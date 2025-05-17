# inventario-service
Este es el microservicio del inventario de los perfumes.

# Microservicio de Inventario – Perfulandia SPA

Este microservicio permite gestionar el inventario de perfumes de la tienda Perfulandia. Permite registrar, consultar, actualizar y eliminar perfumes del sistema.

## 🧠 ¿Qué vas a aprender con este proyecto?

- Crear microservicios con Spring Boot y Java.
- Aplicar operaciones CRUD con JPA.
- Conectar un proyecto Java a MySQL.
- Crear una estructura backend limpia y modular.
- Usar herramientas como Postman y Lombok.

## ⚙️ Tecnologías usadas

- Java 21
- Spring Web
- Spring Data JPA
- MySQL
- Lombok

---

## 🚀 ¿Qué hace este microservicio?

- Registra perfumes nuevos.
- Consulta todos los perfumes o por ID.
- Permite actualizar el stock de un perfume.
- Elimina perfumes del catálogo.

---

## 📝 Endpoints disponibles

| Método | Ruta                                     | Descripción                     |
|--------|------------------------------------------|---------------------------------|
| GET    | `/api/v1/perfumes`                       | Lista todos los perfumes        |
| GET    | `/api/v1/perfumes/{id}`                  | Obtiene un perfume por ID       |
| POST   | `/api/v1/perfumes`                       | Crea un nuevo perfume           |
| PUT    | `/api/v1/perfumes/{id}/stock?stock=30`   | Actualiza el stock de un perfume |
| DELETE | `/api/v1/perfumes/{id}`                  | Elimina un perfume              |

---

## 🧪 Ejemplo JSON para crear un perfume

```json
{
  "nombre": "Invictus",
  "marca": "Paco Rabanne",
  "precio": 59990,
  "stock": 30
}
