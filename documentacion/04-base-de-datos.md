# Base de datos

## Motor y configuracion

- Motor previsto: MySQL
- Base de datos: `studywithme`
- Script principal: `database/studywithme.sql`

## Tablas principales

### Usuarios

- `administradores`
- `profesores`
- `alumnos`

Cada tabla almacena:

- identificador numerico
- NIF unico
- nombre
- email unico
- password cifrada

En `alumnos` tambien aparecen:

- `nombre_padre_alumno`
- `nombre_madre_alumno`

### Academico

- `cursos`
- `asignaturas`
- `tareas`

Campos destacados:

- `cursos.nombre_curso`
- `asignaturas.nombre_asignatura`
- `asignaturas.imagen_asignatura`
- `asignaturas.descripcion_asignatura`
- `asignaturas.detalle_asignatura`
- `tareas.tipo_tarea`
- `tareas.titulo_tarea`
- `tareas.descripcion_tarea`
- `tareas.calificacion_tarea`

## Tablas de relacion

- `tarea_curso`
- `tarea_asignatura`
- `asignatura_curso`
- `alumnos_tarea`
- `profesor_tarea`
- `alumno_curso`
- `profesor_curso`
- `alumno_asignatura`
- `profesor_asignatura`

Estas tablas permiten modelar relaciones muchos-a-muchos entre usuarios, cursos, asignaturas y tareas.

## Entidades JPA presentes

Entidades maestras:

- `Administradores`
- `Alumnos`
- `Profesores`
- `Cursos`
- `Asignaturas`
- `Tareas`

Entidades de enlace mapeadas en codigo:

- `AlumnoAsignatura`
- `AlumnoTarea`
- `ProfesorAsignatura`
- `ProfesorTarea`
- `TareaAsignatura`

## Relaciones funcionales importantes

- Un alumno puede pertenecer a varias asignaturas.
- Un profesor puede impartir varias asignaturas.
- Una asignatura puede tener muchas tareas.
- Una tarea puede estar relacionada con una asignatura y con un curso.
- Un alumno y un profesor pueden quedar vinculados a tareas concretas.

## Datos semilla

El script incluye:

- administradores de prueba
- profesores de varias materias
- alumnos para varios cursos de ESO
- cursos de ejemplo
- asignaturas por nivel
- tareas y asociaciones con cursos y asignaturas

## Autenticacion y base de datos

Spring Security no usa una tabla unica de usuarios. En su lugar, compone usuarios y roles con consultas SQL sobre:

- `administradores`
- `profesores`
- `alumnos`

Esto permite autenticar a cualquier rol usando su NIF como `username`.
