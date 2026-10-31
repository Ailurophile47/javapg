import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {

    private JButton alphaButton;
    private JButton betaButton;
    private JButton gammaButton;
    private JLabel messageLabel;

    public Main(String button1Name, String button2Name, String button3Name) {
        setTitle("Alpha Beta Gamma Button App");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create components
        alphaButton = new JButton(button1Name);
        betaButton = new JButton(button2Name);
        gammaButton = new JButton(button3Name);
        messageLabel = new JLabel("Click a button...");

        // Register action listeners
        alphaButton.addActionListener(this);
        betaButton.addActionListener(this);
        gammaButton.addActionListener(this);

        // Add components to frame
        add(alphaButton);
        add(betaButton);
        add(gammaButton);
        add(messageLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == alphaButton) {
            messageLabel.setText(alphaButton.getText() + " pressed");
        } else if (e.getSource() == betaButton) {
            messageLabel.setText(betaButton.getText() + " pressed");
        } else if (e.getSource() == gammaButton) {
            messageLabel.setText(gammaButton.getText() + " pressed");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name for button 1: ");
        String button1Name = sc.nextLine();
        System.out.print("Enter name for button 2: ");
        String button2Name = sc.nextLine();
        System.out.print("Enter name for button 3: ");
        String button3Name = sc.nextLine();
        sc.close();
        SwingUtilities.invokeLater(() -> {
            Main app = new Main(button1Name, button2Name, button3Name);
            app.setVisible(true);
        });
    }
}