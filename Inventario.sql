CREATE DATABASE Inventario
use Inventario
create table Categorias(
id_categoria int identity primary key ,
nombre_categoria varchar(100) not null
);

create table Productos(
id_prodcuto int primary key,
nombre varchar(100) not null,
stock int default 0,
precio_unitario decimal(10,2),
id_categoria int,
foreign key (id_categoria) references Categorias (id_categoria)
);

insert into Categorias (nombre_categoria) values ('Ropa'), ('Alimento'), ('Electronico'), ('Limpieza'), ('Deporte');

insert into Productos (id_prodcuto, nombre, stock, precio_unitario, id_categoria) values
(174208, 'Polo_Adidas', 40, 35.60, 1),
(902316, 'Arroz_Costeno', 100, 3.80, 2),
(618453, 'Laptop_HP', 10, 2500.00, 3),
(237109, 'Shampoo_Savital', 30, 12.90, 4),
(861304, 'Balon_Futbol', 15, 89.00, 5),
(493712, 'Short_Nike', 25, 45.50, 1),
(705128, 'Leche_Gloria', 80, 4.20, 2),
(382640, 'Tablet_Samsung', 12, 850.00, 3),
(126849, 'Jabon_Lava', 60, 2.50, 4),
(540376, 'Guantes_Boxeo', 10, 120.00, 5),
(314920, 'Casaca_Columbia', 18, 150.00, 1),
(607183, 'Azucar_Rubia', 70, 3.50, 2),
(829415, 'Teclado_Logitech', 20, 95.00, 3),
(750269, 'Detergente_Ariel', 50, 7.90, 4),
(198430, 'Zapatillas_Puma', 22, 200.00, 5),
(463280, 'Camisa_Formal', 17, 85.00, 1),
(248970, 'Fideos_DonVittorio', 90, 2.80, 2),
(630194, 'Audifonos_Sony', 30, 130.00, 3),
(389716, 'Limpiavidrios_MrMusculo', 40, 8.90, 4),
(517203, 'Pelota_Basquet', 14, 99.90, 5);

select * from Productos
select * from Categorias