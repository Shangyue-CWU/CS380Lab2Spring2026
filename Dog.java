/**
 * class Dog extends Animal. 
 *Subclass that extends from the Animal Parent Class
 *@author Nelson Bustos.
 */
 class Dog extends Animal{
 
   /**
   * Constructor. Creates a new Dog object
   * @param name Name of object to be passed
   */
   Dog(String name){ super(name);}
   
   /**
   * Sound. Prints out sound the Dog Makes
   */
   public void sound(){ System.out.println(this.name+ " is barking: Woof! Woof!");}
   
   /**
   * Play. Prints out Activity performed by Dog
   */
   public void play() {System.out.println(this.name + " is Playing Fetch with you!");}
   
   
}

 /**
 * Class Main. Hosts main method
 */
class Main {
   public static void main(String args[]){
      Dog fido = new Dog("Luffy");
      
      fido.play();
      fido.sound();
      fido.eat();
   }
}