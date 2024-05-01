/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user10
 */
public class Prac9 extends JFrame {
//Create Instances of JPanels
    private JPanel panelTop = new JPanel();
    private JPanel panelCenter = new JPanel();
    private JPanel panelBottom = new JPanel();
//Create Instances of Labels
    private JLabel lblDepartment = new JLabel("Department:");
    private JLabel lblFirstName = new JLabel("First Name:");
    private JLabel lblLastName = new JLabel("Last Name:");
    private JLabel lblEmploymentType = new JLabel("Employment Type:");

//Create Instances of textfields 
    private JTextField txtFirstName = new JTextField();
    private JTextField txtLastName = new JTextField();
//Create Instance of ComboBox and add items in list
    String[] departments = {"select","Graphic Design","Civil Engineering","Information Technology"}; 
    private JComboBox cboDepartment = new JComboBox(departments);
    
//Create Instances of the radiobuttons and group them
    private JRadioButton radPermanent = new JRadioButton("Permanent");
    private JRadioButton radTemporary = new JRadioButton("Temporary");
    
//Create Instances of the buttons  
    private JButton btnAddToTable = new JButton("Add to Table");
    private JButton btnExit = new JButton("Exit");
    
//Create Instance of table
    Object[] columns = {"Department","FirstName","LastName","EmployementType"};
    DefaultTableModel model = new DefaultTableModel();
    private JTable table = new JTable(model);
    private JScrollPane scrollPane = new JScrollPane(table);
    
    
    public Prac9() {
        super("University Staff Application");
        //Construct JPanels
        panelTop.setLayout(new GridLayout(6,2,5,5));
        //panelBottom.setLayout(new GridLayout(1, 1, 5, 5));
        
        
        panelTop.add(lblDepartment);
        panelTop.add(cboDepartment);
        panelTop.add(lblFirstName);
        panelTop.add(txtFirstName);
        panelTop.add(lblLastName);
        panelTop.add(txtLastName);
        panelTop.add(lblEmploymentType);
        panelTop.add(radPermanent);
        panelTop.add(radTemporary);
        
        
        
        
        this.setLayout(new BorderLayout());
        this.add(panelTop);
        //this.add(panelBottom, BorderLayout.WEST);
    }
   
    
}
