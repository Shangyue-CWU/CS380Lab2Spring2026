/**
 * Goat class that extends the abstract Animal class.
 * It provides specific implementations for sound and play methods.
 * 
 * @author Kaltoum
 */

public class Goat extends Animal {

    /**
     * Constructor that initializes the goat's name.
     * 
     * @param name Name of the goat.
     */
    public Goat(String name) {
        super(name);
    }

    /**
     * Prints the sound a goat makes.
     */
    @Override
    public void sound() {
        System.out.println(this.name + " says: Baaaaa!");
    }

    /**
     * Prints a fun activity that a goat does.
     */
    @Override
    public void play() {
        System.out.println(this.name + " is climbing rocks and jumping around! That's very common, especially for mountain goats.");
    }

    /**
     * Main method to declare an object of Goat and call the methods previously implemented.
     * @param args
     */
    public static void main(String[] args) {
        Goat goat1 = new Goat("Goatyy");

        goat1.sound();
        goat1.play();
        goat1.eat();
    }
}