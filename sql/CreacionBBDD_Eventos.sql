-- Creación de la base de datos

CREATE DATABASE IF NOT EXISTS Eventos;
USE Eventos;

-- Creación de la tabla Categorías

CREATE TABLE categorias (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

-- Creación de la tabla Ubicación

CREATE TABLE ubicacion (
    id INT AUTO_INCREMENT PRIMARY KEY,
    online BOOLEAN NOT NULL,
    direccion VARCHAR(200) NOT NULL
);

-- Creación de la tabla Organizador

CREATE TABLE organizador (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(255) NOT NULL
);

-- Creación de la tabla Usuario

CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(255) NOT NULL
);

-- Creación de la tabla Evento

CREATE TABLE evento (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(20) NOT NULL,
    fecha DATE NOT NULL,
    duracion TIME NOT NULL,
    id_ubicacion INT NOT NULL,
    id_organizador INT NOT NULL,
    id_categoria INT NOT NULL,
    CONSTRAINT fk_evento_ubicacion FOREIGN KEY (id_ubicacion) REFERENCES ubicacion(id),
    CONSTRAINT fk_evento_organizador FOREIGN KEY (id_organizador) REFERENCES organizador(id),
    CONSTRAINT fk_evento_categoria FOREIGN KEY (id_categoria) REFERENCES categorias(id)
);

-- Creación de la tabla Inscripciones

CREATE TABLE inscripciones (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cancelado BOOLEAN NOT NULL,
    id_usuario INT NOT NULL,
    id_evento INT NOT NULL,
    CONSTRAINT fk_inscripciones_usuario FOREIGN KEY (id_usuario) REFERENCES usuario(id),
    CONSTRAINT fk_inscripciones_evento FOREIGN KEY (id_evento) REFERENCES evento(id)
);