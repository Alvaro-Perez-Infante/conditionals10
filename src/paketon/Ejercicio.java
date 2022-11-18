package paketon;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in); 
		
		
		final int TOTAL_MIN = 1440;
		
		int hora;
		int minutos;
		int minTranscurridos;
		int minRestantes;
		
		
		
		System.out.print("Introduzca la hora (formato 24 horas): ");
		hora = Integer.parseInt(teclado.nextLine());
		System.out.print("Introduzca los minutos: ");
		minutos = Integer.parseInt(teclado.nextLine());
		
		
		minTranscurridos = (hora * 60) + minutos;
		minRestantes = TOTAL_MIN - minTranscurridos;
		
		
		
		System.out.println("Han transcurrido " + minTranscurridos + "minutos.");
		System.out.println("Faltan " + minRestantes + " minutos para la media noche.");
		
		
	}

}