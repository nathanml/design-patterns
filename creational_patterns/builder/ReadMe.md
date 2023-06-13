# Builder

## Intent
Separate construction of complex objects from its representation so that the same construction process can create different representations.

## Motivation
When reuse of algorithms is required allowing for multiple representations.

## Applicability
1. When the algorithm for creating a complex object should be independent of the parts that make up the object and how they're assembled.
2. When the construction process must allow different representations for the object that's constructed.

## Participants
1. Builder: Abstract interface for creating parts of Product object
2. ConcreteBuilder: Implements Builder, constructing a Product and definingtracking the representation it creates. Provides and interface for retrieving the product
3. Director: Constructs an object using Builder interface
4. Product: Represents complex object under construction

## Collaborations
Client creates Director and configures it with desired builder. Director notifies builder when product should be created and builder sends product to client.

## Consequences
1. Lets you vary a product's internal representation
2. Isolates code for construction and representation
3. Gives you control over construction process.

## Implementation
1. Construct Builder interface, constructing products in step-by-step fashion, while generalizing interface to support multiple ConcreteBuilders
2. Create a non-abstract class for products to get returned by ConcreteBuilder
3. Empty all methods as default in Builder

## Known Uses
1. Parser classes in compilers are Directors that notify Builder classes when a syntactic construct is recognized
2. ClassBuilder is both Director and Product. Class for creating subclasses.