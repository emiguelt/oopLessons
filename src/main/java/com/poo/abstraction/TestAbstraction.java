package com.poo.abstraction;

import com.poo.abstraction.hierarchy.Duck;
import com.poo.abstraction.hierarchy.FliyingSlowDuck;
import com.poo.abstraction.hierarchy.FlyingDuck;
import com.poo.abstraction.hierarchy.RubberDuck;
import com.poo.abstraction.hierarchy.WalkingDuck;

import java.util.Arrays;
import java.util.List;

public class TestAbstraction {

	public static void main(String[] args) {

		for (Duck duck : getAllDucks()) {
			System.out.println("---" + duck.getClass().getSimpleName() + "---");
			duck.fly();
			duck.swim();
			duck.talk();
		}

	}

	public static List<Duck> getAllDucks() {
		return Arrays.asList(
				new Duck(),
				new FlyingDuck(),
				new WalkingDuck(),
				new FliyingSlowDuck(),
				new RubberDuck()
							);
	}
}
