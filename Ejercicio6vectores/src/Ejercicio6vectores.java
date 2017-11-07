//6. Generar una matriz de 10x10, asignarles n�mero reales aleatorios a cada elemento entre -5 y 5.
//Calcular e imprimir la suma de cada una de sus filas y de cada una de sus columnas junto con la
//matriz.
public class Ejercicio6vectores {

	public static void main(String[] args) {
		double matriz [][] = new double[10][10];
		int fila, columna;
		double sumafila, sumacolumna;
		for(fila = 0; fila < 10; fila++){
			sumafila = 0;
			for(columna = 0; columna < 10; columna++){
				//Math.random()*(maximo-minimo)+(minimo);
				matriz [fila][columna] = Math.random()*5; 
				sumafila = sumafila + matriz[fila][columna];
				System.out.printf(String.format("%8.2f", matriz[fila][columna]));//String.format("%espacios delante.decimales",)
			}
			System.out.println(String.format("%10.2f",sumafila));	
		}
		System.out.println("\n");
		for(columna = 0; columna < 10; columna++){
			sumacolumna = 0;
			for(fila = 0; fila < 10; fila++){
				sumacolumna = sumacolumna + matriz[fila][columna]; //siempre primero fila y luego columna
			}
			System.out.printf(String.format("%8.2f",sumacolumna));
			}
	
	}

}
