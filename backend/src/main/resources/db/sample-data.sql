USE villagecraft;
-- Development-only sample catalogue. No default user accounts are seeded.
INSERT INTO products(sku,name,category,description,retail_price,status) VALUES
('VC101','Handwoven Coconut Basket','Woven Handicrafts','A durable, naturally textured basket woven by skilled Sri Lankan artisans.',2450,'PUBLISHED'),
('VC102','Ceylon Tea & Spice Gift Box','Gift Collections','A thoughtful gift collection inspired by the island.',3850,'PUBLISHED'),
('VC103','Hand-painted Wooden Elephant','Pottery & Wooden Crafts','A decorative wooden elephant with colourful hand-painted details.',1900,'PUBLISHED'),
('VC104','Coconut Shell Candle','Handmade Candles','A softly scented candle poured into a reusable coconut shell.',1650,'PUBLISHED'),
('VC105','Coastal Shell Wind Chime','Seashell Crafts','A coastal-inspired shell wind chime made with natural cord.',2200,'PUBLISHED'),
('VC106','Artisan Textile Tote','Coconut & Textile','A practical reusable tote featuring textile-inspired patterns.',2800,'PUBLISHED'),
('VC107','Mini Tuk-tuk Keepsake','Tourist Souvenirs','A keepsake inspired by the iconic Sri Lankan tuk-tuk.',1250,'PUBLISHED'),
('VC108','Traditional Mask Decor','Tourist Souvenirs','A colourful display piece inspired by Sri Lankan mask artistry.',3200,'PUBLISHED');
INSERT INTO inventory(product_id,quantity_on_hand) SELECT id,10 FROM products;
