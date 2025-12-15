package Codidtas;

public class CountingOccurences {
    static int countOccurence(String text, char ch){
        int count=0;
//        text = text.toLowerCase();
        for (int i = 0; i < text.length() ; i++) {
//            System.out.println("*");
            if(text.charAt(i)==ch)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "Aditya";
        System.out.println(countOccurence(str,'a'));
        System.out.println(countOccurence("Aditya",'a'));
    }
}
