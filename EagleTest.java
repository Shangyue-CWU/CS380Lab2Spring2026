/**
 * Student Name: Naya Kaba
 * Date: April, 22, 2026
 * Class: CS380
 * 
 * This is the main class to test and execute implemented methods in Eagle
 * 
 */
public class EagleTest {

    /**
     * start of main
     * This is the main method in which we call and implement all method in Ealge
     * @param args
     */
    public static void main(String[] args) {
        Eagle eagle1 = new Eagle("Bald Eagle");

        System.out.println("***** Eagle Test *****");

        System.out.println("The Eagle's name is --> " + eagle1.name);
        System.out.println();

        // calls the sound method
        System.out.println("The following method describes how an eagle soulds like:");
        eagle1.sound();
        System.out.println();

        // calls the play method
        System.out.println("The following method describes how an eagle move or play:");
        eagle1.play();
        System.out.println();

        // calls the eat method
        System.out.println("The following method describes how an eagle eats:");
        eagle1.eat();
        System.out.println();

    } // end of main
} // end of EagleTest
