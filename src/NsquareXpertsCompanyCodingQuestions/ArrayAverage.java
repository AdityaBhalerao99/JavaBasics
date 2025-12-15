package NsquareXpertsCompanyCodingQuestions;

import java.util.Scanner;

public class ArrayAverage {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step 1: Input array
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter " + n + " array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Step 2: Calculate sum and average
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }
            double avg = sum / n;
            System.out.println("Average: " + avg);

            // Step 3: Count elements greater than average
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > avg) {
                    count++;
                    
                }
            }

            // Step 4: Create new array to store elements greater than average
            int[] greater = new int[count];
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > avg) {
                    greater[j] = arr[i];
                    j++;
                }
            }

            // Step 5: Print the new array
            System.out.println("Elements greater than average:");
            for (int i = 0; i < greater.length; i++) {
                System.out.print(greater[i] + " ");
            }
        }
}
