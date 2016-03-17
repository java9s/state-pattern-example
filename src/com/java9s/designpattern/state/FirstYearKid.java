package com.java9s.designpattern.state;

public class FirstYearKid implements KidState{
	public void play(){
		System.out.println("Play in cradle");
	}
	
	public void eat(){
		System.out.println("Drink Milk");
	}
}
