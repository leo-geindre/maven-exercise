package io.github.leo_geindre;

public class TripletOfDice {
	
	private int die1;
	private int die2;
	private int die3;
	private int sides;
	
	public TripletOfDice(int sides) {
		this.sides = sides;
	}

	
	public void rollAllDice() {
		die1 = (int)(Math.random()*sides) + 1;
		die2 = (int)(Math.random()*sides) + 1;
		die3 = (int)(Math.random()*sides) + 1;
	}
	
	public void rollOneDie(int dieNumber) {
		if (dieNumber == 1) {
			die1 = (int)(Math.random()*sides) + 1;
		}
		else if (dieNumber == 2) {
			die2 = (int)(Math.random()*sides) + 1;
		}
		else if (dieNumber == 3) {
			die3 = (int)(Math.random()*sides) + 1;
		}
		else {
			System.out.println("dieNumber doit être compris entre 1 et 3 !");
		}
	}	
	
	public int getFirstDie() {
		return die1;
	}
	
	public int getSecondDie() {
		return die2;
	}
	
	public int getThirdDie() {
		return die3;
	}

}
