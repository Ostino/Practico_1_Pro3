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
    public   Linea[] arreglo = new Linea[200];

    public Linea(){
        this.xf=generador();
        this.yf=generador();
        observado = new PropertyChangeSupport(this);

    }
    public void addObserver(PropertyChangeListener observador) {
        observado.addPropertyChangeListener(observador);
    }
    public static int generador() {
        Random random = new Random();
        return random.nextInt(600) + 1;
    }

    public Linea[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Linea[] arreglo) {
        this.arreglo = arreglo;
    }

    public  void Anadir_lineas () {
        Linea[] oldarreglo = this.arreglo;
        for (int i = 0; i < arreglo.length; i++) {
            Linea linea = new Linea();
            arreglo[i] = linea;
        }
        observado.firePropertyChange("Arreglo",oldarreglo, this.arreglo);

    }
    public void Formatear_arreglo() {
        Linea[] oldarreglo = this.arreglo;
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = null;
        }
        observado.firePropertyChange("Arreglo",oldarreglo, this.arreglo);
    }


    public int getXi() {
        return xi;
    }

    public void setXi(int xi) {
        this.xi = xi;
    }

    public int getYi() {
        return yi;
    }

    public void setYi(int yi) {
        this.yi = yi;
    }

    public int getXf() {
        return xf;
    }

    public void setXf(int xf) {
        this.xf = xf;
    }

    public int getYf() {
        return yf;
    }

    public void setYf(int yf) {
        this.yf = yf;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
}