# Funcionalidades y rutas

## Zona publica

Rutas principales:

- `/`
- `/join`
- `/knowUs`
- `/login`
- `/logout`
- `/login-error`

Funcion:

- mostrar la pagina principal
- mostrar informacion corporativa
- iniciar o cerrar sesion

## Funcionalidades de administrador

Prefijo base: `/administradores`

### Modulos disponibles

- gestion de alumnos
- gestion de administradores
- gestion de profesores
- gestion de cursos
- gestion de asignaturas
- gestion de tareas
- vista de perfil propio
- home privada de administrador

### Patrones de ruta usados

Alumnos:

- `/alumnos/viewCrearAlumnoAdministradores`
- `/alumnos/guardarAlumno`
- `/alumnos/viewListarAlumnosAdministradores`
- `/alumnos/listarAlumnosAdministradores`
- `/alumnos/viewActualizarAlumnoAdministradores/{id_alumno}`
- `/alumnos/actualizarAlumno/{id_alumno}`
- `/alumnos/borrarAlumno/{id_alumno}`

Administradores:

- `/administradores/viewHomeAdministrador`
- `/administradores/homeAdministrador`
- `/administradores/viewCrearAdministrador`
- `/administradores/guardarAdministrador`
- `/administradores/viewListarAdministradores`
- `/administradores/listarAdministradores`
- `/administradores/viewActualizarAdministradores/{id_admin}`
- `/administradores/actualizarAdministradores/{id_admin}`
- `/administradores/borrarAdministrador/{id_admin}`
- `/administradores/viewPerfilAdministrador`
- `/administradores/perfilAdministrador`

Profesores:

- `/profesor/viewCrearProfesorAdministrador`
- `/profesor/guardarProfesor`
- `/profesor/viewListarProfesoresAdministradores`
- `/profesor/listarProfesoresAdmin`
- `/profesor/viewActualizarProfesorAdministradores/{id_profesor}`
- `/profesor/actualizarProfesor/{id_profesor}`
- `/profesor/borrarProfesorAdministrador/{id_profesor}`

Cursos:

- `/curso/viewCrearCursoAdministrador`
- `/curso/guardarCurso`
- `/curso/viewListarCursosAdministradores`
- `/curso/listarCursosAdmin`
- `/curso/viewActualizarCursosAdministradores/{id_curso}`
- `/curso/actualizarCurso/{id_curso}`
- `/curso/borrarCursoAdministrador/{id_curso}`

Asignaturas:

- `/asignatura/viewCrearAsignaturasAdministrador`
- `/asignatura/guardarAsignatura`
- `/asignatura/viewListarAsignaturasAdministradores`
- `/asignatura/listarAsignaturaAdministrador`
- `/asignatura/viewActualizarAsignaturasAdministradores/{id_asignatura}`
- `/asignatura/actualizarAsignatura/{id_asignatura}`
- `/asignatura/borrarAsignaturaAdministrador/{id_asignatura}`

Tareas:

- `/tareas/viewCrearTareaAdministrador`
- `/tareas/guardarTarea`
- `/tareas/viewListarTareasAdministradores`
- `/tareas/listarTareasAdministrador`
- `/tarea/viewActualizarTareasAdministradores/{id_tarea}`
- `/tareas/actualizarTarea/{id_tarea}`
- `/tareas/borrarTareaAdministrador/{id_tarea}`

## Funcionalidades de profesor

Prefijo base: `/profesor`

### Funciones

- ver asignaturas asignadas
- ver perfil
- ver tablon de una asignatura
- ver calendario de asignatura
- ver personas de la asignatura
- listar tareas
- ver detalle de tarea
- crear tarea
- modificar tarea
- calificar tarea
- subir archivo de trabajo

### Rutas detectadas

- `/profesor/homeProfesor`
- `/profesor/viewPerfilProfesor`
- `/profesor/perfilProfesor`
- `/asignatura/{id}`
- `/asignatura/calendario/{idAsignatura}`
- `/asignatura/verPersonas/{idAsignatura}`
- `/asignaturas/{idAsignatura}`
- `/asignatura/verUnaTarea/{idAsignatura}/{idTarea}`
- `/tareas/{id}/subirTrabajo`
- `/tareas/modificarTarea`
- `/tareas/calificarTarea`
- `/asignatura/listarTareas/{idAsignatura}`
- `/tareas/viewCrearTarea/{idAsignatura}`
- `/tareas/crearTarea/{idAsignatura}`

## Funcionalidades de alumno

Prefijo base declarado: `/alumnos`

### Funciones

- ver asignaturas matriculadas
- ver perfil
- ver tablon por asignatura
- ver calendario
- ver profesores y companeros de una asignatura
- ver listado de tareas
- ver detalle de tarea

### Rutas detectadas

- `/alumnos/homeAlumnos`
- `/alumnos/viewPerfilAlumno`
- `/alumnos/perfilAlumno`
- `/asignatura/{id}`
- `/asignatura/calendario/{idAsignatura}`
- `/asignatura/verPersonas/{idAsignatura}`
- `/asignatura/verTareas/{idAsignatura}`
- `/asignatura/verUnaTarea/{idTarea}`

## Vistas Thymeleaf por rol

### Publicas

- `index.html`
- `join.html`
- `knowUs.html`
- `pages/login.html`

### Administrador

- `pages/administrador/...`
- subcarpetas: `student`, `teacher`, `grade`, `subject`, `task`

### Profesor

- `pages/profesor/homeProfesor.html`
- `pages/profesor/profileProfesor.html`
- `pages/profesor/asignatura/...`

### Alumno

- `pages/alumno/homeAlumno.html`
- `pages/alumno/profileAlumno.html`
- `pages/alumno/grade/...`

## Recursos de interfaz

- barras de navegacion especificas para cada rol
- hojas de estilo:
  - `style.css`
  - `loginStyle.css`
  - `calendar.css`
- scripts:
  - `script.js`
  - `calendar.js`
  - `validatorForm.js`
