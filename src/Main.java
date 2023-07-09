import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;
        do {
            Team homeTeam = null;
            Team awayTeam = null;
            int homeGoals = 0;
            int awayGoal = 0;

            League premierLeague = new League();
            premierLeague.populate();

            System.out.println("Type 1 to select a random home team or type 2 to select a specific team:");
            System.out.println("(1) Pick a random team");
            System.out.println("(2) Pick a specific team");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1){
                homeTeam = Match.pickRandomTeam(premierLeague);
            } else if (choice == 2) {
                System.out.println("Type your team name: ");
                String userString = scanner.nextLine();
                Team userTeam = premierLeague.findTeam(userString);
                homeTeam = Match.pickTeam(userTeam, premierLeague);
            }

            assert homeTeam != null;
            System.out.println("The home team is : " + homeTeam.getName());

            System.out.println("Type 1 to select a random away team or type 2 to select a specific team:");
            System.out.println("(1) Pick a random team");
            System.out.println("(2) Pick a specific team");
            int awayChoice = scanner.nextInt();
            scanner.nextLine();

            if (awayChoice == 1){
                awayTeam = Match.pickRandomTeam(premierLeague);
            } else if (awayChoice == 2) {
                System.out.println("Type your team name: ");
                String userAwayString = scanner.nextLine();
                Team userAwayTeam = premierLeague.findTeam(userAwayString);
                awayTeam = Match.pickTeam(userAwayTeam, premierLeague);
            }
            assert awayTeam != null;
            System.out.println("The away team is : " + awayTeam.getName());

            homeGoals = Match.generateHomeGoals(homeTeam);
            awayGoal = Match.generateAwayGoals(awayTeam);

            System.out.println("Get ready, the match is about to start!");
            System.out.println("The final result is : "+ homeTeam.getName() + " vs " + awayTeam.getName()
                    + " Final Score= " + homeGoals + " : " + awayGoal);
            if (homeGoals == awayGoal) {
                System.out.println("It is a draw!");
            } else if (homeGoals > awayGoal) {
                System.out.println(homeTeam.getName() + " wins!!");
            } else {
                System.out.println(awayTeam.getName() + " wins!!!");
            }
            System.out.println("Do you want to play another game? (Press 1 to play again, 0 to exit)");
            int playAgainChoice = scanner.nextInt();
            playAgain = playAgainChoice == 1;
            scanner.nextLine();


        } while (playAgain);
        System.out.println("Exiting the program. Thank you for playing!");
        scanner.close();
    }

}
