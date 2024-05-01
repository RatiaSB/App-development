/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author user10
 */
public class Prac9 extends JFrame implements ActionListener {
    //Create Instances of JPanels
    private JPanel panelTop = new JPanel();
    private JPanel panelJTable = new JPanel();
    private JPanel panelButton = new JPanel();
    //Create Instances of Labels
    private JLabel lblDepartment = new JLabel("Department:");
    private String[] departments = {"select", "Graphic Design", "Civil Engineering", "Information Technology"};
    private JComboBox cboDepartment = new JComboBox(departments);
    private JLabel lblFirstName = new JLabel("First Name:");
    private JTextField txtFirstName = new JTextField();
    private JLabel lblLastName = new JLabel("Last Name:");
    private JTextField txtLastName = new JTextField();
    private JLabel lblEmploymentType = new JLabel("Employment Type:");
    private JLabel lblDummy = new JLabel("");//to open some space
    private JRadioButton radPermanent = new JRadioButton("Permanent");
    private JRadioButton radTemporary = new JRadioButton("Temporary");
    ButtonGroup radGrp = new ButtonGroup();
    //JTable
    private DefaultTableModel tblModel = new DefaultTableModel();
    private JTable tblEmployees = new JTable(tblModel);

    //Create Instances of the buttons
    private JButton btnAddToTable = new JButton("Add to Table");
    private JButton btnExit = new JButton("Exit");

    private String strOutput;
    private boolean empty;


    public Prac9() {
        super("University Staff Application");
        //Construct radio buttons
        radGrp.add(radPermanent);
        radGrp.add(radTemporary);
        //Construct JPanels
        panelTop.setLayout(new GridLayout(5, 2, 5, 5));
        panelButton.setLayout(new GridLayout(1, 2, 5, 5));

        panelTop.add(lblDepartment);
        panelTop.add(cboDepartment);
        panelTop.add(lblFirstName);
        panelTop.add(txtFirstName);
        panelTop.add(lblLastName);
        panelTop.add(txtLastName);
        panelTop.add(lblEmploymentType);
        panelTop.add(radPermanent);
        panelTop.add(lblDummy);
        panelTop.add(radTemporary);

        panelButton.add(btnAddToTable);
        panelButton.add(btnExit);

        //Slot Jtable here
        tblModel.addColumn("Department");
        tblModel.addColumn("First Name");
        tblModel.addColumn("Last Name");
        tblModel.addColumn("Employment Type");


        panelJTable.add(new JScrollPane(tblEmployees));

        this.setLayout(new BorderLayout());
        this.add(panelTop, BorderLayout.NORTH);
        this.add(panelJTable, BorderLayout.CENTER);
        this.add(panelButton, BorderLayout.SOUTH);

        //Create Listeners
        btnAddToTable.addActionListener(this);
        btnExit.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAddToTable) readValuesFromFields();

        if (e.getSource() == btnExit) System.exit(0);

    }
    //read Values from fields
    public void readValuesFromFields(){
        String radOutcome = "No Selection";
        if (radTemporary.isSelected()) {
            radOutcome = "Temporary";
            empty = false;
        } else if (radPermanent.isSelected()) {
            radOutcome = "Permanent";
            empty = false;
        }
        if (!empty){
            tblModel.addRow(new Object[]{(String) cboDepartment.getSelectedItem(),txtFirstName.getText(),txtLastName.getText(), radOutcome});
            strOutput = (String) cboDepartment.getSelectedItem() +"#"+txtFirstName.getText()+"#"+txtLastName.getText()+"#"+radOutcome;

            clearFields();
            System.out.println(strOutput);
            empty = true;
        }else {
            JOptionPane.showMessageDialog(null,"Please make entries","Information",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void clearFields(){
        cboDepartment.setSelectedIndex(0);
        txtFirstName.setText(null);
        txtLastName.setText(null);
        radGrp.clearSelection();
//        radPermanent.setSelected(false);
//        radTemporary.setSelected(false);
    }
}
