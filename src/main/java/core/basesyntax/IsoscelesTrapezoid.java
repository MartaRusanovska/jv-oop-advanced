package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private double side1;
    private double side2;
    private double height;

    public IsoscelesTrapezoid(String randomColor, double height, double side1, double side2) {
        super(randomColor);
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double square(double side1, double side2, double height) {
        return ((side1 + side2) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("This is a isosceles trapezoid with side1 = " + side1
                + ", side2 = " + side2
                + " and height = " + height + ". Square = " + square(side1, side2, height));
    }
}
