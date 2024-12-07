import java.util.Arrays;

public class test2b {
    public static void main(String[] args){
        String num[] = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",};
        String newElement = "Eleven";
        String newNums[] = Arrays.copyOf(num, num.length + 1);
        newNums[newNums.length - 1] = newElement;

        for( int n = 0; n<=10; n++ ){
            System.out.println(newNums[n]);   
        } 
        System.out.println();

        for( int x = 0; x <= 10; x++){
            if(x==4){
                newNums[x] = "5";
            }
            System.out.println(newNums[x]);
        }
    }
}
