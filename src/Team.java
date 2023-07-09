public class Team {
    private String name;
    private double homeGoals;
    private double awayGoals;

    public Team(String name, double homeGoals, double awayGoals){
        this.name = name;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(double homeGoals) {
        this.homeGoals = homeGoals;
    }

    public double getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(double awayGoals) {
        this.awayGoals = awayGoals;
    }


}
