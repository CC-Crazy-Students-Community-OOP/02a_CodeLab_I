package com.cc.java;
public class App {
    
    public static void main(String[] args) {
        output("----------------------");
        /*********************************************************/
        /*******          Beispiel 01 laut Aufgabe         *******/
        /*********************************************************/
            // 1 instance - **konto1** | konto1 → Verdoppelung
                Konto konto1 = new Konto( 10000 );                                  // Objekt 1 wird erstellt

                // Beispiel 1, als direkte Rechnung
                    output( "Konto 1 Kontostand alt a): " + konto1.getKontostand() );           // alter Kontostand
                    output( "Konto 1 Kontostand neu a): " + ( konto1.getKontostand() * 2 ) );   // neuer Kontostand direkt berechnet
                    output( " " );

                // Beispiel 2, als neusetzen der Variable
                    output( "Konto 1 Kontostand alt b): " + konto1.getKontostand() );           // alter Kontostand
                    konto1.setKontostand( 20000 );                                  // neuer Kontostand wird schriftlich in die alte Variable geschrieben
                    output( "Konto 1 Kontostand neu b): " + konto1.getKontostand() );           // neuer Kontostand durch auslesen der alten Variable
                    output( " " );

                // Beispiel 3, als neusetzen der Variable mit Rechnung
                    konto1.setKontostand( 10000 );                                  // nur wegen dem Beispiel, da die Variable oben überschrieben wurde
                    output( "Konto 1 Kontostand alt c): " + konto1.getKontostand() );           // alter Kontostand
                    konto1.setKontostand( ( 10000 * 2 ) );                                      // neuer Kontostand wird mit Rechnung in die alte Variable geschrieben
                    output( "Konto 1 Kontostand neu c): " + konto1.getKontostand() );           // neuer Kontostand durch auslesen der alten Variable
                    output( "----------------------" );

            // 2 instance - **konto2** | konto2 → Verdreifachung
                Konto konto2 = new Konto( 10000 );                                  // Objekt 2 wird erstellt
                    output( "Konto 2 Kontostand alt: " + konto2.getKontostand() );              // alter Kontostand
                    konto2.setKontostand( konto2.getKontostand() * 3 );                         // neuer Kontostand wird mit Rechnung aus der alten Variable berechnet in die alte Variable geschrieben
                    output( "Konto 2 Kontostand neu: " + konto2.getKontostand() );              // neuer Kontostand durch auslesen der alten Variable
                    output( "----------------------" );
                
            // 3 instance - **konto3** | konto3 → Verzehnfachung
                Konto konto3 = new Konto( 10000 );                                  // Objekt 3 wird erstellt
                    output( "Konto 3 Kontostand alt: " + konto3.getKontostand() );              // alter Kontostand
                    output( "Konto 3 Kontostand neu: " + ( konto3.getKontostand() * 10 ) );     // neuer Kontostand durch auslesen der alten Variable mit Rechnung
                    output( "----------------------" );
            
        /*********************************************************/
        /*******      Beispiel 2, als Schleifenausgabe     *******/
        /*********************************************************/
            konto1.setKontostand( 10000 );                                          // Kontostand 1 bis 3 werden erstellt
            konto2.setKontostand( 10000 );
            konto3.setKontostand( 10000 );
            int kontoOldA[] = {                                                                 // Kontostand funktion wird in einem Array gespeichert
                konto1.getKontostand(), 
                konto2.getKontostand(), 
                konto3.getKontostand()
            };
            int kontoNewA[] = {                                                                 // Kontostand berechnungs funktion wird in einem Array gespeichert
                ( konto1.getKontostand() * 2 ), 
                ( konto2.getKontostand() * 3 ), 
                ( konto3.getKontostand() * 10 )
            };
            for (int kontoA : kontoOldA) {
                output( "Konto Kontostand alt: " + kontoA );                                    // Schleife der Ausgabe des alten Kontostandes
    	    }
            output( " " );
            for (int kontoB : kontoNewA) {
                output( "Konto Kontostand neu: " + kontoB );                                    // Schleife der Ausgabe des neuen Kontostandes
    	    }
            output( "----------------------" );

        /*********************************************************/
        /*******      Beispiel 3, als Schleifenausgabe     *******/
        /*********************************************************/
            konto1.setKontostand( 10000 );                                          // Kontostand 1 bis 3 werden erstellt 
            konto2.setKontostand( 10000 ); 
            konto3.setKontostand( 10000 );
            int kontoOldB[] = {                                                                 // Kontostand berechnungs funktion wird in einem Array gespeichert
                konto1.getKontostand(), 
                konto2.getKontostand(), 
                konto3.getKontostand()
            };
            int kontoNewB[] = {                                                                 // Kontostand berechnungs funktion wird in einem Array gespeichert
                ( konto1.getKontostand() * 2 ), 
                ( konto2.getKontostand() * 3 ), 
                ( konto3.getKontostand() * 10 )
            };
            for ( int i = 0; i <= kontoOldB.length -1 ; i++ ) {
                output( "Konto " + i + " Kontostand alt: " + kontoOldB[ i ] );                  // Schleife der Ausgabe des alten Kontostandes
            }
            output( " " );
            for ( int i = 0; i <= kontoNewB.length - 1; i++ ) {
                output( "Konto " + i + " Kontostand neu: " + kontoNewB[ i ] );                  // Schleife der Ausgabe des neuen Kontostandes
            }
            output( "----------------------" );

        
        /*****************************************'****************/
        /******* Beispiel 4, als Schleife erstellte Objekte *******/
        /******************************************************'***/
            Konto[] konto;                                                                      // konto wird als Array registriert
            konto = new Konto[3];                                                               // es werden 3 Speicher als Array gesetzt
            for ( int i = 0; i <= konto.length -1 ; i++ ) {                                     // Schleife erstellt die neuen Objekte
                konto[ i ] = new Konto( 10000 );
            }
            for ( int i = 0; i <= konto.length -1 ; i++ ) {                                     // Schleife erstellt die Outputs
                output( "Konto " + i + " Kontostand alt: " + konto[ i ].getKontostand() );
                output( "Konto " + i + " Kontostand neu: " + konto[ i ].getKontostandNew( i ) );
                output( " " );
            }
            output( "----------------------" );
    }

    public static void output( String outputStr ) { System.out.println( outputStr ); }          // Output Funktion
}
