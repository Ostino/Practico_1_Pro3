import javax.swing.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Panel extends JPanel implements PropertyChangeListener {
    private List<Integer> arreglo =new ArrayList<>();
    private Linea modelo;

    public Panel(Linea l) {
    modelo =l;
    modelo.addObserver(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
    repaint();
    }

}
