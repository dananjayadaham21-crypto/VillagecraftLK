package lk.villagecraft.auth;
import io.jsonwebtoken.*; import io.jsonwebtoken.security.Keys; import javax.crypto.SecretKey; import java.nio.charset.StandardCharsets; import java.time.Instant; import java.util.Date; import org.springframework.beans.factory.annotation.Value; import org.springframework.stereotype.Service; import lk.villagecraft.users.AppUser;
@Service public class JwtService {
 private final SecretKey key;
 public JwtService(@Value("${app.jwt.secret}") String secret){if(secret.getBytes(StandardCharsets.UTF_8).length<32)throw new IllegalStateException("JWT_SECRET must be at least 32 bytes");key=Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));}
 public String issue(AppUser user){Instant now=Instant.now();return Jwts.builder().subject(user.getEmail()).claim("role",user.getRole()).issuedAt(Date.from(now)).expiration(Date.from(now.plusSeconds(3600))).signWith(key).compact();}
 public Jws<Claims> parse(String token){return Jwts.parser().verifyWith(key).build().parseSignedClaims(token);}
}
