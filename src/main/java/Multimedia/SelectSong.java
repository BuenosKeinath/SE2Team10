package Multimedia;

import java.util.ArrayList;
import java.util.Scanner;




public class SelectSong {
    
    private static ArrayList<String> song = new ArrayList<String>();

	public static void main(String[] args) throws InterruptedException {
	    
	    playlistErstellen();
	    playlistAusgeben();
	    eingabe();
	    

	}	
	
	public static void eingabe() throws InterruptedException {
	    int eingabe = 0;
        Scanner songEingabe = new Scanner(System.in);    
	    
        System.out.print("Welchen Song wollen sie abspielen? : ");
        eingabe = songEingabe.nextInt();
        
        System.out.println();
        System.out.println();
        System.out.println();
                
        songEingabe.close();
        songAuswahl(eingabe);
	}
	
	public static ArrayList<String> playlistErstellen() {
        
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
        
        return song;

	}
	
	private static void playlistAusgeben() {
        
        System.out.println();
    
        System.out.println("Lieblingssongs \n------------------------------------------------------ \n");
        for(int i=0; i<10 ;i++) {
        System.out.println((i+1) + ": " + song.get(i));
        System.out.println();    
        }
        System.out.println("-------------------------------------------------------");
	}
	
	public static void songAuswahl(int eingabe) throws InterruptedException {	
		
		int count = 0;
		

		    		    
			
	        switch(eingabe){
	        case 1:	        	
	            System.out.println(song.get(eingabe));
	            System.out.println();
	            System.out.println("0:00                                                                   3:30");
	            while(count < 75) {
	            	System.out.print("=");
	            	Thread.sleep(250);
	            	count += 1;
	            }	           
	            break;
	            
	        case 2:
	            System.out.println(song.get(eingabe));
	            System.out.println();
	            System.out.println("0:00                                                                   3:30");
	            while(count < 75) {
	            	System.out.print("=");
	            	Thread.sleep(250);
	            	count += 1;
	            }
	            break;
	            
	        case 3:
	            System.out.println(song.get(eingabe));
	            System.out.println();
	            System.out.println("0:00                                                                   3:30");
	            while(count < 75) {
	            	System.out.print("=");
	            	Thread.sleep(250);
	            	count += 1;
	            }
	            break;
	            
	        case 4:
	            System.out.println(song.get(eingabe));
	            System.out.println();
	            System.out.println("0:00                                                                   3:30");
	            while(count < 75) {
	            	System.out.print("=");
	            	Thread.sleep(250);
	            	count += 1;
	            }
	            break;
	            
	        case 5:
	            System.out.println(song.get(eingabe));
	            System.out.println();
	            System.out.println("0:00                                                                   3:30");
	            while(count < 75) {
	            	System.out.print("=");
	            	Thread.sleep(250);
	            	count += 1;
	            }
	            break;
	            
	        case 6:
	            System.out.println(song.get(eingabe));
	            System.out.println();
	            System.out.println("0:00                                                                   3:30");
	            while(count < 75) {
	            	System.out.print("=");
	            	Thread.sleep(250);
	            	count += 1;
	            }
	            break;
	            
	        case 7:
	            System.out.println(song.get(eingabe));
	            System.out.println();
	            System.out.println("0:00                                                                   3:30");
	            while(count < 75) {
	            	System.out.print("=");
	            	Thread.sleep(250);
	            	count += 1;
	            }
	            break;
	            
	        case 8:
	            System.out.println(song.get(eingabe));
	            System.out.println();
	            System.out.println("0:00                                                                   3:30");
	            while(count < 75) {
	            	System.out.print("=");
	            	Thread.sleep(250);
	            	count += 1;
	            }
	            break;
	            
	        case 9:
	            System.out.println(song.get(eingabe));
	            System.out.println();
	            System.out.println("0:00                                                                   3:30");
	            while(count < 75) {
	            	System.out.print("=");
	            	Thread.sleep(250);
	            	count += 1;
	            }
	            break;
	            
	        case 10:
	            System.out.println(song.get(eingabe));
	            System.out.println();
	            System.out.println("0:00                                                                   3:30");
	            while(count < 75) {
	            	System.out.print("=");
	            	Thread.sleep(250);
	            	count += 1;
	            }
	            break;
	            
	        default:
	            System.out.println("Songauswahl fehlgeschlagen");
	            break;
	        }
	}
}

