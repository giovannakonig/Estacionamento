/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  01983820067
 * Created: 06/10/2022
 */

CREATE DATABASE IF NOT EXISTS estacionamento;
USE estacionamento;

CREATE TABLE vaga (
    idVaga int NOT NULL AUTO_INCREMENT,
    numero int NOT NULL,
    rua varchar(100) NOT NULL,
    obiqua boolean NOT NULL,
    PRIMARY KEY (idVaga));

CREATE TABLE motorista (
    idMotorista int NOT NULL AUTO_INCREMENT,
    nome varchar(200) NOT NULL,
    genero varchar(100) NOT NULL,
    rg varchar(10) NOT NULL,
    cpf varchar(11) NOT NULL,
    celular varchar(11) NOT NULL,
    email varchar(100) NOT NULL,
    senha varchar(10) NOT NULL,
    PRIMARY KEY (idMotorista));
