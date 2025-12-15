package BrainStorm;

public class ReverseString {

    public static void main(String[] args) {

        String str = " is sky   the blue ";
        char ch [] = new char[str.length()];
        ch = str.toCharArray();


        String res = "";

        String trim = str.trim(); // only removes the starting and ending spaces of the string...
        System.out.println(trim);

        for (int i = 0; i < str.length(); i++) {


//            System.out.print(charr);
        }
        System.out.println(res);



    }

}
