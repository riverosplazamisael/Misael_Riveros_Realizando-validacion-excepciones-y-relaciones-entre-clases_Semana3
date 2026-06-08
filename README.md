# Sistema de Gestión de Tours

## 📌 Nombre del proyecto
Sistema de Gestión de Tours

---

## 📖 Breve descripción del propósito
Este proyecto en Java simula un sistema básico de gestión de tours turísticos. Permite modelar clientes, guías turísticos, rutas (RUT), y tours, estableciendo relaciones entre ellos. El objetivo es practicar programación orientada a objetos (POO), manejo de clases, objetos y relaciones entre entidades.

---

## 📁 Estructura de paquetes y clases implementadas

### 📦 paquete `app`
- `Main`: Clase principal donde se crean objetos y se ejecuta la aplicación.

### 📦 paquete `model`
- `Cliente`: Representa a un cliente del sistema.
- `Guia`: Representa un guía turístico.
- `Tour`: Representa un tour disponible.
- `Rut`: Representa la identificación RUT de una persona.

### 📦 paquete `util` 
- `RutInvalidoException`: Excepción personalizada para validar RUT inválidos.

---

## ⚙️ Instrucciones para compilar y ejecutar

### 💻 Opción 1: IntelliJ IDEA (recomendado)
1. Abrir el proyecto en IntelliJ IDEA.
2. Asegurarse de que las carpetas estén marcadas como `src`.
3. Ir a la clase `Main`.
4. Presionar el botón ▶️ "Run".

---

### 💻 Opción 2: Línea de comandos

#### 1. Compilar el proyecto:
Ubícate en la carpeta raíz del proyecto y ejecuta:

```bash
javac -d out src\model\*.java src\app\*.java src\util\*.java
java -cp out app.Main