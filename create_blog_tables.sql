DROP DATABASE IF EXISTS `mental_placeblog`;
CREATE SCHEMA `mental_placeblog` DEFAULT CHARACTER SET utf8 ;
USE `mental_placeblog`;

CREATE TABLE `user`(
    `email` VARCHAR(32) NOT null,
	`username` VARCHAR(32) NOT null,
	`password` VARCHAR(32) DEFAULT null,
	PRIMARY KEY(`email`)
)
COMMENT 'User Table';

INSERT INTO `mental_placeblog`.`user` VALUES ('test@gmail.com', 'Tester Joe Doe', 'f6b338015a5a6321ba4468010ba2a71e');
INSERT INTO `mental_placeblog`.`user` VALUES ('siri@gmail.com', 'Siri', 'f6b338015a5a6321ba4468010ba2a71e');

CREATE TABLE `quote`(
	`id` INT(20) NOT null AUTO_INCREMENT COMMENT 'quoteID',
    `content` VARCHAR(255) NOT null,
	PRIMARY KEY(`id`)
)
COMMENT 'Quote Table';

INSERT INTO `mental_placeblog`.`quote` VALUES (1, 'I am doing great.');
INSERT INTO `mental_placeblog`.`quote` VALUES (2, 'I am smarter than I think.');
INSERT INTO `mental_placeblog`.`quote` VALUES (3, 'Good things and good people will be drawn to me as long as I stay positive.');
INSERT INTO `mental_placeblog`.`quote` VALUES (4, 'Tomorrow will be a brighter day!');