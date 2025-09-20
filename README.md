# Biblioteca Uptc

Aplicación web para gestión de libros y editoriales desarrollada con Spring Boot 3.2.0 y Java 17.

## Tecnologías

- Java 17
- Spring Boot 3.2.0
- Spring Data JPA
- Thymeleaf
- Bootstrap 5
- MySQL

## Instalación

```bash
git clone https://github.com/gabo8191/relation-JPA
cd relation-JPA
```

Configurar base de datos MySQL:

```sql
CREATE DATABASE biblioteca;
```

Editar `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/biblioteca?serverTimezone=GMT-3
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
```

Ejecutar:

```bash
mvn spring-boot:run
```

## Acceso

- URL Principal: <http://localhost:8080>
- Listado de Libros: <http://localhost:8080/>
- Nuevo Libro: <http://localhost:8080/libros/crear>
- Buscar Libros: <http://localhost:8080/buscar>

## Estructura del Proyecto

```
src/main/java/co/edu/uptc/eisc/swii/bilbioteca/
├── BilbiotecaApplication.java
├── config/CorsConfig.java
├── controller/
│   ├── LibroCrudController.java
│   └── ListadoController.java
├── domain/
│   ├── Editorial.java
│   └── Libro.java
├── repository/
│   ├── EditorialRepository.java
│   └── LibroRepository.java
└── service/
    ├── EditorialService.java
    └── LibroService.java
```

## Modelo de Datos

**Libro**: id, nombre, descripcion, imagenUrl, editorial (ManyToOne)

**Editorial**: id, nombre, sitioWeb
