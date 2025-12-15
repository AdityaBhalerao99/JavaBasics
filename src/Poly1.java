//Method Overriding
class A1 {
    void hello(String name){
        System.out.println("hello " + name);
    }
}
class B1 extends A1 {

    @Override
    void hello(String name) {
        System.out.println("Hello "+name+" Sir");
    }
}
public class Poly1 {
    public static void main(String[] args) {
        A1 a = new B1();
        a.hello("aditya");

    }
}



/*
PolyMorphism = same name but diffrent behavior

Method Overloading  = Same method name but Diffrent parameter list
                      Ex : add(int a , int b)
                      add(int a, int b, int c)


Method Overriding  = Same method name and Same parameter list but diffrent behavior
                     Ex : add(int a , int b)
                          add(int a , int b)
 */





























