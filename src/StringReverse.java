import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : ");
        String input = sc.nextLine();
        String reverse="";

        try{
            for (int i = 0 ; i<=input.length(); i++) {

                //System.out.println(i+" = "+input.charAt(i)); // To check the usage of charAt() method
                reverse = input.charAt(i) + reverse;
            }
        }
        catch (Exception e) {
            System.out.println("Exception Occured : "+e.getMessage());
        }

        finally {
            System.out.println("Reversed String : "+reverse);
        }


    }
}

