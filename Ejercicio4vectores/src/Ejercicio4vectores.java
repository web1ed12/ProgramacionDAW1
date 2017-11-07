
public class Ejercicio4vectores {

	public static void main(String[] args) {
		int matriz[][] = new int[5][5];
		int min, max, fila, columna, filamax, filamin, columnamax, columnamin;
		//necesitaremos un for por cada dimension, en este caso dos for anidados
		for(fila = 0; fila < 5; fila++){
			for(columna = 0; columna < 5; columna++){
				matriz[fila][columna] = (int)Math.floor(Math.random()*201-100);
			}//columnas
		}//filas
		max = min = matriz[0][0];
		filamax = filamin = columnamax = columnamin = 0;
		for(fila = 0; fila < 5; fila++){
			for(columna = 0; columna < 5; columna++){
				if(matriz[fila][columna] > max){
					max = matriz[fila][columna];
					filamax = fila;
					columnamax = columna;
				}
				if(matriz[fila][columna] < min){
					min = matriz[fila][columna];
					filamin = fila;
					columnamin = columna;
				}	
			}
		}
		System.out.println("El maximo es " + max + "en la posicion (" + filamax + "," + columnamax + ") y el minimo " + min + " en la posicion (" + filamin + "," + columnamin + ")");
	
	
	
	
	
	}

}
