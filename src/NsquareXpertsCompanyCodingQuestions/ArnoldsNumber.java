package NsquareXpertsCompanyCodingQuestions;

// Q. Check if number is Arnold's number or not ?
// Ans : Answer was modified to do advance solutoin i.e. arnolds number from 10-1000000000. remove for loop from line 14 and assign user accepted value to originalNumber.

import java.util.Scanner;

public class ArnoldsNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number : ");
        for (int i = 10; i < 1000000000; i++) {
            int originalNumber = i;
            int tempNumber = originalNumber , remainder = 0 , result = 0, digits=0;

            while (tempNumber!=0){
                tempNumber= tempNumber/10;
                digits++;
            }
            tempNumber = originalNumber;

            while (tempNumber != 0){

                remainder = tempNumber % 10;
                result = (int) (result + Math.pow(remainder,digits));
                tempNumber = tempNumber / 10;
            }

            if (result == originalNumber){
//                System.out.println("Its arnold's number...");
                System.out.println(result);
            }
//            else /
        }

        }


}
