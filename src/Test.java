public class Test {
    public static void main(String[] args) {
        String str1 = new String("Aditya");
        String str2 = new String("Aditya");

        System.out.println(str1==str2);          //It compares object reference, this checks the memory reference of the Strings since it is declared as a object
        System.out.println(str1.equals(str2));   //It compares object values, this compares the values inside the object.

        String a = "Aditya";
        String b = "Aditya";

        System.out.println(a==b);


    }
}
