import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Test extends JFrame {

    private JButton reset = new JButton("Reset");
    private JButton play = new JButton("Play");
    private JButton stop = new JButton("Stop");
    private JButton check = new JButton("Check");
    private  Linea modelo = new Linea();
    private boolean listo = true;
    Panel panel = new Panel(modelo);
    Panel panel2 = new Panel(modelo);
    public Test() {
        setTitle("Test");
        setSize(700, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

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
        panel.setBackground(Color.white);
        this.setVisible(true);
        initcomponent();
    }


    private void initcomponent() {
        reset.addActionListener(e -> {
        modelo.Formatear_arreglo();
        modelo.Anadir_lineas();
       repaint();
        });
        play.addActionListener(e -> {
            LimpiarPanel(panel);
            modelo.ordenar_arreglo();
            for (int i = 0; i < modelo.arreglordenado.length; i++) {
                System.out.println( modelo.arreglordenado[i].getTamano());
            }
            repaint();
        });
        check.addActionListener(e -> {
            if (modelo.Check() == true){
                JOptionPane.showMessageDialog(null,"Esta ordenado");
            }else{
                JOptionPane.showMessageDialog(null,"Esta desordenado");
            }

            ;
        });
    }
    public  void LimpiarPanel(Panel panel){

    }
    public static void main(String[] args) {
        Test test = new Test();

    }
}
