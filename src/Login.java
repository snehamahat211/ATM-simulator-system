
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
        text.setFont(new Font("Times New Roman",Font.BOLD,38));
        text.setBounds(200,40,100,40);
        add(text);


        getContentPane().setBackground(Color.white);

        setSize(800,400);
        setVisible(true);
        setLocation(350,200);
    }

    public static void main(String[] args) {
        new Login();
    }
}
