import java.util.*;
class amazonlager {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String lager [][] = new String[][] { { "Laptop", "Drucker", "Desktop PC", "Tablet" }, { "MP3 Player", "iPhone", "Android Handy" }, { "Fernseher", "WLAN Router" } };

        System.out.print("Zeile eingeben: ");
        int zeile = sc.nextInt();

        System.out.print("Spalte eingeben: ");
        int spalte = sc.nextInt();

        zeile = zeile - 1;
        spalte = spalte - 1;

        System.out.println("\nIhr gewaehltes Produkt ist: " + lager[zeile][spalte]);
        if ( zeile == 0 ) {
            System.out.println("Produkt im Angebot!");
        }

        System.out.print("\n\n");
        System.out.print("Alle Produkte: \n");

        for ( int i = 0; i<=2; i++ ) {

            if ( i == 0 ) {

                System.out.print("Im Angebot: \t\t");

                for ( int j = 0; j<=3; j++ ) {
                    System.out.print(lager[i][j] + ", " );
                }

                System.out.print("\n");

            } else if ( i == 1 ) {

                System.out.print("Tragbare Geraete: \t");

                for ( int j = 0; j<=2; j++ ) {
                    System.out.print(lager[i][j] + ",  " );
                }

                System.out.print("\n");

            } else if ( i == 2 ) {

                System.out.print("Zuhause: \t\t");
                for ( int j = 0; j<=1; j++ ) {
                    System.out.print(lager[i][j] + ",  " );
                }

                System.out.print("\n");
            }
        }
    }
}
