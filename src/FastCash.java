import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;


public class FastCash extends JFrame implements ActionListener {
    JButton onethau,fivethau,eightthau,tenthau,fifteenthau,twentythau,exit;
    String pin;
    FastCash( String pin)
    {
        this.pin=pin;
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text=new JLabel("Please select your withdrawl");
        text.setBounds(215,300,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);

        onethau=new JButton("1000");
        onethau.setBounds(170,415,150,30);
        onethau.addActionListener(this);
        image.add(onethau);

        fivethau=new JButton("5000");
        fivethau.setBounds(355,415,150,30);
        fivethau.addActionListener(this);
        image.add(fivethau);

        eightthau=new JButton("8000");
        eightthau.setBounds(170,450,150,30);
        eightthau.addActionListener(this);
        image.add(eightthau);

        tenthau=new JButton("10000");
        tenthau.setBounds(170,485,150,30);
        tenthau.addActionListener(this);
        image.add(tenthau);

        fifteenthau=new JButton("15000");
        fifteenthau.setBounds(355,450,150,30);
        fifteenthau.addActionListener(this);
        image.add(fifteenthau);


        twentythau=new JButton("20000");
        twentythau.setBounds(355,485,150,30);
        twentythau.addActionListener(this);
        image.add(twentythau);

        exit=new JButton("Exit");
        exit.setBounds(170,520,150,30);
        exit.addActionListener(this);
        image.add(exit);



        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==exit){
            setVisible(false);
            new Transaction(pin).setVisible(true);
        } else {
            String amount = ((JButton) ae.getSource()).getText().substring(3);

            Conn c=new Conn();
            try{
                ResultSet rs= c.s.executeQuery("select * from bank where pin ='"+pin+"'");
                int balance=0;
                while(rs.next()){
                    if (rs.getString("type").equals("Deposit")){
                        balance+=Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance-=Integer.parseInt(rs.getString("amount"));
                    }
                }
                if (ae.getSource()!=exit && balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                Date date = new Date();
                java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String formattedDate = sdf.format(date);

                String query = "insert into bank values('" + pin + "','" + formattedDate + "','Withdrawl','" + amount + "')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs " + amount +  " Debited successfully");
                setVisible(false);
                new FastCash(pin).setVisible(true);

            }catch (Exception e){
                System.out.println(e);
            }

        }



    }

    public static void main(String args[]){
        new Transaction("");

    }


}