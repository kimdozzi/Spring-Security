CREATE TABLE bank;

USE bank;

CREATE TABLE users (
                       `id` BIGINT NOT NULL AUTO_INCREMENT,
                       `username` VARCHAR(45) NOT NULL,
                       `password` VARCHAR(45) NOT NULL,
                       `enabled` INT NOT NULL,
                       PRIMARY KEY (`id`));

CREATE TABLE authorities (
                             `id` BIGINT NOT NULL AUTO_INCREMENT,
                             `username` VARCHAR(45) NOT NULL,
                             `authority` VARCHAR(45) NOT NULL,
                             PRIMARY KEY(`id`));

INSERT IGNORE INTO `users` VALUES (null, 'happy', '12345', '1');
INSERT IGNORE INTO authorities VALUES (null, 'happy', 'write');