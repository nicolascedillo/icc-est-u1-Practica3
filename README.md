# Sistema de Gestión de Personas con Algoritmos de Ordenamiento y Búsqueda

## 📌 Información General

- **Título:** Sistema de Gestión de Personas
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Nicolás Cedillo
- **Fecha:** 22 de abril de 2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Este proyecto implementa un sistema completo para gestionar personas (nombre y edad) con capacidades de:  
- **Ordenamiento** mediante múltiples algoritmos:  
  - Burbuja por nombre  
  - Selección por nombre 
  - Inserción por edad  
  - Inserción por nombre  
- **Búsqueda** binaria eficiente:  
  - Por nombre  
  - Por edad  
- **Validación** de orden previo a búsquedas  
- Interfaz de usuario intuitiva mediante consola  

---
## 🏗️ Estructura del Proyecto
```plaintext
src/
├── models/
│ └── Person.java # Modelo de datos (nombre, edad)
├── views/
│ └── View.java # Interfaz de usuario (entrada/salida)
├── controllers/
│ ├── Controller.java # Coordinador principal
│ ├── SortingMethods.java # Algoritmos de ordenamiento
│ └── SearchMethods.java # Algoritmos de búsqueda
└── App.java # Punto de entrada
```
---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac App.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```

---

## 🧑‍💻 Ejemplo de Salida

```plaintext

Ingrese la cantidad de personas en el arreglo
3
-----------Menu----------
Seleccione una opción: 
1: Ingresar personas
2: Ordenar personas
3: Buscar persona
4: Mostrar personas
0: Salir
1
Ingrese el nombre: 
Juan
Ingrese la edad: 
14
Ingrese el nombre: 
Lola
Ingrese la edad: 
15
Ingrese el nombre: 
Pablo
Ingrese la edad: 
8
-----------Menu----------
Seleccione una opción:
1: Ingresar personas
2: Ordenar personas
3: Buscar persona
4: Mostrar personas
0: Salir
2
Seleccione método de ordenamiento: 
1: Burbuja por nombre
2: Selección por nombre
3: Inserción por edad
4: Inserción por nombre
1
-----------Menu----------
Seleccione una opción:
1: Ingresar personas
2: Ordenar personas
3: Buscar persona
4: Mostrar personas
0: Salir
3
Seleccione método de busqueda: 
1: Binaria por edad
2: Binaria por nombre
2
Ingrese el nombre: 
Pablo
Persona encontrada:
Person [name=Pablo, edad=8]
-----------Menu----------
Seleccione una opción:
1: Ingresar personas
2: Ordenar personas
3: Buscar persona
4: Mostrar personas
0: Salir
4
Lista de personas
Person [name=Juan, edad=14]
Person [name=Lola, edad=15]
Person [name=Pablo, edad=8]
-----------Menu----------
Seleccione una opción:
1: Ingresar personas
2: Ordenar personas
3: Buscar persona
4: Mostrar personas
0: Salir
5
Ingrese una ocpción valida
-----------Menu----------
Seleccione una opción:
1: Ingresar personas
2: Ordenar personas
3: Buscar persona
4: Mostrar personas
0: Salir
0

---