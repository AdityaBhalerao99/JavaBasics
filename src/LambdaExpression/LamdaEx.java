package LambdaExpression;

public class LamdaEx{

    /*

    Lambda expression is an anonymous function
    -> It can be only used with functional interface
    Why ? : --> Because Functional INterface has only one abstract method and to provide its implementation we can use lambda expression.
            --> If there are multiple abstract method in interface then it will not be called functional inerface, and since we are writing lambda expression
                compiler will get confused that which methods implementation is written by the help of lambda expression.

    Now Functional Interface means what :
    Before java 1.8 , only public abstract methods were allowed in interface.
    but after Java 1.8 In interface any number Default and Static methods are allowed.

    Functional Interface :
    - Interface having exactly single abstract method but can have any number of defaults and static method.
    - We can invoke lambda expression by using functional interface.


    i.e.
    ->Not having any name
    ->Not having any return type
    ->Not having any access modifier

    Steps to make any function lamda expression
    1. Remove modifier
    2. Remove return type
    3. Remove method name
    4. Place arrow
    */

    public static void main(String[] args) {
        
        MyInterface m = ()->"Hello from Lambda expression..."; //lambda expression is written by storing it into local variable created Functional interface's type.

        System.out.println(m.sayHello());    // called here...

         




    }

}

