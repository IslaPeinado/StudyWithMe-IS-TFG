# Observaciones tecnicas

## Estado actual del proyecto

El proyecto es funcional como base academica para un TFG y tiene una separacion clara por roles, pero presenta varios detalles tecnicos relevantes para mantenimiento y evolucion.

## Observaciones de implementacion

- Hay controladores anotados con `@RestController` que realmente devuelven vistas `ModelAndView`. En una aplicacion MVC tradicional seria mas consistente usar `@Controller`.
- La seguridad declara acceso para `/alumno/**`, pero el controlador de alumnos usa el prefijo `/alumnos`. Esa diferencia conviene revisarla porque puede afectar al control de acceso esperado.
- Existen rutas con prefijos repetidos, por ejemplo en profesor y administrador, porque se combina `@RequestMapping` de clase con segmentos similares en metodos.
- El flujo de logout esta definido tanto en `SecurityConfig` como en `ControladorGeneral`.
- El codigo incluye llamadas a `Thread.sleep(...)` dentro de controladores antes de redirigir. No es recomendable para produccion porque bloquea el hilo de peticion.
- `pom.xml` contiene dependencias duplicadas o solapadas, como Thymeleaf repetido y dos conectores MySQL distintos.
- La carpeta `node_modules` esta versionada en el repositorio actual. En la mayoria de proyectos se excluye del control de versiones.
- La clase `logout.java` existe en `services/`, pero no representa un servicio de dominio util ni sigue la convencion habitual de nombres Java.
- El proyecto casi no tiene tests automatizados: solo hay una prueba de carga de contexto.

## Observaciones sobre persistencia

- Parte de la logica de negocio consulta directamente repositorios desde controladores.
- Algunas consultas custom en repositorios parecen mezclar ids de entidad con ids de tablas de enlace, por lo que conviene validarlas con datos reales antes de ampliar funcionalidad.
- El script SQL contiene un volumen considerable de datos semilla y comentarios de apoyo para pruebas manuales.

## Recomendaciones de evolucion

1. Unificar prefijos de rutas y reglas de seguridad.
2. Sustituir `@RestController` por `@Controller` donde corresponda.
3. Eliminar `Thread.sleep(...)` de los controladores.
4. Consolidar dependencias en `pom.xml`.
5. Aumentar cobertura de tests de controladores, seguridad y repositorios.
6. Externalizar credenciales de base de datos mediante variables de entorno o perfiles Spring.
