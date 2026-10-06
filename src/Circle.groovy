// src/Circle.groovy

// Circle is a specific Shape defined by its radius.
class Circle extends Shape {
    // Property holding the radius of the circle.
    double radius

    // Constructor to create a circle with a given radius.
    Circle(double radius) {
        this.radius = radius
    }

    // Implement area: π * r^2
    @Override
    double area() {
        Math.PI * radius * radius
    }

    // Implement perimeter: 2 * π * r
    @Override
    double perimeter() {
        2 * Math.PI * radius
    }
}