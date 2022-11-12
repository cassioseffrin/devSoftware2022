# devSoftware2022
devsoft2022

CREATE USER 'root'@'%' IDENTIFIED BY '123123123';
GRANT ALL PRIVILEGES ON * . * TO 'root'@'%';
FLUSH PRIVILEGES;


DDL

CREATE TABLE `cliente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `cpf` varchar(15) NOT NULL,
  `rg` varchar(15) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `sexo` varchar(45) DEFAULT NULL,
  `dataNascimento` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cpf_UNIQUE` (`cpf`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;

Drivers JDBC
Postgres -> https://jdbc.postgresql.org/download/
SQL Server -> https://learn.microsoft.com/en-us/sql/connect/jdbc/download-microsoft-jdbc-driver-for-sql-server?source=recommendations&view=sql-server-ver16
MySQL -> https://dev.mysql.com/downloads/connector/j/ 


ex insercao:
INSERT INTO cliente (nome, cpf, rg, endereco) values ('Nikolas', '243234234', '234234', 'rua cc')

SELECT * from cliente;
