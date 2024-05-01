import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter myFWriter = new FileWriter("Student.txt");
            myFWriter.write("File writer is bit understandable");
            myFWriter.close();
            JOptionPane.showMessageDialog(null, "Successfully wrote to the file!",
                    "Information",JOptionPane.INFORMATION_MESSAGE);
        }catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Error occurred",
                    "Error",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

        }
    }
