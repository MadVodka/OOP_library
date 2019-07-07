package generators;

import java.util.Random;

public class RandomPositionGenerator {
    private Random random = new Random();

    public int generate(int bound) {
        return random.nextInt(bound);
    }
}
