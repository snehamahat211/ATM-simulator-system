
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    Login() {

        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        ImageIcon i1=new ImageIcon (ClassLoader.getSystemResource("logo.png"));
        Image i2=i1.getImage().getScaledInstance(60,60,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

        JLabel text=new JLabel("Welcome to ATM");
        text.setFont(new Font("Arial",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardno=new JLabel("Card no:");
        cardno.setFont(new Font("Arial",Font.BOLD,38));
        cardno.setBounds(120,150,400,40);
        add(cardno);

        JTextField cardTextField=new JTextField();
        cardTextField.setBounds(300,150,250,30);
        add (cardTextField);

        JLabel pin =new JLabel("PIN:");
        pin.setFont(new Font("Arial",Font.BOLD,38));
        pin.setBounds(120,220,400,40);
        add(pin);

        JTextField pinTextField=new JTextField();
        pinTextField.setBounds(300,220,250,30);
        add (pinTextField);


        getContentPane().setBackground(Color.white);

        setSize(800,400);
        setVisible(true);
        setLocation(350,200);
    }

    public static void main(String[] args) {
        new Login();
    }
}
