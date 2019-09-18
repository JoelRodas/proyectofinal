create database DBRestaurante;
use DBRestaurante;

create table mesero(
id_mesero int not null primary key auto_increment,
nombres varchar(45)not null,
apellidos varchar(45)not null,
porcentajepropina int not null
);

create table cocineros(
id_cocinero int not null primary key auto_increment,
nombres varchar(45)not null,
apellidos varchar(45)not null
);

create table clientes (
id_cliente int not null primary key auto_increment,
nombres varchar(45)not null,
apellidos varchar(45)not null,
Nit varchar(45)not null,
correo varchar(45)not null
);

create table areas(
id_areas int not null primary key auto_increment,
nombrearea varchar(45)not null
);

create table mesas(
id_mesa int not null primary key auto_increment,
id_areas int not null,
foreign key(id_areas)references areas(id_areas),
escripcion varchar(45)not null);

create table platos(
id_plato int not null primary key auto_increment,
descripcion varchar(45)not null
);

create table menu(
id_menu int not null primary key auto_increment,
id_plato int not null,
disponible varchar(45)not null,
costo double not null,
foreign key (id_plato)references platos(id_plato)
);


create table fatura(
id_factura int not null primary key auto_increment,
id_cliente int not null ,
id_mesa int not null ,
id_mesero int not null,
fecha datetime not null,
foreign key(id_mesa)references mesas(id_mesa),
foreign key(id_cliente)references clientes (id_cliente),
foreign key (id_mesero)references mesero (id_mesero)
);

create table detallefactura(
id_factura int not null,
id_menu int not null,
id_cocinero int not null,
cantidad int not null,
precioventa double not null,
totalventa double as(cantidad*precioventa),
primary key(id_factura,id_Menu),
foreign key(id_factura)  references fatura(id_factura),
foreign key(id_menu) references menu(id_Menu),
foreign key(id_cocinero)references cocineros (id_cocinero)
);

insert into detallefactura(id_factura, id_menu, id_cocinero, cantidad, precioventa) values
(1,1,1,10,5);

select * from areas;
