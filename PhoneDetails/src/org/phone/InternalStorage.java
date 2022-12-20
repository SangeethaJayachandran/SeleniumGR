package org.phone;

public class InternalStorage {
	private void processorName() {
System.out.println("Processor name is IOS");
	}
	private void ramSize() {
System.out.println("Ram size is: 128 GB");
	}
	public static void main(String[] args) {
		InternalStorage mob = new InternalStorage();
		mob.processorName();
		mob.ramSize();
		ExternalStorage phn = new ExternalStorage();
		phn.size();
	}
}
