# SOLID-principles
Solucion de problemas de programacion con la implementacion de los principios SOLID
- Nombre:Oscar Raul Lopez Perez
- Carnet:1290-17-4138
## Principles
- Single Responsibility Principle
- Open/Closed Principle
- Liskov Substitution Principle
- Interface Segregation Principle
- Dependency Inversion Principle
## Samples
   Single Responsability Principle
   Vehicle Shop
   Problem:
   - El problema radica en que las responsabilidades recaen en una sola clase la cual es el WorkShopController,
   Solution
   - Con base al princincipio de responsabilidad unica, se crea otra clase llamada WorkShopManagerController, el cual tendra las responsabilidades correspondientes a el, como la de DeliverCar,CollectServices,RecibeCar, las cuales estaban todas en una sola clase, dificultando el mantenimiento y lectura
   
   Open/ClosedPrinciple
   converterApp
   Problem:
   - El problema radica cuando nosotros deseamos agregar un nuevo formato a la aplicacion sin modificar el codigo ya hecho, en este caso si decidieramos agregar un formato nuevo, tendriamos que modoficar la clase en la cual estan los demas formatos arriesganodonos de esa forma.
   
   Solution:
   -La solucion una interfaz la cual contiene el metodo convertir y creamos una clase para cada formato las cuales implementan a la interfaz y una clase adicional que contenga un metodo con el parametro de entrada de tipo interfaz, de este modo nos aseguramos que solo recibiremos objetos correctos, de esta manera podremos agregar multiples formatos sin la necesidad de modificar el codigo ya crado.
   
   Interface Segregation Principle
   vehiclesApp
   Problem:
   - El problema consiste en que los vehiculos extiende a una clase con metodos que no pueden realizar todos debido a que hay vehiculos con ruedas y vehiculos sin ruedas, un problema de abstraccion.
   
   Solution:
   -La solucion es crear dos clases adicionales, una que contenga los metodos para los vehiulos con ruedas y otra para los vehiculos sin ruedas, estas clases extras implementaran la clase inicial que contenia todos los metodos, pero estas la implementaran de diferente manera, asi resolvemos el prolema de exepciones.
