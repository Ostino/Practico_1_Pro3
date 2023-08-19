import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {

    private JButton reset = new JButton("Reset");
    private JButton play = new JButton("Play");
    private JButton stop = new JButton("Stop");
    private JButton check = new JButton("Check");
    private  Linea modelo;
    public Test() {
        setTitle("Test");
        setSize(700, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        initcomponent();
        modelo = new Linea();
        Panel panel = new Panel(modelo);
        this.add(panel);
        panel.setLayout(null);
        panel.add(reset);
        reset.setBounds(150,600,70,24);
        panel.add(play);
        play.setBounds(250,600,70,24);
        panel.add(stop);
        stop.setBounds(350,600,70,24);
        panel.add(check);
        check.setBounds(450,600,70,24);
        this.setVisible(true);
    }

    private void initcomponent() {

    }

    public static void main(String[] args) {
        Test test = new Test();
    }
}
