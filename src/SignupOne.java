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

        JTextField nameTextField =new JTextField();
        nameTextField.setFont(new Font("Arial",Font.BOLD,20));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);


        JLabel fname =new JLabel("Father's name:");
        fname.setFont(new Font("Arial",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        JTextField fTextField =new JTextField();
        fTextField.setFont(new Font("Arial",Font.BOLD,20));
        fTextField.setBounds(300,190,400,30);
        add(fTextField);

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

        JTextField emailTextField =new JTextField();
        emailTextField.setFont(new Font("Arial",Font.BOLD,20));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);

        JLabel marital =new JLabel("Marital status:");
        marital.setFont(new Font("Arial",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);

        JLabel city =new JLabel("City:");
        city.setFont(new Font("Arial",Font.BOLD,20));
        city.setBounds(100,430,200,30);
        add(city);

        JTextField cityTextField =new JTextField();
        cityTextField.setFont(new Font("Arial",Font.BOLD,20));
        cityTextField.setBounds(300,430,400,30);
        add(cityTextField);

        JLabel address =new JLabel("Address:");
        address.setFont(new Font("Arial",Font.BOLD,20));
        address.setBounds(100,480,200,30);
        add(address);

        JTextField addressTextField =new JTextField();
        addressTextField.setFont(new Font("Arial",Font.BOLD,20));
        addressTextField.setBounds(300,480,400,30);
        add(addressTextField);

        JLabel state =new JLabel("State:");
        state.setFont(new Font("Arial",Font.BOLD,20));
        state.setBounds(100,530,200,30);
        add(state);

        JTextField stateTextField =new JTextField();
        stateTextField.setFont(new Font("Arial",Font.BOLD,20));
        stateTextField.setBounds(300,530,400,30);
        add(stateTextField);

        JLabel pincode  =new JLabel("Pin Code:");
        pincode.setFont(new Font("Arial",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        JTextField pinTextField =new JTextField();
        pinTextField.setFont(new Font("Arial",Font.BOLD,20));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);


















        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SignupOne();
    }
}