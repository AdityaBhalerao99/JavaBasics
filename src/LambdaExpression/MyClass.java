package LambdaExpression;

/*
Here we want to check the ways to call the static and default methods from MyInterface
- To check if we want to call then how we can call them / do we have to override them ?

Conclusion :
Default methods in interface :
-> Methods which has body in interface and can be called by object of implementing class.
-> Can be overridden and called by the object of the Implementing class i.e. Child Class.

Static methods in interface :
-> These methods can not be overridden in implemented class means in child classes.Because it is not visible in Implemented class
-> these methods can only be called by interface name.

 */

public class MyClass implements MyInterface{

    @Override
    public String sayHello() {
        System.out.println("Implemented in My Class...");
        return null;
    }

    @Override
    public void sayGoodMorning() {
        System.out.println(" Overridden by MyClass to Print : Good Morning");
    }



    public static void main(String[] args) {
        MyClass m = new MyClass();
        m.sayGoodMorning(); // This is default method from MyInterface interface and it is called by creaing object of child class who is implementing MyInterface.
        m.sayHello();

        /* But here we can see we are only able to call the default and abstract methods with the object
           and if we have to call the static methods we cannot call them using object.
           The Only way to call static method is by interface name as shown below.
         */

        MyInterface.sayGoodEvening();  //This is static method and can be only called by interface name.


    }



}
