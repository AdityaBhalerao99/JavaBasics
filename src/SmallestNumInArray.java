public class SmallestNumInArray {

    public static void main(String[] args) {
        int num [] = {13,23,5,6,7,85,43,234};
        int small = num[0];

        for (int i = 0; i <num.length ; i++) {

            if(small>num[i]){
                small = num[i];
            }
             
        }
        System.out.println(small);


    }
}
