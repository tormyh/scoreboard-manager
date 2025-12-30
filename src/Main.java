import java.util.List;

import models.*;
import services.*;

public class Main {
    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        // Demo

        // Start matches
        MatchManager.startMatch("Norway", "Sweden");
        sleep(10);
        MatchManager.startMatch("Brazil", "Portugal");
        sleep(10);
        MatchManager.startMatch("England", "Germany");
        sleep(10);
        MatchManager.startMatch("Denmark", "Spain");
        sleep(10);
        MatchManager.startMatch("Netherlands", "France");

        // Update scores
        MatchManager.setHomeAwayScore(1, 0, 5);
        MatchManager.setHomeAwayScore(2, 10, 2);
        MatchManager.setHomeAwayScore(3, 2, 2);
        MatchManager.setHomeAwayScore(4, 6, 6);
        MatchManager.setHomeAwayScore(5, 3, 1);
        
        // Display scoreboard
        System.out.println("Live Scoreboard:");
        List<Match> scoreboard = Scoreboard.getScoreboard();
        for (Match match : scoreboard) {
            System.out.println(match.getHomeTeam() + " " + match.getHomeScore() + " - " + match.getAwayScore() + " " + match.getAwayTeam());
        }

        // End match
        MatchManager.endMatch(3);
        System.out.println("\nLive Scoreboard after ending match:");
        scoreboard = Scoreboard.getScoreboard();
        for (Match match : scoreboard) {
            System.out.println(match.getHomeTeam() + " " + match.getHomeScore() + " - " + match.getAwayScore() + " " + match.getAwayTeam());
        }
    }
}
