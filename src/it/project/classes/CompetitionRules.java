package it.project.classes;

public class CompetitionRules {
    private static CompetitionRules competitionRules = new CompetitionRules();
    private CompetitionRules(){}
    public static CompetitionRules getInstance(){
        return competitionRules;
    }

    private String competitionRule1 = "Do not copy and paste from StackOverflow!";
    private String competitionRule2 = "Learn every day!";
    private String competitionRule3 = "Be the best team!";

    public void printRules(){
        System.out.println(competitionRule1 + "\n" + competitionRule2 + "\n" + competitionRule3);
    }

}
