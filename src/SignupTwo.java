import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    long random;
    JTextField nameTextField, fTextField, emailTextField, cityTextField, addressTextField, pinTextField, stateTextField;
    JButton next;
    JRadioButton male, female, married, unmarried, other;
    JDateChooser datechooser;


    SignupTwo() {
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION:PAGE 2") ;
        JLabel additionalDetails = new JLabel("page 2:Additional Details");
        additionalDetails.setFont(new Font("Arial", Font.BOLD, 38));
        additionalDetails.setBounds(140, 20, 600, 40);
        add(additionalDetails);



        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Arial", Font.BOLD, 18));
        name.setBounds(100, 140, 100, 30);   //y=height of particular case +y axis
        add(name);

        String[] valReligion ={"Hindu","Muslim","Buddhist","Sikh","Jain","Christain","Kirat","Others"};
        JComboBox religion= new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);


        JLabel bname = new JLabel("Bank's Branch:");
        bname.setFont(new Font("Arial", Font.BOLD, 18));
        bname.setBounds(100, 190, 200, 30);
        add(bname);

        String[] valbname ={"Kausaltar","Kalimati","Banepa","Koteshwor","Baneshwor","RNC","Others"};
        JComboBox bnname= new JComboBox(valbname);
        bnname.setBounds(300, 190, 400, 30);
        bnname.setBackground(Color.WHITE);
        add(bnname);


        JLabel dob = new JLabel("AmountonBank :");
        dob.setFont(new Font("Arial", Font.BOLD, 18));
        dob.setBounds(100, 240, 230, 30);
        add(dob);

        String[] valincomec ={"NULL","<50000","<1,00000","<1,50,000","<2,00000","<3,00000","Others"};
        JComboBox incomec= new JComboBox(valincomec);
        incomec.setBounds(300, 240, 400, 30);
        incomec.setBackground(Color.WHITE);
        add(incomec);


        JLabel gender = new JLabel("Qualification:");
        gender.setFont(new Font("Arial", Font.BOLD, 18));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(460, 290, 80, 30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(male);
        buttonGroup.add(female);

        JLabel email = new JLabel("Occupation:");
        email.setFont(new Font("Arial", Font.BOLD, 18));
        email.setBounds(100, 340, 200, 30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Arial", Font.BOLD, 20));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);

        JLabel citizen = new JLabel("Citizenship Number:");
        citizen.setFont(new Font("Arial", Font.BOLD, 18));
        citizen.setBounds(100, 390, 200, 30);
        add(citizen);

        married = new JRadioButton("Married");
        married.setBounds(300, 390, 80, 30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(460, 390, 90, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(640, 390, 90, 30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);

        JLabel city = new JLabel("RastriyaParichaya no:");
        city.setFont(new Font("Arial", Font.BOLD, 17));
        city.setBounds(100, 430, 200, 30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Arial", Font.BOLD, 20));
        cityTextField.setBounds(300, 430, 400, 30);
        add(cityTextField);

        JLabel address = new JLabel("Senior Citizen :");
        address.setFont(new Font("Arial", Font.BOLD, 18));
        address.setBounds(100, 480, 200, 30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Arial", Font.BOLD, 20));
        addressTextField.setBounds(300, 480, 400, 30);
        add(addressTextField);

        JLabel state = new JLabel("Existing Account:");
        state.setFont(new Font("Arial", Font.BOLD, 18));
        state.setBounds(100, 530, 200, 30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Arial", Font.BOLD, 20));
        stateTextField.setBounds(300, 530, 400, 30);
        add(stateTextField);

        JLabel pin = new JLabel("Pin Code:");
        pin.setFont(new Font("Arial", Font.BOLD, 18));
        pin.setBounds(100, 590, 200, 30);
        add(pin);

        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Arial", Font.BOLD, 20));
        pinTextField.setBounds(300, 590, 400, 30);
        add(pinTextField);


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
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fTextField.getText();
        String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();

        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }

        String email = emailTextField.getText();

        String marital = null;
        if (married.isSelected()) {
            marital = "Married";
        } else if (unmarried.isSelected()) {
            marital = "Unmarried";
        } else if (other.isSelected()) {
            marital = "Other";
        }

        String city = cityTextField.getText();
        String address = addressTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();

        try {
            // ✅ Validation for empty fields
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter your name");
            } else if (fname.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter your father's name");
            } else if (dob.equals("")) {
                JOptionPane.showMessageDialog(null, "Please select your date of birth");
            } else if (gender == null) {
                JOptionPane.showMessageDialog(null, "Please select your gender");
            } else if (email.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter your email");
            } else if (marital == null) {
                JOptionPane.showMessageDialog(null, "Please select your marital status");
            } else if (address.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter your address");
            } else if (city.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter your city");
            } else if (state.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter your state");
            } else if (pin.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter your pin code");
            } else {
                // ✅ Insert into database
                Conn c = new Conn();
                String query = "INSERT INTO signup (formno, name, fname, dob, gender, email, marital, address, city, state, pin) " +
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
