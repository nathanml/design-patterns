## Abstract Factory (aka Kit)

# Intent
Provide an interface for creating families of related or dependent objects without specifying their classes.

# Motivation
Great for software that must be portable across look and feel standards.

# Applicability
1. When system should be independent of how its products are created, composed, and represented
2. When system should be configured with multiple product families
3. When you want to provide a class library of products revealing interfaces not implementations.

# Participants
1. AbstractFactory: Interface for operations that create abstract product objects.
2. ConcreteFactory: Implements operations to create concrete products.
3. AbstractProduct: Interface for type of product object
4. ConcreteProduct Implements abstract product created by concrete factory.
5. Client: Uses only interfaces defined by AbstractFactory and Product.

# Consequences
1. Isolates concrete classes
2. Makes exchanging product families easy
3. Promotes consistency
4. Difficult to support nenw types of products

# Implementation
1. Application typically only needs 1 ConcreteFactory per product family
2. Implement ConcreteProducts as subclass of AbstractProduct
3. Extend AbstractFactory to be able to generate each product defined.

# Known Uses
1. Portability across operating systems
2. Same UI across different systems