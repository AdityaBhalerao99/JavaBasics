//Method Overloading Example

class B {
    int add(int a, int b, int c) {
        return a + b + c;
    }
    int add(int a, int b) {
        return a + b;
    }
}

public class Poly {
    public static void main(String[] args) {
        B b = new B();

        b.add(1,2);
        b.add(1,2,3);



    }
}
