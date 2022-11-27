package com.assignment3;

public class FindKineticEnergy {
	public static double kineticEnergy(double mass, double velocity) {

		double convertIntoKg = mass / 1000;
		double convertIntoMeterPerSecond = velocity * 1000;
		double KE = (convertIntoKg) * (convertIntoMeterPerSecond * convertIntoMeterPerSecond) / 2;

		// convert KE into J
		KE = KE / 1000;

		return KE;
	}

	public static void main(String[] args) {
		System.out.println(FindKineticEnergy.kineticEnergy(1, 12));

	}

}
