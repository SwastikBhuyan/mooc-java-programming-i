/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author swastik
 */
public class Match {
    
    private String homeTeam;
    private String awayTeam;
    private int homeTeamPoints;
    private int awayTeamPoints;
    
    public Match(String homeTeam, String awayTeam, int homeTeamPoints, int awayTeamPoints) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.awayTeamPoints = awayTeamPoints;
    }
    
    public String getHomeTeam() {
        return homeTeam;
    }
    
    public String getAwayTeam() {
        return awayTeam;
    }
    
    public int getHomeTeamPoints() {
        return homeTeamPoints;
    }
    
    public int getAwayTeamPoints() {
        return awayTeamPoints;
    }
    
}
