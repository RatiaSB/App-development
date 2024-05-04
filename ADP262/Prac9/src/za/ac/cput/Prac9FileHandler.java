package za.ac.cput;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Prac9FileHandler {
    FileWriter fw;
    BufferedWriter bw;
    public void  openFile(){
        try {
            new FileWriter("OutputEmployees.txt");
            new BufferedWriter(fw);

        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Error occurred...\n" + e,"Error",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    public void processFile(String rec){
        rec = String.format("Graphic Design#Shelley#Adams#Temporary");

    }
    public void closeFile(){
    try{
        bw.close();
    }catch(IOException fCe){
        JOptionPane.showMessageDialog(null,"Error occurred...\n" + fCe,"Error",JOptionPane.ERROR_MESSAGE);
        fCe.printStackTrace();

    }

    }
}
