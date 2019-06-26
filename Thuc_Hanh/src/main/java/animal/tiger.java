package animal;
import edible.edible;

public class tiger extends animal implements edible{
    @Override
    public String makesound() {
        return "Tiger: Roarrr";
    }

    @Override
    public String howtoeat() {
        return " meat";
    }
}
