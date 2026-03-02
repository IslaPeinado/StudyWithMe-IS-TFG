# Puesta en marcha

## Requisitos

- Java 17
- Maven Wrapper incluido (`mvnw`, `mvnw.cmd`)
- MySQL en local
- Node.js solo si se quieren reinstalar dependencias frontend

## Configuracion actual

El archivo `src/main/resources/application.properties` define:

- Puerto: `8080`
- Base de datos: `jdbc:mysql://localhost:3306/studywithme`
- Usuario: `root`
- Password: `curso`
- Dialecto JPA: `MySQL8Dialect`

## Preparar la base de datos

1. Crear la base ejecutando `database/studywithme.sql`.
2. Verificar que exista la base `studywithme`.
3. Confirmar que las credenciales coincidan con `application.properties`.

El script SQL:

- crea tablas maestras
- crea tablas de enlace
- inserta datos de prueba
- inserta usuarios con contrasenas cifradas con BCrypt

## Arrancar la aplicacion

En Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

En otros entornos:

```bash
./mvnw spring-boot:run
```

## Ejecutar tests

```powershell
.\mvnw.cmd test
```

Actualmente solo existe un test de carga de contexto.

## Dependencias frontend

El proyecto incluye `bootstrap` y `bootstrap-icons` en `package.json`. La carpeta `node_modules` ya esta presente en el repositorio actual, aunque en un flujo normal se reconstruiria con:

```powershell
npm install
```

## Acceso a la aplicacion

- Home publica: `http://localhost:8080/`
- Login: `http://localhost:8080/login`

Tras autenticarse, Spring Security redirige a `/`, y desde ahi la interfaz muestra contenido segun el rol del usuario autenticado.
