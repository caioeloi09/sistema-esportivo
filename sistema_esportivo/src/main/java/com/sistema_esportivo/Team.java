package com.sistema_esportivo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Team{
    private String id; 
    private String name; 
    private String stadium; 
    private String location; 

    public Team(){
        super(); 
    }

    public Team(String id, String name, String stadium, String location){
        this.id = id; 
        this.name = name;
        this.stadium = stadium; 
        this.location = location;  
    }
    
    @Override
    public String toString(){
        return "Nome do time: " + this.name + "\nEstádio: " + this.stadium + "\n";
    }

    public String getId(){
        return this.id; 
    }

    public String getName(){
        return this.name; 
    }

    public String getStadium(){
        return this.stadium; 
    }

    public String getLocation(){
        return this.location; 
    }
}