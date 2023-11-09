create type trabajos as enum('Programador', 'Recruiter', 'CEO');

create table empleado(
    id int auto_increment,
    nombre varchar(100),
    trabajo trabajos,
    sueldo int,
    primary key (id)
);
