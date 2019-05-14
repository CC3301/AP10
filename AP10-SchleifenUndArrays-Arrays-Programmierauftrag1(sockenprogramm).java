import java.util.*;
class sockenprogramm {
    public static void main(String args[]){
        //Neuen Scanner deklarieren
        Scanner sc = new Scanner(System.in); 
        //socken array deklarieren
        String socken [][] = new String[][] {{ "Montag", "blau"}, {"Dienstag", "gruen"}, {"Mittwoch", "gelb"}, {"Donnerstag", "schwarz"}, {"Freitag", "weiss"}, {"Samstag", "pink"}, {"Sonntag", "rot"}};
        //Abfrage des wochentags
        System.out.print("Wochentag eingeben: ");
        String eingabe = sc.next();
        //jeden wert der 1. dimension des arrays mit der eingabe abgleichen
        for (int i = 0;i<=6;i++){
            if (socken[i][0].equalsIgnoreCase(eingabe)){
                //Wenn der wert der 1. dimension des socken arrays mit der eingabe uebereinstimmt, den wert der 2. dimension fuer den wert der 1. dimension des socken arrays ausgeben
                System.out.println("Sockenfarbe ist: " + socken[i][1]);
            }
        }
    }
}
