import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KryptGUI {
    private JPanel GUI;
    private JButton openButton;
    private JButton saveButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JButton cryptButton;
    private JButton decryptButton;
    private JButton selectKeyButton;
    private JButton aboutButton;

    public KryptGUI() {
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(GUI, "Välj fil");
            }
        });
        selectKeyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(GUI, "Välj key");
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(GUI, "Välj var du vill spara");
            }
        });
        cryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(GUI, "Kryptera meddelande");
            }
        });
        decryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(GUI, "Dekryptera meddelande");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("KryptGUI");
        frame.setContentPane(new KryptGUI().GUI);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1000, 800);
        frame.setResizable(false);
    }
}
