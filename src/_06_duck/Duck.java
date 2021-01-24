package _06_duck;

public class Duck {
	public int numberOfFriends;
	public String favoriteFood;
	

	public Duck(String favoriteFood, int numberOfFriends) {
        this.favoriteFood = favoriteFood;
        this.numberOfFriends = numberOfFriends;
 }
	public void quack() {
		System.out.println(favoriteFood);
	}
	public void waddle() {
		System.out.println(numberOfFriends);
	}
	
}
