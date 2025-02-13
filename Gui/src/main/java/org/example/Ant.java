import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ant {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Employee Details");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(new FlowLayout());

        JLabel label1= new JLabel("ID:");
        JTextField textField1=new JTextField(5);
        //textField1.setPreferredSize(new Dimension(200,20));
        JLabel label2= new JLabel("Name:");
        JTextField textField2=new JTextField(5);
        JLabel label3= new JLabel("Age:");
        JTextField textField3=new JTextField(5);
        JLabel label4= new JLabel("E-Mail:");
        JTextField textField4=new JTextField(5);
        JLabel label5= new JLabel("PhoneNo:");
        JTextField textField5=new JTextField(5);
        JLabel label6= new JLabel("Adress:");
        JTextField textField6=new JTextField(5);
        JLabel label7= new JLabel("Department:");

        JCheckBox checkBox1= new JCheckBox("HR department");
        JCheckBox checkBox2= new JCheckBox("Sales Department");
        JCheckBox checkBox3= new JCheckBox("Marketing Department");
        JCheckBox checkBox4= new JCheckBox("Software Department");
        JCheckBox checkBox5= new JCheckBox("Product Department");
        JCheckBox checkBox6= new JCheckBox("ShareHolder Department");
        ButtonGroup group = new ButtonGroup();
        group.add(checkBox1);
        group.add(checkBox2);
        group.add(checkBox3);
        group.add(checkBox4);
        group.add(checkBox5);
        group.add(checkBox6);


        JLabel label8= new JLabel("WorkingLoc:");
        JRadioButton hydButton=new JRadioButton("Hyderabad");
        JRadioButton visagButton=new JRadioButton("Vizayanagaram");
        JRadioButton krlButton=new JRadioButton("Mumbai");
        JRadioButton koreaButton=new JRadioButton("Delhi");
        JRadioButton bngButton=new JRadioButton("Bangalore");
        JRadioButton wfhButton=new JRadioButton("Work From Home");

        ButtonGroup group1=new ButtonGroup();
        group1.add(hydButton);
        group1.add(visagButton);
        group1.add(krlButton);
        group1.add(koreaButton);
        group1.add(bngButton);
        group1.add(wfhButton);


        JLabel label9= new JLabel("Lang Known:");

        JLabel resultLabel=new JLabel();
        JButton button=new JButton("Submit");
        JButton button1=new JButton("Reset");

        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(label3);
        frame.add(textField3);
        frame.add(label4);
        frame.add(textField4);
        frame.add(label5);
        frame.add(textField5);
        frame.add(label6);
        frame.add(textField6);
        frame.add(label7);
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(checkBox3);
        frame.add(checkBox4);
        frame.add(checkBox5);
        frame.add(checkBox6);

        frame.add(label8);
        frame.add(hydButton);
        frame.add(visagButton);
        frame.add(krlButton);
        frame.add(koreaButton);
        frame.add(wfhButton);


        frame.add(label9);
        String[] lang={"Python","Java","C","WebDevelopment","Python,c","Python,Java","Java,C","Webdevelopment,one from above"};
        JComboBox comboBox=new JComboBox(lang);
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Selected: " + comboBox.getSelectedItem());
            }
        });

        frame.add(comboBox);

        frame.add(button);
        frame.add(button1);
        frame.add(resultLabel);

        frame.pack();
        frame.setVisible(true);


    }

    }