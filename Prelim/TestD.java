import javax.swing.JOptionPane;
import java.io.IOException;

public class TestD {   
    public static void main(String[] args) throws IOException {
        String cars[] = {"BMW", "TOYOTA", "SUBARU", "KIA", "FORD"};
        
        while (true) {

            String option = JOptionPane.showInputDialog("Menu: \n" + "[1] Display Array \n" + "[2] Insert Value \n" + "[3] Replace Value \n" + "[4] Remove Value \n" + "[5] Exit \n",  "Enter Option: ");
            int newOption = Integer.parseInt(option);

            switch (newOption) {
                case 1:
                    display(cars);
                    break;
                case 2:
                    cars = insert(cars);
                    break;
                case 3:
                    cars = replace(cars);
                    break;
                case 4:
                    cars = remove(cars);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Exiting the program.");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please select again.");
            }
        }
    }

        public static void display(String[] cars) {
        StringBuilder result = new StringBuilder("Displaying Cars:\n");
        for (String car : cars) {
        result.append(car).append("\n");
        }

        JOptionPane.showMessageDialog(null, result.toString());       
    }

    public static String[] insert(String[] cars) throws IOException {
        String option = JOptionPane.showInputDialog(
            "Enter index you want to insert the new Car Brand (Enter -1 to insert at the end):"
        );
        int index = Integer.parseInt(option);
    
        if (index == -1) {
            index = cars.length;
        } else if (index < 0 || index > cars.length) {
            JOptionPane.showMessageDialog(null, "Invalid index. Please try again.");
            return cars; 
        }
    
        String newCar = JOptionPane.showInputDialog( "Please enter a Car Brand:");
        if (newCar == null || newCar.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No car brand was entered.");
            return cars;
        }
        
        String newCars[] = new String[cars.length + 1];       
        for (int i = 0; i < index; i++) {
            newCars[i] = cars[i];
        }
            
        newCars[index] = newCar.trim();
        for (int i = index; i < cars.length; i++) {
            newCars[i + 1] = cars[i];
        }

        StringBuilder result = new StringBuilder();
        for (String car : newCars) {
        result.append(car).append("\n");
        }
    
        JOptionPane.showMessageDialog(null, "New Car is Inserted at index " + index + ".\nUpdated Cars:\n" + result.toString());
        return newCars; 
    }
     
    public static String [] replace(String[] cars) {
        String option = JOptionPane.showInputDialog("Enter Index You Want To Replace: ");
        int i = Integer.parseInt(option);

        if (i >= 0 && i < cars.length) {
            cars[i] = JOptionPane.showInputDialog("Enter Car Brand: ");
            StringBuilder result = new StringBuilder("Updated Cars:\n");
            for (String car : cars) {
            result.append(car).append("\n");
            }

            JOptionPane.showMessageDialog(null, "Car Replaced \n " + result.toString());
            System.out.println();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid index. Please try again.");
        }
        return cars;
    }

    public static String[] remove(String[] cars) {
        String option = JOptionPane.showInputDialog("Enter Index You Want To Remove: ");
        int i = Integer.parseInt(option);
    
        if (i >= 0 && i < cars.length) {
            String newCars[] = new String[cars.length - 1];
    
            for (int j = 0; j < i; j++) {
                newCars[j] = cars[j];
            }
    
            for (int j = i; j < cars.length - 1; j++) {
                newCars[j] = cars[j + 1];
            }
    
            StringBuilder result = new StringBuilder("Updated Cars:\n");
            for (String car : newCars) {
            result.append(car).append("\n");
            }

            JOptionPane.showMessageDialog(null, "Car Deleted \n " + result.toString());
            return newCars;
        } else {
            JOptionPane.showMessageDialog(null, "Invalid index. Please try again.");
        }
        return cars;
    }
    
}
