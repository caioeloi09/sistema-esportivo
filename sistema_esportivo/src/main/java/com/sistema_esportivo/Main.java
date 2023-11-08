package com.sistema_esportivo;



public class Main{

    public static void main(String[] args){

        JsonHelper jsonHelper = new JsonHelper(); 

        String json = jsonHelper.JsonFileToString("./algunsStats.json"); 
        System.out.println(json);

    }
}