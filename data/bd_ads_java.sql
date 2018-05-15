/*
SQLyog Enterprise Trial - MySQL GUI v8.05 
MySQL - 5.7.13-log : Database - bd_ads_java
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`bd_ads_java` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `bd_ads_java`;

/*Table structure for table `tm_usuarios` */

DROP TABLE IF EXISTS `tm_usuarios`;

CREATE TABLE `tm_usuarios` (
  `ID_USUARIO` int(11) NOT NULL AUTO_INCREMENT,
  `NO_USUARIO` varchar(20) DEFAULT NULL,
  `DE_CORREO` varchar(45) DEFAULT NULL,
  `DE_PASSWORD` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID_USUARIO`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `tm_usuarios` */

insert  into `tm_usuarios`(`ID_USUARIO`,`NO_USUARIO`,`DE_CORREO`,`DE_PASSWORD`) values (1,'JG','JGSISTEM@GMAIL.COM','123'),(2,'PEDRO','JGJG@GMAIL.COM','1234'),(3,'carmen osorio','carmen@gmal.com','123');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
