# Arquitectura del sistema

## Estilo general

La aplicacion sigue una arquitectura MVC clasica sobre Spring Boot:

- `controllers`: gestionan rutas HTTP y seleccionan vistas
- `services`: encapsulan consultas de negocio y acceso agregado
- `repository`: acceso a datos con Spring Data JPA
- `entity`: mapeo ORM hacia tablas MySQL
- `templates`: vistas Thymeleaf
- `static`: recursos CSS, JS e imagenes

## Flujo principal

1. El usuario accede a una ruta web.
2. Spring Security valida la sesion y el rol.
3. El controlador obtiene el usuario autenticado o los parametros de ruta.
4. El controlador consulta servicios o repositorios.
5. Los datos se pasan a una vista Thymeleaf mediante `ModelAndView`.
6. La vista renderiza HTML apoyandose en Bootstrap y recursos estaticos.

## Capas backend

### Controladores

- `ControladorGeneral`
  - home publica
  - login
  - join
  - knowUs
  - logout
- `AdministradoresController`
  - CRUD de alumnos
  - CRUD de administradores
  - CRUD de profesores
  - CRUD de cursos
  - CRUD de asignaturas
  - CRUD de tareas
- `ProfesorController`
  - home de asignaturas del profesor
  - perfil
  - tablon por asignatura
  - calendario
  - listado de personas
  - detalle de tarea
  - creacion y modificacion de tareas
- `AlumnosController`
  - home de asignaturas del alumno
  - perfil
  - tablon de asignatura
  - calendario
  - listado de personas
  - listado de tareas
  - detalle de tarea

### Servicios

Los servicios son ligeros y se centran en exponer consultas concretas:

- `LoginService`: datos del usuario autenticado
- `AsignaturaService`: carga una asignatura por id
- `TareaService`: lectura, guardado y actualizacion de tareas
- `AlumnoService`: obtiene alumnos por asignatura
- `ProfesorService`: obtiene profesores por asignatura
- `AlumnoAsignaturaService`: asignaturas de un alumno
- `ProfesorAsignaturaService`: asignaturas de un profesor
- `AlumnoTareaService`: tareas asociadas a alumno
- `ProfesorTareaService`: tareas asociadas a profesor

### Persistencia

La persistencia usa Spring Data JPA sobre entidades como:

- `Administradores`
- `Alumnos`
- `Profesores`
- `Cursos`
- `Asignaturas`
- `Tareas`
- tablas de enlace como `AlumnoAsignatura`, `ProfesorAsignatura`, `AlumnoTarea`, `ProfesorTarea` y `TareaAsignatura`

## Seguridad

La clase `SecurityConfig` define:

- autenticacion con `JdbcUserDetailsManager`
- lectura de usuarios desde tres tablas: `administradores`, `profesores`, `alumnos`
- autoridad por rol:
  - `ROLE_ADMINISTRADOR`
  - `ROLE_PROFESOR`
  - `ROLE_ALUMNO`
- login personalizado en `/login`
- logout en `/logout`

El acceso queda segmentado por prefijos:

- `/administradores/**` solo administrador
- `/profesor/**` solo profesor
- `/alumno/**` solo alumno segun configuracion declarada

## Frontend

El frontend es server-rendered con Thymeleaf.

Piezas relevantes:

- vistas en `templates/`
- barras de navegacion separadas por rol
- estilos en `static/styles/`
- scripts en `static/scripts/`
- Bootstrap como base visual

## Configuracion de datos

La conexion a base de datos se construye con `DatabaseConfiguration`, que crea manualmente un `DataSource` usando propiedades de `application.properties`.
