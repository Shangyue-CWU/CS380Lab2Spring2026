/**
 *This class extends the Animal class to represent a Rabbit
 *@author Amir Husnic
 */
public class Rabbit extends Animal {

    /**
     * Constructor to initialize the name variable.
     *
     * @param name Name of the Rabbit.
     */
    public Rabbit(String name) {
        super(name);
    }

    /**
     * Prints the sound of the Rabbit
     */
    @Override
    public void sound() {
        System.out.println("The Rabbit grunts softly");
    }

    /**
     * Describes how the Rabbit plays
     */
    @Override
    public void play() {
        System.out.println("The Rabbit hops around and runs at full speed");
    }

    /**
     * Describes how the Rabbit eats
     */
    @Override
    public void eat() {
        System.out.println("The Rabbit eats carrots and hay");
    }
}