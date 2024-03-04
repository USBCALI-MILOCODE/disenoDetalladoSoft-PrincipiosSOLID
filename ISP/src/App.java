import clases.Empleado;
import clases.Pasante;
import interfaces.Trabajador;

public class App {
    public static void main(String[] args) throws Exception {
        // Creamos un empleado y lo hacemos trabajar
        Trabajador empleado = new Empleado();
        empleado.trabajar();
        empleado.tomarDescanso();

        // Creamos un pasante y lo hacemos trabajar y asistir a reuniones
        Pasante pasante = new Pasante();
        pasante.trabajar();
        pasante.asistirReuniones();
        pasante.tomarDescanso();
    }
}
