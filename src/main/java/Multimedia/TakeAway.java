import java.util.Scanner;

public class TakeAway {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Wilkommen bei der Take-Away Funktion, um ihr Tablet zu entkoppeln schalten sie bitte das Fahrzeug aus [Enter zum fortfahren]");
		input.nextLine();

		System.out.println("Möchten sie das Tablet jetzt entkoppen?" + "\n" + "Enter [1] für Bestätigen oder [2] für Abbruch ");
		String entkoppeln = input.nextLine();

		if (entkoppeln.contains("1")) {
			System.out.println("Ihr Gerät wurde erfolgreich entkoppelt. [Enter zum fortfahren]");
			input.nextLine();

			System.out.println("Möchten sie ihr Tablet wieder mit dem Fahrzeug verbinden? Enter [1] für Bestätigen oder [2] für Abbruch");
			String verbinden = input.nextLine();

			if (verbinden.contains("1")) {
				System.out.println("Ihr Gerät wurde erfolgreich mit dem Fahrzeug verbunden.");
			} else if (verbinden.contains("2")) {
				System.out.println("Der Verbindungsvorgrang wurde abgebrochen.");
			}

		} else if (entkoppeln.contains("2")) {
			System.out.println("Der Entkopplungsvorgang wurde abgebrochen.");
		}

	}

}
