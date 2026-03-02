# Mapa del proyecto

## Arbol resumido

```text
StudyWithMe-IS-TFG/
|-- database/
|   `-- studywithme.sql
|-- documentacion/
|   |-- README.md
|   |-- 01-puesta-en-marcha.md
|   |-- 02-arquitectura.md
|   |-- 03-funcionalidades-y-rutas.md
|   |-- 04-base-de-datos.md
|   |-- 05-mapa-del-proyecto.md
|   `-- 06-observaciones-tecnicas.md
|-- src/
|   |-- main/
|   |   |-- java/com/example/swm/
|   |   |   |-- config/
|   |   |   |-- controllers/
|   |   |   |-- entity/
|   |   |   |-- exceptions/
|   |   |   |-- repository/
|   |   |   |-- security/
|   |   |   |-- services/
|   |   |   `-- StudyWithMeIsTfgApplication.java
|   |   `-- resources/
|   |       |-- static/
|   |       |-- templates/
|   |       `-- application.properties
|   `-- test/
|       `-- java/com/example/swm/StudyWithMeIsTfgApplicationTests.java
|-- pom.xml
|-- package.json
`-- README.md
```

## Backend Java

### `config/`

- `DatabaseConfiguration.java`: crea el `DataSource` manualmente.

### `controllers/`

- `ControladorGeneral.java`: paginas publicas y autenticacion visible.
- `AdministradoresController.java`: mantenimiento de entidades principales.
- `ProfesorController.java`: experiencia del profesor.
- `AlumnosController.java`: experiencia del alumno.

### `entity/`

Contiene el modelo JPA. Se mezclan entidades maestras y de enlace.

### `repository/`

Repositorios Spring Data JPA con metodos `find...` y consultas `@Query`.

### `services/`

Servicios de apoyo para recuperar asignaturas, usuarios y tareas segun el contexto autenticado.

### `security/`

- `SecurityConfig.java`: reglas de autenticacion y autorizacion.

## Recursos y vistas

### `templates/`

Organizacion por rol:

- vistas publicas en la raiz
- vistas de administrador en `pages/administrador`
- vistas de alumno en `pages/alumno`
- vistas de profesor en `pages/profesor`
- pagina de error en `pages/error`

### `static/`

- `styles/`: estilos globales, login y calendario
- `scripts/`: comportamiento de UI y validacion
- `images/`: logos e imagenes de contenido

## Base de datos

- `database/studywithme.sql` concentra tanto DDL como datos iniciales.

## Testing

- `StudyWithMeIsTfgApplicationTests.java`: solo valida que el contexto Spring levanta.
