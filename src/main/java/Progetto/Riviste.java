package Progetto;

public class Riviste {
    public int isbn;
    public String titolo;
    public int annoPubblicazione;
    public int numeroPagine;
    public Periodicita periodicita;
    public enum Periodicita {
        SETTIMANALE, MENSILE, SEMESTRALE
    }

}

