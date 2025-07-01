import java.util.Scanner;

class Function{
    void prime(int num){

        int count = 0;

        for (int i = 1 ; i<=num ; i++){ //i =2, i=3 , i=4 , i=5 , i = 6, condition false, loop break

            int remainder = num % i; //5%1=0 , 5%2=1 , 5%3=2 , 5%4=1 ,5%5=0
            if (remainder==0) { // 0==0, 1!=0 , 2!=0 , 1!=0 , 0==0
                count++; //0+1=1, -- , -- , -- , 1+1=2
            }
        }
        if (count==2){ // 2==2 condition True
            System.out.print(num+" "); //print ths value of num
        }
    }
}


public class Apti {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Function f = new Function();

        for (int i = 2; i < num ; i++) { //i=2
            f.prime(i);
        }
        //System.out.println(sum);

        //f.prime(11);
    }
}
