Generics

-Generic methods and generic classes enable programmers to specify, with a single method declaration, a set of related methods, or with a single class declaration, a set of related types
-Generics stop runtime errors at compile time
-So you will get an error before the application even runs
-Generics can be used as a type safety for example, adding an integer to a string buffer
-It avoids the excess of copy and paste of the buffer
-Generics allow the author of the class or method to introduce type parameters
-These are symbols that can be substituted for any concrete type
-You introduce a type parameter to the end of the class name tradictionally stating with <T>
-You can have multiple type parameters in the same class
-Type Parameters  use extends even when using an interface rather the implement


CollectionsAPI

-Most common used case for generics
-List is an ordered collection
-Set is a collection with unique elements
-Map is a collection with keys and values, and a 1 to 1 relationship with the keys and values
-Using arrays can be problematic and confusing
-Using arrays also has less functionality 


Generic Methods
-the syntax for generic methods needs the type parameters
-The type parameters need to go in the corrects spots or you will get an error
-You can then declare the class parameters to the type paramters
-the type parameters are limited to 1 method
