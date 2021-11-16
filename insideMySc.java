package com.GYK;

import javax.print.attribute.standard.DialogOwner;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class insideMySc extends JPanel implements ActionListener, FocusListener {

    JPanel panel2;
    JLabel name,city,clas,schoolType,medium,gender,heading;
    JComboBox jcity,jmedium;
    JTextField tname,tclas,tcity;
    JRadioButton govermentSchool,privateSchool,male,female,other;
    JButton sumbit;

    insideMySc(){




        setLayout(null);
        setBounds(5,50,560,680);
        setBackground(new Color(255,240,245));


        panel2 = new JPanel();
        panel2.setBounds(5,8,500,80);
        panel2.setBackground(Color.blue);
        panel2.setBorder(new LineBorder(Color.black));

        heading = new JLabel("Fill Out Form ");
        heading.setBounds(20,0,500,100);
//        heading.setFont(new Font("Arial", Font.PLAIN, 40));
        heading.setFont(new Font("Broadway",Font.BOLD, 45));

        heading.setForeground(Color.white);
        panel2.add(heading);



        name = new JLabel("Name");
        name.setFont(new Font("Arial",Font.ITALIC,25));
        name.setForeground(Color.black);
        name.setBounds(50,50,100,100);
        name.setBackground(new Color(153,0,153));

//        welcome.setBackground(new Color(255,255,255));


        tname = new JTextField(20);
//        tname.setText("Full-Name");
        tname.setBounds(150,80,290,35);
        tname.setFont(new Font("Arial", Font.PLAIN, 18));
        tname.addFocusListener(this);


        clas = new JLabel("Class");
        clas.setForeground(Color.black);
        clas.setFont(new Font("Arial",Font.ITALIC,25));
        clas.setBounds(50,100,100,100);
        clas.setBackground(new Color(153,0,153));


        tclas = new JTextField(20);
//        tclas.setText("Number-Only");
        tclas.setBounds(150,130,290,35);
        tclas.setFont(new Font("Arial", Font.PLAIN, 18));
        tclas.addFocusListener(this);

        gender = new JLabel("Gender");
        gender.setForeground(Color.black);

        gender.setFont(new Font("Arial",Font.ITALIC,25));
        gender.setBounds(50,150,100,100);
        gender.setBackground(new Color(153,0,153));

        male = new JRadioButton("Male");
        male.setBounds(150,180,150,35);
        male.setFont(new Font("Arial", Font.PLAIN, 18));
//        male.setFocusable(false);

        female = new JRadioButton("Female");
        female.setBounds(150,230,150,35);
        female.setFont(new Font("Arial", Font.PLAIN, 18));
//        female.setFocusable(false);

        other= new JRadioButton("Other");
        other.setBounds(150,280,150,35);
        other.setFont(new Font("Arial", Font.PLAIN, 18));
//        other.setFocusable(false);



        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        bg.add(other);


        medium = new JLabel("Medium");
        medium.setForeground(Color.black);

        medium.setFont(new Font("Arial",Font.ITALIC,25));
        medium.setBounds(50,300,150,100);
        medium.setBackground(new Color(153,0,153));


        String[] mediumss = {"Sindhi","English"};

        jmedium = new JComboBox(mediumss);
//        jmedium.setFocusable(true);
        jmedium.setBounds(150,330,290,35);
        jmedium.setFont(new Font("Arial", Font.PLAIN, 18));



        schoolType = new JLabel("Family");
        schoolType.setForeground(Color.black);

        schoolType.setFont(new Font("Arial",Font.ITALIC,25));
        schoolType.setBounds(50,370,150,100);
        schoolType.setBackground(new Color(153,0,153));



        govermentSchool = new JRadioButton("Goverment");
        govermentSchool.setBounds(150,400,150,35);
        govermentSchool.setFont(new Font("Arial", Font.PLAIN, 18));
//        govermentSchool.setFocusable(false);


        privateSchool = new JRadioButton("Private");
        privateSchool.setBounds(350,400,150,35);
        privateSchool.setFont(new Font("Arial", Font.PLAIN, 18));
//        privateSchool.setFocusable(false);


        city = new JLabel("City");
        city.setForeground(Color.black);

        city.setFont(new Font("Arial",Font.ITALIC,25));
        city.setBounds(50,420,100,100);
        city.setBackground(new Color(153,0,153));

        String[] citiess = {"Jamshoro","LUMS","Hyderabad","Qasimabad","MUCHS"};

        jcity = new JComboBox(citiess);
//        jcity.setFocusable(true);
        jcity.setBounds(150,450,290,35);
        jcity.setFont(new Font("Arial", Font.PLAIN, 18));



        sumbit= new JButton("Sumbit");
        sumbit.setBounds(160,540,180,40);
        sumbit.setBackground(new Color(0,102,204));
        sumbit.addActionListener(this);
        sumbit.setForeground(Color.WHITE);
        sumbit.setFocusable(false);






        add(name);
        add(tname);
        add(clas);
        add(tclas);
        add(gender);
        add(male);
        add(female);
        add(other);
        add(medium);
        add(jmedium);
        add(schoolType);
        add(govermentSchool);
        add(privateSchool);
        add(city);
        add(jcity);
        add(sumbit);

        setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        JPanel spanel;
        JFrame fr;
        String[] citiess = {"Jamshoro", "LUMS", "Hyderabad", "Qasimabad", "MUCHS"};
        String[] mediumss = {"English", "Sindhi"};
        fr = new JFrame();


        JLabel l1, l2, l3, fschoolname, fheading, fschoolname2;
        l2 = new JLabel();
        l2.setFont(new Font("Arial", Font.PLAIN, 18));
        l2.setBounds(100, 50, 100, 50);


        fheading = new JLabel("Schools Near  ");
        fheading.setFont(new Font("Broadway", Font.BOLD, 40));
        fheading.setBounds(100, 50, 350, 50);


        fschoolname = new JLabel();
        fschoolname.setBounds(100, 130, 380, 200);
        fschoolname.setFont(new Font("Arial", Font.PLAIN, 20));
        fschoolname.setOpaque(true);

        fschoolname2 = new JLabel();
        fschoolname2.setBounds(100, 350, 300, 200);
        fschoolname2.setFont(new Font("Arial", Font.PLAIN, 20));
        fschoolname2.setOpaque(true);

        l1 = new JLabel();
        l1.setBounds(100, 100, 350, 200);
        l1.setFont(new Font("Arial", Font.PLAIN, 20));


        if(e.getSource() == sumbit) {

            if(tname.getText().equals("") && tclas.getText().equals("")) {

                JOptionPane.showMessageDialog(fr,"Please Fill entire Form");

            } else {


                if(tclas.getText().equals("9") || tclas.getText().equals("10") && jcity.getSelectedItem().equals(citiess[0])) {

                    fschoolname.setText("<html> <p> <b>Pakturk Lums Branch</b></p><p>Private School<br>English Medium<br>Admision Opened 9,10 Only<br><b>5</b> ,Seats In 9th and <b>9</b>  in 10th <br>Phone: (022) 202 202 128 </p></html>");
                    fschoolname2.setText("<html> <p><b>Cadet College Petaro</b></p><p>Private School<br>English Medium<br>Admision Opened 9,10 Only<br><b>1</b> ,Seats In 9th and <b>3</b>  in 10th <br>Phone: 0313 3666621</p></html>");
                } else {
                    fschoolname.setText("<html><p>Sorry User, Could not Find any School<br> Near By.<br><br> Thanks </p></html>");


                }

                if(tclas.getText().equals("11") || tclas.getText().equals("12") && jcity.getSelectedItem().equals(citiess[2])) {

                    fschoolname.setText("<html> <p><b>The Educators</b> <br>Private School<br>English Medium<br>Admision Opened 11,12 Only<br><b>10</b> ,Seats In 11th and <b>15</b>  in 12th </p></html>");
                }

                if(tclas.getText().equals("7") || tclas.getText().equals("8") && jcity.getSelectedItem().equals(citiess[4])) {

                    fschoolname.setText("<html> <p> <b>The Smart</b></p><p>Private School<br>English Medium<br>Admision Opened 7,8 Only<br><b>Unknown</b> ,Seats  <br>Phone: (022) 202 202 128 </p></html>");
//                fschoolname.setText("<html> <p> <b>Pakturk Lums Branch</b></p><p>Private School<br>English Medium<br>Admision Opened 9,10 Only<br><b>5</b> ,Seats In 9th and <b>9</b>  in 10th <br>Phone: (022) 202 202 128 </p></html>");
                }



                fr.setSize(530, 760);
                fr.setResizable(false);
                fr.setLocationRelativeTo(null);
                fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                fr.setLayout(null);
                fr.setBackground(Color.black);
                fr.setResizable(false);
                fr.add(l2);
                fr.add(fheading);
                fr.add(fschoolname);
                fr.add(fschoolname2);
                fr.add(l1);
                fr.setVisible(true);



            }
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        if(e.getSource()==tname){
            tname.setText("");

        }
        if(e.getSource()==tclas){
            tclas.setText("");
        }

    }

    @Override
    public void focusLost(FocusEvent e) {

    }
}
