package Multimedia;

import java.util.ArrayList;

public class Navigation {

	public static String Stadtnamen(String stadt) {
		String[] stadtnamen = { "Stuttgart", "Hamburg", "Berlin", "Dortmund", "Paris", "Rom" };

		for (int i = 0; i < stadtnamen.length; i++) {
			if (stadt == stadtnamen[i]) 
				System.out.println(stadtnamen[i]);	
		}

		return stadt;
	}
}
