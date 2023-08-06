# oop-java
Repository to save my progress in OOP Java studies. I'm following this course: [curso em video](https://www.cursoemvideo.com/curso/java-poo/aulas/java-poo/)

**Class 2 - What is an Object?:**

All objects have attributes, methods, and states.
- class: define the attributes and methods
- object: it is a class instance

**Class 3 - What is Object Visibility?:**

UML: Unified Modeling Language

Class Diagram: class -> first letter is uppercase; attribute or method -> all letters are lowercase; method -> parentheses in the end.

Visibility modifiers: 

- +: public (all classes)
- -: private (only current class)
- #: protect (current class and sub-classes)

**Class 4 - Special Methods**

It's recommend to create a get and a set method for each attribute of one class.

- Getters: this method is a security way to get an attribute, to "get" some attribute from an object, insted to access straight we have to use the `<obj>.get<attribute>()` method.

- Setters: this method is a security way to set an attrivute, to "set" some attribute from an object, insted to modify straight we have to use the `<obj>.set<attribute>(<parameter>)` method.

- Construct: this method will run everytime that an object was created, this method will define the standard values for the class attributes. This method has the same name that its class, ex: a class that calls "House", the constructor method will be something like `public House(){ ... }`. The construct and setters methods can work together.

**Class 5 - Hands-on with Objects**

Bank account example. Create a bank account class with the follow requisites:

- Attributes: + numConta, # tipo (cc or cp), - dono (name), - saldo, - status (true or false).

- Methods: + abrirConta(){cc=50; cp=150;}, + fecharConta(){saldo=0}, + depositar(){status=true}, + sacar(){status=true; saldo>s;}, + pagarMensal(){cc=12;cp=20;}.

- All special methods: getters, setters and construct{saldo=0 & status=false}.

**Class 6**
