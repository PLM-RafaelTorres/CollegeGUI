-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: oop_activity
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `college`
--

DROP TABLE IF EXISTS `college`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `college` (
  `COLLEGE_CODE` varchar(10) NOT NULL,
  `DESCRIPTION` varchar(100) DEFAULT '',
  `ACTIVE` varchar(1) DEFAULT 'Y',
  `DATE_OPENED` date DEFAULT '1990-01-01',
  `DATE_CLOSED` date DEFAULT '9999-12-31',
  PRIMARY KEY (`COLLEGE_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `college`
--

LOCK TABLES `college` WRITE;
/*!40000 ALTER TABLE `college` DISABLE KEYS */;
INSERT INTO `college` VALUES ('CAUP','College of Architecture and Urban Planning','Y','1990-01-01','9999-12-31'),('CEd','College of Education','Y','1990-01-01','9999-12-31'),('CET','College of Engineering and Technology','Y','1990-01-01','9999-12-31'),('CHASS','College of Humanities, Arts and Social Sciences','Y','1990-01-01','9999-12-31'),('CL','College of Law','Y','1990-01-01','9999-12-31'),('CM','College of Medicine','Y','1990-01-01','9999-12-31'),('CN','College of Nursing','Y','1990-01-01','9999-12-31'),('CPT','College of Physical Therapy','Y','1990-01-01','9999-12-31'),('CS','College of Science','Y','1990-01-01','9999-12-31'),('GSL','Graduate School of Law','Y','1990-01-01','9999-12-31'),('PLM-BS','PLM Business School','Y','1990-01-01','9999-12-31'),('SG','School of Government','Y','1990-01-01','9999-12-31'),('SPH','School of Public Health','Y','1990-01-01','9999-12-31');
/*!40000 ALTER TABLE `college` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subject` (
  `SUBJECT_CODE` varchar(10) NOT NULL,
  `DESCRIPTION` varchar(100) DEFAULT '',
  `UNITS` int DEFAULT '3',
  `COLLEGE_CODE` varchar(10) DEFAULT 'CET',
  `ACTIVE` varchar(1) DEFAULT 'Y',
  PRIMARY KEY (`SUBJECT_CODE`),
  KEY `college_code_fk` (`COLLEGE_CODE`),
  CONSTRAINT `college_code_fk` FOREIGN KEY (`COLLEGE_CODE`) REFERENCES `college` (`COLLEGE_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` VALUES ('CSC 0102','Discrete Structures 1',3,'CET','Y'),('CSC 0211','Discrete Structures 2',3,'CET','Y'),('CSC 0212','Object Oriented Programming (lec)',2,'CET','Y'),('CSC 0212.1','Object Oriented Programming (lab)',1,'CET','Y'),('CSC 0213','Logic Design and Digital Computer Circuits (lec)',2,'CET','Y'),('CSC 0213.1','Logic Design and Digital Computer Circuits (lab)',1,'CET','Y'),('CSC 0223','Human Computer Interaction',3,'CET','Y'),('CSC 0224','Operation Research',3,'CET','Y'),('ETH 0008','Ethics',3,'CHASS','Y'),('ICC 0101','Introduction to Computing (lec)',2,'CET','Y'),('ICC 0101.1','Introduction to Computing (lab)',1,'CET','Y'),('ICC 0102','Fundamentals of Programming (lec)',2,'CET','Y'),('ICC 0102.1','Fundamentals of Programming (lab)',1,'CET','Y'),('ICC 0103','Intermediate Programming (lec)',2,'CET','Y'),('ICC 0103.1','Intermediate Programming (lab)',3,'CET','Y'),('ICC 0104','Data Structures and Algorithms (lec)',2,'CET','Y'),('ICC 0104.1','Data Structures and Algorithms (lab)',1,'CET','Y'),('ICC 0105','Information Management (lec)',2,'CET','Y'),('ICC 0105.1','Information Management (lab)',1,'CET','Y'),('IPP 0010','Interdisiplinaryong Pagbasa at Pagsulat tungo sa Mabisang Pagpapahayag',3,'CHASS','Y'),('ITE 0001','Living in the IT Era',3,'CET','Y'),('LWR 0009','Life and Works of Rizal',3,'CHASS','Y'),('MMW 0001','Mathematics in the Modern World',3,'CS','Y'),('PATHFIT 1','Physical Activities Towards Health and Fitness 1',3,'CEd','Y'),('PATHFIT 2','Physical Activities Towards Health and Fitness 2',3,'CEd','Y'),('PCM 0006','Purposive Communications',3,'CHASS','Y'),('RPH 0004','Readings in Philiipine History',3,'CHASS','Y'),('STS 0002','Science, Technology and Society',3,'CS','Y'),('TCW 0005','The Contemporary World',3,'CHASS','Y'),('UTS 0003','Understanding the Self',3,'CHASS','Y');
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-23 12:59:48
