# Proyecto de API  - SCREENMATCH 2

Este proyecto es una API desarrollada con Spring Boot que permite gestionar y mostrar información relacionada con series de televisión, incluyendo detalles como temporadas, episodios, categorías y más. La API está diseñada para ser consumida por un frontend, permitiendo la interacción con los datos de manera eficiente.
Cabe aclarar que la plantilla para la parte de Front End, así como el procedimiento para el desarrollo de la parte de Back End del proyecto, fueron obtenidos y desarrollados (respectivamente) en el curso **Java: creando tu primera API y conectándola a Front End**, del programa ONE, po **Alura Latam** y **Oracle** . 

---

## Características
- **Front End**: toda la información mostrada se muestra como si fuera una página web, combinando Back End con Front End
- **Listado de Series**: Permite consultar todas las series almacenadas en la base de datos.
- **Series por Categoría**: Obtención de series filtradas por categorías (géneros).
- **Detalle de Serie**: Proporciona información detallada sobre una serie específica, incluyendo temporadas y episodios.
- **Top 5 Series**: Obtención de las 5 mejores series basadas en la evaluación de los usuarios.
- **API Restful**: La API sigue principios RESTful y utiliza endpoints bien estructurados para facilitar su integración con otros sistemas.

---

### Tecnologías Utilizadas

- **Spring Boot**: Framework para la creación de aplicaciones Java basadas en Spring.
- **JPA**: Persistencia de datos en la base de datos mediante Java Persistence API.
- **DTO**: Uso de objetos de transferencia de datos para encapsular la información que se retorna.
- **Jackson**: Biblioteca para la serialización y deserialización de datos en formato JSON.
- **CORS**: Configuración de políticas de seguridad para solicitudes entre diferentes orígenes.

---

### Estructura del Proyecto

El proyecto sigue la arquitectura Modelo-Vista-Controlador (MVC), con las siguientes capas:

- **Controladores**: Mapeo de las rutas de la API y manejo de solicitudes HTTP.
- **Servicios**: Lógica de negocio y manejo de las entidades.
- **Repositorios**: Interacción con la base de datos.
- **DTOs**: Objetos diseñados para transferir datos de forma segura y eficiente.

---

### Extras

- **Inyección de Dependencias**: El uso de la inyección de dependencias permite separar responsabilidades y hacer el código más limpio.
- **Uso de Streams**: Para realizar transformaciones de listas y objetos de forma eficiente.
- **Validación de Datos**: Se utilizan `Optional` y comprobaciones para evitar problemas con datos no encontrados.
- **Trabajo Incremental**: El desarrollo de la aplicación se ha realizado de manera incremental, añadiendo nuevas funcionalidades conforme se necesitaban.

---

## Pruebas

Las pruebas de la API se pueden realizar utilizando herramientas como **Postman** o directamente desde el frontend.

Ejemplo de pruebas:

- **Obtener el listado de todas las series**: `GET http://localhost:8080/series`
- **Obtener el detalle de una serie**: `GET http://localhost:8080/series/{id}`
- **Filtrar series por categoría**: `GET http://localhost:8080/series/categoria/{categoria}`

---

¡Gracias por tu interés en este proyecto!
