import javax.swing.*;
import java.awt.event.ActionListener;

public class SwingWindow extends JFrame implements ActionListener {
    private JPanel MainPanel;
    private JTextField playerNamePairsOfTextField;

    public SwingWindow(){
        setContentPane(MainPanel);
        setTitle("Window Test");
        setSize(700, 450);
        setLocation(650,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerform(){
        
    }
}
