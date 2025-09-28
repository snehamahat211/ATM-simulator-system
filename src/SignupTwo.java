
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    JTextField cnTextField, rpTextField;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, bnname, oname, incomec, ename;

    SignupTwo() {
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION: PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Arial", Font.BOLD, 30));
        additionalDetails.setBounds(200, 20, 600, 40);
        add(additionalDetails);

        // Religion
        JLabel sreligion = new JLabel("Religion:");
        sreligion.setFont(new Font("Arial", Font.BOLD, 18));
        sreligion.setBounds(100, 100, 150, 30);
        add(sreligion);

        String[] valReligion = {"Hindu","Muslim","Buddhist","Sikh","Jain","Christian","Kirat","Others"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 100, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        // Branch
        JLabel bname = new JLabel("Bank's Branch:");
        bname.setFont(new Font("Arial", Font.BOLD, 18));
        bname.setBounds(100, 150, 200, 30);
        add(bname);

        String[] valbname = {"Kausaltar","Kalimati","Banepa","Koteshwor","Baneshwor","RNC","Others"};
        bnname = new JComboBox(valbname);
        bnname.setBounds(300, 150, 400, 30);
        bnname.setBackground(Color.WHITE);
        add(bnname);

        // Amount
        JLabel amount = new JLabel("Amount on Bank:");
        amount.setFont(new Font("Arial", Font.BOLD, 18));
        amount.setBounds(100, 200, 200, 30);
        add(amount);

        String[] valincomec = {"NULL","<50,000","<1,00,000","<1,50,000","<2,00,000","<3,00,000","Others"};
        incomec = new JComboBox(valincomec);
        incomec.setBounds(300, 200, 400, 30);
        incomec.setBackground(Color.WHITE);
        add(incomec);

        // Qualification
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Arial", Font.BOLD, 18));
        qualification.setBounds(100, 250, 200, 30);
        add(qualification);

        String[] valename = {"Non Graduation","Graduation","Masters","PhD","Others"};
        ename = new JComboBox(valename);
        ename.setBounds(300, 250, 400, 30);
        ename.setBackground(Color.WHITE);
        add(ename);

        // Occupation
        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Arial", Font.BOLD, 18));
        occupation.setBounds(100, 300, 200, 30);
        add(occupation);

        String[] valoccup = {"Officers","Businessman","Army","Police","Doctor","Engineers","Nurse","Others"};
        oname = new JComboBox(valoccup);
        oname.setBounds(300, 300, 400, 30);
        oname.setBackground(Color.WHITE);
        add(oname);

        // Citizenship
        JLabel citizen = new JLabel("Citizenship Number:");
        citizen.setFont(new Font("Arial", Font.BOLD, 18));
        citizen.setBounds(100, 350, 200, 30);
        add(citizen);

        cnTextField = new JTextField();
        cnTextField.setFont(new Font("Arial", Font.PLAIN, 18));
        cnTextField.setBounds(300, 350, 400, 30);
        add(cnTextField);

        // RP No
        JLabel rp = new JLabel("Rastriya Parichaya No:");
        rp.setFont(new Font("Arial", Font.BOLD, 18));
        rp.setBounds(100, 400, 250, 30);
        add(rp);

        rpTextField = new JTextField();
        rpTextField.setFont(new Font("Arial", Font.PLAIN, 18));
        rpTextField.setBounds(300, 400, 400, 30);
        add(rpTextField);

        // Senior Citizen
        JLabel scitizen = new JLabel("Senior Citizen:");
        scitizen.setFont(new Font("Arial", Font.BOLD, 18));
        scitizen.setBounds(100, 450, 200, 30);
        add(scitizen);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 450, 80, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(400, 450, 80, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(syes);
        buttonGroup.add(sno);

        // Existing Account
        JLabel eaccount = new JLabel("Existing Account:");
        eaccount.setFont(new Font("Arial", Font.BOLD, 18));
        eaccount.setBounds(100, 500, 200, 30);
        add(eaccount);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 500, 80, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(400, 500, 80, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup bGroup = new ButtonGroup();
        bGroup.add(eyes);
        bGroup.add(eno);

        // Next Button
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Arial", Font.BOLD, 20));
        next.setBounds(600, 600, 120, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 700);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String sreligion = (String) religion.getSelectedItem();
        String bname = (String) bnname.getSelectedItem();
        String amount = (String) incomec.getSelectedItem();
        String qualification = (String) ename.getSelectedItem();
        String occupation = (String) oname.getSelectedItem();

        String citizen = cnTextField.getText();
        String rp = rpTextField.getText();

        String scitizen = null;
        if (syes.isSelected()) scitizen = "Yes";
        else if (sno.isSelected()) scitizen = "No";

        String eaccount = null;
        if (eyes.isSelected()) eaccount = "Yes";
        else if (eno.isSelected()) eaccount = "No";

        try {
            Conn c = new Conn();
            String query = "INSERT INTO signuptwo (religion, branch, amount, qualification, occupation, citizen_no, rp_no, senior_citizen, existing_account) " +
                    "VALUES ('" + sreligion + "', '" + bname + "', '" + amount + "', '" + qualification + "', '" + occupation + "', '" +
                    citizen + "', '" + rp + "', '" + scitizen + "', '" + eaccount + "')";
            c.s.executeUpdate(query);

            JOptionPane.showMessageDialog(null, "Form submitted successfully!");
            setVisible(false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignupTwo();
    }
}

