USE adlister_db;

DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(240) NOT NULL,
    email VARCHAR(240) NOT NULL,
    password VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE ads (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    title VARCHAR(240) NOT NULL,
    description VARCHAR(2400) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users(id)
        ON DELETE CASCADE
);



insert into ads (user_id, title, description) values (?, ?, ?),
 (1, 'Wings and Rings', 'Our New Braunfels location offers a club-level sports experience for the whole family, with fresh, never frozen wings customized the way you want them. Come visit us today, we''re conveniently located off the Texas 337 Loop.'),

(2, 'Muck & Fuss', 'Located in the heart of the downtown district of New Braunfels, Muck & Fuss is a craft beer and burger restaurant with a unique, chef-inspired menu. We pride ourselves on cooking with creative, fresh ingredients that result in dishes that everyone can enjoy.'),

(3, 'Pollos Asados los Norteños', 'Grilled on the spot with fresh ingredients, and marinated on the same day, our chicken is of the best quality and taste. Using our traditional family recipe passed down from generation to generation with that authentic mexican flavor many have come to love.'),

(4, 'Adobe Cafe', 'For 34 years, Adobe Cafe has been serving great tasting food to New Braunfels locals and visitors alike. We use the freshest ingredients to prepare your favorites, and use time-tested recipes so that you enjoy great tasting food each time you visit. Adobe Cafe is the home of the best sizzling Certified Angus Beef Fajitas! You can call ahead and pick up your To Go order at our pick up window or drive up and order. Speedy service provided.'),

(5, 'Soluna', 'Soluna is a relaxed and colorful Mexican restaurant with a vibrant and luscious patio that will make you feel like you’ve been transported to another world entirely. We specialize in innovative Mexican food and our famous handmade “Chispa” margaritas.'),

(6, 'Carnitas Lonja', 'We''re a family own business located in the Southside of San Antonio.
We specialize in the traditional dish of Michoacán, Carnitas with fresh daily ingredients to delight our customers.');
