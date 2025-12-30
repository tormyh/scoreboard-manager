import java.util.List;
import java.util.concurrent.TimeUnit;

import models.*;
import services.*;

public class Main {
    public static void main(String[] args) {
        // Testing

        MatchManager.startMatch("Norway", "Sweden");
        try {
            TimeUnit.SECONDS.sleep(1);
            MatchManager.startMatch("Brazil", "Portugal");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            TimeUnit.SECONDS.sleep(1);
            MatchManager.startMatch("England", "Germany");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            TimeUnit.SECONDS.sleep(1);
            MatchManager.startMatch("Denmark", "Spain");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            TimeUnit.SECONDS.sleep(1);
            MatchManager.startMatch("Netherlands", "France");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MatchManager.setHomeAwayScore(1, 0, 5);
        MatchManager.setHomeAwayScore(2, 10, 2);
        MatchManager.setHomeAwayScore(3, 2, 2);
        MatchManager.setHomeAwayScore(4, 6, 6);
        MatchManager.setHomeAwayScore(5, 3, 1);
        
        List<Match> scoreboard = Scoreboard.getScoreboard();
        for (Match match : scoreboard) {
            System.out.println(match);
        }

        MatchManager.endMatch(9); // Should fail
        List<Match> activeMatches = MatchManager.getActiveMatches();
        for (Match match : activeMatches) {
            System.out.println(match);
        }
    }
}
