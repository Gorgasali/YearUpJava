package com.yearup.week2.homework;

 class SolarSystemPlanet extends Planet{
    String starOfTheSolarSystem = "";
    @Override
    protected String getStar(String starOfTheSolarSystem) {
        return starOfTheSolarSystem = "SUN";
    }
    protected int plan(String s){
        String planet = "";
        int position = 0;
        switch (s) {
            case "Mercury":
                position = 1;
                break;
            case "Venus":
                position = 2;
                break;
            case "Earth":
                position = 3;
                break;
            case "Mars":
                position = 4;
                break;
            case "Jupiter":
                position = 5;
                break;
            case "Saturn":
                position = 6;
                break;
            case "Uranus":
                position = 7;
                break;
            case "Neptune":
                position = 8;
                break;


        }

        return position;

    }

}
