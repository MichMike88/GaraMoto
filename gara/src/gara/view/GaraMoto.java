package gara.view;

import java.util.Scanner;

//import gara.controller.GestioneGara;

public class GaraMoto {

	public static void main(String[] args) {
		
		String scelta;
		
//		GestioneGara gg= new GestioneGara();
		
		System.out.println("Inserisci scelta: ");
		System.out.println("1. Inserisci Pilota");
		System.out.println("2. Cerca Pilota ");
		System.out.println("3. Esci ");
		
		Scanner tastiera = new Scanner(System.in);
		scelta = tastiera.nextLine();
		tastiera.close();
		switch (scelta) {
		
		case "1":
			
//			String nome,cognome;
//			
//			Scanner tastiera2= new Scanner(System.in);
			
			break;

		default:
			break;
		}
	}
}
