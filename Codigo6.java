//Anwar Delgado Silva
//calificaión: 4/5, revisó Jonathan.
//se recomendó ser más legible con el nombre de las variables.
package org.generation.revision6;
import java.util.Random;
import java.util.Scanner;
//se agrega random y scanner
public class Codigo6 {

	public static void main(String[] args) {
		//se agreaga new y se renombra a num
	    int[] num = new int[20];
	    //se pone ++
	    for (int i = 0; i < 20; i++) {
	      num[i] = (int)(Math.random() * 381) + 20;
	      System.out.println(num[i] + " ");
	    //se pone el out
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.println("(1 – los múltiplos de 5,");
	    System.out.println(" 2 – los múltiplos de 7): ");

	    //se agrega scanner
	    Scanner scanner = new Scanner(System.in);
	    int opcion = scanner.nextInt();
	    //Se agrega parentesis
	    int multiplo = (opcion == 1) ? 5 : 7;

	    //se cambia de char a int
	    for (int e : num) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      } else {
	        System.out.println(e + " ");
	      }
	    }

	}
	  
	}
