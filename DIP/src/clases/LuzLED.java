package clases;

import interfaces.Luz;

public class LuzLED implements Luz {

  @Override
  public void encender() {
    System.out.println("Luz LED encendida");

  }

  @Override
  public void apagar() {  
    System.out.println("Luz LED apagada");
  }

}
