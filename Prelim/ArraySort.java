import java.util.*;

public class ArraySort {
    public static void main (String[] args){

        int num [] = {1, 4, 3, 6, 5, 2, 7};
        String name[]={"ANA", "GABRIEL", "CHLOE", "JASON"};

        System.out.print("Original Array:" + "\n");
        for(int i=0; i >= 0 && i<= (num.length - 1); i++){
            System.out.print(num[i] + " ");
        }
        System.out.print("\n");

        Arrays.sort(num);
        System.out.print("Sorted Array: " +"\n");
        for(int i=0; i >= 0 && i<= (num.length - 1); i++){
            System.out.print(num[i] + " ");
        }
        System.out.print("\n" +"\n");

        System.out.print("Original Array: " + "\n");
        for(int i=0; i >= 0 && i<= (name.length - 1); i++){
            System.out.print(name[i] + " ");
        }
        System.out.print("\n");

        System.out.print("Sorted Array: " + "\n");
        Arrays.sort(name);
        for(int i=0; i >= 0 && i<= (name.length - 1); i++){
            System.out.print(name[i] + ", ");
        }
        System.out.print("\n");


    }
}
