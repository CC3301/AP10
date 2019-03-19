import java.util.Scanner;
public class Wuerfel {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);		

		int zufallszahl = (int) (Math.random()*10 + 1);
		int i = 0;
		int versuche = 0;
		
		System.out.println("Rate welche Zahl gewuefelt wurde: ");	
		
		do {
			
		int geratenezahl = sc.nextInt();
		
		if (zufallszahl == geratenezahl) {
			
			versuche++;
			System.out.println("Du hast richtig geraten! Du hast " + versuche + " Versuche gebraucht.");
			i = 1;
			
		} else {
			
			System.out.println("Falsch!");
			versuche++;
			
		}
			
		} while (i == 0);
	}
}
