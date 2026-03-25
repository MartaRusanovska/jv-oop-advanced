package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private double leg1;
    private double leg2;

    public RightTriangle(String randomColor,double leg1, double leg2) {
        super(randomColor);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    public double getLeg1() {
        return leg1;
    }

    public double getLeg2() {
        return leg2;
    }

    public double square(double leg1, double leg2) {
        return (leg1 * leg2) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + square(leg1, leg2)
                + " sq. units, firstLeg: " + leg1 + " units, secondLeg: " + leg2
                + " units, color: " + super.getColor());
    }
}
