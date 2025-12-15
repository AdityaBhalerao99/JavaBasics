package starPatterns;

public class StarPattern1 {

    public static void main(String[] args) {

        starPattern2();

    }

    

//    To Print Star Pattern 1 :
//     *
//     **
//     ***
//     ****
//     *****
    static void starPattern(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    |1234*****
    |123*****
    |12*****
    |1*****
    |*****
     *
     */

    static void starPattern2(){
        int num = 9, space = 4;
        for (int row = 0; row <5; row++) {
            for (int col = 0; col <=num ; col++) {
                if(col>space){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            num--;
            space--;
        }
        
    }


}
