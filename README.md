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

**Class 6 - OOP pilars: Encapsulation**

The three pilars of OOP are Encapsulation (abstraction), Inheritance, and Polymorphism, some references separate the absctraction from encpasulation as a fourth pilar.

- Encapsulation definition: hide independent parts of the implementation to allow create invisible parts from the external world. The way to interact with the external world an object encapsulated uses the interface, so, it's important to create a good interface to guarantee the encapsulation quality.

- Encapsulation advantages: 

1. Make the changes invisible; 

2. Easy code reusability; 

3. Fewer collateral effects;

An interfaces don't are similar to classes, but they don't have attributes only methods. To work with encapsulation all attributes from a class have to be created as private (or at least protected) mode.

**Class 7 - Classes relationship**

The aim of this class is understand how create and use different classes in the same context.

- Aggregation concept: it's happening when a class has another class.

**Class 8 - Aggregation**

The aim of this class is show how to create aggregation relation between classes. To practice the concept the relation above was built in [Aula07](https://github.com/mascalmeida/oop-java/tree/main/Aula07) folder:

<p align="center">
<img width="250px"  src="https://github.com/mascalmeida/oop-java/assets/48625700/343c9b44-202c-4d85-b2bf-4ad426768bb5" />
</p>

**Class 9 - Hands-on with Objects 2**

Books, people and readers. Create the system above using POO.

<p align="center">
<img width="250px"  src="https://github.com/mascalmeida/oop-java/assets/48625700/ebd27095-8fff-4833-b31b-aca79fccc071" />
</p>

**Class 10 - Inheritance**

The aim of this class is show the inheritance concept. 

- Inheritance allows based a new classe on definition of another class previously created.

- The inheritance will be applied to characteristics (attributes) and behaviors (methods).

The image above shows the challenge of this class.

<p align="center">
<img width="250px"  src="https://github.com/mascalmeida/oop-java/assets/48625700/93cc5932-695b-47be-9a9c-e4bedbabbd03" />
</p>

**Class 11 - Inheritance**

1. Herança de implementação (pobre)

2. Herança para diferença

- Abstract Class: it can't generate objects.

- Abstract Method: it can only be used in interfaces or abstracts classes.

- Final Class: it's only a leaf, it can't generate other leafs.

- Final Method: it can't be specialized.

---------------

## References

- [OOP pilars 1](https://levelup.gitconnected.com/what-are-inheritance-encapsulation-polymorphism-and-abstraction-in-object-oriented-programming-526770ac18fa)
- [OOP pilars 2](https://datatrained.com/post/four-pillars-of-oops/)
