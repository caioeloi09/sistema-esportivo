package com.sistema_esportivo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TeamHelper{

    private final ObjectMapper mapper = new ObjectMapper();

    public List<Team> TeamsJsonToList(String json){
        try{
            JsonNode jsonArray = mapper.readTree(json); 
            List<Team> teamList = new ArrayList<>(); 
            for(JsonNode element : jsonArray){
                Team team = mapper.treeToValue(element, Team.class); 
                teamList.add(team); 
            }

            return teamList; 

        }catch(Exception e){
            e.printStackTrace();
        }
        return Collections.emptyList(); 
    }
    
}