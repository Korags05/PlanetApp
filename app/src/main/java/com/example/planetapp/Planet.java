package com.example.planetapp;

public class Planet {
    private String moonCount;
    private String PlanetName;
    private int planetImage;
    private String planetFact;

    public Planet(String moonCount, String planetName, int planetImage, String planetFact) {
        this.moonCount = moonCount;
        this.PlanetName = planetName;
        this.planetImage = planetImage;
        this.planetFact = planetFact;
    }

    public String getMoonCount() {
        return moonCount;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }

    public String getPlanetName() {
        return PlanetName;
    }

    public String getPlanetFact(){
        return planetFact;
    }

    public void setPlanetName(String planetName) {
        PlanetName = planetName;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }
}
