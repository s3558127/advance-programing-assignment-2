CREATE TABLE IF NOT EXISTS `ablecarehome`.`patient`(
`pid` VARCHAR(10) NOT NULL,
`firstname` VARCHAR(45) NOT NULL,
`lastname` VARCHAR(45) NOT NULL,
`username` VARCHAR(45) NOT NULL,
`gender` CHAR,
Primary Key (`pid`)
);


CREATE TABLE IF NOT EXISTS `ablecarehome`.`medicine`(
`pid` VARCHAR(10) NOT NULL,
`med` VARCHAR(45) NOT NULL,
`time` VARCHAR(45) NOT NULL,
`dose` INT NOT NULL,
Foreign Key (`pid`) references `ablecarehome`.`patient` (`pid`)
);

CREATE TABLE IF NOT EXISTS `ablecarehome`.`prescription`(
`pid` VARCHAR(10) NOT NULL,
`prescription` VARCHAR(200) NOT NULL,
Foreign Key (`pid`) references `ablecarehome`.`patient` (`pid`)
);

CREATE TABLE IF NOT EXISTS `ablecarehome`.`shift`(
`sid` VARCHAR(10) NOT NULL,
`starttime` VARCHAR(45) NOT NULL,
`endtime` VARCHAR(45) NOT NULL,
Primary Key (`sid`)
);

CREATE TABLE IF NOT EXISTS `ablecarehome`.`doctor`(
`did` VARCHAR(10) NOT NULL,
`username` VARCHAR(45) NOT NULL,
`password` VARCHAR(45),
`sid` VARCHAR(10),
Primary Key (`did`),
Foreign Key (`sid`) references `ablecarehome`.`shift` (`sid`)
);

CREATE TABLE IF NOT EXISTS `ablecarehome`.`nurse`(
`nid` VARCHAR(10) NOT NULL,
`username` VARCHAR(45) NOT NULL,
`password` VARCHAR(45),
`sid` VARCHAR(10),
Primary Key (`nid`),
Foreign Key (`sid`) references `ablecarehome`.`shift` (`sid`)
);

CREATE TABLE IF NOT EXISTS `ablecarehome`.`bed`(
`bid` VARCHAR(10) NOT NULL,
`available` BOOLEAN NOT NULL,
`pid` VARCHAR(45),
Primary Key (`bid`),
Foreign Key (`pid`) references `ablecarehome`.`patient` (`pid`)
);

