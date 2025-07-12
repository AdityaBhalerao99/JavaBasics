package NsquareXpertsCompanyCodingQuestions;

// Q. Write a program ro check a string is palindrome or not...(Use dynamic inputs)
// Ans :
import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sc.next();
        String rev = "";

        for (int i = 0; i <str.length() ; i++) {
            rev =  str.charAt(i) + rev ;
        }

        System.out.println(rev);
        if(str.equalsIgnoreCase(rev)){
            // here we have used .equals() method instead of "==" this operator Becoz == : this compares the reference of object
            // and .equals() method : compres the content of String.

            System.out.println("The entered String "+str+" after reversing is "+rev+" \n So the string is Palindrome String...");
        }

        else System.out.println("Not a Palindrome String...");

    }
}
