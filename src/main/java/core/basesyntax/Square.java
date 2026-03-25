package core.basesyntax;

public class Square extends AbstractFigure {
    private double side;

    public Square(String randomColor, double side) {
        super(randomColor);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double square(double side) {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + square(side)
                + " sq. units, side: " + side + " units, color: " + super.getColor());
    }
}
