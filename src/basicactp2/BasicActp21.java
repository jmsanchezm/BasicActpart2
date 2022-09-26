package basicactp2;

import java.util.Scanner;

public class BasicActp21 {

	public static void main(String[] args) {
		
/*Creamos el Scanner, que nos permitirá leer el teclado, en el cuál el usuario introducirá su edad.
Además, declaramos las variables y constantes necesitadas, en este caso dos variables y una constante*/
			Scanner keyboard = new Scanner (System.in);
				final int YEAR = 2022;
				int age;
				int bornIn;
//Pedimos al usuario que introduzca su edad.
		System.out.print ( "How old are you this year? ");
//Hacemos que el Scanner lea el dato introducido por el usuario.
					age = keyboard.nextInt();
					bornIn = YEAR - age;
// Como resultado, se le mostrará en pantalla a este, el año de nacimiento.
		System.out.println("I think you were born in " + bornIn);
// Finalmente, cerramos el Scanner.
		
	keyboard.close ();


	}

}
