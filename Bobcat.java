public class Bobcat extends Animal {

    public Bobcat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " the bobcat growls.");
    }

    @Override
    public void play() {
        System.out.println(name + " is pouncing and playing.");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating its prey.");
    }
}