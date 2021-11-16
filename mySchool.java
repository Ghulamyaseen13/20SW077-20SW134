package com.GYK;

import org.w3c.dom.Text;


//*********************       Email : example@gmail.com    Password  example12345

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class mySchool extends JFrame implements ActionListener, FocusListener {

    JPanel panel1, panel2, panel3, panel4, panel5;

    JLabel welcome, login, agree, line, img, instructions, point1, point2, point3, point4;
    JTextField email;
    JPasswordField password;
    JButton log, forgotPass, createAcc;
    ImageIcon icon, bImage;


    mySchool() {
        icon = new ImageIcon("picture.png");
        bImage = new ImageIcon("picture.png");


        welcome = new JLabel("Welcome To MySchool");
        welcome.setFont(new Font("Arial", Font.BOLD, 30));
        welcome.setBounds(90, 130, 350, 100);
        welcome.setFocusable(true);
        welcome.setBackground(new Color(153, 0, 153));
//        welcome.setBackground(new Color(255,255,255));

        welcome.setForeground(Color.white);
        welcome.setOpaque(true);

        panel1 = new JPanel();
        panel1.setSize(350, 300);
        panel1.setBackground(new Color(255, 255, 255));
        panel1.setOpaque(true);
        panel1.setLocation(90, 220);
        panel1.setLayout(null);


        panel2 = new JPanel();
        panel2.setSize(400, 400);
        panel2.setBackground(new Color(102, 205, 170));
//        panel2.setOpaque(true);
        panel2.setLocation(870, 180);
        panel2.setLayout(null);


        instructions = new JLabel("Instructions");
        instructions.setFont(new Font("Arial", Font.BOLD, 30));
        instructions.setBounds(90, 0, 300, 100);
        instructions.setBackground(new Color(153, 0, 153));
        panel2.add(instructions);


        point1 = new JLabel("<html> 1 ) Dear customer If You are new Simply<br/> Click Create New Account</html>");
        point1.setFont(new Font("Arial", Font.ITALIC, 20));
        point1.setBounds(10, 0, 370, 200);
        panel2.add(point1);


        point2 = new JLabel("<html> 2 ) Dear User Subscibtion Of MySchool is 15$</html>");
        point2.setFont(new Font("Arial", Font.ITALIC, 20));
        point2.setBounds(10, 70, 370, 200);
        panel2.add(point2);

        point3 = new JLabel("<html> 3 ) After Adding Data of Your School, It may Take Time To Update. </html>");
        point3.setFont(new Font("Arial", Font.ITALIC, 20));
        point3.setBounds(10, 140, 370, 200);
        panel2.add(point3);

        point4 = new JLabel("<html> 4 ) Sometimes You May Not Able To Filter Data B/C Either Schools Are Not Registered Or Out Of Our Range. </html>");
        point4.setFont(new Font("Arial", Font.ITALIC, 20));
        point4.setBounds(10, 210, 370, 200);
        panel2.add(point4);

        email = new JTextField(20);

        email.setBounds(60, 30, 250, 40);
        email.setFont(new Font("Arial", Font.PLAIN, 18));
//        email.setFocusable(true);
        email.setText("Email");
        email.addFocusListener(this);
        panel1.add(email);

        password = new JPasswordField();
        password.setBounds(60, 80, 250, 40);
        password.setText("Password");
        password.setEchoChar((char)0);
        password.setFont(new Font("Arial", Font.PLAIN, 18));
        password.addFocusListener(this);
        panel1.add(password);

        log = new JButton("Log In");
        log.setBounds(60, 130, 250, 40);
        log.setBackground(new Color(17, 102, 255));
        log.setForeground(Color.WHITE);
        log.setFocusable(false);
        log.addActionListener(this);
        panel1.add(log);

        createAcc = new JButton("Create New Account");
        createAcc.setBounds(100, 230, 150, 40);
        createAcc.setBackground(new Color(51, 255, 51));
        createAcc.setForeground(Color.WHITE);
        createAcc.setFocusable(false);
        panel1.add(createAcc);


        agree = new JLabel("By creating this account, you agree to our Privacy Policy & Cookie Policy.");
        agree.setFont(new Font("Arial", Font.PLAIN, 10));
        agree.setBounds(0, 290, 350, 10);
//        agree.setBackground(new Color(153,0,153));
        agree.setForeground(Color.black);
        agree.setOpaque(true);
        panel1.add(agree);

        line = new JLabel();
        line.setBorder(new LineBorder(Color.GRAY));
        line.setBounds(5, 210, 340, 1);
        line.setOpaque(true);
        panel1.add(line);


//        JLabel background = new JLabel(new ImageIcon("wall.jpg"));
//        background.setBounds(0, 0, 600, 760);


        add(welcome);
        add(panel1);
        add(panel2);
//        this.setIconImage(icon.getImage()); add(background);


        setSize(530, 760);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setBackground(Color.black);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String n = email.getText();
        String pas = password.getText();

        if(n.equals("example@gmail.com") && pas.equals("example12345")) {       //example@gmail.com      12345


        if(e.getSource() == log) {


                panel1.setVisible(false);
                remove(welcome);
                //  revalidate();
                add(new insideMySc().panel2);
                add(new insideMySc());

                repaint();

            }

        }
    }


    @Override
    public void focusGained(FocusEvent e) {

        if(e.getSource()==email){
            email.setText("");
            email.setBorder(new LineBorder(Color.blue,2));
        }
        if(e.getSource()==password){
            password.setText("");
            password.setEchoChar('*');
            password.setBorder(new LineBorder(Color.blue,2));
        }
    }

    @Override
    public void focusLost(FocusEvent e) {

        email.setBorder(new LineBorder(Color.blue,1));
        password.setBorder(new LineBorder(Color.blue,1));


    }
}
