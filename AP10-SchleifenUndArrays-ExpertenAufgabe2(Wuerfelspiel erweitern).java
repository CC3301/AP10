import java.util.*;
public class ratespiel {
	
	public static void main (String[] args) {
		
		int geratenezahl = 0;
		int zufallszahl = 1;
		int versuche = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte gebe eine Obergreze an: ");
		int obergrenze = sc.nextInt();
		System.out.println("Wie viele Versuche sind maximal zulaessig: ");
		int maxversuche = sc.nextInt();
		
		zufallszahl = (int) (Math.random()* (obergrenze+1));
		
		while (geratenezahl != zufallszahl) {
			
			System.out.print("Versuch " + versuche + " - Dein Tipp?");
			geratenezahl = sc.nextInt();
			versuche++;
			
			if (geratenezahl < zufallszahl) {
				
				System.out.println("Meine Zahl ist groesser!");
				
			} else if (geratenezahl > zufallszahl) {
				
				System.out.println("Meine Zahl ist kleiner!");
				
			} else if (geratenezahl == zufallszahl) {
				
				System.out.println("Du hast die Zahl mit " + versuche + " Versuchen erraten!");
				
			}
			
			if (versuche == maxversuche) {
				
				System.out.println("Du hast die maximale Anzahl von Versuchen erreicht!");
				break;
				
			}
		}
	}
}
