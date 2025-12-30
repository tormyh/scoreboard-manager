package services;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import models.*;

public class Scoreboard {
    // Return list of started matches
    // Sort descending by total goals
    // In case of tie sort by start time

    public static List<Match> getScoreboard() {
        List<Match> scoreboard = MatchManager.getActiveMatches();

        Comparator<Match> comp = new Comparator<Match>() {
            public int compare(Match a, Match b) {
                if (a.getTotalGoals() > b.getTotalGoals()) {
                    return -1;
                } else if (a.getTotalGoals() == b.getTotalGoals()) {
                    if (a.getStartTime().isAfter(b.getStartTime())) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else {
                    return 1;
                }
            }
        };

        Collections.sort(scoreboard, comp);

        return scoreboard;
    } 
}
