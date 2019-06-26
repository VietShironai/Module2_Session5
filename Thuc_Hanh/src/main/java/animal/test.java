package animal;
import edible.edible;
public class test {
    public static void main(String[] args) {
        animal[] animals = new animal[2];
        animals[0] = new tiger();
        animals[1] = new chicken();
        for (animal animal : animals) {
            System.out.println(animal.makesound());

            if (animal instanceof chicken) {
                edible edible = (chicken) animal;
                System.out.println(edible.howtoeat());
            }
            if (animal instanceof tiger){
                edible edible= (tiger) animal;
                System.out.println(edible.howtoeat());
            }
        }
    }
}
