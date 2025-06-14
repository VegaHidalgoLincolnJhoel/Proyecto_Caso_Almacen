CREATE DATABASE Inventario
USE Inventario

CREATE TABLE Categorias (
    id_categoria INT IDENTITY PRIMARY KEY,
    nombre_categoria VARCHAR(100) NOT NULL
);

INSERT INTO Categorias (nombre_categoria) VALUES
('Ropa'), ('Alimento'), ('Electronico'), ('Limpieza'), ('Deporte');

CREATE TABLE Ropa (
    id_ropa INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    stock INT DEFAULT 0,
    precio_unitario DECIMAL(10,2),
    id_categoria INT DEFAULT 1,
    FOREIGN KEY (id_categoria) REFERENCES Categorias(id_categoria)
);

CREATE TABLE Alimento (
    id_alimento INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    stock INT DEFAULT 0,
    precio_unitario DECIMAL(10,2),
    id_categoria INT DEFAULT 2,
    FOREIGN KEY (id_categoria) REFERENCES Categorias(id_categoria)
);

CREATE TABLE Electronico (
    id_electronico INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    stock INT DEFAULT 0,
    precio_unitario DECIMAL(10,2),
    id_categoria INT DEFAULT 3,
    FOREIGN KEY (id_categoria) REFERENCES Categorias(id_categoria)
);

CREATE TABLE Limpieza (
    id_limpieza INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    stock INT DEFAULT 0,
    precio_unitario DECIMAL(10,2),
    id_categoria INT DEFAULT 4,
    FOREIGN KEY (id_categoria) REFERENCES Categorias(id_categoria)
);

CREATE TABLE Deporte (
    id_deporte INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    stock INT DEFAULT 0,
    precio_unitario DECIMAL(10,2),
    id_categoria INT DEFAULT 5,
    FOREIGN KEY (id_categoria) REFERENCES Categorias(id_categoria)
);

INSERT INTO Ropa VALUES
(174208, 'Polo_Adidas', 40, 35.60, 1),
(493712, 'Short_Nike', 25, 45.50, 1),
(314920, 'Casaca_Columbia', 18, 150.00, 1),
(463280, 'Camisa_Formal', 17, 85.00, 1);

INSERT INTO Alimento VALUES
(902316, 'Arroz_Costeno', 100, 3.80, 2),
(705128, 'Leche_Gloria', 80, 4.20, 2),
(607183, 'Azucar_Rubia', 70, 3.50, 2),
(248970, 'Fideos_DonVittorio', 90, 2.80, 2);

INSERT INTO Electronico VALUES
(618453, 'Laptop_HP', 10, 2500.00, 3),
(382640, 'Tablet_Samsung', 12, 850.00, 3),
(829415, 'Teclado_Logitech', 20, 95.00, 3),
(630194, 'Audifonos_Sony', 30, 130.00, 3);

INSERT INTO Limpieza VALUES
(237109, 'Shampoo_Savital', 30, 12.90, 4),
(126849, 'Jabon_Lava', 60, 2.50, 4),
(750269, 'Detergente_Ariel', 50, 7.90, 4),
(389716, 'Limpiavidrios_MrMusculo', 40, 8.90, 4);

INSERT INTO Deporte VALUES
(861304, 'Balon_Futbol', 15, 89.00, 5),
(540376, 'Guantes_Boxeo', 10, 120.00, 5),
(198430, 'Zapatillas_Puma', 22, 200.00, 5),
(517203, 'Pelota_Basquet', 14, 99.90, 5);
