package io.github.leo_geindre;

public class DiceUser {
	
	
	public static TripletOfDice rollOnce() {
		TripletOfDice die = new TripletOfDice(6);
		die.rollAllDice();
		return die;
	}
	
	public static void main(String[] args) {
		TripletOfDice die = rollOnce();
		System.out.println("The die number 1 is a " + die.getFirstDie());
		System.out.println("The die number 2 is a " + die.getSecondDie());
		System.out.println("The die number 3 is a " + die.getThirdDie());
	}
}
