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
		System.out.println("Bitte Men�punkt ausw�hlen");
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
			System.out.println("Bitte den Men�punkt wieder w�hlen");
			System.out.println("1.Bluetooth");
			System.out.println("2.Live-Standort");
			System.out.println("3.Mobile-Daten");
			System.out.println("4.Tablet-Ortung");
			System.out.println("Bitte Zahl eingeben: ");
			Scanner scDef = new Scanner(System.in);
			zk = Integer.parseInt(scDef.nextLine());
			if(zk!=1||zk!=2||zk!=3||zk!=4)
			{
				System.out.println("Sie haben eine falsche Eingabe get�tigt");
				System.out.println("Bitte eine korrekte Eingabe t�tigen");
				System.out.println("M�gliche Eingaben sind: 1, 2, 3 und 4");
				zk=0;
			}
			break;
			
		case 1:
			System.out.println("Bluetooth wurde ausgew�hlt");
			if(BT.contentEquals("Ausgeschaltet"))
			{
			System.out.println("Bluetooth ist Momentatn "+BT+". M�chten sie es einschalten?");
			System.out.println("Y f�r Ja/N f�r Nein");
				Scanner scBT = new Scanner(System.in);
				BTstatus = scBT.nextLine();
				if(BTstatus.contentEquals("Y")||BTstatus.contentEquals("y"))
				{
					System.out.println("Bluetooth wurde Aktiviert");
					System.out.println("Sie werden zur�ck ins Men� gebracht");
					BT = "Eingeschaltet";
				}
				else if(BTstatus.contentEquals("N")||BTstatus.contentEquals("n"))
				{
					System.out.println("Bluetooth bleibt Deaktiviert");
					System.out.println("Sie werden zur�ck ins Men� gebracht");
				}
				else
				{
					System.out.println("Inkorrekte Eingabe");
				}
				
			zk = 0;
			}
			else if(BT.contentEquals("Eingeschaltet"))
			{
				System.out.println("Bluetooth ist Momentatn "+BT+". M�chten sie es ausschalten?");
				System.out.println("Y f�r Ja/N f�r Nein");
					Scanner scBT2 = new Scanner(System.in);
					BTstatus = scBT2.nextLine();
					if(BTstatus.contentEquals("Y")||BTstatus.contentEquals("y"))
					{
						System.out.println("Bluetooth wurde Deaktiviert");
						System.out.println("Sie werden zur�ck ins Men� gebracht");
						BT = "Ausgeschaltet";
					}
					else if(BTstatus.contentEquals("N")||BTstatus.contentEquals("n"))
					{
						System.out.println("Bluetooth bleibt Aktiviert");
						System.out.println("Sie werden zur�ck ins Men� gebracht");
					}
					else
					{
						System.out.println("Inkorrekte Eingabe");
					}
					
				zk = 0;
			}
			break;
			
		case 2:
			System.out.println("Live-Standort wurde ausgew�hlt");
			if(LS.contentEquals("Ausgeschaltet"))
			{
			System.out.println("Live-Standort ist Momentatn "+LS+". M�chten sie ihn einschalten?");
			System.out.println("Y f�r Ja/N f�r Nein");
				Scanner scLS = new Scanner(System.in);
				LSstatus = scLS.nextLine();
				if(LSstatus.contentEquals("Y")||LSstatus.contentEquals("y"))
				{
					System.out.println("Live-Standort wurde Aktiviert");
					System.out.println("Sie werden zur�ck ins Men� gebracht");
					LS = "Eingeschaltet";
				}
				else if(LSstatus.contentEquals("N")||LSstatus.contentEquals("n"))
				{
					System.out.println("Live-Standort bleibt Deaktiviert");
					System.out.println("Sie werden zur�ck ins Men� gebracht");
				}
				else
				{
					System.out.println("Inkorrekte Eingabe");
				}
				
			zk = 0;
			}
			else if(LS.contentEquals("Eingeschaltet"))
			{
				System.out.println("Live-Standort ist Momentatn "+LS+". M�chten sie es ausschalten?");
				System.out.println("Y f�r Ja/N f�r Nein");
					Scanner scLS2 = new Scanner(System.in);
					LSstatus = scLS2.nextLine();
					if(LSstatus.contentEquals("Y")||LSstatus.contentEquals("y"))
					{
						System.out.println("Live-Standort wurde Deaktiviert");
						System.out.println("Sie werden zur�ck ins Men� gebracht");
						LS = "Ausgeschaltet";
					}
					else if(LSstatus.contentEquals("N")||LSstatus.contentEquals("n"))
					{
						System.out.println("Live-Standort bleibt Aktiviert");
						System.out.println("Sie werden zur�ck ins Men� gebracht");
					}
					else
					{
						System.out.println("Inkorrekte Eingabe");
					}
					
				zk = 0;
			}
			break;
			
		case 3:
			System.out.println("Mobile-Daten wurde ausgew�hlt");
			if(MD.contentEquals("Ausgeschaltet"))
			{
			System.out.println("Mobile-Daten ist Momentatn "+MD+". M�chten sie diese einschalten?");
			System.out.println("Y f�r Ja/N f�r Nein");
				Scanner scMD = new Scanner(System.in);
				MDstatus = scMD.nextLine();
				if(MDstatus.contentEquals("Y")||MDstatus.contentEquals("y"))
				{
					System.out.println("Mobile-Daten wurde Aktiviert");
					System.out.println("Sie werden zur�ck ins Men� gebracht");
					MD = "Eingeschaltet";
				}
				else if(MDstatus.contentEquals("N")||MDstatus.contentEquals("n"))
				{
					System.out.println("Mobile-Daten bleibt Deaktiviert");
					System.out.println("Sie werden zur�ck ins Men� gebracht");
				}
				else
				{
					System.out.println("Inkorrekte Eingabe");
				}
				
			zk = 0;
			}
			else if(MD.contentEquals("Eingeschaltet"))
			{
				System.out.println("Mobile-Daten ist Momentatn "+MD+". M�chten sie es ausschalten?");
				System.out.println("Y f�r Ja/N f�r Nein");
					Scanner scMD2 = new Scanner(System.in);
					MDstatus = scMD2.nextLine();
					if(MDstatus.contentEquals("Y")||MDstatus.contentEquals("y"))
					{
						System.out.println("Mobile-Daten wurde Deaktiviert");
						System.out.println("Sie werden zur�ck ins Men� gebracht");
						MD = "Ausgeschaltet";
					}
					else if(MDstatus.contentEquals("N")||MDstatus.contentEquals("n"))
					{
						System.out.println("Mobile-Daten bleibt Aktiviert");
						System.out.println("Sie werden zur�ck ins Men� gebracht");
					}
					else
					{
						System.out.println("Inkorrekte Eingabe");
					}
					
				zk = 0;
			}
			break;
	
		case 4:
			System.out.println("Tablet-Ortung wurde ausgew�hlt");
			if(TO.contentEquals("Ausgeschaltet"))
			{
			System.out.println("Tablet-Ortung ist Momentatn "+TO+". M�chten sie diese einschalten?");
			System.out.println("Y f�r Ja/N f�r Nein");
				Scanner scTO = new Scanner(System.in);
				TOstatus = scTO.nextLine();
				if(TOstatus.contentEquals("Y")||TOstatus.contentEquals("y"))
				{
					System.out.println("Tablet-Ortung wurde Aktiviert");
					System.out.println("Sie werden zur�ck ins Men� gebracht");
					TO = "Eingeschaltet";
				}
				else if(TOstatus.contentEquals("N")||TOstatus.contentEquals("n"))
				{
					System.out.println("Tablet-Ortung bleibt Deaktiviert");
					System.out.println("Sie werden zur�ck ins Men� gebracht");
				}
				else
				{
					System.out.println("Inkorrekte Eingabe");
				}
				
			zk = 0;
			}
			else if(TO.contentEquals("Eingeschaltet"))
			{
				System.out.println("Tablet-Ortung ist Momentatn "+TO+". M�chten sie es ausschalten?");
				System.out.println("Y f�r Ja/N f�r Nein");
					Scanner scTO2 = new Scanner(System.in);
					TOstatus = scTO2.nextLine();
					if(TOstatus.contentEquals("Y")||TOstatus.contentEquals("y"))
					{
						System.out.println("Tablet-Ortung wurde Deaktiviert");
						System.out.println("Sie werden zur�ck ins Men� gebracht");
						TO = "Ausgeschaltet";
					}
					else if(TOstatus.contentEquals("N")||TOstatus.contentEquals("n"))
					{
						System.out.println("Tablet-Ortung bleibt Aktiviert");
						System.out.println("Sie werden zur�ck ins Men� gebracht");
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
