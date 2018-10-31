package gara.view;

import java.sql.SQLException;
import java.util.Scanner;

import gara.controller.GestioneGara;
import gara.vo.PilotaVo;

public class GaraMoto {

	public static void main(String[] args) {

		int scelta = 1;

		String nome, cognome;

		GestioneGara gg = new GestioneGara();

		do {
			System.out.println("Inserisci scelta: ");
			System.out.println("1. Inserisci Pilota");
			System.out.println("2. Cerca Pilota ");
			System.out.println("3. Esci ");

			System.out.print("Inserisci scelta: ");

			@SuppressWarnings("resource")
			Scanner tastiera = new Scanner(System.in);
			scelta = tastiera.nextInt();

			switch (scelta) {

			case 1:
				
				int esito;

				System.out.print("Inserisci nome: ");
				Scanner tastiera2 = new Scanner(System.in);
				nome = tastiera2.nextLine();

				System.out.print("Inserisci cognome: ");
				Scanner tastiera3 = new Scanner(System.in);
				cognome = tastiera3.nextLine();

				try {
					esito = gg.inserisciPilota(nome, cognome);

					if (esito != 0) {
						System.out.println("Dati Inseriti");
					} else {
						System.out.println("Dati non inseriti");
					}
				} catch (ClassNotFoundException e1) {
					System.out.println("Errore caricamento Driver");
					e1.printStackTrace();
				} catch (SQLException e1) {
					System.out.println("Errore connessione database");
					e1.printStackTrace();
				}
				break;

			case 2:

				System.out.print("Cerca nome: ");
				Scanner tastiera4 = new Scanner(System.in);
				nome = tastiera4.nextLine();

				System.out.print("Cerca cognome: ");
				Scanner tastiera5 = new Scanner(System.in);
				cognome = tastiera5.nextLine();

				try {
					PilotaVo pl = new PilotaVo();
				
					pl = gg.cercaPilota(nome, cognome);

					System.out.print(pl.toString());
					System.out.println("");

				} catch (ClassNotFoundException e) {
					System.out.println("Errore caricamento Driver");
					e.printStackTrace();
				} catch (SQLException e) {
					System.out.println("Errore connessione database");
					e.printStackTrace();
				}
			}
		} while (scelta != 3);
	}
}
