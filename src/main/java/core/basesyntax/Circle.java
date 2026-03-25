package core.basesyntax;

public class Circle extends AbstractFigure {
    private final double radius;

    public Circle(String randomColor, double radius) {
        super(randomColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double square(double radius) {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + square(radius) + " sq. units, radius: "
                + radius + " units, color: " + super.getColor());
    }
}
