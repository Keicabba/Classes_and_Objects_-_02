package it.figuccia;

class Competition {
    // Richiamo la funzione in Competition Rules per la stampa
    public static void main(String[] args) {
        CompetitionRules.getInstance().printRules();

        //creo dei nuovi team assegnando valori casuali
        Team teamA = new Team();
        teamA.teamName = "Team primo";
        teamA.p1 = new Programmer();
        teamA.p1.name = "John Doe";
        teamA.p1.programmingLanguage = "Java";
        teamA.p1.yearsOfExperience = 5;
        teamA.p2 = new Programmer();
        teamA.p2.name = "Jane Smith";
        teamA.p2.programmingLanguage = "Python";
        teamA.p2.yearsOfExperience = 3;

        Team teamB = new Team();
        teamB.teamName = "Team Secondo";
        teamB.p1 = new Programmer();
        teamB.p1.name = "Bob Johnson";
        teamB.p1.programmingLanguage = "C++";
        teamB.p1.yearsOfExperience = 7;
        teamB.p2 = new Programmer();
        teamB.p2.name = "Sara Lee";
        teamB.p2.programmingLanguage = "JavaScript";
        teamB.p2.yearsOfExperience = 2;

        //stampo i 2 team creati
        System.out.println("- Team A -");
        teamA.printTeamDetails();
        System.out.println("- Team B -");
        teamB.printTeamDetails();
    }
}
