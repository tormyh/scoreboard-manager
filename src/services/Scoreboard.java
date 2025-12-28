package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import models.*;

public class Scoreboard {
    // Return active matches in scoreboard format
    // Only need to return homeName, homeScore, awayName, awayScore
    // Sort descending by total goals
    // In case of tie sort by start time

    public static void getScoreboard() {
        ArrayList<Match> scoreboard = MatchManager.getActiveMatches();

        Comparator<Match> comp = new Comparator<Match>() {
            public int compare(Match a, Match b) {
                if ((a.getHomeScore() * a.getAwayScore()) > (b.getHomeScore() * b.getAwayScore())) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };

        Collections.sort(scoreboard, comp);

        for (Match match : scoreboard) {
            System.out.println(match);
        }
    } 
}
