CREATE DATABASE  IF NOT EXISTS `rpg` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `rpg`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: rpg
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `inimigo`
--

DROP TABLE IF EXISTS `inimigo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inimigo` (
  `idInimigo` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `pontovida` int NOT NULL,
  `pontomana` int NOT NULL,
  `nivel` int NOT NULL,
  `raca` varchar(45) NOT NULL,
  `classe` varchar(45) NOT NULL,
  `chefe` varchar(45) NOT NULL,
  `experiencia_dropada` int NOT NULL,
  `fraqueza` varchar(45) NOT NULL,
  `equipamento_idequipamento` int NOT NULL,
  `habilidade_idHabilidade` int NOT NULL,
  PRIMARY KEY (`idInimigo`,`equipamento_idequipamento`,`habilidade_idHabilidade`),
  UNIQUE KEY `nome_UNIQUE` (`nome`),
  KEY `fk_inimigo_habilidade1_idx` (`habilidade_idHabilidade`),
  KEY `fk_inimigo_equipamento1` (`equipamento_idequipamento`),
  CONSTRAINT `fk_inimigo_equipamento1` FOREIGN KEY (`equipamento_idequipamento`) REFERENCES `equipamento` (`idequipamento`),
  CONSTRAINT `fk_inimigo_habilidade1` FOREIGN KEY (`habilidade_idHabilidade`) REFERENCES `habilidade` (`idHabilidade`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-19 15:35:05
