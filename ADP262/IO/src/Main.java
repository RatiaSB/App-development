//Created txt file

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            File myFile = new File("Student.txt");
            if (myFile.createNewFile()) {
                JOptionPane.showMessageDialog(null, "File created " + myFile.getName(),
                        "Information", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "File already exist " + myFile.getName() + "\n" + myFile.getAbsolutePath(),
                        "Warning", JOptionPane.WARNING_MESSAGE);

            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "An error occurred. \n" + e,
                    "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}