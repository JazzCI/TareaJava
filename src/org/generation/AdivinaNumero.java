package org.generation;

import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int limInf = 1;
		int limSup = 100;
		int intentos = 0;
		
		System.out.println("Hola bienvenido!, intentaré adivinar tu número, "
				+ "por favor piensa un número del 1 al 100");
		while (true) {
			int adivNum = (limInf + limSup) / 2;
			intentos++;
			System.out.println("Tu número que pensaste es " + adivNum + " ? ");
			System.out.println("Responde si es mayor con 'mayor', si es menor con 'menor',");
			System.out.println("si es correcto el número responde con 'correcto'");
			String resp = scanner.nextLine().trim().toLowerCase();
			
			if(resp.equals("correcto")) {
				System.out.println("wiiiii, tu número es " + adivNum + " y lo adiviné en "
						+ intentos + " intentos :3");
				break;
			}else if(resp.equals("mayor")) {
				limInf = adivNum + 1;
			}else if(resp.equals("menor")) {
				limSup = adivNum - 1;
			}else {
				System.out.println("buuuu, responde si es 'mayor', 'menor' o 'correcto'"
						+ " el número que te mostré por favor");
			}
			
			if(limInf > limSup) {
				System.out.println("mmmm vuelve a intentarlo, no coinciden tus respuestas");
				break;	
			}
		}
		scanner.close();

	}

}
