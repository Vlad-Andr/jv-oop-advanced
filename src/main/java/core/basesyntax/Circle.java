package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String name) {
        super(name);
        radius = new RandomNumberGenerator().getRandomProperties();
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String draw() {
        return "Figure: " + getName()
              + ", area: " + getArea()
              + ", radius: " + getRadius()
              + ", color: " + getColor();
    }
}
