/**
 * The Wolf class extends the Animal class.
 * It represents a wolf and its behaviors.
 * 
 * @author Ameer
 */
public class Wolf extends Animal {

    public Wolf(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(this.name + " howls loudly!");
    }

    @Override
    public void play() {
        System.out.println(this.name + " runs and plays in the forest.");
    }
}