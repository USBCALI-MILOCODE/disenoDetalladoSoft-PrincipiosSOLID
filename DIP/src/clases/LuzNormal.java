package clases;

import interfaces.Luz;

public class LuzNormal implements Luz {

  @Override
  public void encender() {
   System.out.println("Luz normal encendida");
  }

  @Override
  public void apagar() {
    System.out.println("Luz normal apagada");
  }


}
