package com.sistema_esportivo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MatchHelper {
    private static final ObjectMapper mapper = new ObjectMapper();
    private static List<Match> matches = new ArrayList<>();

    private static void matchsJsonToList(String json) {
        try {
            JsonNode jsonArray = mapper.readTree(json);
            JsonNode matchesArray = jsonArray.get("data").get("match");

            for (JsonNode element : matchesArray) {

                String home = element.get("home_name").asText();
                String away = element.get("away_name").asText();
                String score = element.get("score").asText(); 

                System.out.println(home + away + score); 

                // TO DO
                // Transformar a string do time em um objeto do tipo Team
                
                // Match match = new Match(); 
                // System.out.println(match);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Não foi possível ler o arquivo de partidas");
        }
    }

    public static List<Match> getAllMatches() {
        String json = JsonHelper.JsonFileToString("sistema_esportivo/src/main/resources/paginaJogos1.json");
        matchsJsonToList(json);
        return matches;
    }
}
