package basicactp2;

import java.util.Scanner;

public class BasicActp23 {

	public static void main(String[] args) {
// Creamos el Scanner y declaramos las variables necesarias.
			Scanner keyboard = new Scanner(System.in);
			int num1;
			int num2 = 6;
//Solicitamos al usuario que introduzca un valor. En este caso el num1 será leído por el Scanner.
			System.out.print("Enter value ");
			num1 = keyboard.nextInt();
			num1 = num1 + 2;
			num2 = num1 / num2;
//Una vez calculado el valor de num2, se le mostrara el resultado en pantalla al usuario.
			System.out.println("Result = " + num2);
// Finalmente, cerramos el Scanner.
		keyboard.close();

	}

}
