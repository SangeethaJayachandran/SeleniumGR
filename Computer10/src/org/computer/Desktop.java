package org.computer;
//multip,e inheritance
public class Desktop implements Software, HardWare { // child
	private void desktopModel() {
System.out.println("Desktop model is: Inspiron 15");
	}
	@Override
		public void softwareResources() {
		System.out.println("Software resources are: tcs, TM");			
		}
	@Override
		public void hardwareResources() {
		System.out.println("Hardware resourses are: Dell, HP");
			
		}
	public static void main(String[] args) {
		Desktop data = new Desktop();
		data.desktopModel();	
		data.hardwareResources();
		data.softwareResources();
		
	}
}
