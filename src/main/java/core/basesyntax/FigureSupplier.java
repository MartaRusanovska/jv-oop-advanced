package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 6; // Кількість твоїх фігур
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public AbstractFigure getRandomFigure() {
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
        return random.nextInt(10) + 1;
    }

    public AbstractFigure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(),10);
    }
}
