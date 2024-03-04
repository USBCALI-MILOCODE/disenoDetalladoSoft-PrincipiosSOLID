import clases.Interruptor;
import clases.LuzLED;
import clases.LuzNormal;
import interfaces.Luz;

public class App {
    public static void main(String[] args) throws Exception {
        // Creamos la instancia del interruptor con luz LED
        Luz luzLED = new LuzLED();
        Interruptor interruptorLED = new Interruptor(luzLED);

        interruptorLED.encender();
        interruptorLED.apagar();

        // Creamos la instancia del interruptor con luz normal
        Luz luzNormal = new LuzNormal();
        Interruptor interruptorNormal = new Interruptor(luzNormal);

        interruptorNormal.encender();
        interruptorNormal.apagar();
    }
}
