# Factory Pattern

## [before] Naive solution

In the naive solution, every pizza store need to implement their own logic:
what kind of pizza they should make for certain type. 
When there're some new kind of pizza, or need to remove some pizza type, 
they need to change the hard-code logic to cater for the new situation.

This method does not conform with the basic principle: 
object should close to modification


## [middle] Simple factory

In this pattern, we made some improvement: 
move the "change" part from client to an independent module

## [after] Factory method

PizzaStore in responsible for orderPizza and leave the create pizza task to an abstract method.
By this way, different type of pizza stores can have their own create pizza method.

## [final] Abstract factory

Decouple pizza and its ingredients.