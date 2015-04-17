CREATE TABLE IF NOT EXISTS `student` (
  `studentId` varchar(10) NOT NULL,
  `studentName` varchar(45) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `DateOfBirth` date DEFAULT NULL,
  `class` varchar(10) DEFAULT NULL,
  `image` varchar(100) NOT NULL,
  PRIMARY KEY (`studentId`)
) ENGINE=InnoDB;
