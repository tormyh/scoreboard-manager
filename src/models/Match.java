package models;

import java.time.LocalDateTime;

public class Match {
    private int id;
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    private LocalDateTime startTime;

    // Constructor
    public Match(int id, String homeTeam, String awayTeam, LocalDateTime startTime) {
        this.id = id;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = 0;
        this.awayScore = 0;
        this.startTime = startTime;
    }

    // Getters
    public int getId() {
        return this.id;
    }
    public String getHomeTeam() {
        return this.homeTeam;
    }
    public int getHomeScore() {
        return this.homeScore;
    }
    public String getAwayTeam() {
        return this.awayTeam;
    }
    public int getAwayScore() {
        return this.awayScore;
    }
    public LocalDateTime getStartTime() {
        return this.startTime;
    }
    public int getTotalGoals() {
        return this.homeScore + this.awayScore;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setHomeScore(int goals) {
        this.homeScore = goals;
    }
    public void setAwayScore(int goals) {
        this.awayScore = goals;
    }
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return id + "|" + homeTeam + "|" + homeScore + "|" + awayTeam + "|" + awayScore + "|" + startTime;
    }
}
