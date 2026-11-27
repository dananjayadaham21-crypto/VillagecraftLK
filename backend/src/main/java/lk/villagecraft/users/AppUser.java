package lk.villagecraft.users;
import jakarta.persistence.*;
@Entity @Table(name="users")
public class AppUser {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(name="full_name",nullable=false,length=120) private String fullName;
 @Column(nullable=false,unique=true,length=190) private String email;
 @Column(name="password_hash",length=255) private String passwordHash;
 @Column(nullable=false,length=20) private String role;
 @Column(nullable=false) private boolean enabled=true;
 protected AppUser(){}
 public AppUser(String fullName,String email,String passwordHash,String role){this.fullName=fullName;this.email=email;this.passwordHash=passwordHash;this.role=role;this.enabled=true;}
 public Long getId(){return id;} public String getFullName(){return fullName;} public String getEmail(){return email;} public String getPasswordHash(){return passwordHash;} public String getRole(){return role;} public boolean isEnabled(){return enabled;} public void setPasswordHash(String value){passwordHash=value;}
}
