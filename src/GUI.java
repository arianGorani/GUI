import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel succes;


    public static void main(String[] args) {

        JPanel panel = new JPanel();

        JFrame frame = new JFrame();
        frame.setSize(350  , 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(50);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);



        button = new JButton("Log in");
        button.setBounds(10, 80, 80,25);
        button.addActionListener(new GUI());
        panel.add(button);
        
        succes = new JLabel("");
        succes.setBounds(10, 110, 300, 25   );
        panel.add(succes);


        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user +", "+ password);

        if  (user.equals("arian") && password.equals("gorani")) {
            succes.setText("Login Successful!");
        }else{
            succes.setText("Wrong user or password!");
        }




    }
}
