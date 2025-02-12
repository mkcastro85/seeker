# GitHub User Search API

## Descripción
Este servicio permite  buscar usuarios en GitHub. La búsqueda se realiza a través de un servicio que interactúa con la API pública de GitHub.

## Endpoints

### 🔍 Buscar Usuarios en GitHub
**Endpoint:**
```
GET /github/search
```
**Descripción:**
Realizar busqueda.

**Parámetros:**
- `user` (String, requerido) - Nombre de usuario a buscar.

**Ejemplo de solicitud:**
```
GET /github/search?user=Meyling
```

**Respuesta:**
```json
{
    "items": [
        {
            "login": "testuser",
            "id": 12345,
            "avatar_url": "https://avatars.githubusercontent.com/u/12345?v=4",
            "html_url": "https://github.com/testuser"
....
        }
    ]
}
```

## Tecnologías utilizadas
- **Spring Boot**
- **Spring Web**


## Instalación y Ejecución

1. Clonar el repositorio:
   ```sh
   git clone https://github.com/mkcastro85/seeker.git
   cd seeker
   ```
2. Construir y ejecutar el proyecto con Maven:
   ```sh
   mvn spring-boot:run
   ```

```sh
mvn test
```

## Autor
- **mkcastro85**
