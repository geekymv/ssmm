
create database dvd;

/*用户*/
CREATE TABLE `t_login` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `loginId` varchar(20) DEFAULT NULL,
  `pwd` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

/*货物*/
CREATE TABLE `t_dvd` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `createDate` date DEFAULT NULL,
  `color` varchar(5) DEFAULT NULL,
  `detail` varchar(20) DEFAULT NULL,
  `price` decimal(10,3) DEFAULT NULL,
  `imgIndex` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

/*购物车*/
CREATE TABLE `t_cart` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `dvdId` int(11) DEFAULT NULL,
  `buynum` int(11) DEFAULT NULL,
  `itemprice` decimal(10,3) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
);










































