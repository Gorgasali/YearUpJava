package com.yearup.week2.homework;

import java.util.Scanner;
public class Executor {
    static Scanner userInput = new Scanner(System.in);
    //static Scanner userResponse = new Scanner(System.in);
    static SolarSystemPlanet solar = new SolarSystemPlanet();
    static Planet planet = new Planet();

    static String planetInput() {
        System.out.println("Enter the planet name: ");
        return userInput.nextLine();
    }

    static void planetAreaFunction() {
        System.out.println("Enter the planet radius: ");
        double radius = userInput.nextDouble();
        double planetArea = planet.area(radius);
        System.out.println("The area of the planet is: " + planetArea);

    }

    public static String starOfPlanet() {
        return (solar.getStar(solar.starOfTheSolarSystem));
    }

    public static void planetPosition(String position) {
        System.out.println("The position of the planet is: " + solar.plan(position));
    }

    static class CelestialObject implements Calculator {

        @Override
        public double sum(double num1, double num2) {
            return 0;
        }

        @Override
        public double area(double length, double width) {
            return 0;
        }

        @Override
        public double volume(double length, double width, double height) {
            return 0;
        }

        @Override
        public double userInput() {
            return 0;
        }

        @Override
        public double area(double r) {
            return 0;
        }
        @Override
        public void displayCelestialObject() {
            System.out.println(" Comet is a celestial object");
        }
    }
    // Class Display with one method
    public static class Display {
        public static void display() {
            System.out.println("Your planet belongs to Milky way galaxy.");
        }
    }

    // Enum class to store planets
    enum PlanetName {
        Mercury, Venus, Earth, Mars,
        Jupiter, Saturn, Uranus, Neptune,
    }
    // Method to check number of moons of planet
    public static int moons(PlanetName planet) {

        int moon = 0;
        switch (planet) {
            case Mercury:
            case Venus:
                moon = 0;
                break;
            case Earth:
                moon = 1;
                break;
            case Mars:
                moon = 2;
                break;
            case Jupiter:
                moon = 80;
                break;
            case Saturn:
                moon = 83;
                break;
            case Uranus:
                moon = 27;
                break;
            case Neptune:
                moon = 14;
                break;
        }
        return moon;
    }
    // method which checks input and returns number of moons
    public static void checkPlanet(String s) {
        int moon = moons(PlanetName.valueOf(s));
        System.out.println(s + " has " + moon + " moons");
        Display.display();

    }

    public static void main(String[] args) {
        String s = planetInput();   // The user enters the planet's name.
        checkPlanet(s);             // call method from Homework Week3
        planetAreaFunction();
        planetPosition(s);
        System.out.println("The star of the " + s + " is " + starOfPlanet());
    }
}

