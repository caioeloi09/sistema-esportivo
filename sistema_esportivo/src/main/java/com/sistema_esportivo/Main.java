package com.sistema_esportivo;



public class Main{



    public static void main(String[] args){

        TeamHelper.loadAllTeams(); 
        MatchHelper.loadAllMatches(); 
        StandingsHelper.loadStandings();
        StadiumHelper.loadAllStadiums();
        StadiumHelper.printAllStadiums();
        MenuScreens.initialMenu();
    }
}