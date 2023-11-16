package com.sistema_esportivo;

public class Stadium {

    private String city;
    private String stadium_name;
    private String capacity;

    public Stadium(String city, String stadium_name, String capacity) {
        this.city = city;
        this.stadium_name = stadium_name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return  "Nome do Estádio: " + stadium_name + '\n' +
                "Cidade: " + city + '\n' +
                "Capacidade:" + capacity + '\n'; 
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStadium_name() {
        return this.stadium_name;
    }

    public void setStadium_name(String stadium_name) {
        this.stadium_name = stadium_name;
    }

    public String getCapacity() {
        return this.capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

}
