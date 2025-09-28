import javax.swing.*;
import java.awt.*;

public class SignupThree extends JFrame {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    SignupThree() {
        setLayout(null);

        JLabel ll=new JLabel("Page 3: Account Details");
        ll.setFont(new Font("Arial",Font.BOLD,22));
        ll.setBounds(180,40,300,40);

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


        JLabel card=new JLabel("Card Number:");
        card.setFont(new Font("Arial", Font.BOLD, 20));
        card.setBounds(150,320,500,30);
        add(card);

        JLabel digit=new JLabel("(Your 16 Digit Card Number)");
        digit.setFont(new Font("Arial", Font.BOLD, 13));
        digit.setBounds(150,345,300,30);
        add(digit);

        JLabel cardno=new JLabel("XXXX-XXXX-XXXX-5114");
        cardno.setFont(new Font("Arial", Font.BOLD, 23));
        cardno.setBounds(410,320,400,40);
        add(cardno);


        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Arial", Font.BOLD, 20));
        pin.setBounds(150,420,500,30);
        add(pin);

        JLabel pass=new JLabel("(Your 4 Digit Password)");
        pass.setFont(new Font("Arial", Font.BOLD, 13));
        pass.setBounds(150,445,300,30);
        add(pass);

        JLabel pinno=new JLabel("XXXX");
        pinno.setFont(new Font("Arial", Font.BOLD, 23));
        pinno.setBounds(410,420,400,40);
        add(pinno);

        JLabel service = new JLabel("Services Required:");
        service.setFont(new Font("Arial", Font.BOLD, 20));
        service.setBounds(150,520,300,30);
        add(service);

        c1= new JCheckBox("ATM Card");
        c1.setFont(new Font("Arial", Font.BOLD, 15));
        c1.setBackground(Color.WHITE);
        c1.setBounds(150, 550, 250, 30);
        add(c1);

        c2= new JCheckBox("Internet Banking");
        c2.setFont(new Font("Arial", Font.BOLD, 15));
        c2.setBackground(Color.WHITE);
        c2.setBounds(420, 550, 250, 30);
        add(c2);

        c3= new JCheckBox(" Mobile Banking");
        c3.setFont(new Font("Arial", Font.BOLD, 15));
        c3.setBackground(Color.WHITE);
        c3.setBounds(150, 600, 250, 30);
        add(c3);

        c4= new JCheckBox("Email and SMS Alert");
        c4.setFont(new Font("Arial", Font.BOLD, 15));
        c4.setBackground(Color.WHITE);
        c4.setBounds(420, 600, 250, 30);
        add(c4);

        c5= new JCheckBox("Cheque Book");
        c5.setFont(new Font("Arial", Font.BOLD, 15));
        c5.setBackground(Color.WHITE);
        c5.setBounds(150, 650, 250, 30);
        add(c5);

        c6= new JCheckBox("E-Statement");
        c6.setFont(new Font("Arial", Font.BOLD, 15));
        c6.setBackground(Color.WHITE);
        c6.setBounds(420, 650, 250, 30);
        add(c6);

        c7= new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge.");
        c7.setBackground(Color.WHITE);
        c7.setBounds(150, 710, 650, 30);
        add(c7);

        submit=new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Arial", Font.BOLD, 15));
        submit.setBounds(490, 45, 90, 30);
        add(submit);

        cancel=new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Arial", Font.BOLD, 15));
        cancel.setBounds(600, 45, 85, 30);
        add(cancel);





        getContentPane().setBackground(Color.WHITE);
        setSize(850,820);;
        setLocation(350,0);
        setVisible(true);







    }
    public static  void main(String []args){
        new SignupThree();
    }
}