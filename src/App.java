import org.degante.arreglos.Arreglo;

public class App {
    public static void main(String[] args) throws Exception {
        operacionesDeArreglos();
    }

    public static void operacionesDeArreglos() {
        Arreglo arreglo = new Arreglo();
        arreglo.listarArreglo();
        arreglo.listarArregloConForI();
        arreglo.sumarElementosDeArreglo();
        arreglo.elementoMayor();
        arreglo.invertirArreglo();
        arreglo.ordenarArreglo();
    }
}
