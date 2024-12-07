import javax.swing.*;
import java.util.Arrays;

public class ArrayMenu {
    private static String[] cars = {"BMW", "TOYOTA", "SUBARU", "KIA", "FORD"};

    public static void main(String[] args) {
        int choice;

        do {
            String menu = "Menu:\n" +
                          "[1] Display Array\n" +
                          "[2] Insert Value\n" +
                          "[3] Remove Value\n" +
                          "[4] Replace Value\n" +
                          "[5] Exit";
            choice = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (choice) {
                case 1:
                    displayArray();
                    break;
                case 2:
                    insertValue();
                    break;
                case 3:
                    removeValue();
                    break;
                case 4:
                    replaceValue();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "THANK YOU!!!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private static void displayArray() {
        JOptionPane.showMessageDialog(null, "Array Values = " + Arrays.toString(cars));
    }

    private static void insertValue() {
        String indexStr = JOptionPane.showInputDialog("Enter index to insert at (0 to " + cars.length + "):");
        int index = Integer.parseInt(indexStr);

        if (index < 0 || index > cars.length) {
            JOptionPane.showMessageDialog(null, "Invalid index. Please try again.");
            return;
        }

        String newValue = JOptionPane.showInputDialog("Enter value to insert:");

        String[] newArray = new String[cars.length + 1];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == index) {
                newArray[i] = newValue;
            } else {
                newArray[i] = cars[j++];
            }
        }

        cars = newArray;

        JOptionPane.showMessageDialog(null, "Successfully added " + newValue + " at index " + index + ".");
        displayArray();
    }

    private static void removeValue() {
        String indexStr = JOptionPane.showInputDialog("Enter index to remove (0 to " + (cars.length - 1) + "):");
        int index = Integer.parseInt(indexStr);

        if (index < 0 || index >= cars.length) {
            JOptionPane.showMessageDialog(null, "Invalid index. Please try again.");
            return;
        }

        String removedValue = cars[index];

        String[] newArray = new String[cars.length - 1];
        for (int i = 0, j = 0; i < cars.length; i++) {
            if (i != index) {
                newArray[j++] = cars[i];
            }
        }

        cars = newArray;

        JOptionPane.showMessageDialog(null, "Successfully removed " + removedValue + " from index " + index + ".");
        displayArray();
    }

    private static void replaceValue() {
        String indexStr = JOptionPane.showInputDialog("Enter index to replace (0 to " + (cars.length - 1) + "):");
        int index = Integer.parseInt(indexStr);

        if (index < 0 || index >= cars.length) {
            JOptionPane.showMessageDialog(null, "Invalid index. Please try again.");
            return;
        }

        String newValue = JOptionPane.showInputDialog("Enter new value:");

        String oldValue = cars[index];
        cars[index] = newValue;

        JOptionPane.showMessageDialog(null, "Successfully replaced " + oldValue + " with " + newValue + " at index " + index + ".");
        displayArray();
    }
}