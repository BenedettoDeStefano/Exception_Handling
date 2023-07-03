package Ex2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Inserisci i km percorso: ");
			double kmPercorsi = scanner.nextDouble();

			System.out.println("Inserisci numero litri carburante consumati: ");
			double litriCarburanteConsumati = scanner.nextDouble();

			if (litriCarburanteConsumati == 0) {
				System.out.println(
						"Errore: Divisione per zero. Inserisci un valore diverso da zero per i litri consumati.");
			} else {
				double kmPerLitro = kmPercorsi / litriCarburanteConsumati;
				System.out.println("Il consumo di carburante è di " + kmPerLitro + " km/litro.");
			}
		} catch (Exception e) {
			System.out.println("Si è verificato un errore. Assicurati di inserire valori numerici validi.");
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
	}
