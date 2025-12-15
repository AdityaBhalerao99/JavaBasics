package Functions;

//This class will demonstrate how to use of variable arguments in function.



public class Varargs {

//  suppose we have to add n numbers i.e we dont have the exact number of arguments which will be passed in function
//  there we use varargs

     public static float average(int... numbers) {
         int sum = 0,count = 0;
         float avg=0;
         for(int i : numbers){
             sum = sum + i;
             count ++;
         }

         avg = sum / count;

         return avg;
    }

    public static void main(String[] args) {

        System.out.println(average(1,23,2,3,1,3,4,5,6,7,8));
    }
}
