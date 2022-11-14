package com.yearup.week2.homework;
//Calculator interface within the above package which has the following methods
public interface Calculator {
    //Method to calculate sum which accepts two arguments of type double returns double
    double sum(double num1, double num2);
    //Method to calculate area which accepts two arguments of type double returns double
    double area(double length, double width);
    //Method to calculate volume which accepts three arguments of type double and returns double
    double volume(double length, double width, double height);
    double userInput();
    double area(double r);
}