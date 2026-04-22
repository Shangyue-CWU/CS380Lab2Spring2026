/**
 * Student Name: Naya Kaba
 * Date: April, 22, 2026
 * Class: CS380
 * 
 * This class extends the Animal class to represent an Eagle.
 * It overrides abstract and inherited methods as part of the assignment.
 */


public class Eagle extends Animal{

    /**
     * Constructor to initialize the name variable
     * @param name the name of the eagle
     */
    public Eagle(String name) {
        super(name);
    } // end of constructor

    /**
     * This method overrides the abstract method in Animal, sound.
     * It describes the sound of an eagle.
     */
    @Override
    public void sound() {
        System.out.println("The Eagle makes high-pitched whistles and squeaks.");
    } // end of sound

    /**
     * This method overrides the abstract method in Animal, play.
     * It describes the movement of an eagle.
     */
    @Override
    public void play() {
        System.out.println("The Eagle soars through the sky and glides with the wind.");
    } // end of play

    /**
     * This method overrides the non-abstract method in Animal, eat.
     * It describes how an eage eats.
     */
    @Override
    public void eat(){
        System.out.println("The Eagle eats its prey.");
    } // end of eat

    
} // end of Eagle