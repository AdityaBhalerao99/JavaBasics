package LambdaExpression;

/*
Now Functional Interface means what :
    Before java 1.8, only public abstract methods were allowed in interface.
    but after Java 1.8, in interface any number Default and Static methods are allowed.

    Functional Interface :
    - Interface having exactly single abstract method but can have any number of defaults and static method.
    - We can invoke lambda expression by using functional interface.
    - It is must that Functional Interface should have Single Abstract Method in it.
    - So, an empty interface can also not called Functional interface.

Need for @FunctionalInterface :
-> if we don't use this annotation on interface then also it is fine.
-> But if we did not use this and someone other than you came and add another abstract method then it willnot be Functional interface any more
   and all other functionalities depending upon it will throw error
-> And if it is used then It is not possible to add another abstract method and still if added then it will show an error indicating that Functional interface
   can have only single abstract method and any number of default and static methods.

In simple words :
Advntages of @FunctionalInterface annotation
- It restricts the interface to be a functional interface.
- So if people have already used some lambda expression and some new
  team member added another abstact methoda in interface, All lambda expression will have errors.


 */

@FunctionalInterface
public interface MyInterface {

    public String sayHello(); //Single abstract method, so it can be called functional interface

    //public void sayBye(); // This second abstract method is added in this interface then it can not be called functional interface.

    //We can add any number of default and static methods in functional interface.

    default void sayGoodMorning(){
        System.out.println("Good Morning From My Interface");
    }

    static void sayGoodEvening(){
        System.out.println("Good Evening From My Interface");
    }

}
