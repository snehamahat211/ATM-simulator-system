
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login() {

        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        ImageIcon i1=new ImageIcon (ClassLoader.getSystemResource("logo.png"));
        Image i2=i1.getImage().getScaledInstance(60,60,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(100,10,100,100);
        add(label);

        JLabel text=new JLabel("Welcome to ATM");
        text.setFont(new Font("Arial",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardno=new JLabel("Card no:");
        cardno.setFont(new Font("Arial",Font.BOLD,28));
        cardno.setBounds(120,150,150,30);
        add(cardno);

        cardTextField=new JTextField();
        cardTextField.setBounds(260,150,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add (cardTextField);

        JLabel pin =new JLabel("PIN:");
        pin.setFont(new Font("Arial",Font.BOLD,28));
        pin.setBounds(120,220,150,30);
        add(pin);

        pinTextField =new JPasswordField();
        pinTextField.setBounds(260,220,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add (pinTextField);

        login=new JButton("SIGN IN");
        login.setBounds(260,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear=new JButton("CLEAR");
        clear.setBounds(390,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup=new JButton("SIGNUP");
        signup.setBounds(260,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.white);

        setSize(680,500);
        setVisible(true);
        setLocation(350,200);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");


        } else if (ae.getSource()==login){
            Conn conn=new Conn();
            String Cardnumber=cardTextField.getText();
            String pin=pinTextField.getText();
            String query="select * from login where cardnumber='"+Cardnumber+"' and pin='"+pin+"'";
            try{
                ResultSet rs= conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transaction(pin).setVisible(true);

                }else {
                    JOptionPane.showMessageDialog(null,"Invalid Card Number or pin");
                }

            } catch(Exception e){
                System.out.println(e);
            }


        } else if(ae.getSource()==signup){
            setVisible(false);
            new SignupOne().setVisible(true);

        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
