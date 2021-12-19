package Multimedia;

import java.util.Scanner;

public class SE2Menue {

	public static void menu()
	{
		boolean b = true;
		String BT = "Ausgeschaltet";
		String BTstatus;
		String LS = "Ausgeschaltet";
		String LSstatus;
		String MD = "Ausgeschaltet";
		String MDstatus;
		String TO = "Ausgeschaltet";
		String TOstatus;
		
		while (b)
		{
		System.out.println("Bitte Menüpunkt auswählen");
		System.out.println("1.Bluetooth");
		System.out.println("2.Live-Standort");
		System.out.println("3.Mobile-Daten");
		System.out.println("4.Tablet-Ortung");
		System.out.println("Bitte Zahl eingeben: ");
		Scanner sc = new Scanner(System.in);
		int zk = Integer.parseInt(sc.nextLine());
		
		switch(zk)
		{
		case 0:
			System.out.println("Bitte den Menüpunkt wieder wählen");
			System.out.println("1.Bluetooth");
			System.out.println("2.Live-Standort");
			System.out.println("3.Mobile-Daten");
			System.out.println("4.Tablet-Ortung");
			System.out.println("Bitte Zahl eingeben: ");
			Scanner scDef = new Scanner(System.in);
			zk = Integer.parseInt(scDef.nextLine());
			if(zk!=1||zk!=2||zk!=3||zk!=4)
			{
				System.out.println("Sie haben eine falsche Eingabe getätigt");
				System.out.println("Bitte eine korrekte Eingabe tätigen");
				System.out.println("Mögliche Eingaben sind: 1, 2, 3 und 4");
				zk=0;
			}
			break;
			
		case 1:
			System.out.println("Bluetooth wurde ausgewählt");
			if(BT.contentEquals("Ausgeschaltet"))
			{
			System.out.println("Bluetooth ist Momentatn "+BT+". Möchten sie es einschalten?");
			System.out.println("Y für Ja/N für Nein");
				Scanner scBT = new Scanner(System.in);
				BTstatus = scBT.nextLine();
				if(BTstatus.contentEquals("Y")||BTstatus.contentEquals("y"))
				{
					System.out.println("Bluetooth wurde Aktiviert");
					System.out.println("Sie werden zurück ins Menü gebracht");
					BT = "Eingeschaltet";
				}
				else if(BTstatus.contentEquals("N")||BTstatus.contentEquals("n"))
				{
					System.out.println("Bluetooth bleibt Deaktiviert");
					System.out.println("Sie werden zurück ins Menü gebracht");
				}
				else
				{
					System.out.println("Inkorrekte Eingabe");
				}
				
			zk = 0;
			}
			else if(BT.contentEquals("Eingeschaltet"))
			{
				System.out.println("Bluetooth ist Momentatn "+BT+". Möchten sie es ausschalten?");
				System.out.println("Y für Ja/N für Nein");
					Scanner scBT2 = new Scanner(System.in);
					BTstatus = scBT2.nextLine();
					if(BTstatus.contentEquals("Y")||BTstatus.contentEquals("y"))
					{
						System.out.println("Bluetooth wurde Deaktiviert");
						System.out.println("Sie werden zurück ins Menü gebracht");
						BT = "Ausgeschaltet";
					}
					else if(BTstatus.contentEquals("N")||BTstatus.contentEquals("n"))
					{
						System.out.println("Bluetooth bleibt Aktiviert");
						System.out.println("Sie werden zurück ins Menü gebracht");
					}
					else
					{
						System.out.println("Inkorrekte Eingabe");
					}
					
				zk = 0;
			}
			break;
			
		case 2:
			System.out.println("Live-Standort wurde ausgewählt");
			if(LS.contentEquals("Ausgeschaltet"))
			{
			System.out.println("Live-Standort ist Momentatn "+LS+". Möchten sie ihn einschalten?");
			System.out.println("Y für Ja/N für Nein");
				Scanner scLS = new Scanner(System.in);
				LSstatus = scLS.nextLine();
				if(LSstatus.contentEquals("Y")||LSstatus.contentEquals("y"))
				{
					System.out.println("Live-Standort wurde Aktiviert");
					System.out.println("Sie werden zurück ins Menü gebracht");
					LS = "Eingeschaltet";
				}
				else if(LSstatus.contentEquals("N")||LSstatus.contentEquals("n"))
				{
					System.out.println("Live-Standort bleibt Deaktiviert");
					System.out.println("Sie werden zurück ins Menü gebracht");
				}
				else
				{
					System.out.println("Inkorrekte Eingabe");
				}
				
			zk = 0;
			}
			else if(LS.contentEquals("Eingeschaltet"))
			{
				System.out.println("Live-Standort ist Momentatn "+LS+". Möchten sie es ausschalten?");
				System.out.println("Y für Ja/N für Nein");
					Scanner scLS2 = new Scanner(System.in);
					LSstatus = scLS2.nextLine();
					if(LSstatus.contentEquals("Y")||LSstatus.contentEquals("y"))
					{
						System.out.println("Live-Standort wurde Deaktiviert");
						System.out.println("Sie werden zurück ins Menü gebracht");
						LS = "Ausgeschaltet";
					}
					else if(LSstatus.contentEquals("N")||LSstatus.contentEquals("n"))
					{
						System.out.println("Live-Standort bleibt Aktiviert");
						System.out.println("Sie werden zurück ins Menü gebracht");
					}
					else
					{
						System.out.println("Inkorrekte Eingabe");
					}
					
				zk = 0;
			}
			break;
			
		case 3:
			System.out.println("Mobile-Daten wurde ausgewählt");
			if(MD.contentEquals("Ausgeschaltet"))
			{
			System.out.println("Mobile-Daten ist Momentatn "+MD+". Möchten sie diese einschalten?");
			System.out.println("Y für Ja/N für Nein");
				Scanner scMD = new Scanner(System.in);
				MDstatus = scMD.nextLine();
				if(MDstatus.contentEquals("Y")||MDstatus.contentEquals("y"))
				{
					System.out.println("Mobile-Daten wurde Aktiviert");
					System.out.println("Sie werden zurück ins Menü gebracht");
					MD = "Eingeschaltet";
				}
				else if(MDstatus.contentEquals("N")||MDstatus.contentEquals("n"))
				{
					System.out.println("Mobile-Daten bleibt Deaktiviert");
					System.out.println("Sie werden zurück ins Menü gebracht");
				}
				else
				{
					System.out.println("Inkorrekte Eingabe");
				}
				
			zk = 0;
			}
			else if(MD.contentEquals("Eingeschaltet"))
			{
				System.out.println("Mobile-Daten ist Momentatn "+MD+". Möchten sie es ausschalten?");
				System.out.println("Y für Ja/N für Nein");
					Scanner scMD2 = new Scanner(System.in);
					MDstatus = scMD2.nextLine();
					if(MDstatus.contentEquals("Y")||MDstatus.contentEquals("y"))
					{
						System.out.println("Mobile-Daten wurde Deaktiviert");
						System.out.println("Sie werden zurück ins Menü gebracht");
						MD = "Ausgeschaltet";
					}
					else if(MDstatus.contentEquals("N")||MDstatus.contentEquals("n"))
					{
						System.out.println("Mobile-Daten bleibt Aktiviert");
						System.out.println("Sie werden zurück ins Menü gebracht");
					}
					else
					{
						System.out.println("Inkorrekte Eingabe");
					}
					
				zk = 0;
			}
			break;
	
		case 4:
			System.out.println("Tablet-Ortung wurde ausgewählt");
			if(TO.contentEquals("Ausgeschaltet"))
			{
			System.out.println("Tablet-Ortung ist Momentatn "+TO+". Möchten sie diese einschalten?");
			System.out.println("Y für Ja/N für Nein");
				Scanner scTO = new Scanner(System.in);
				TOstatus = scTO.nextLine();
				if(TOstatus.contentEquals("Y")||TOstatus.contentEquals("y"))
				{
					System.out.println("Tablet-Ortung wurde Aktiviert");
					System.out.println("Sie werden zurück ins Menü gebracht");
					TO = "Eingeschaltet";
				}
				else if(TOstatus.contentEquals("N")||TOstatus.contentEquals("n"))
				{
					System.out.println("Tablet-Ortung bleibt Deaktiviert");
					System.out.println("Sie werden zurück ins Menü gebracht");
				}
				else
				{
					System.out.println("Inkorrekte Eingabe");
				}
				
			zk = 0;
			}
			else if(TO.contentEquals("Eingeschaltet"))
			{
				System.out.println("Tablet-Ortung ist Momentatn "+TO+". Möchten sie es ausschalten?");
				System.out.println("Y für Ja/N für Nein");
					Scanner scTO2 = new Scanner(System.in);
					TOstatus = scTO2.nextLine();
					if(TOstatus.contentEquals("Y")||TOstatus.contentEquals("y"))
					{
						System.out.println("Tablet-Ortung wurde Deaktiviert");
						System.out.println("Sie werden zurück ins Menü gebracht");
						TO = "Ausgeschaltet";
					}
					else if(TOstatus.contentEquals("N")||TOstatus.contentEquals("n"))
					{
						System.out.println("Tablet-Ortung bleibt Aktiviert");
						System.out.println("Sie werden zurück ins Menü gebracht");
					}
					else
					{
						System.out.println("Inkorrekte Eingabe");
					}
					
				zk = 0;
			}
			break;
			
		}
		}
	}

}
