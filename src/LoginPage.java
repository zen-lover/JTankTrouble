import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LoginPage {

    private JFrame loginForm;
    private JButton loginButton;
    private JTextField nameField;
    private JPasswordField passwordField;

    public LoginPage(String title) {

        loginForm = new JFrame(title);
        loginForm.setLocationRelativeTo(null);
        loginForm.setMinimumSize(new Dimension(300, 200));
        loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout(5, 5));
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        loginForm.setContentPane(panel);

        JLabel label = new JLabel(" JTankTrouble ");
        label.setBackground(Color.ORANGE);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);

        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        label.setBorder(border);

        int labelWidth = label.getPreferredSize().width + 20;
        int labelHeight = label.getPreferredSize().height + 10;
        label.setPreferredSize(new Dimension(labelWidth, labelHeight));

        JLabel nameLabel = new JLabel(" Username : ");
        nameField = new JTextField();

        JLabel passwordLabel = new JLabel(" Password : ");
        passwordField = new JPasswordField();

        JPanel fieldsPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        fieldsPanel.add(nameLabel);
        fieldsPanel.add(nameField);
        fieldsPanel.add(passwordLabel);
        fieldsPanel.add(passwordField);

        loginButton = new JButton("Login");

        int buttonWidth = loginButton.getPreferredSize().width;
        int buttonHeight = loginButton.getPreferredSize().height + 10;
        loginButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));

        JPanel rememberPanel = new JPanel(new GridLayout(1, 2));
        rememberPanel.setBorder(new EmptyBorder(5, 5, 0, 0));
        rememberPanel.add(new JLabel("Remember me: "));
        JCheckBox trayBox = new JCheckBox();
        rememberPanel.add(trayBox);

        JPanel southPanel = new JPanel(new GridLayout(2, 1));
        southPanel.add(loginButton);
        southPanel.add(rememberPanel);

        panel.add(label, BorderLayout.NORTH);
        panel.add(fieldsPanel, BorderLayout.CENTER);
        panel.add(southPanel, BorderLayout.SOUTH);
    }

    public void showGUI() {
        loginForm.pack();
        loginForm.setVisible(true);
    }
}