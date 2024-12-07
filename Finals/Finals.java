import javax.swing.*;
import java.util.ArrayList;

public class Finals {
   
    private static ArrayList<String[]> studentRecords = new ArrayList<>();

    public static void main(String[] args) {
        
        int id_num = 1;

        while (true) {
            String choice = JOptionPane.showInputDialog("Menu: \n" + "A. Input Student Record \n" 
            + "B. View Student Record \n" 
            + "C. Delete Student Record \n"
            + "D. Exit \n"
            + "\n" 
            + "Your Choice: ");

            switch (choice) {
                case "A":
                case "a":
                    inputStudentRecord(id_num);
                    id_num++;
                    break;

                case "B":
                case "b":
                    viewStudentRecords();
                    break;

                case "C":
                case "c":
                    deleteStudentRecord();
                    break;

                case "D":
                case "d":
                    System.exit(0);

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option!!!");
            }
        }
    }

    public static void inputStudentRecord(int id_num) {
        JTextField lastName = new JTextField();
        JTextField firstName = new JTextField();
        JTextField middleName = new JTextField();
        JTextField dateOfBirth = new JTextField("MM/DD/YY");
        JTextField address = new JTextField();

        Object[] message = {
            "Last Name:", lastName,
            "First Name:", firstName,
            "Middle Name:", middleName,
            "Date of Birth:", dateOfBirth,
            "Address:", address,
        };
        
        String Id_num = Integer.toString(id_num);

        int input = JOptionPane.showConfirmDialog(null, message, "Enter Student Credentials", JOptionPane.OK_CANCEL_OPTION);
        if (input == JOptionPane.OK_OPTION) {
            String[] record = {
                Id_num,
                lastName.getText(),
                firstName.getText(),
                middleName.getText(),
                dateOfBirth.getText(),
                address.getText()
            };
            studentRecords.add(record);

            JOptionPane.showMessageDialog(null, "Student " + firstName.getText() + " " + middleName.getText() + " " + lastName.getText() + " is added to the DATABASE.");
        }        
    }

    public static void viewStudentRecords() {
        if (studentRecords.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No records available.");
            return;
        }

        String[] columnNames = {"ID_Number", "Last Name", "First Name", "Middle Name", "Date of Birth", "Address"};
        String[][] data = new String[studentRecords.size()][6];

        for (int i = 0; i < studentRecords.size(); i++) {
            data[i] = studentRecords.get(i);
        }

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        JOptionPane.showMessageDialog(null, scrollPane, "Student Records", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void deleteStudentRecord() {
        if (studentRecords.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No records available.");
            return;
        }

        String search = JOptionPane.showInputDialog("Enter ID Number or Last Name of the Student to be deleted:");

        String[] columnNames = {"ID_Number", "Last Name", "First Name", "Middle Name", "Date of Birth", "Address"};
        String[][] data = new String[studentRecords.size()][6];

        for (int i = 0; i < studentRecords.size(); i++) {
            if (studentRecords.get(i)[0].equals(search)) {
                int input = JOptionPane.showConfirmDialog(null, "Do you want to Delete this record? ", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (input == JOptionPane.YES_OPTION){
                    studentRecords.remove(i);
                    JOptionPane.showMessageDialog(null, "Student Record with ID Number " + search + " is deleted.");
                }
            }else if (studentRecords.get(i)[1].equals(search)) {
                data[i] = studentRecords.get(i);            
            }else{
                JOptionPane.showMessageDialog(null, "No record found with ID Number or Last Name " + search + ".");  
            }
        }  
        
        if (data.length-1 == 0){
            int input = JOptionPane.showConfirmDialog(null, "Do you want to Delete this record? ", search + " is Found (" + data.length + ")", JOptionPane.YES_NO_OPTION);
            if (input == JOptionPane.YES_OPTION){
                studentRecords.remove(0);
                JOptionPane.showMessageDialog(null, data[0][2] + " " + data[0][1] + " is deleted.");
            }
        }else{
            JTable table = new JTable(data, columnNames);
            JScrollPane scrollPane = new JScrollPane(table);
            int input = JOptionPane.showConfirmDialog(null, scrollPane, search +" Found (" + data.length + ")" + " " + "Do you want to Delete a Record?", JOptionPane.YES_NO_OPTION);
            if (input == JOptionPane.YES_OPTION){
                String id_num = JOptionPane.showInputDialog("Enter ID Number of the Student to be deleted:" );

                for (int j = 0; j < studentRecords.size(); j++) {
                    if (studentRecords.get(j)[0].equals(id_num)) {
                        studentRecords.remove(j);
                        JOptionPane.showMessageDialog(null, data[j][2] + " " + data[j][1] + " is deleted.");
                        return;
                    }
                }
                    
            }
        }   
    }
}
