package com.sistema_esportivo;


public class Match {
    private Team home_team; 
    private Team away_team; 
    private String score; 
    
    public Team getHomeTeam(){
        return this.home_team; 
    }

    public Team getAwayTeam(){
        return this.away_team; 
    }

    public String getScore(){
        return this.score; 
    }
}
