import models.*;
import services.*;

public class Main {
    public static void main(String[] args) {
        // Testing
        MatchManager.createMatch(new Match(0, "Norway", 2, "Sweden", 7, null, Status.NOT_STARTED));
        MatchManager.createMatch(new Match(0, "Brazil", 7, "Germany", 3, null, Status.NOT_STARTED));
        MatchManager.createMatch(new Match(0, "Urugay", 2, "Italy", 1, null, Status.NOT_STARTED));
        MatchManager.createMatch(new Match(0, "England", 5, "Spain", 5, null, Status.NOT_STARTED));
        MatchManager.createMatch(new Match(0, "Portugal", 1, "Nepal", 0, null, Status.NOT_STARTED));
        
        MatchManager.startMatch(0);
        MatchManager.startMatch(1);
        MatchManager.startMatch(2);
        MatchManager.startMatch(3);
        MatchManager.startMatch(4);
        MatchManager.startMatch(5);
        
        Scoreboard.getScoreboard();
    }
}
