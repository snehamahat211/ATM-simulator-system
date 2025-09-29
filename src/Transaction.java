import javax.swing.*;
import java.awt.*;

public class Transaction extends JFrame {
    Transaction() {
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text=new JLabel("Please select your Transaction");
        text.setBounds(215,300,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);

        JButton deposit=new JButton("Deposit");
        deposit.setBounds(170,415,150,30);
        image.add(deposit);

        JButton withdrawl=new JButton(" Cash withdrawl");
        withdrawl.setBounds(355,415,150,30);
        image.add(withdrawl);

        JButton fastcash=new JButton("Fastcash");
        fastcash.setBounds(170,450,150,30);
        image.add(fastcash);

        JButton ministatement=new JButton("Mini Statement");
        ministatement.setBounds(355,450,150,30);
        image.add(ministatement);

        JButton pinchange=new JButton("Pin Change");
        pinchange.setBounds(170,485,150,30);
        image.add(pinchange);

        JButton balance=new JButton("Balance check");
        balance.setBounds(355,485,150,30);
        image.add(balance);

        JButton exit=new JButton("Exit");
        exit.setBounds(170,520,150,30);
        image.add(exit);


        add(image);
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);


    }
    public static void main(String args[]){
        new Transaction();

    }


}