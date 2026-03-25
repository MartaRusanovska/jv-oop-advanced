package core.basesyntax;

public class Rectangle extends AbstractFigure {
    private final double length;
    private final double width;

    public Rectangle(String randomColor, double length, double width) {
        super(randomColor);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double square(double length, double width) {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + square(length,width)
                + " sq. units, width: " + width + " units, length: " + length
                + " units, color: " + super.getColor());
    }
}
