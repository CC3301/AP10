public class Menschi {
	
	public static void main (String args[]) {
		
		int zufallszahl = 0;
		int versuche = 0;
		
		do {
			
			zufallszahl = (int) (Math.random()*6 + 1);
			System.out.println("Du hast eine " + zufallszahl + " gewuerfelt!");
			versuche++;
			
		} while(zufallszahl == 6);	
		
		System.out.println("Du hast " + versuche + " mal gewuerfelt!");
		
	}
}
