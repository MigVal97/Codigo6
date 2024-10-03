//Se agrega scanner - linea 5 agregar new - linea 7 se agraga un + - linea 9 .out -  linea 12 ln - linea 14 ) - linea 16 cambio de signos ? : - Cambiar foreach y char por for int - linea 21 llave else - linea 22 in por out

import java.util.Scanner;

public class codigo6 {
	   public static void main(String[] args) {
	        int[] n = new int[20];

	        for (int i = 0; i < 20; i++) {
	            n[i] = (int)(Math.random() * 381) + 20;
	            System.out.print(n[i] + " ");
	        }
	        
	        System.out.println("\n¿Qué números quiere resaltar? ");
	        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	        
	        Scanner scanner = new Scanner(System.in);
	        int opcion = scanner.nextInt();
	        
	        if (opcion < 1 || opcion > 2) {
	            System.out.println("Opción no válida. Debe ser 1 o 2.");
	            scanner.close();
	            return;
	        }

	        for (int e : n) {
	            if (opcion == 1 && e % 5 == 0) {
	                System.out.print("[" + e + "] ");
	            } else if (opcion == 2 && e % 7 == 0) {
	                System.out.print("[" + e + "] ");
	            } else {
	                System.out.print(e + " ");
	            }
	        }
	        
	        scanner.close();
	    }
	}