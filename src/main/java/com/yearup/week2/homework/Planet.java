package com.yearup.week2.homework;

 class Planet implements Calculator{
   // double planetRadius ;
    protected String getStar(String star){
        return star;
    }

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
    public double area(double radius) {
        return (3.14 * radius * radius);
    }
}
