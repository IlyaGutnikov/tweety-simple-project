package ru.ilyagutnikov.tweetysimpleproject;

import net.sf.tweety.logics.pl.syntax.Proposition;
import net.sf.tweety.logics.pl.syntax.PropositionalFormula;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropositionalFormula helloWorld = new Proposition("HelloWorld");
		System.out.println(helloWorld);
		
	}

}
