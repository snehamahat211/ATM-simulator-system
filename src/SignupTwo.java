import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    long random;
    JTextField  cnTextField, rpTextField;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,bnname,oname,incomec,ename;


    SignupTwo() {
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION:PAGE 2") ;
        JLabel additionalDetails = new JLabel("page 2:Additional Details");
        additionalDetails.setFont(new Font("Arial", Font.BOLD, 38));
        additionalDetails.setBounds(140, 20, 600, 40);
        add(additionalDetails);



        JLabel sreligion = new JLabel("Religion:");
        sreligion.setFont(new Font("Arial", Font.BOLD, 18));
        sreligion.setBounds(100, 140, 100, 30);   //y=height of particular case +y axis
        add(sreligion);

        String[] valReligion ={"Hindu","Muslim","Buddhist","Sikh","Jain","Christain","Kirat","Others"};
        religion= new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);


        JLabel bname = new JLabel("Bank's Branch:");
        bname.setFont(new Font("Arial", Font.BOLD, 18));
        bname.setBounds(100, 190, 200, 30);
        add(bname);

        String[] valbname ={"Kausaltar","Kalimati","Banepa","Koteshwor","Baneshwor","RNC","Others"};
        bnname= new JComboBox(valbname);
        bnname.setBounds(300, 190, 400, 30);
        bnname.setBackground(Color.WHITE);
        add(bnname);


        JLabel amount = new JLabel("AmountonBank :");
        amount.setFont(new Font("Arial", Font.BOLD, 18));
        amount.setBounds(100, 240, 230, 30);
        add(amount);

        String[] valincomec ={"NULL","<50000","<1,00000","<1,50,000","<2,00000","<3,00000","Others"};
        incomec= new JComboBox(valincomec);
        incomec.setBounds(300, 240, 400, 30);
        incomec.setBackground(Color.WHITE);
        add(incomec);


        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Arial", Font.BOLD, 18));
        qualification.setBounds(100, 290, 200, 30);
        add(qualification);

        String[] valename ={"Non Graduation","Graduation","Masters","PHD","Others"};
        ename= new JComboBox(valename);
        ename.setBounds(300, 290, 400, 30);
        ename.setBackground(Color.WHITE);
        add(ename);

        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Arial", Font.BOLD, 18));
        occupation.setBounds(100, 340, 200, 30);
        add(occupation);

        String[] valoccup ={"Officers","Businessman","Army","Police","Doctor","Engineers","Nurse","Others"};
        oname= new JComboBox(valoccup);
        oname.setBounds(300, 190, 400, 30);
        oname.setBackground(Color.WHITE);
        add(oname);

        JLabel citizen = new JLabel("Citizenship Number:");
        citizen.setFont(new Font("Arial", Font.BOLD, 18));
        citizen.setBounds(100, 390, 200, 30);
        add(citizen);

        cnTextField = new JTextField();
        cnTextField.setFont(new Font("Arial", Font.BOLD, 20));
        cnTextField.setBounds(300, 390, 400, 30);
        add(cnTextField);

        JLabel rp = new JLabel("RastriyaParichaya no:");
        rp.setFont(new Font("Arial", Font.BOLD, 17));
        rp.setBounds(100, 430, 200, 30);
        add(rp);

        rpTextField = new JTextField();
        rpTextField.setFont(new Font("Arial", Font.BOLD, 20));
        rpTextField.setBounds(300, 430, 400, 30);
        add(rpTextField);

        JLabel scitizen = new JLabel("Senior Citizen :");
        scitizen.setFont(new Font("Arial", Font.BOLD, 18));
        scitizen.setBounds(100, 480, 200, 30);
        add(scitizen);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 290, 60, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(460, 290, 80, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(syes);
        buttonGroup.add(sno);

        JLabel state = new JLabel("Existing Account:");
        state.setFont(new Font("Arial", Font.BOLD, 18));
        state.setBounds(100, 530, 200, 30);
        add(state);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 290, 60, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(460, 290, 80, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup bGroup = new ButtonGroup();
        bGroup.add(eyes);
        bGroup.add(eno);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Arial", Font.BOLD, 20));
        next.setBounds(620, 660, 80, 20);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String sreligion = (String) religion.getSelectedItem();
        String bname =(String) bnname.getSelectedItem();
        String amount = (String) incomec.getSelectedItem();
        String qualification =(String) ename.getSelectedItem();
        String occupation =(String) oname.getSelectedItem();

        String citizen = cnTextField.getText();
        String rp = cnTextField.getText();



        String scitizen = null;
        if (syes.isSelected()) {
            scitizen = "Yes";
        } else if (sno.isSelected()) {
            scitizen= "No";
        }

        String rp = null;
        if (syes.isSelected()) {
            rp = "Yes";
        } else if (sno.isSelected()) {
            rp= "No";
        }
                Conn c = new Conn();
                String query = "INSERT INTO signup ( name, fname, dob, gender, email, marital, address, city, state, pin) " +
                        "VALUES ('" + formno + "', '" + name + "', '" + fname + "', '" + dob + "', '" + gender + "', '" +
                        email + "', '" + marital + "', '" + address + "', '" + city + "', '" + state + "', '" + pin + "')";
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Form submitted successfully!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new SignupTwo();
    }
}
