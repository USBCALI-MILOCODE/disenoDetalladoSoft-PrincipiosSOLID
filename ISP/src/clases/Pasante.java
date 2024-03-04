package clases;

import interfaces.Trabajador;
import interfaces.TrabajadorConReuniones;

public class Pasante implements Trabajador, TrabajadorConReuniones {

  @Override
  public void asistirReuniones() {
    System.out.println("Asistiendo a reuniones como pasante");
  }

  @Override
  public void trabajar() {
    System.out.println("Trabajando como pasante");
  }

  @Override
  public void tomarDescanso() {
    System.out.println("Tomando descanso como pasante");
  }

}
