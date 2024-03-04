package clases;

import interfaces.Trabajador;

public class Empleado implements Trabajador{

  @Override
  public void trabajar() {
    System.out.println("Trabajando como empleado");
  }

  @Override
  public void tomarDescanso() {
    System.out.println("Tomando descanso como empleado");
  }
  

}