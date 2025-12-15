public class AvgOfArray {
    public static void main(String[] args) {

        int num [] = {13,23,5,6,7,85,43,234};
        int sum = 0;
        int avg = 0;

        for (int i = 0; i < num.length ; i++) {
            sum = sum + num[i];
        }

        avg = sum / num.length;

        System.out.println("Average Of An Array is : "+avg +"\nSum is : "+sum);
    }
}
