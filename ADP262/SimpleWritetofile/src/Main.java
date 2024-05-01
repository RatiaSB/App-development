import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String heading = String.format("%-15s%-15s%-15s%-15s\n", "Student Name", "Student Number",
                "Qualification", "Date of Birth");
        String student1 = String.format("%-15s%-15s%-15s%-15s\n", "John Smith", "24636578", "BCom", "19980328");
        try {

            FileWriter fw = new FileWriter("Student.txt");
            //BufferedWriter bw = new BufferedWriter(fw);
            //bw.write(heading);
            //bw.write(student1);
            //bw.close();
            fw.write(heading);
            fw.write(student1);
            fw.close();
            System.out.println("opened and wrote to file successfully");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}