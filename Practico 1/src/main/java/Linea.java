import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Arrays;
import java.util.Random;

public class Linea implements  Comparable<Linea>{

    private int xf;
    private int yf;
    private int tamano;
    private PropertyChangeSupport observado;
    public   Linea[] arreglo = new Linea[200];
    public Linea[] arreglordenado = new Linea[200];

    public Linea[] getArreglordenado() {
        return arreglordenado;
    }

    public Linea(){
        this.xf=generador();
        this.yf=generador();
        tamano= (int) Math.sqrt((xf*xf)+(yf*yf));
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
        arreglordenado=Arrays.copyOf(arreglo,arreglo.length);
        observado.firePropertyChange("Arreglo",oldarreglo, this.arreglo);
    }
    public void Formatear_arreglo() {
        Linea[] oldarreglo = this.arreglo;
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = null;
        }
        observado.firePropertyChange("Arreglo",oldarreglo, this.arreglo);
    }
    public  void ordenar_arreglo (){
        Arrays.sort(arreglo);
    }
    public boolean Check (){
        for (int i = 0; i < arreglo.length-1; i++) {
            if (arreglo[i].getTamano()<=arreglo[i+1].getTamano()){
            }else{
                return false;
            }
        }
        return true;
    }
    public int getXf() {
        return xf;
    }
    public int getYf() {
        return yf;
    }
    public int getTamano() {
        return tamano;
    }
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    public void animacion( int milisegundos) {
            try {

                Thread.sleep(milisegundos);
            } catch(Exception q) {

            }
        }

    @Override
    public int compareTo(Linea o) {
        return Integer.compare(this.tamano,o.getTamano());
    }
}