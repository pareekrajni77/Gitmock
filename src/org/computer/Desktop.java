package org.computer;

public class Desktop extends Computer {
	private void m1() {
System.out.println("hello ffffff");
	}
    public void desktopSize() {
        System.out.println("Desktop Size : 42 inch");
		
 }
   
   public static void main(String[] args) {
	Desktop d = new Desktop();
	d.computerModel();
	d.desktopSize();
	
}
}
