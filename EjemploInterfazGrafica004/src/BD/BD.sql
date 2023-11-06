CREATE TABLE Marca
(
    id          int             primary key auto_increment,
    nombre      varchar(100)    not null,
    habilitado  boolean         not null,
    unique(nombre)
);

insert into marca values (null, 'Nissan',1);
insert into marca values (null, 'Fiat',1);
insert into marca values (null, 'Mazda',1);
insert into marca values (null, 'Toyota',1);
insert into marca values (null, 'Subaru',1);


select * from marca;