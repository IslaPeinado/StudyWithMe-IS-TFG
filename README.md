# Study With Me

<p align="center">
  <img src="src/main/resources/static/images/logos/logoSinFondo.png" alt="Study With Me logo" width="220">
</p>

Plataforma web educativa desarrollada como Trabajo de Fin de Grado para la gestion academica por roles. El proyecto permite trabajar con perfiles de `administrador`, `profesor` y `alumno`, cada uno con vistas, rutas y permisos diferenciados dentro de la aplicacion.

## Descripcion

`Study With Me` es una aplicacion web construida con `Spring Boot`, `Thymeleaf` y `MySQL` orientada a centralizar operaciones academicas como:

- gestion de alumnos, profesores, cursos, asignaturas y tareas
- autenticacion y autorizacion por roles
- consulta de asignaturas asociadas al usuario autenticado
- visualizacion de tareas, tablones, calendario y perfiles
- administracion de datos desde un panel interno

## Stack tecnologico

- `Java 17`
- `Spring Boot 3.2.1`
- `Spring MVC`
- `Spring Security`
- `Spring Data JPA`
- `Thymeleaf`
- `MySQL`
- `Maven`
- `Bootstrap 5`
- `Bootstrap Icons`

## Funcionalidades principales

### Administrador

- alta, edicion, listado y borrado de alumnos
- alta, edicion, listado y borrado de profesores
- alta, edicion, listado y borrado de administradores
- alta, edicion, listado y borrado de cursos
- alta, edicion, listado y borrado de asignaturas
- alta, edicion, listado y borrado de tareas

### Profesor

- consulta de asignaturas asignadas
- acceso al perfil personal
- visualizacion del tablon de tareas por asignatura
- consulta de personas vinculadas a una asignatura
- creacion y modificacion de tareas
- calificacion de tareas

### Alumno

- consulta de asignaturas matriculadas
- acceso al perfil personal
- visualizacion del tablon de asignatura
- consulta de calendario
- visualizacion de tareas y detalle de cada tarea
- consulta de profesorado y companeros por asignatura

## Arquitectura

La aplicacion sigue un enfoque MVC clasico:

- `controllers`: gestion de rutas HTTP y vistas
- `services`: logica de apoyo para consultas funcionales
- `repository`: acceso a datos con Spring Data JPA
- `entity`: mapeo ORM con las tablas de MySQL
- `templates`: vistas Thymeleaf renderizadas en servidor
- `static`: estilos, scripts e imagenes

## Estructura del proyecto

```text
.
|-- database/
|   `-- studywithme.sql
|-- documentacion/
|-- src/
|   |-- main/
|   |   |-- java/com/example/swm/
|   |   |-- resources/templates/
|   |   `-- resources/static/
|   `-- test/
|-- pom.xml
|-- package.json
`-- README.md
```

## Instalacion

### 1. Requisitos

- `Java 17`
- `MySQL`
- `Node.js` opcional para dependencias frontend

### 2. Configurar la base de datos

Ejecuta el script:

```sql
database/studywithme.sql
```

La configuracion actual de desarrollo esta en `src/main/resources/application.properties`:

```properties
server.port=8080
spring.datasource.url=jdbc:mysql://localhost:3306/studywithme
spring.datasource.username=root
spring.datasource.password=curso
```

### 3. Arrancar la aplicacion

En Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

En Linux o macOS:

```bash
./mvnw spring-boot:run
```

### 4. Ejecutar tests

```powershell
.\mvnw.cmd test
```

## Acceso local

- Home: `http://localhost:8080/`
- Login: `http://localhost:8080/login`

## Seguridad

La autenticacion se apoya en `Spring Security` y `JdbcUserDetailsManager`, tomando usuarios desde tres tablas distintas:

- `administradores`
- `profesores`
- `alumnos`

Cada tipo de usuario recibe un rol diferente:

- `ROLE_ADMINISTRADOR`
- `ROLE_PROFESOR`
- `ROLE_ALUMNO`

## Base de datos

El modelo relacional incluye tablas principales y tablas de enlace para representar relaciones muchos a muchos entre usuarios, cursos, asignaturas y tareas.

Tablas principales:

- `administradores`
- `profesores`
- `alumnos`
- `cursos`
- `asignaturas`
- `tareas`

Tablas de enlace destacadas:

- `alumno_asignatura`
- `profesor_asignatura`
- `alumnos_tarea`
- `profesor_tarea`
- `tarea_asignatura`
- `tarea_curso`

## Capturas y recursos visuales

Actualmente el repositorio incluye recursos graficos del proyecto usados por la interfaz. Esta seccion puede ampliarse despues con capturas reales de la aplicacion en ejecucion.


## Documentacion tecnica

La documentacion detallada del proyecto esta en [`documentacion/`](documentacion/README.md).

- [Puesta en marcha](documentacion/01-puesta-en-marcha.md)
- [Arquitectura](documentacion/02-arquitectura.md)
- [Funcionalidades y rutas](documentacion/03-funcionalidades-y-rutas.md)
- [Base de datos](documentacion/04-base-de-datos.md)
- [Mapa del proyecto](documentacion/05-mapa-del-proyecto.md)
- [Observaciones tecnicas](documentacion/06-observaciones-tecnicas.md)

## Estado actual

El proyecto dispone de base funcional completa para un entorno academico y de una estructura clara por capas. Como linea de mejora, conviene reforzar testing, revisar algunos prefijos de rutas y homogeneizar ciertos aspectos de configuracion y seguridad.
