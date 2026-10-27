import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {

    private JButton alphaButton;
    private JButton betaButton;
    private JButton gammaButton;
    private JLabel messageLabel;

    public Main() {
        setTitle("Alpha Beta Gamma Button App");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create components
        alphaButton = new JButton("Alpha");
        betaButton = new JButton("Beta");
        gammaButton = new JButton("Gamma");
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
            messageLabel.setText("Alpha pressed");
        } else if (e.getSource() == betaButton) {
            messageLabel.setText("Beta pressed");
        } else if (e.getSource() == gammaButton) {
            messageLabel.setText("Gamma pressed");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main app = new Main();
            app.setVisible(true);
        });
    }
}