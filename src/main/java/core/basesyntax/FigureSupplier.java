package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int FIGURE_COUNT = 5;
    private static final int MAX_RANDOM_VALUE = 10;
    private static final double DEFAULT_RADIUS = 10.0;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        switch (figureType) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), getRandomValue());
            case 1:
                return new Circle(colorSupplier.getRandomColor(), getRandomValue());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomValue(),
                        getRandomValue());
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomValue(),
                        getRandomValue());
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomValue(),
                        getRandomValue(), getRandomValue());
            case 5:
            default:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomValue(),
                        getRandomValue());
        }
    }

    private int getRandomValue() {
        return random.nextInt(MAX_RANDOM_VALUE) + 1;
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(),DEFAULT_RADIUS);
    }
}
