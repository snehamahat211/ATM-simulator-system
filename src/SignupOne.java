import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SignupOne extends JFrame {
    SignupOne() {
        setLayout(null);

        Random ran=new Random();
        long random=Math.abs((ran.nextLong() % 9000L)+1000L);

        JLabel formno =new JLabel("APPLICATION FORM NO."+ random);
        formno.setFont(new Font("Arial",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personDetails =new JLabel("Page 1:Personal Details");
        personDetails.setFont(new Font("Arial",Font.BOLD,25));
        personDetails.setBounds(290,80,400,30);
        add(personDetails);

        JLabel name =new JLabel("Name:");
        name.setFont(new Font("Arial",Font.BOLD,20));
        name.setBounds(100,140,100,30);   //y=height of particular case +y axis
        add(name);

        JLabel fname =new JLabel("Father's name:");
        fname.setFont(new Font("Arial",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        JLabel dob =new JLabel("Date of birth :");
        dob.setFont(new Font("Arial",Font.BOLD,20));
        dob.setBounds(100,240,230,30);
        add(dob);

        JLabel gender =new JLabel("Gender:");
        gender.setFont(new Font("Arial",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

        JLabel email =new JLabel("Email:");
        email.setFont(new Font("Arial",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);

        JLabel marital =new JLabel("Marital status:");
        marital.setFont(new Font("Arial",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);









        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SignupOne();
    }
}