package estructurasRepetitivas;
import java.util.Scanner;

/**
 * Ejercicio 16: Escribe un programa que diga si un número introducido por teclado es o no primo. 
 * Un número primo es aquel que sólo es divisible entre él mismo y la unidad.
 * 
 * @author JavierEpifanio
 *
 */
public class Ejercicio16NumeroPrimo {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número entero y le diré si es primo: ");
    int numeroIntroducido = s.nextInt();

    boolean esPrimo = true;
    
    for (int i = 2; i < numeroIntroducido; i++) {
      if ((numeroIntroducido % i) == 0) {
        esPrimo = false;
      }
    }
        
    if (esPrimo) {
      System.out.println("El número introducido es primo.");
    } else {
      System.out.println("El número introducido no es primo.");
    }
    
    s.close();
  }

}
