# DemoBlaze Automation Tests

Este proyecto contiene pruebas automatizadas para el sitio web DemoBlaze utilizando Selenium WebDriver maven y TestNG.

## Requisitos Previos

Para ejecutar estas pruebas, necesitarás tener instalado lo siguiente:
- Java JDK 8 o superior
- Maven
- WebDriver correspondiente a tu navegador

## Configuración del Proyecto

1. Clona el repositorio en tu máquina local.
2. Importa el proyecto como un proyecto Maven en tu IDE preferido.
3. Asegúrate de que Maven descargue y configure todas las dependencias necesarias.

## Ejecución de las Pruebas

Hay dos archivos XML de TestNG que puedes usar para ejecutar diferentes conjuntos de pruebas:

### blazeAddToCartTest.xml

Este archivo ejecuta las pruebas para añadir un producto al carrito y completar el formulario de orden.



blazeRegisterTest.xml
Este archivo ejecuta las pruebas para el registro (sign in) y el inicio de sesión (login).

Antes de ejecutar estas pruebas, debes cambiar las credenciales dentro de las clases de prueba:

Para el registro (sign in), actualiza las credenciales en /demoblazeDynamic2/src/test/java/com/blaze/test/SignInTest.java.
Para el inicio de sesión (login), actualiza las credenciales en /demoblazeDynamic2/src/test/java/com/blaze/test/LoginTest.java.


