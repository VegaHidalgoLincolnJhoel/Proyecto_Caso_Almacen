# 📦 Configuración del JDBC en NetBeans (Conexión a SQL Server)

> Proyecto: `CasoAlmacen`  
> Lenguaje: Java con NetBeans + ANT  
> Motor: SQL Server  
> Objetivo: Evitar errores de compilación al clonar el repositorio y usar el driver JDBC

---

## ✅ Requisitos Previos

1. Tener Java instalado (JDK 11 o superior recomendado).
2. NetBeans correctamente instalado.
3. Tener el archivo `.jar` del JDBC (versión: `mssql-jdbc-8.2.2.jre11.jar`).

---

## 🗂️ Paso 1: Crear carpeta común para el `.jar`

Todos los miembros del equipo deben crear la siguiente carpeta:

```
C:\Users\JDBC\
```

Y dentro de ella, guardar este archivo:

```
mssql-jdbc-8.2.2.jre11.jar
```

---

## 📥 Paso 2: Agregar la librería al proyecto en NetBeans

1. Haz clic derecho sobre el **proyecto** en NetBeans → `Properties`.
2. Ve a la sección **Libraries**.
3. En la pestaña **Compile**, haz clic en `+` en la parte de `Classpath`.
4. Selecciona **Add JAR/Folder...**.
5. Busca el archivo `mssql-jdbc-8.2.2.jre11.jar` en:
C:\Users\JDBC\

6. En la parte inferior derecha:
- ✅ Marca la opción **Absolute Path**
- ❌ No uses "Relative Path"
- Asegúrate que diga algo como:
  ```
  C:\Users\JDBC\mssql-jdbc-8.2.2.jre11.jar
  ```
7. Haz clic en **Open** y luego en **OK**.

---

## 🔁 Paso 3: Verificación

1. Limpia y compila el proyecto: `Clean and Build`.
2. Si no hay errores de `.jar`, ya está todo listo.
3. Tu NetBeans no debería mostrar errores de librerías en futuras ejecuciones.

---

## ❗ Notas importantes

- **No subir el archivo .jar a GitHub**. Solo compartan este `README.md`.
- Si alguien usa otra versión de Java (por ejemplo, Java 8), deberá usar el `.jre8.jar` en lugar del `.jre11.jar`.

---

## 🛠 ¿Errores?

Si ves algo como:

BUILD FAILED: zip file is empty

Significa que el `.jar` está corrupto. Descárgalo nuevamente desde:

🔗 [Descargar JDBC SQL Server](https://learn.microsoft.com/sql/connect/jdbc/download-microsoft-jdbc-driver-for-sql-server)

---

## 👨‍💻 Contacto del proyecto

Desarrollador principal: **Lincoln Vega**  

---


# Proyecto_Caso_Almacen
Repositorio del Proyecto del curso de Programacion Orientada a Objetos (P.O.O)
