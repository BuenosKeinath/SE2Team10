import java.util.ArrayList;
import java.util.Scanner;


public class SelectSong {

	public static void main(String[] args) throws InterruptedException {
		songAuswahl();
	}		
	
	public static void songAuswahl() throws InterruptedException {	
		int eingabe = 0;
		int count = 0;
		
		 ArrayList<String> song = new ArrayList<String>();
		    song.add("Elton John & Dua Lipa - Cold Heart");
		    song.add("Mariah Carey - All I Want For Christmas Is You");
		    song.add("Wham! - Last Christmas");
		    song.add("Ed Sheeran - Shivers");
		    song.add("Ed Sheeran - Bad Habits");
		    song.add("Acraze feat. Cherish - Do It To It");
		    song.add("Sido - Mit Dir");
		    song.add("Adele - Easy On Me");
		    song.add("GAYLE - abcdefu");
		    song.add("Ed Sheeran & Elton John - Merry Christmas");
		    
		    System.out.println();
	    
		    System.out.println("Lieblingssongs \n------------------------------------------------------ \n");
		    for(int i=0; i<10 ;i++) {
		    System.out.println((i+1) + ": " + song.get(i));
		    System.out.println();    
		    }
		    System.out.println("-------------------------------------------------------");
		    		    
			Scanner songEingabe = new Scanner(System.in);		    
	        System.out.print("Welchen Song wollen sie abspielen? : ");
	        eingabe = songEingabe.nextInt();
	        
	        System.out.println();
	        System.out.println();
	        System.out.println();
			        
	        switch(eingabe){
	        case 1:	        	
	            System.out.println(song.get(eingabe));
	            System.out.println();
	            System.out.println("0:00                                                                   3:30");
	            while(count < 210) {
	            	System.out.print("=");
	            	Thread.sleep(2800);
	            	count += 1;
	            }	           
	            break;
	            
	        case 2:
	            System.out.println(song.get(eingabe));
	            System.out.println();
	            System.out.println("0:00                                                                   3:30");
	            while(count < 210) {
	            	System.out.print("=");
	            	Thread.sleep(2800);
	            	count += 1;
	            }
	            break;
	            
	        case 3:
	            System.out.println(song.get(eingabe));
	            System.out.println();
	            System.out.println("0:00                                                                   3:30");
	            while(count < 210) {
	            	System.out.print("=");
	            	Thread.sleep(2800);
	            	count += 1;
	            }
	            break;
	            
	        case 4:
	            System.out.println(song.get(eingabe));
	            System.out.println();
	            System.out.println("0:00                                                                   3:30");
	            while(count < 210) {
	            	System.out.print("=");
	            	Thread.sleep(2800);
	            	count += 1;
	            }
	            break;
	            
	        case 5:
	            System.out.println(song.get(eingabe));
	            System.out.println();
	            System.out.println("0:00                                                                   3:30");
	            while(count < 210) {
	            	System.out.print("=");
	            	Thread.sleep(2800);
	            	count += 1;
	            }
	            break;
	            
	        case 6:
	            System.out.println(song.get(eingabe));
	            System.out.println();
	            System.out.println("0:00                                                                   3:30");
	            while(count < 210) {
	            	System.out.print("=");
	            	Thread.sleep(2800);
	            	count += 1;
	            }
	            break;
	            
	        case 7:
	            System.out.println(song.get(eingabe));
	            System.out.println();
	            System.out.println("0:00                                                                   3:30");
	            while(count < 210) {
	            	System.out.print("=");
	            	Thread.sleep(2800);
	            	count += 1;
	            }
	            break;
	            
	        case 8:
	            System.out.println(song.get(eingabe));
	            System.out.println();
	            System.out.println("0:00                                                                   3:30");
	            while(count < 210) {
	            	System.out.print("=");
	            	Thread.sleep(2800);
	            	count += 1;
	            }
	            break;
	            
	        case 9:
	            System.out.println(song.get(eingabe));
	            System.out.println();
	            System.out.println("0:00                                                                   3:30");
	            while(count < 210) {
	            	System.out.print("=");
	            	Thread.sleep(2800);
	            	count += 1;
	            }
	            break;
	            
	        case 10:
	            System.out.println(song.get(eingabe));
	            System.out.println();
	            System.out.println("0:00                                                                   3:30");
	            while(count < 210) {
	            	System.out.print("=");
	            	Thread.sleep(2800);
	            	count += 1;
	            }
	            break;
	            
	        default:
	            System.out.println("Songauswahl fehlgeschlagen");
	            break;
	        }
	}
}

