# SOLID-principles
Solucion de problemas de programacion con la implementacion de los principios SOLID
- Nombre:Oscar Raul Lopez Perez
- Carnet:1290-17-4138
## Principles
- Single Responsibility Principle: S-Solution,S-Problem
- Open/Closed Principle: O-Problem,O-Solution
- Liskov Substitution Principle: L-Problem, L-Solution
- Interface Segregation Principle: I-Problem, I-Solution
- Dependency Inversion Principle: D-Problem,- D-Solution
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
   - La solucion una interfaz la cual contiene el metodo convertir y creamos una clase para cada formato las cuales implementan a la interfaz y una clase adicional que contenga un metodo con el parametro de entrada de tipo interfaz, de este modo nos aseguramos que solo recibiremos objetos correctos, de esta manera podremos agregar multiples formatos sin la necesidad de modificar el codigo ya crado.
   
   Liskov Substitution Principle
   vehiclesApp
   
   Problem:
   - El problema consiste en que los vehiculos extiende a una clase con metodos que no pueden realizar todos debido a que hay vehiculos con ruedas y vehiculos sin ruedas, un problema de abstraccion.
   
   Solution:
   - La solucion es crear dos clases adicionales, una que contenga los metodos para los vehiulos con ruedas y otra para los vehiculos sin ruedas, estas clases extras implementaran la clase inicial que contenia todos los metodos, pero estas la implementaran de diferente manera, asi resolvemos el prolema de exepciones.
   
   Interface Segregation Principle
   movieApp
   
   Problem:
   - El problema surge al tener todos los comportamientos o metodos dentro de una sola interfaz(IUserAcountsActions), metodos que no todos comparten, muy parecido al principio L.
  
   Solution:
   - La solucion segun este principio es crear una interfaz por cada comportamiento o accion que querramos ejecutar, asi podremos elegir que metodos implementar y compartir con otras clases
   
   Dependency Inversion Principle
   registerApp
   
   Problem:
   - En esta aplicacion que registra un nombre,no se ve nada inusual,el problema radica en que cuando querramos almacenar esa informacion en una base de datos diferente o almacenar de diferente forma el dato.
 
   Solution:
   - La solucion radica en crear una interfaz(IDao)que contiene el metodo save y utilizar el constructor de la clase que ejecuta la logica del negocio(servicePerson) para crear una instancia de la clase que conecta con la bd, 
