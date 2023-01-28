package it.figuccia;
// Crea le variabili team e recupera i campi della classe programmer per 2 variabili
public class Team{
    public String teamName;
    public Programmer p1;
    public Programmer p2;

    // Crea la funzione "printTeamDetails" che stampa Team e 2 Programmer
    public void printTeamDetails() {
        System.out.println("Team Name: " + teamName);
        System.out.println("+ Programmer 1:");
        p1.printProgrammerDetails();
        System.out.println("+ Programmer 2:");
        p2.printProgrammerDetails();
    }
}
