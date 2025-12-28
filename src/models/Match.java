package models;

import java.time.LocalDateTime;

public class Match {
    private int id;
    private String homeTeam;
    private int homeScore;
    private String awayTeam;
    private int awayScore;
    private LocalDateTime startTime;
    private Status status;

    // Constructor
    public Match(int id, String homeTeam, int homeScore, String awayTeam, int awayScore, LocalDateTime startTime, Status status) {
        this.id = id;
        this.homeTeam = homeTeam;
        this.homeScore = homeScore;
        this.awayTeam = awayTeam;
        this.awayScore = awayScore;
        this.startTime = startTime;
        this.status = status;
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
    public int awayScore() {
        return this.awayScore;
    }
    public LocalDateTime getStartTime() {
        return this.startTime;
    }
    public Status getStatus() {
        return this.status;
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
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return id + "|" + homeTeam + "|" + homeScore + "|" + awayTeam + "|" + awayScore + "|" + startTime + "|" + status;
    }
}
