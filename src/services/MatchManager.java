package services;

import models.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class MatchManager {
    private final static List<Match> activeMatches = new ArrayList<>();
    private static int nextId = 1;
    
    // Start match, creates match and adds to active matches
    public static Match startMatch(String homeTeam, String awayTeam) {
        Match match = new Match(nextId++, homeTeam, awayTeam, LocalDateTime.now());
        activeMatches.add(match);
        return match;
    }

    // Return activeMatches
    public static List<Match> getActiveMatches() {
        return activeMatches;
    }
    
    // Update match scores
    public static void setHomeAwayScore(int id, int homeGoals, int awayGoals) {
        Match match = findMatchById(id);
        match.setHomeScore(homeGoals);
        match.setAwayScore(awayGoals);
    }
    
    // Find match by id
    private static Match findMatchById(int id) {
        for (Match match : activeMatches) {
            if (match.getId() == id) {
                return match;
            }
        }
        throw new IllegalArgumentException("Match with id " + id + " not found.");
    }
}