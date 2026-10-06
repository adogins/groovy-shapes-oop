// src/Rectangle.groovy

// Rectangle is a Shape defined by its width and height.
class Rectangle extends Shape {

    // Properties for the rectangle dimensions.
    double width
    double height

    // Constructor to create a rectangle with given width and height.
    Rectangle(double width, double height) {
        this.width = width
        this.height = height
    }

    // Implement area: width * height
    @Override
    double area() {
        width * height
    }

    // Implement perimeter: 2 * (width + height)
    @Override
    double perimeter() {
        2 * (width + height)
    }
}