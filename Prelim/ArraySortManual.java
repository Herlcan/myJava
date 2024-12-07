public class ArraySortManual {
    public static void main(String[] args){
// Int
        int num[] = {1, 4, 3, 6, 5, 2, 7};
        int l = num.length;

        System.out.print ("Original Int Array: " + "\n");
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.print("\n");
        sortnum(num, l);

// String 
        String name[] = {"ANA", "GABRIEL", "CHLOE", "JASON"};
        int a = name.length;

        System.out.print ("Original String Array: " + "\n");
        for (int i = 0; i < name.length; i++){
            System.out.print(name[i] + " ");
        }
        System.out.print("\n");
        sortstr(name, a);
    }

    public static void sortnum(int num[], int l){
        for(int i = 0; i < l-1; i++){
            for(int j = i+1; j<l; j++){
                if(num[i] >num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Sorted Int Array: " + "\n" );
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.print("\n" + "\n");
    }

    public static void sortstr(String name[], int a){
        for(int i = 0; i < a-1; i++){
            for(int j = i+1; j<a; j++){
                if(name[j].compareTo(name[i]) < 0){
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        System.out.print("Sorted String Array: " + "\n" );
        for (int i = 0; i < name.length; i++){
            System.out.print(name[i] + " ");
        }
        System.out.print("\n" + "\n");
    }
    
}
