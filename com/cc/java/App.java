package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        // 1 instance - **konto1** | konto1 → Verdoppelung
            output("----------------------");

            // Beispiel 1, als direkte Rechnung
                Konto konto1 = new Konto( 10000 );
                output( "Konto 1 Kontostand a): " + ( konto1.getKontostand() * 2 ) );

            // Beispiel 2, als neusetzen der Variable
                konto1.setKontostand( 20000 );
                output( "Konto 1 Kontostand b): " + konto1.getKontostand() );

            // Beispiel 3, als neusetzen der Variable mit Rechnung
                konto1.setKontostand( ( 10000 * 2 ) );
                output( "Konto 1 Kontostand c): " + konto1.getKontostand() );

            output("----------------------");

        // 2 instance - **konto2** | konto2 → Verdreifachung
            Konto konto2 = new Konto( 10000 );
            output( "Konto 2 Kontostand: " + ( konto2.getKontostand() * 3 ) );
            output("----------------------");
            
        // 3 instance - **konto3** | konto3 → Verzehnfachung
            Konto konto3 = new Konto( 10000 );
            output( "Konto 3 Kontostand: " + ( konto3.getKontostand() * 10 ) );
            output("----------------------");
    }

    public static void output( String outputStr ) { System.out.println( outputStr ); }
}
