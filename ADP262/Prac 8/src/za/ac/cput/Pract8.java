/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @RatiaSB
 */
public class Pract8 extends JFrame {

    // Declare Array values
    String languages[] = {"English", "Xhosa", "Zulu", "Sotho", "Tswana", "Pedi", "Afrikaans", "Venda", "Tsonga", "Swati"};
    private JLabel lblIndex = new JLabel("Enter index value: ");
    private JTextField txtIndex = new JTextField();
    private JTextField txtDisplay = new JTextField();
    private JButton btnShow = new JButton("Show Element");

    private JPanel panelTop = new JPanel();
    private JPanel panelBottom = new JPanel();

    public Pract8() {
        super("Pract 8");
        this.setLayout(new BorderLayout());
        panelTop.setLayout(new GridLayout(1, 2, 5, 5));
        panelBottom.setLayout(new GridLayout(2, 1, 5, 5));
        panelTop.add(lblIndex);
        panelTop.add(txtIndex);
        panelBottom.add(btnShow);
        panelBottom.add(txtDisplay);

        this.add(panelTop, BorderLayout.NORTH);
        this.add(panelBottom, BorderLayout.SOUTH);

        btnShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == btnShow) {
                    try{
                        int input = Integer.parseInt(txtIndex.getText());
                        
                        for (int i = 0; i < languages.length; i++) {
                         txtDisplay.setText((String)"Array index at position " + input + " "+ languages[input]);
                            
                        }
                    } catch (ArrayIndexOutOfBoundsException ex) {
                        JOptionPane.showMessageDialog(null, "Enter the value from 0 to 9 \n"+ ex , "Error", JOptionPane.ERROR_MESSAGE);
                    } catch(NumberFormatException nx) {
                        JOptionPane.showMessageDialog(null, "Enter the numeric values \n"+ nx , "Error", JOptionPane.ERROR_MESSAGE);
                    }


                }

            }
        });
    }

}
