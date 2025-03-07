# 📐 Java Shape Calculator

## 📌 Description
This is a **menu-driven Java program** that calculates the **area, perimeter, and volume** of different shapes.  
The program uses **OOP principles** such as **abstract classes, interfaces, and inheritance** for a well-structured design.

---

## 🚀 Features
✔ **Supports both 2D & 3D shapes**  
✔ **Encapsulated, modular design using separate Java files**  
✔ **Implements Abstract Class (`Shape`) & Interface (`Volume`)**  
✔ **User-friendly menu-driven interface**  

---

## 📌 **Classes & Functionalities**
### 1️⃣ **`Shape.java`** (Abstract Class)
- Defines the **template for all shapes**.
- Includes an **abstract method** for `calculateArea()` and `calculatePerimeter()`.
- Provides a **constructor** to set the shape name.

### 2️⃣ **`Volume.java`** (Interface)
- Defines `calculateVolume()` as an **abstract method**.
- Implemented by **3D shape classes** (e.g., `Sphere`, `Cylinder`, `EquilateralPyramid`).

### 3️⃣ **Shape Implementations**
| Class                  | Type   | Implements       | Key Methods                     |
|------------------------|--------|-----------------|--------------------------------|
| `Circle`              | 2D     | `Shape`         | `calculateArea()`, `calculatePerimeter()` |
| `Rectangle`           | 2D     | `Shape`         | `calculateArea()`, `calculatePerimeter()` |
| `Square`              | 2D     | `Rectangle`     | Uses rectangle methods         |
| `Sphere`              | 3D     | `Shape, Volume` | `calculateArea()`, `calculateVolume()` |
| `Cylinder`            | 3D     | `Shape, Volume` | `calculateArea()`, `calculateVolume()` |
| `EquilateralPyramid`  | 3D     | `Shape, Volume` | `calculateArea()`, `calculateVolume()` |

---



