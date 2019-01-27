package com.company;

import java.util.ArrayList;

// @link https://www.tutorialspoint.com/java/java_innerclasses.htm

public class Gearbox {
	private ArrayList<Gear> gears;
	private int maxGears;
	private int currentGear = 0;

	public Gearbox(int maxGears) {
		this.maxGears = maxGears;
		this.gears = new ArrayList<Gear>();
		Gear neutral = new Gear(0, 0.0);
		this.gears.add(neutral);
	}

	// inner class
	public class Gear {
		private int gearNumber;
		private  double ratio;

		// "this" is Gear
		public Gear(int gearNumber, double ratio) {
			this.gearNumber = gearNumber;
			this.ratio = ratio;
		}

		public double driveSpeed(int revs) {
			return revs * (this.ratio);
		}
	}
}
