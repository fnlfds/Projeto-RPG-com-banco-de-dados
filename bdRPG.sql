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
-- Table structure for table `diario_de_missoes`
--

DROP TABLE IF EXISTS `diario_de_missoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diario_de_missoes` (
  `protagonista_idprotagonista` int NOT NULL,
  `missao_idmissao` int NOT NULL,
  PRIMARY KEY (`protagonista_idprotagonista`,`missao_idmissao`),
  KEY `fk_protagonista_has_missao_missao1_idx` (`missao_idmissao`),
  KEY `fk_protagonista_has_missao_protagonista1_idx` (`protagonista_idprotagonista`),
  CONSTRAINT `fk_protagonista_has_missao_missao1` FOREIGN KEY (`missao_idmissao`) REFERENCES `missao` (`idmissao`),
  CONSTRAINT `fk_protagonista_has_missao_protagonista1` FOREIGN KEY (`protagonista_idprotagonista`) REFERENCES `protagonista` (`idprotagonista`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diario_de_missoes`
--

LOCK TABLES `diario_de_missoes` WRITE;
/*!40000 ALTER TABLE `diario_de_missoes` DISABLE KEYS */;
/*!40000 ALTER TABLE `diario_de_missoes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipamento`
--

DROP TABLE IF EXISTS `equipamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equipamento` (
  `idequipamento` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `efeito` varchar(45) NOT NULL,
  `consumivel` varchar(45) NOT NULL,
  `raridade` varchar(45) NOT NULL,
  PRIMARY KEY (`idequipamento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipamento`
--

LOCK TABLES `equipamento` WRITE;
/*!40000 ALTER TABLE `equipamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `equipamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `habilidade`
--

DROP TABLE IF EXISTS `habilidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `habilidade` (
  `idHabilidade` int NOT NULL AUTO_INCREMENT,
  `descrição` varchar(45) NOT NULL,
  `efeito` varchar(45) NOT NULL,
  `nome` varchar(45) NOT NULL,
  PRIMARY KEY (`idHabilidade`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habilidade`
--

LOCK TABLES `habilidade` WRITE;
/*!40000 ALTER TABLE `habilidade` DISABLE KEYS */;
/*!40000 ALTER TABLE `habilidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inimigo`
--

DROP TABLE IF EXISTS `inimigo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inimigo` (
  `idInimigo` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `ponto de vida` int NOT NULL,
  `ponto de mana` int NOT NULL,
  `nível` int NOT NULL,
  `raça` varchar(45) NOT NULL,
  `classe` varchar(45) NOT NULL,
  `chefe` varchar(45) NOT NULL,
  `experiência dropada` int NOT NULL,
  `fraqueza` varchar(45) NOT NULL,
  `equipamento_idequipamento` int NOT NULL,
  `habilidade_idHabilidade` int NOT NULL,
  PRIMARY KEY (`idInimigo`,`equipamento_idequipamento`,`habilidade_idHabilidade`),
  KEY `fk_inimigo_habilidade1_idx` (`habilidade_idHabilidade`),
  KEY `fk_inimigo_equipamento1` (`equipamento_idequipamento`),
  CONSTRAINT `fk_inimigo_equipamento1` FOREIGN KEY (`equipamento_idequipamento`) REFERENCES `equipamento` (`idequipamento`),
  CONSTRAINT `fk_inimigo_habilidade1` FOREIGN KEY (`habilidade_idHabilidade`) REFERENCES `habilidade` (`idHabilidade`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inimigo`
--

LOCK TABLES `inimigo` WRITE;
/*!40000 ALTER TABLE `inimigo` DISABLE KEYS */;
/*!40000 ALTER TABLE `inimigo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `missao`
--

DROP TABLE IF EXISTS `missao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `missao` (
  `idmissao` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `objetivo` varchar(45) NOT NULL,
  `recompensa` varchar(45) NOT NULL,
  PRIMARY KEY (`idmissao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `missao`
--

LOCK TABLES `missao` WRITE;
/*!40000 ALTER TABLE `missao` DISABLE KEYS */;
/*!40000 ALTER TABLE `missao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `protagonista`
--

DROP TABLE IF EXISTS `protagonista`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `protagonista` (
  `idprotagonista` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `ponto de vida` int NOT NULL,
  `ponto de mana` int NOT NULL,
  `nivel` int NOT NULL,
  `raça` varchar(45) NOT NULL,
  `classe` varchar(45) NOT NULL,
  `experiência` int NOT NULL,
  `força` int NOT NULL,
  `destreza` int NOT NULL,
  `inteligência` int NOT NULL,
  `carisma` int NOT NULL,
  `efeito` varchar(45) NOT NULL,
  `dinheiro` int NOT NULL,
  `habilidade_idHabilidade` int NOT NULL,
  `equipamento_idequipamento` int NOT NULL,
  PRIMARY KEY (`idprotagonista`,`habilidade_idHabilidade`,`equipamento_idequipamento`),
  KEY `fk_protagonista_habilidade1_idx` (`habilidade_idHabilidade`),
  KEY `fk_protagonista_equipamento1_idx` (`equipamento_idequipamento`),
  CONSTRAINT `fk_protagonista_equipamento1` FOREIGN KEY (`equipamento_idequipamento`) REFERENCES `equipamento` (`idequipamento`),
  CONSTRAINT `fk_protagonista_habilidade1` FOREIGN KEY (`habilidade_idHabilidade`) REFERENCES `habilidade` (`idHabilidade`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `protagonista`
--

LOCK TABLES `protagonista` WRITE;
/*!40000 ALTER TABLE `protagonista` DISABLE KEYS */;
/*!40000 ALTER TABLE `protagonista` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-09 17:11:26
