package be.pxl.week3.opdracht1;

import java.util.*;

public class Gearbox {

	private boolean clutchsln;
	private int maxGears;
	private List<Gear> gears = new ArrayList<>();
	private int currentGear;

	public Gearbox(int maxGears) {
		this.maxGears = maxGears;
		for (int i = 0; i <= maxGears; i++) {
			Gear g = new Gear();
			g.gearNumber = i;
			g.ratio = g.gearNumber * (5.3);
			addGear(g);
		}
	}

	public void operateClutch(boolean in) {
		clutchsln = in;
	}

	private void addGear(Gear gear) {
		gears.add(gear);
	}

	public void changeGear(int newGear) {
		if (newGear > 0 && newGear <= maxGears && clutchsln == true) {
			currentGear = newGear;
			System.out.printf("Gear %d selected%n", newGear);
		} else {
			currentGear = 0;
			System.out.println("Grind!");
		}
	}

	public double wheelSpeed(int revs) {
		if (clutchsln == true) {
			System.out.println("Grind!");
			return 0;
		} else {
			return gears.get(currentGear).driveSpeed(revs);
		}
	}

	private class Gear {
		private int gearNumber;
		private double ratio;

		public double driveSpeed(int revs) {
			return revs * ratio;
		}
	}
}
