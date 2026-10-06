// src/Shape.groovy

// Base abstract class representing a generic geometric shape.
// Each shape must be able to compute its area and perimeter.
abstract class Shape {

    // Compute the area of the shape.
    abstract double area()

    // Compute the perimeter of the shape.
    abstract double perimeter()

    // Helper to print details of any shape.
    void printInfo() {
        println "Shape type: ${this.class.simpleName}"
        println "Area: ${area()}"
        println "Perimeter: ${perimeter()}"
        println "-----------------------------"
    }
}