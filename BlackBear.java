/**
 * BlackBear is a subclass of Animal that provides specific
 * implementations for the abstract methods defined in the parent class.
 * student = Fulya Bilgin
 */
public class BlackBear extends Animal {
 
    /**
     * Constructor that takes in a name for the Black Bear.
     *
     * @param name Name of the black bear.
     */
    public BlackBear(String name) {
        super(name);
    }
 
    /**
     * Overrides the sound method to represent the sound a black bear makes.
     */
    @Override
    public void sound() {
        System.out.println(this.name + " lets out a loud, rumbling growl!");
    }
 
    /**
     * Overrides the play method to represent a fun activity a black bear does.
     */
    @Override
    public void play() {
        System.out.println(this.name + " climbs up a tall tree for fun!");
    }
 
    /**
     * Main method to test the BlackBear implementation.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        BlackBear bear1 = new BlackBear("Baloo");
        bear1.sound();
        bear1.play();
        bear1.eat();
    }
}
