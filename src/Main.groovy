// src/Main.groovy

// Entry point for the shapes demo.
// Creates different shapes and prints their details.
class Main {

    static void main(String[] args) {
        // create a few shapes
        Shape circle = new Circle(5.0) // radius = 5
        Shape rectangle = new Rectangle(4.0, 7.5) // width = 4, height = 7.5

        // print information about each shape
        circle.printInfo()
        rectangle.printInfo()

        // Polymorphism with a list of shapes
        List<Shape> shapes = [circle, rectangle]

        println "Iterating over all shapes polymorphically:"
        shapes.each { shape ->
            shape.printInfo()}
    }
}