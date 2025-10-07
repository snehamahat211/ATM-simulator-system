
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PinChange extends JFrame implements ActionListener {
    String pin;
    JPasswordField change,change2;
    JButton button,button2;

    PinChange(String pin) {
        this.pin=pin;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text=new JLabel("CHANGE YOUR PIN");
        text.setBounds(235,300,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);

        JLabel pintext=new JLabel("New Pin Number:");
        pintext.setBounds(200,340,500,20);
        pintext.setForeground(Color.white);
        pintext.setFont(new Font("System",Font.BOLD,12));
        image.add(pintext);

        change = new JPasswordField();
        change.setFont(new Font("System", Font.BOLD, 22));
        change.setBounds(380, 340, 130, 26);
        image.add(change);

        JLabel ptext=new JLabel("Confirm New Pin Number:");
        ptext.setBounds(200,380,500,20);
        ptext.setForeground(Color.white);
        ptext.setFont(new Font("System",Font.BOLD,12));
        image.add(ptext);

        change2 = new JPasswordField();
        change2.setFont(new Font("System", Font.BOLD, 22));
        change2.setBounds(380, 380, 130, 26);
        image.add(change2);

        button = new JButton("Confirm");
        button.setFont(new Font("System", Font.BOLD,12));
        button.setBounds(400,488,110,28);
        button.setForeground(Color.BLACK);
        button.setBackground(Color.white);
        button.addActionListener(this);
        image.add(button);

        button2 = new JButton("Back");
        button2.setFont(new Font("System", Font.BOLD,12));
        button2.setBounds(400,518,110,28);
        button2.setForeground(Color.BLACK);
        button2.setBackground(Color.white);
        button2.addActionListener(this);
        image.add(button2);


        setSize(900,900);
        setLocation(300,0);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()== button) {
            try {
                String npin = change.getText();
                String rpin = change2.getText();

                if (!npin.equals(rpin)) {
                    JOptionPane.showMessageDialog(null, "Pin Number doesnot match");
                    return;
                }

                if (npin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter Pin Number");
                    return;

                }
                if (rpin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Re-enter Pin Number");
                    return;
                }
                Conn conn = new Conn();
                String query1 = "UPDATE bank SET pin = '" + rpin + "' WHERE pin = '" + pin + "'";
                String query2 = "UPDATE login SET pin = '" + rpin + "' WHERE pin = '" + pin+ "'";
                String query3 = "UPDATE signupthree SET pin = '" + rpin + "' WHERE pin = '" + pin + "'";

                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);

                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new Transaction(pin).setVisible(true);







            } catch (Exception e) {
                System.out.println(e);
            }
        } else{
            setVisible(false);
            new Transaction(pin).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }
}