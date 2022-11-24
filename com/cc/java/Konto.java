package com.cc.java;

public class Konto {
    // filed declaration
        private int kontostand;
        
    // constructor
        public Konto( int kontostand ) { this.kontostand = kontostand; }
        
    // getter & setter
        public int getKontostand() { return kontostand; }
        public int getKontostandNew( int konto ) {
            switch ( konto ) {
                case 0:
                    return kontostand * 2;
                case 1:
                    return kontostand * 3;
                case 2:
                    return kontostand * 10;
                default:
                return kontostand;
            }
        }
        public void setKontostand( int kontostand ) { this.kontostand = kontostand; }
}
