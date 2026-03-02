# Documentacion de Study With Me

Esta carpeta centraliza la documentacion funcional y tecnica del proyecto `StudyWithMe-IS-TFG`.

## Indice

1. [Puesta en marcha](01-puesta-en-marcha.md)
2. [Arquitectura del sistema](02-arquitectura.md)
3. [Funcionalidades y rutas](03-funcionalidades-y-rutas.md)
4. [Base de datos](04-base-de-datos.md)
5. [Mapa del proyecto](05-mapa-del-proyecto.md)
6. [Observaciones tecnicas](06-observaciones-tecnicas.md)

## Resumen rapido

`Study With Me` es una aplicacion web educativa basada en Spring Boot, Thymeleaf, Spring Security, JPA e integracion con MySQL. El sistema diferencia tres roles:

- `ADMINISTRADOR`: gestiona alumnos, profesores, cursos, asignaturas y tareas.
- `PROFESOR`: consulta sus asignaturas, ve alumnado, revisa tareas y crea nuevas tareas.
- `ALUMNO`: consulta asignaturas, tablon, personas del grupo, calendario y detalle de tareas.

## Tecnologias principales

- Java 17
- Spring Boot 3.2.1
- Spring MVC
- Spring Security
- Spring Data JPA
- Thymeleaf
- MySQL
- Bootstrap 5
- Bootstrap Icons

## Estructura de alto nivel

- `src/main/java/com/example/swm`: backend Java
- `src/main/resources/templates`: vistas Thymeleaf
- `src/main/resources/static`: CSS, JS e imagenes
- `database/studywithme.sql`: creacion y carga de datos

## Punto de entrada

- Aplicacion Spring Boot: `src/main/java/com/example/swm/StudyWithMeIsTfgApplication.java`
- Puerto por defecto: `8080`
- URL local: `http://localhost:8080`
