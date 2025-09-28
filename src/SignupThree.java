import javax.swing.*;
import java.awt.*;

public class SignupThree extends JFrame {
    JRadioButton r1,r2,r3,r4;
    SignupThree() {
        setLayout(null);

        JLabel ll=new JLabel("Page 3: Account Details");
        ll.setFont(new Font("Arial",Font.BOLD,22));
        ll.setBounds(280,40,400,40);

        add(ll);

        JLabel type=new JLabel("Account Type:");
        type.setFont(new Font("Arial",Font.BOLD,20));
        type.setBounds(150,140,500,40);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Arial", Font.BOLD, 15));
        r1.setBackground(Color.WHITE);
        r1.setBounds(150, 190, 250, 30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Arial", Font.BOLD, 15));
        r2.setBackground(Color.WHITE);
        r2.setBounds(420, 190, 300, 30); // shifted a bit right
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Arial", Font.BOLD, 15));
        r3.setBackground(Color.WHITE);
        r3.setBounds(150, 240, 250, 30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Arial", Font.BOLD, 15));
        r4.setBackground(Color.WHITE);
        r4.setBounds(420, 240, 320, 30); // enough width to avoid cutoff
        add(r4);


        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);


        getContentPane().setBackground(Color.WHITE);
        setSize(850,820);;
        setLocation(350,0);
        setVisible(true);





    }
    public static  void main(String []args){
        new SignupThree();
    }
}