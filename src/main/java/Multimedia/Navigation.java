package Multimedia;

import java.util.ArrayList;

public class Navigation {

	public static String Stadtnamen(String stadt) {
		String[] stadtnamen = { "Stuttgart", "Hamburg", "Berlin", "Dortmund", "Paris", "Rom" };

		for (int i = 0; i < stadtnamen.length; i++) {
			if (stadt == stadtnamen[i]) 
				System.out.println(stadtnamen[i]);	
		}
		
		 switch(stadt){
	        case "Hamburg":
	            System.out.println("Postleitzah: 20095 ");
	            break;
	        case "Stuttgart":
	        	System.out.println("Postleitzah: 70173 ");
	            break;
	        case "Berlin":
	        	System.out.println("Postleitzah: 10115 ");
	            break;
	        case "Dortmund":
	        	System.out.println("Postleitzah: 44263");
	            break;
	        case "Paris":
	        	System.out.println("Postleitzah: 75116");
	            break;
	        case "Rom":
	        	System.out.println("Postleitzah: 00017");
	            break;
	        default:
	            System.out.println("Die Eingabe war nicht korrekt");
	            break;
		 }
		return stadt;
	}
}
