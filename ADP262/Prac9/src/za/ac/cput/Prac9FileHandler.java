package za.ac.cput;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Prac9FileHandler {
    public void  openFile(){
        try {
            FileWriter fw = new FileWriter("OutputEmployees.txt");
            BufferedWriter bw = new BufferedWriter(fw);

        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Error occurred...\n" + e,"Error",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    public void processFile(String rec){
        rec = String.format("Graphic Design#Shelley#Adams#Temporary");

    }
    public void closeFile(){
        ;

    }
}
