package services;

import models.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

public class MatchManager {
    static ArrayList<Match> inactiveMatches = new ArrayList<>();
    public static ArrayList<Match> activeMatches = new ArrayList<>();
    private static int nextId = 0;
    
    // Start match and add to activeMatches
    public static boolean startMatch(int id) {
        Iterator<Match> iterator = inactiveMatches.iterator();
        while (iterator.hasNext()) {
            Match match = iterator.next();
            if (match.getId() == id) {
                match.setStartTime(LocalDateTime.now());
                match.setStatus(Status.IN_PROGRESS);
                activeMatches.add(match);
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    // Add new match to inactiveMatches, and auto increment id
    public static void createMatch(Match match) {
        if (match.getId() == 0) {
            match.setId(nextId);
            nextId++;
        } else {
            if (match.getId() >= nextId) {
                nextId = match.getId() + 1;
            }
        }
        inactiveMatches.add(match);
    }

    // Return activeMatches
    public static ArrayList<Match> getActiveMatches() {
        return activeMatches;
    }

    // Print all inactive matches
    public static void printInactiveMatches() {
        for (Match match : inactiveMatches) {
            System.out.println(match);
        }
    }

    // Print all active matches
    public static void printActiveMatches() {
        for (Match match : activeMatches) {
            System.out.println(match);
        }
    }
}