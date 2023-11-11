package com.sistema_esportivo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TeamHelper{

    private static final ObjectMapper mapper = new ObjectMapper();
    private static List<Team> teamList = new ArrayList<>(); 

    private static List<Team> teamsJsonToList(String json){
        try{

            JsonNode jsonArray = mapper.readTree(json);
            JsonNode dataArray = jsonArray.get("data");  

            for(JsonNode element : dataArray){
                // System.out.println(element);
                String text = element.toString(); 
                Team team = mapper.readValue(text, Team.class); 
                teamList.add(team); 
            }

            return teamList; 

        }catch(Exception e){
            e.printStackTrace();
        }
        return Collections.emptyList(); 
    }

    public static List<Team> getAllTeams(){

        String json = JsonHelper.JsonFileToString("sistema_esportivo/src/main/resources/todasAsSelecoes.json"); 

        List<Team> teams = teamsJsonToList(json); 
        // System.out.println(teams);
        return teams;
    }

    public static Team getTeamByName(String name){
        for(Team team : teamList){
            if(team.getName().equals(name)){
                return team; 
            }
        }
        System.out.println("Time não encontrado"); 
        return null;
    }
}