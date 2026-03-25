package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();

    public String getRandomColor() {
        Colors[] values = Colors.values();
        int randomIndex = RANDOM.nextInt(values.length);
        return values[randomIndex].name();
    }
}
