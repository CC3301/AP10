public class ZufallsZahlen {
	
	public static void main(String args[]) {
		
		int ZufallsZahl1 = (int) (Math.random()*6 + 1);
		int ZufallsZahl2 = (int) (Math.random()*6 + 1);
		
		if (ZufallsZahl1 == ZufallsZahl2) {
			
			System.out.println("Du hast gewonnen!" + ZufallsZahl1 + ZufallsZahl2);
			
		} else {
			
			System.out.println("Du hast verloren :D");
			
		}
	}
}
