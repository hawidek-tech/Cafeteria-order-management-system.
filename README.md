# Cafeteria Order Management System (Java)
  Project Description
This is a simple Java console-based Cafeteria Order Management System.
It demonstrates core Object-Oriented Programming (OOP) concepts:
  -Encapsulation
  -Inheritance
  -Polymorphism
The system allows customers to place orders, and the admin can view who ordered what.
  OOP Concepts Used
1. Encapsulation
Private variables like name, price, and customerName
Accessed using constructors and getters
2. Inheritance
Food and Drink classes inherit from MenuItem
3. Polymorphism
display() method is overridden in Food and Drink
Same method behaves differently depending on object type
  Project Structure
MenuItem.java   → Parent class (menu items)
Food.java       → Food item (inherits MenuItem)
Drink.java      → Drink item (inherits MenuItem)
Order.java      → Handles customer orders
Main.java       → Runs the program
  Sample Output
=== Orders ===
Hawi ordered:
Food: Burger | Price: 120.0

Nejma ordered:
Drink: Coke | Price: 30.0
