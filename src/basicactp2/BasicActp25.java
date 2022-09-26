package basicactp2;

import java.util.Scanner;

public class BasicActp25 {

	public static void main(String[] args) {
//Solicitamos al usuario que introduzca el ancho del rectángulo.
		System.out.println("Introduzca el ancho del rectángulo: ");
//Creamos el Scanner por el que la máquina podrá leer los datos introducidos. Declaramos e inicializamos las variables correspondientes.
			Scanner read = new Scanner(System.in);
				double  length;
					length = read.nextDouble();
//Solicitamos al usuaroi otro dato para calcular el perímetro y área y declaramos e inicializamos la correspondiente variable.
		System.out.println("Introduzca la altura del rectángtulo: ");
				double height;
					height = read.nextDouble();
//Declaramos e inicializamos la variable area y perímetro, las cuáles serán calculadas según los valores introducidos por el usuario.
				double area;
					area = length * height ;
				double perimeter;
					perimeter = 2*length + 2*height ;
//Como resultado, se le mostrará en pantalla al usuario los resultados de las operaciones llevadas a cabo.
		System.out.println("Según los datos introducidos, el área del rectángulo es " + area + ". Además el perímetro de este es " + perimeter);
// Finalmente, cerramos el Scanner.
		read.close();
	}

}
