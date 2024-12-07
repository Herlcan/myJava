import javax.swing.JOptionPane;

public class Stack {


    public static void main(String[] arg){

        int top = -1;
        int [] arr = new int[10];

        while (true) {

            String choice = JOptionPane.showInputDialog("Menu: \n" + "A. Pop \n" 
            + "B. Push \n" 
            + "C. Peek \n"
            + "D. IsEmpty \n"
            + "\n" 
            +    "Your Choice: ");

            switch (choice) {

                case "A":
                case "a":
                    if (top == -1){
                        arr = Pop(arr, top);
                    }else if(top == arr.length){
                        top = decreament(top);
                        arr = Pop(arr, top);
                    }else{
                        arr = Pop(arr, top);
                        top = decreament(top);
                    }
                    break;

                case "B":
                case "b":
                    if (top == arr.length){
                        arr = Push(arr, top);
                    }else{
                        top = increament(top);
                        arr = Push(arr, top);
                    }
                    
                    break;

                case "C":
                case "c":
                    if (top == arr.length){ 
                        top = decreament(top);
                        Peek(arr, top);
                    }else{
                    Peek(arr, top);
                    }
                    break;

                case "D":
                case "d":
                    IsEmpty(top);
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option!!!");
            }
        }
    }

    public static int increament(int itop){
        itop++;
        return itop;
    }

    public static int decreament(int dtop){
        dtop--;
        return dtop;
    }

    public static int[] Pop(int[] arr, int top){
        if (top == -1){
            JOptionPane.showMessageDialog(null,"Stock is Empty");
        }else{
            int pop = arr[top];

            JOptionPane.showMessageDialog(null, pop + " Is Remove from them Stock");
        }     
        return arr;
    }

    public static int[] Push(int[] arr, int top){
        if (top > arr.length - 1){
            JOptionPane.showMessageDialog(null, "Overflow");
        }else{
            String enter = JOptionPane.showInputDialog("Enter Element");
            int x = Integer.parseInt(enter);
            arr[top] = x;

            JOptionPane.showMessageDialog(null, arr[top] + " Is Inserted from them Stock");
        }     
        return arr;
    }

    public static void Peek(int[] arr, int top){
        if (top == -1){
            JOptionPane.showMessageDialog(null, "Stock is Empty");
        }else{
            JOptionPane.showMessageDialog(null, arr[top]);
        }
    }

    public static void IsEmpty(int top){
        if (top == -1){
            JOptionPane.showMessageDialog(null, "True");
        }else{
            JOptionPane.showMessageDialog(null, "False");
        }
    }
}
