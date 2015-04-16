-- MySQL InnoDB Schema
create table application_info (
    id VARCHAR(36),
    info_name VARCHAR(255) NOT NULL,
    info_description VARCHAR(255) NOT NULL,
    PRIMARY KEY (id),
    UNIQUE KEY (info_name)
)InnoDB;

CREATE TABLE IF NOT EXISTS `petugas` (
  `id_petugas` int(11) NOT NULL,
  `user` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_petugas`)
) ENGINE=InnoDB;

insert into application_info (id, info_name, info_description) values ('1', 'try','trying migrate');
insert into application_info (id, info_name, info_description) values ('2', 'try again','trying to migrate');
