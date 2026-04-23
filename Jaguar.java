package CS380Lab2;

public class Jaguar extends Animal {
	
	    /**
	     * Sets the name of the Jaguar
	     * @param name of Jaguar
	     */
	    public Jaguar(String name) {
	        super(name);
	    }

	    /**
	     * overriden from Animal class
	     * print how a jaguar sounds
	     */
	    @Override
	    public void sound() {
	        System.out.println(name + " Roars loudly");
	    }

	    /**
	     * overriden from Animal class
	     * prints a jaguar playing
	     */
	    @Override
	    public void play() {
	        System.out.println(name + " chases a leaf that is flying in the wind");
	    }
	}

