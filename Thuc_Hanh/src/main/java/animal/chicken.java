package animal;
import edible.edible;

public class chicken extends animal implements edible {
    @Override
    public String makesound() {
        return " Chicken: cuckoo";
    }

    @Override
    public String howtoeat() {
        return "cound be fruit";
    }
}
