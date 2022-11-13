package com.yearup.week2.homework;
import java.util.Scanner;

class Body  implements Calculator {
    @Override
    public double sum(double num1, double num2) {
        return num1 + num2;
    }
    @Override
    public double area(double length, double width) {
        return length * width;
    }
    @Override
    public double volume(double length, double width, double height) {
        return (length * width * height);
    }
    @Override
    public double userInput() {
        Scanner userInput = new Scanner(System.in);
        return userInput.nextDouble();
    }
    @Override
    public double area(double r) {
        return r * r; //modifying area method for square
    }
    // area method which was implemented from the interface to calculator area of a square using the formula r*r
    protected double square() {
        System.out.println("Enter Side of Square: ");
        double r = userInput();
        return area(r);
        }
}

