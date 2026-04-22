/**
 * class Alpaca extends Animal. 
 *Subclass that extends from the Animal Parent Class
 *@author Nelson Bustos.
 */
 class Alpaca extends Animal{
 
   /**
   * Constructor. Creates a new Alpaca object
   * @param name Name of object to be passed
   */
   Alpaca(String name){ super(name);}
   
   /**
   * Sound. Prints out sound the Alpaca Makes
   */
   public void sound(){ System.out.println(this.name+ " is humming: Hyurr! Hyurrr!");}
   
   /**
   * Play. Prints out Activity performed by Alpaca
   */
   public void play() {System.out.println(this.name + " is cooling down in a pool!");}
   
   
}

 /**
 * Class Main. Hosts main method
 */
class Main {
   public static void main(String args[]){
      Alpaca alpa1 = new Alpaca("Luffy");
      
      alpa1.play();
      alpa1.sound();
      alpa1.eat();
   }
}