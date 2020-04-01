package com.poo.abstraction.hierarchy;

public class RubberDuck extends Duck{

	@Override public void talk() {

		System.out.println("--");
	}

	@Override public void fly() {
		System.out.println("No se volar");
	}
}
