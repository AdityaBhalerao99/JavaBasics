import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : ");
        String input = sc.nextLine();

        String Words [] = input.split("\\s");
//
        int count = Words.length;
//
//        System.out.println(count);

        System.out.println("Detected String : "+input+ " with count of "+count+" words");


    }
}
