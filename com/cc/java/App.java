package com.cc.java;
public class App {
    
    public static void main(String[] args) {
        output("----------------------");
        /*********************************************************/
        /*******          Beispiel 01 laut Aufgabe         *******/
        /*********************************************************/
            // 1 instance - **konto1** | konto1 → Verdoppelung
                Konto konto1 = new Konto( 10000 );

                // Beispiel 1, als direkte Rechnung
                    output( "Konto 1 Kontostand alt a): " + konto1.getKontostand() );
                    output( "Konto 1 Kontostand neu a): " + ( konto1.getKontostand() * 2 ) );
                    output( " " );

                // Beispiel 2, als neusetzen der Variable
                    output( "Konto 1 Kontostand alt b): " + konto1.getKontostand() );
                    konto1.setKontostand( 20000 );
                    output( "Konto 1 Kontostand neu b): " + konto1.getKontostand() );
                    output( " " );

                // Beispiel 3, als neusetzen der Variable mit Rechnung
                    konto1.setKontostand( 10000 );
                    output( "Konto 1 Kontostand alt c): " + konto1.getKontostand() );
                    konto1.setKontostand( ( 10000 * 2 ) );
                    output( "Konto 1 Kontostand neu c): " + konto1.getKontostand() );
                    output( "----------------------" );

            // 2 instance - **konto2** | konto2 → Verdreifachung
                Konto konto2 = new Konto( 10000 );
                    output( "Konto 2 Kontostand alt: " + konto2.getKontostand() );
                    konto2.setKontostand( konto2.getKontostand() * 3 );
                    output( "Konto 2 Kontostand neu: " + konto2.getKontostand() );
                    output( "----------------------" );
                
            // 3 instance - **konto3** | konto3 → Verzehnfachung
                Konto konto3 = new Konto( 10000 );
                    output( "Konto 3 Kontostand alt: " + konto3.getKontostand() );
                    output( "Konto 3 Kontostand neu: " + ( konto3.getKontostand() * 10 ) );
                    output( "----------------------" );
            
        /*********************************************************/
        /*******      Beispiel 2, als Schleifenausgabe     *******/
        /*********************************************************/
            konto1.setKontostand( 10000 ); 
            konto2.setKontostand( 10000 ); 
            konto3.setKontostand( 10000 );
            int kontoOldA[] = { 
                konto1.getKontostand(), 
                konto2.getKontostand(), 
                konto3.getKontostand()
            };
            int kontoNewA[] = { 
                ( konto1.getKontostand() * 2 ), 
                ( konto2.getKontostand() * 3 ), 
                ( konto3.getKontostand() * 10 )
            };
            for (int kontoA : kontoOldA) {
                output( "Konto Kontostand alt: " + kontoA );
    	    }
            output( " " );
            for (int kontoB : kontoNewA) {
                output( "Konto Kontostand neu: " + kontoB );
    	    }
            output( "----------------------" );

        /*********************************************************/
        /*******      Beispiel 3, als Schleifenausgabe     *******/
        /*********************************************************/
            konto1.setKontostand( 10000 ); 
            konto2.setKontostand( 10000 ); 
            konto3.setKontostand( 10000 );
            int kontoOldB[] = { 
                konto1.getKontostand(), 
                konto2.getKontostand(), 
                konto3.getKontostand()
            };
            int kontoNewB[] = { 
                ( konto1.getKontostand() * 2 ), 
                ( konto2.getKontostand() * 3 ), 
                ( konto3.getKontostand() * 10 )
            };
            for ( int i = 0; i <= kontoOldB.length -1 ; i++ ) {
                output( "Konto " + i + " Kontostand alt: " + kontoOldB[ i ] );
            }
            output( " " );
            for ( int i = 0; i <= kontoNewB.length - 1; i++ ) {
                output( "Konto " + i + " Kontostand neu: " + kontoNewB[ i ] );
            }
            output( "----------------------" );

        
        /*****************************************'****************/
        /******* Beispiel 4, als Schleife erstellte Objekte *******/
        /******************************************************'***/
            Konto[] konto;
            konto = new Konto[3];
            for ( int i = 0; i <= konto.length -1 ; i++ ) {
                konto[ i ] = new Konto( 10000 );
            }
            for ( int i = 0; i <= konto.length -1 ; i++ ) {
                output( "Konto " + i + " Kontostand alt: " + konto[ i ].getKontostand() );
                output( "Konto " + i + " Kontostand neu: " + konto[ i ].getKontostandNew( i ) );
                output( " " );
            }
            output( "----------------------" );
    }

    public static void output( String outputStr ) { System.out.println( outputStr ); }
}
