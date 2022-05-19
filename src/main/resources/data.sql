DROP TABLE IF EXISTS 'facultad';
DROP TABLE IF EXISTS 'investigadores';
DROP TABLE IF EXISTS 'equipos';
DROP TABLE IF EXISTS 'reserva';
SET character_set_client = utf8mb4 ;

create table facultad(
id int auto_increment primary key,
nombre varchar(100)
);

insert into facultad(nombre) values ('Artes');
insert into facultad(nombre) values ('Marketing');


create table investigadores(
id int auto_increment primary key,
nomapels varchar(255),
facultad int, foreign key (facultad) references facultad(id)
);

insert into investigadores(nomapels, facultad) values ('Borja Montseny', 1);
insert into investigadores(nomapels, facultad) values ('Martina Garcia', 2);


create table equipos(
id int auto_increment primary key,
nombre varchar(100),
facultad int, foreign key (facultad) references facultad(id)
);

insert into equipos(nombre, facultad) values ('Pintores', 1);


create table reserva(
id int auto_increment primary key,
dni int,
numserie int,
comienzo date,
fin date,
foreign key (dni) references investigadores(id),
foreign key (numserie) references equipos(id)
);

insert into reserva(dni, numserie, comienzo, fin) values (1, 1, '2022-05-18', '2022-09-24');