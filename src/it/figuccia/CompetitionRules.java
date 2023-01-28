package it.figuccia;
//
public class CompetitionRules {
    //crea una istanza con campi non modificabili sotto la funzione competitionRules
    private static final CompetitionRules instance = new CompetitionRules();
    private String competitionRule1 = "Do not cheat!";
    private String competitionRule2 = "Be honest!";
    private String competitionRule3 = "Have fun!";

    private CompetitionRules() {}

    // funzione che permette di richiamare l'istanza competitionRules
    public static CompetitionRules getInstance() {
        return instance;
    }

    // Stampa i valori presenti nella funzione competitionRules
    public void printRules() {
        System.out.println("Rule 1: " + competitionRule1);
        System.out.println("Rule 2: " + competitionRule2);
        System.out.println("Rule 3: " + competitionRule3);
    }
}
