package clases;

import interfaces.Luz;

public class Interruptor {

  private Luz luz;

  public Interruptor(Luz luz) {
    this.luz = luz;
  }

  public void encender() {
    luz.encender();
  }

  public void apagar() {
    luz.apagar();
  }

}
