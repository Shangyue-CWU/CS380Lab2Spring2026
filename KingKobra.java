package project2_380;


/*
 * KingKobra class extends from the Animal class.
 *  @author Chader
 * */
public class KingKobra extends Animal {
	
	public KingKobra(String name) {
		super(name);
	
	}
	@Override
	/**
	 * It will print out the sound of KingKobra
	 * @Override the abstract sound method from the Animal class
	 * 
	 * */
	public void sound() {
		System.out.println(this.name + " sounds Hiss");
		
	}

	@Override
	/**
	 * It will print out how KingKobra plays.
	 * */
	public void play() {
		System.out.println(this.name + " play with its prey");
		
		
	}
	
	

}
