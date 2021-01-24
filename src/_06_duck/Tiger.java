package _06_duck;

public class Tiger {
	public String name;
	public int weight;
	
	public Tiger(String name, int weight) {
        this.name = name;
        this.weight = weight;
 }
	void growl() {
		System.out.println(name);
	}
	void roar() {
		System.out.println(weight);
	}
}
