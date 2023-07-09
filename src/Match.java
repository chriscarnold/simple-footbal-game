import java.util.Random;

public class Match {

    private static Random random = new Random();

    private static int nextPoisson(double lambda) {
        double L = Math.exp(-lambda);
        double p = 1.0;
        int k = 0;

        do {
            k++;
            p *= random.nextDouble();
        } while (p > L);

        return k - 1;
    }

    public static int generateHomeGoals(Team aTeam){
        double averageHomeGoals = aTeam.getHomeGoals();
        return nextPoisson(averageHomeGoals);
    }

    public static  int generateAwayGoals(Team aTeam){
        double averageAwayGoals = aTeam.getAwayGoals();
        return nextPoisson(averageAwayGoals);
    }

    public static Team pickRandomTeam(League aLeague){
        int teamCt = aLeague.getTeams().size();
        int ranIndex = random.nextInt(teamCt);
        return aLeague.pick(ranIndex);
    }

    public static Team pickTeam(Team aTeam, League aLeague){
        if (aLeague.getTeams().contains(aTeam)) {
            return aTeam;
        } else {
            throw new IllegalArgumentException(" Check if the team or league exist!");
        }
    }


}
