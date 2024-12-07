import java.util.Arrays;

public class test1a {
    public static void main(String[] args){
        String num[] = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",};
        for( int i = 0; i<=9; i++ ){
            System.out.println(num[i]);   
        } 
        System.out.println();

        String newElement = "Eleven";
        String[] newArray = Arrays.copyOf(num, num.length + 1);
        newArray[newArray.length - 1] = newElement;

        for( int n = 0; n<=10; n++ ){
            System.out.println(newArray[n]);   
        } 
    }
}
