/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ec.jorgetorres.bowling;

import ec.jorgetorres.bowling.control.TenPinBowlingGame;

public class App {
  public String getGreeting() {
    return "Hello world.";
  }

  public static void main(String[] args) {
    if (args.length > 0) {
      game(args[0]);
    } else {
      System.out.println("No se ha ingresado una ruta de archivo");
    }
  }

  public static void game(String path) {
    new TenPinBowlingGame(path);
  }

}
