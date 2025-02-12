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
            "node_id": "MDQ6VXNlcjEzNTcwMTY0",
            "avatar_url": "https://avatars.githubusercontent.com/u/12345?v=4",
            "gravatar_id": "",
            "url": "https://api.github.com/users/testuser",
            "html_url": "https://github.com/testuser",
            "followers_url": "https://api.github.com/users/testuser/followers",
            "following_url": "https://api.github.com/users/testuser/following{/other_user}",
            "gists_url": "https://api.github.com/users/testuser/gists{/gist_id}",
            "starred_url": "https://api.github.com/users/testuser/starred{/owner}{/repo}",
            "subscriptions_url": "https://api.github.com/users/testuser/subscriptions",
            "organizations_url": "https://api.github.com/users/testuser/orgs",
            "repos_url": "https://api.github.com/users/testuser/repos",
            "events_url": "https://api.github.com/users/testuser/events{/privacy}",
            "received_events_url": "https://api.github.com/users/testuser/received_events",
            "type": "User",
            "user_view_type": "public",
            "site_admin": false,
            "score": 1

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
