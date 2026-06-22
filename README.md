# Automatización de Pruebas para web E-commerce

## Descripción
Este proyecto incluye un conjunto de pruebas automatizadas para un sitio web de comercio electrónico.
Se validan funcionalidades clave como:
– Registro de usuario.
– Inicio de sesión.
– Proceso de compra (carrito y pago).

Las pruebas fueron diseñadas para asegurar que las principales características del sitio funcionen correctamente y detectar errores antes del lanzamiento.

## Herramientas Utilizadas
– **Lenguaje:** Java
– **Framework de Automatización:** Selenium WebDriver
– **Gestor de Dependencias:** Maven
– **Framework de Testing:** TestNG
– **Reporte de Resultados:** ExtentReports

## Objetivo
Automatizar las pruebas de las principales funcionalidades de un sitio web de comercio electrónico para reducir el tiempo y esfuerzo en las pruebas manuales y aumentar la cobertura de pruebas.

## Estructura del Proyecto
– `/src/test/java/tests`: Clase principal HomeTest.
– `/src/main/java/org.example`: Scripts de prueba automatizados.
- `/src/main/java/driver`: Archivos de configuración como el driver de Selenium.
– `/src/main/java/reports`:  Reportes de prueba.


#### **Ejemplo de Caso de Prueba**
## Ejemplo de Caso de Prueba
Verificar que un usuario pueda iniciar sesión correctamente.

Pasos:
1. Abrir el navegador e ir al sitio web.
2. Ingresar el usuario y la contraseña del usuario.
3. Hacer clic en el botón de «Login».
4. Validar que el usuario sea redirigido al panel principal.

El script correspondiente se encuentra en `/src/main/java/org.example/LoginPage.java`.

## Autores
– **Tu Nombre** – Cristina C. QA Automation Tester
– LinkedIn: www.linkedin.com/in/cristina-correas-callero-18853290
