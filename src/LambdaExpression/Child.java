package LambdaExpression;

/*
-So what we understand here is If the Parent Interface is Functional Interface then
 Child interface who is extending Parent interface will automatically becomes Functional interface even if it is empty.
-But if we try to add abstract method in Child interface then it will show error and Child interface will not be
 Functional interface anymore.
-Again if we try to write the same method as written in Parent class then it is accepted and child intefrace will be Functional interface.
-And Child interface can have any number of Default and Static method to stay Functional Interface.

*/


//@FunctionalInterface
public interface Child extends Parent{








}
