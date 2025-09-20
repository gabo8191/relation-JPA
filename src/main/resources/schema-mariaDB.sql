drop table if exists libro;
drop table if exists editorial;
create table libro (
  id int primary key auto_increment,
  nombre varchar(200) not null,
  descripcion varchar(3000),
  imagen_url varchar(500)
);
insert into libro (nombre, descripcion, imagen_url)
values (
    'Cien Años de Soledad',
    'La obra maestra de Gabriel García Márquez que narra la historia de la familia Buendía a lo largo de siete generaciones en el pueblo ficticio de Macondo.',
    'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSbNAvE0GfZzgCtmbgy3DElhxiN9muZQYtN9g&s'
  ),
  (
    'El Quijote de la Mancha',
    'Las aventuras de Don Quijote y su fiel escudero Sancho Panza en su lucha contra los molinos de viento y otros desafíos imaginarios.',
    'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQcMRZdGl9oMFn7_O4oyErwUXK9yrN3OcSe0w&s'
  ),
  (
    '1984',
    'Una distopía clásica de George Orwell que describe un mundo totalitario donde el Gran Hermano vigila cada movimiento de los ciudadanos.',
    'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRf6kMW5rBSZz-RsErME_uuXiZeXIwUGG3lfw&s'
  ),
  (
    'El Principito',
    'La conmovedora historia de un pequeño príncipe que viaja de planeta en planeta aprendiendo sobre la vida, el amor y la amistad.',
    'https://online.fliphtml5.com/ilypf/stri/files/large/1.webp?1601836779&1601836779'
  ),
  (
    'Orgullo y Prejuicio',
    'La historia de Elizabeth Bennet y Mr. Darcy en la Inglaterra del siglo XIX, una de las novelas románticas más famosas de la literatura.',
    'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvC-ihcGdtkATFpKMUIRRVmO2-fBwZ6Axkvw&s'
  ),
  (
    'El Hobbit',
    'La aventura de Bilbo Bolsón, un hobbit que se embarca en una épica aventura para recuperar un tesoro custodiado por un dragón.',
    'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFR4z-1xbwe3vtsLxEFJqPG8OQjvNabeHjxQ&s'
  ),
  (
    'Matar a un Ruiseñor',
    'Una novela sobre la justicia racial en el sur de Estados Unidos, narrada desde la perspectiva de una niña de seis años.',
    'https://m.media-amazon.com/images/I/71ScCUdhhQL._UF1000,1000_QL80_.jpg'
  ),
  (
    'El Gran Gatsby',
    'La historia de Jay Gatsby y su obsesión por Daisy Buchanan en la era del jazz de los años 20 en Estados Unidos.',
    'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSHjsJx0-jfyY_gqhuBoYPf35UhZng6azQDwg&s'
  );
create table editorial (
  id int primary key auto_increment,
  nombre varchar(200) not null,
  sitio_web varchar(500)
);
insert into editorial (id, nombre, sitio_web)
values (
    1,
    'Planeta',
    'https://www.planetadelibros.com/'
  ),
  (
    2,
    'Mirahadas',
    'https://www.mirahadas.com/'
  ),
  (
    3,
    'Pre-Textos',
    'https://www.pre-textos.com/'
  ),
  (4, 'Sexto Piso', 'https://sextopiso.es/'),
  (
    5,
    'Nordica',
    'https://www.nordicalibros.com/'
  ),
  (
    6,
    'Acantilado',
    'https://www.acantilado.es/'
  ),
  (
    7,
    'La Huerta Grande',
    'https://www.lahuertagrande.com/'
  );
alter table libro
add column editorial_id int,
  add foreign key (editorial_id) references editorial(id);
update libro
set editorial_id = 1
where id in (1, 5);
update libro
set editorial_id = 2
where id in (2);
update libro
set editorial_id = 3
where id in (3);
update libro
set editorial_id = 4
where id in (4);
update libro
set editorial_id = 5
where id in (6);
update libro
set editorial_id = 6
where id in (7);
update libro
set editorial_id = 7
where id in (8);
alter table libro
modify editorial_id int not null;
