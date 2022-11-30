package it.project.classes;

public class Competition {

    public static void main(String[] args){
        CompetitionRules p1 = CompetitionRules.getInstance();
        System.out.println("\n ------------- \n");
        p1.printRules();

        Team teamA = new Team();
        Team teamB = new Team();

        teamA.teamName = "team Rosso";
        teamA.p1.name = "Giacomo";
        teamA.p1.programmingLanguage = "Python";
        teamA.p1.yearsOfExperience = 2;
        teamA.p2.name = "Marco";
        teamA.p2.programmingLanguage = "JavaScript";
        teamA.p2.yearsOfExperience = 4;

        teamB.teamName = "team Blue";
        teamB.p1.name = "Matteo";
        teamB.p1.programmingLanguage = "Kotlin";
        teamB.p1.yearsOfExperience = 0;
        teamB.p2.name = "Andrea";
        teamB.p2.programmingLanguage = "Java";
        teamB.p2.yearsOfExperience = 3;

        System.out.println("\n ------------- \n");
        teamA.printTeamDetails();
        System.out.println("\n ------------- \n");
        teamB.printTeamDetails();
        System.out.println("\n ------------- \n");
    }
}
