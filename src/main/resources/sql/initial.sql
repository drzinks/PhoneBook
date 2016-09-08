create database contactdb;
use contactdb
CREATE TABLE  CONTACTS
(
  id int(10) unsigned NOT NULL AUTO_INCREMENT,
  name varchar(45) NOT NULL,
  email varchar(45) DEFAULT NULL,
  phone varchar(15) DEFAULT NULL,
  PRIMARY KEY (id)
);

INSERT INTO contacts VALUES (1,'Janusz Kowalski','janusz.kowalski@gmail.com','+48555444333');