import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Random;

public class Linea {
    private int xi;
    private int yi;
    private int xf;
    private int yf;
    private int tamano;
    private PropertyChangeSupport observado;

    public Linea(){
        this.tamano=generador();
        observado = new PropertyChangeSupport(this);

    }
    public void addObserver(PropertyChangeListener observador) {
        observado.addPropertyChangeListener(observador);
    }
    public static int generador() {
        Random random = new Random();
        return random.nextInt(200) + 1;
    }
}

