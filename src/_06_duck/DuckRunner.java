package _06_duck;

public class DuckRunner {
public static void main(String[] args) {
	Duck ducky = new Duck("waffle", 10);
	Tiger tiger = new Tiger("rufus", 100);
	
	ducky.quack();
	ducky.waddle();
	
	tiger.roar();
	tiger.growl();
}
}
