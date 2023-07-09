import java.util.HashSet;
import java.util.Objects;

public class League {
    private HashSet<Team> teams;

    public League(){
        teams   = new HashSet<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        League league = (League) o;
        return Objects.equals(teams, league.teams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teams);
    }

    public HashSet<Team> getTeams() {
        return teams;
    }

    public void  addTeam(Team aTeam){
        if (teams.contains(aTeam)){
            throw new IllegalArgumentException(aTeam + "is already in this league");
        } else {
            teams.add(aTeam);
        }
    }

    public  void  remove(Team aTeam){
        if (teams.contains(aTeam)){
            teams.remove(aTeam);
        } else {
            throw new IllegalArgumentException(aTeam+ "is not in the league");
        }
    }

    public void removeAll(){
        teams.clear();
    }

    public  Team findTeam(String aName){
        Team targetTeam = null;
        for (Team team: teams){
            if (team.getName().equals(aName)){
                targetTeam = team;
            } /*else {
                System.out.println("Couldn't find the requested team.");
            }*/
        }
        return targetTeam;
    }

    public void populate(){
        Team manchesterUnited = new Team("Manchester United", 5.00, 5.00);
        Team manchesterCity =  new Team("Manchester City", 3.16, 1.79);
        Team arsenal = new Team("Arsenal", 2.79, 1.84);
        Team everton = new Team("Everton", 0.84, 0.95);
        Team wolves = new Team("Wolverhampton", 1.00, 0.63);
        Team soton = new Team("Southampton", 1.00, 0.89);
        Team liverpool = new Team("Liverpool", 2.42, 1.53);
        Team newcastle = new Team("Newcastle United", 1.89, 1.68);
        Team villa = new Team("Aston Villa", 1.74, 0.95);
        Team brentford = new Team("Brentford", 1.84, 1.21);
        Team spurs = new Team("Tottenham Hotspurs", 1.95, 1.74);
        Team brighton = new Team("Brighton", 1.95, 1.84);
        Team nottm = new Team("Nottingham Forest", 1.48, 0.58);
        Team fulham = new Team("Fulham", 1.63, 1.26);
        Team westHam = new Team("West Ham United", 1.37, 0.84);
        Team palace = new Team("Crystal Palace", 1.11, 1.00);
        Team chelsea = new Team("Chelsea", 1.05, 0.95);
        Team bournemouth = new Team("Bournemouth", 1.05, 0.89);
        Team leeds = new Team("Leeds United", 1.37, 1.16);
        Team leicester = new Team("Leicester City", 1.21, 1.47);




        addTeam(manchesterUnited);
        addTeam(manchesterCity);
        addTeam(arsenal);
        addTeam(everton);
        addTeam(wolves);
        addTeam(soton);
        addTeam(liverpool);
        addTeam(newcastle);
        addTeam(villa);
        addTeam(brentford);
        addTeam(spurs);
        addTeam(brighton);
        addTeam(nottm);
        addTeam(fulham);
        addTeam(westHam);
        addTeam(palace);
        addTeam(chelsea);
        addTeam(bournemouth);
        addTeam(leeds);
        addTeam(leicester);
    }

    public Team pick(int aNum){
        if (aNum < 0 || aNum > teams.size()){
            throw new IllegalArgumentException("Invalid number");
        } else{
            int currentIndex = 0;
            for (Team team: teams) {
                if (aNum == currentIndex){
                    return  team;
                }
                currentIndex++;
            }
        }
        return null;
    }
}
