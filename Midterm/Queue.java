import javax.swing.JOptionPane;

public class Queue {

    public static void main(String[] arg) {
        int front = 0;
        int last = -1;
        int[] arr = new int[10];
        int count = 0;

        while (true) {
            String choice = JOptionPane.showInputDialog("Menu: \n" + "A. Dequeue \n"
                    + "B. Enqueue \n"
                    + "C. PeekFirst \n"
                    + "D. PeekLast \n"
                    + "E. IsEmpty \n"
                    + "\n" + "Your Choice: ");

            switch (choice) {
                case "A":
                case "a":
                    front = dequeue(arr, front, count);
                    count--;
                    break;

                case "B":
                case "b":
                    last = enqueue(arr, last, count);
                    count++;
                    break;

                case "C":
                case "c":
                    peekfirst(arr, count, front);
                    break;
                
                case "D":
                case "d":
                    peeklast(arr, count, last);
                    break;

                case "E":
                case "e":
                    isEmpty(count);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option!!!");
            }
        }
    }

    public static int enqueue(int[] arr, int last, int count) {
        if (count == arr.length) {
            JOptionPane.showMessageDialog(null, "Queue Overflow");
        } else {
            last = (last + 1) % arr.length;
            String enter = JOptionPane.showInputDialog("Enter Element");
            int x = Integer.parseInt(enter);
            arr[last] = x;
            JOptionPane.showMessageDialog(null, arr[last] + " is inserted into the queue");
        }
        return last;
    }

    public static int dequeue(int[] arr, int front, int count) {
        if (count == 0) {
            JOptionPane.showMessageDialog(null, "Queue is empty");
        } else {
            int dequeuedElement = arr[front];
            JOptionPane.showMessageDialog(null, dequeuedElement + " is removed from the queue");
            front = (front + 1) % arr.length;
        }
        return front;
    }

    public static void peekfirst(int[] arr, int count, int front) {
        if (count == 0) {
            JOptionPane.showMessageDialog(null, "Queue is empty");
        } else {
            JOptionPane.showMessageDialog(null, arr[front] + " is at the front of the queue");
        }
    }

    public static void peeklast(int[] arr, int count, int last) {
        if (count == 0) {
            JOptionPane.showMessageDialog(null, "Queue is empty");
        } else {
            JOptionPane.showMessageDialog(null, arr[last] + " is at the last of the queue");
        }
    }

    public static void isEmpty(int count) {
        JOptionPane.showMessageDialog(null, count == 0 ? "True" : "False");
    }
}
