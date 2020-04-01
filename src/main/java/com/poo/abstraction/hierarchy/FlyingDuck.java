package com.poo.abstraction.hierarchy;

public class FlyingDuck extends Duck {

	@Override public void swim() {
		System.out.println("No se nadar");
	}

	@Override public void talk() {

		System.out.println("Coack");
	}
}
