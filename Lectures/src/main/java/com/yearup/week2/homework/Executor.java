package com.yearup.week2.homework;

import java.util.Scanner;
public class Executor {
    static Scanner userInput = new Scanner(System.in);
    static Scanner userResponse= new Scanner(System.in);
    static SolarSystemPlanet solar = new SolarSystemPlanet();
    static Planet planet = new Planet();

    static String planetInput(){
        System.out.println("Enter the planet name: ");
        String planetName = userInput.nextLine();
        return planetName;
    }
    static void planetAreaFunction(){
        System.out.println("Enter the planet radius: ");
        double radius = userInput.nextDouble();
        double planetArea = planet.area(radius);
        System.out.println("The area of the planet is: " + planetArea);

    }
    public static String starOfPlanet(){
        return (solar.getStar(solar.starOfTheSolarSystem));
    }
    public static void planetPosition(String position){
        System.out.println("The position of the planet is: " + solar.plan(position));
    }
    public static void main(String[] args) {
            String s = planetInput();                                             // The user enters the planet's name.
            planetAreaFunction();
            planetPosition(s);
            System.out.println("The star of the " + s + " is " + starOfPlanet());
    }
}
