//7. Generar una matriz de 5x5 num�rica entera entre -10 y 10, a continuaci�n pedir dos n�meros
//de fila, que se deben filtrar entre 1 y 5 e intercambiar ambas filas. Presentar las matrices antes
//y despu�s del cambio
import java.util.Scanner;
public class Ejercicio7vectores {

	public static void main(String[] args) {
		int matriz [][] = new int [5][5];
		int aux ;
		int fila, columna, num1, num2;
		for(fila = 0; fila < 5; fila++){
			for(columna = 0; columna < 5; columna++){
				matriz[fila][columna] = (int)Math.floor(Math.random()*11);
				System.out.printf("%4d", matriz[fila][columna]);//d cuando es entero
			}
			System.out.println("\n");
		}
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca dos numeros de la matriz");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		while(num1 < 1 | num1 > 5 | num2 < 1 | num2 > 5){
			System.out.println("Introduzca dos numeros de la matriz entre 1 y 5");
			num1 = teclado.nextInt();
			num2 = teclado.nextInt();
		}
		for(columna = 0; columna < 5; columna++){
			aux = matriz[num1][columna];
			matriz[num1][columna] = matriz[num2][columna];
			matriz[num1][columna] = aux;
			System.out.println(matriz[fila][columna]);
		}
		
	
	
	
	}

}
