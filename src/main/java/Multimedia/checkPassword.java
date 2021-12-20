package Multimedia;

import java.util.HashMap;
import java.util.Scanner;

public class checkPassword {

	public static HashMap<String,Integer> pass = new HashMap<>();

	public static int password;
    
	
	public static void setPassword() {

		Scanner input = new Scanner(System.in);

		System.out.println("Bitte 4 Stellige pass eingeben ");

		password = input.nextInt();

			pass.put("Pass",password);
			System.out.println("Password is valid: " + password);
			
	   input.close();
		
	}

	public static boolean checkPass(int test) {
		
         int check = pass.get("Pass");
         
		if (test != check) {
			System.out.println("Pass ist Falsch, bitte noch mal versuchen");

			return false;
		} else {
			System.out.println("Pass is correct, access granted");
			return true;
		}

	}

}
