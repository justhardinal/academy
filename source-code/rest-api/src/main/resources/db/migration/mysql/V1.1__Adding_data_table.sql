ALTER table application_info add update_info varchar(40);

CREATE TABLE IF NOT EXISTS `officer` (
  `officerID` int(11) NOT NULL,
  `user_name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`officerID`)
) ENGINE=InnoDB;

