import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.BrilliantGenerator;
import Fabric.DiamondGenerator;
import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;
import Fabric.LvlUpGenerator;
import Fabric.RubyGenerator;
import Fabric.SilverGenerator;

public class App {
    public static void main(String[] args) throws Exception {

        List<ItemGenerator> generators = new ArrayList<>();

        generators.add(new GemGenerator());
        generators.add(new GoldGenerator());
        generators.add(new BrilliantGenerator());
        generators.add(new DiamondGenerator());
        generators.add(new LvlUpGenerator());
        generators.add(new RubyGenerator());
        generators.add(new SilverGenerator());

        Random random = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(54);
            if (index == 54) {
                generators.get(0).openReward();
            }
            if (index > 50 && index < 54) {
                generators.get(1).openReward();
            }
            if (index > 40 && index < 51) {
                generators.get(2).openReward();
            }
            if (index > 30 && index < 41) {
                generators.get(3).openReward();
            }
            if (index > 20 && index < 31) {
                generators.get(4).openReward();
            }
            if (index > 10 && index < 21) {
                generators.get(5).openReward();
            }
            if (index > 0 && index < 11) {
                generators.get(6).openReward();
            }
        }

    }
}
