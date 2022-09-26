package basicactp2;

import java.util.Scanner;

public class BasicActp24 {

	public static void main(String[] args) {
//Creamos el Scanner y declaramos las variables, en este caso x, y y aux.
		Scanner keyboard = new Scanner (System.in);
		int x;
		int y;
		int aux;
//Solicitamos al usuario que introduzca dos valores.
		System.out.println ("Enter value for x: ");
			x = keyboard.nextInt();
		System.out.print ("Enter value for y: ");
			y = keyboard.nextInt();
// Igualamos las variables
			aux = x;
			x = y;
			y = aux;
//Al usuario se le mostrará por pantalla el nuevo valor de x e y.
		System.out.println("x = " + x);
		System.out.println("y = " + y);
// Finalmente, cerramos el Scanner.
		keyboard.close();
		}

	}

