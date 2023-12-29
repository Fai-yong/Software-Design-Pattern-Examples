# Software Design Patterns

This document provides an overview of some common software design patterns and includes class diagrams for demonstration purposes.

## Decorator

Introduction to the Decorator pattern:

The Decorator pattern allows for adding new functionalities to an existing object without altering its structure. This is achieved by creating a set of decorator classes that are used to wrap the original class and add additional behaviors. It is particularly useful for adhering to the Single Responsibility Principle, as it allows functionality to be divided between classes with unique areas of concern.

Class diagram for Decorator pattern:

![Decorator Class Diagram](decorator-class-diagram.png)

## Facade

Introduction to the Facade pattern:

The Facade pattern provides a simplified interface to a complex subsystem. By doing so, it hides the complexities of the subsystem from the client and promotes ease of use. This pattern is often used when a system is very complex or difficult to understand because it groups the work into a simpler, higher-level interface.

Class diagram for Facade pattern:

![Facade Class Diagram](facade-class-diagram.png)

## Factory

Introduction to the Factory pattern:

The Factory pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. This is done by creating objects via a common interface and deferring instantiation logic to subclass(es). It is particularly useful when the creation process is complex or when it needs to be dynamic and controlled at runtime.

Class diagram for Factory pattern:

![Factory Class Diagram](factory-class-diagram.png)

## Singleton

Introduction to the Singleton pattern:

The Singleton pattern ensures that a class has only one instance and provides a global point of access to it. This is especially useful when exactly one object is needed to coordinate actions across the system, such as a configuration manager or a connection pool.

Class diagram for Singleton pattern:

![Singleton Class Diagram](singleton-class-diagram.png)

## State

Introduction to the State pattern:

The State pattern allows an object to alter its behavior when its internal state changes. The object will appear to change its class. Rather than having a monolithic object that manages its state internally, state-specific behavior is distributed across a set of state objects and the main object delegates state-based behavior to its current state object.

Class diagram for State pattern:

![State Class Diagram](state-class-diagram.png)
