package org.allvehicle;
import org.twowheeler.TwoWheller;
import org.threewheeler.ThreeWheeler;
import org.fourwheeler.FourWheeler;

public class Vehicle {
	private void VehicleNecessery() {
		System.out.println("Necessery vehicles: Bike, Cycle, Auto, Car, Bus and Lorry");
	}

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.VehicleNecessery();
		TwoWheller two = new TwoWheller();
		two.bike();
		two.cycle();
		ThreeWheeler three = new ThreeWheeler();
		three.Auto();
		FourWheeler four = new FourWheeler();
		four.car();
		four.bus();
		four.lorry();
	}
}
