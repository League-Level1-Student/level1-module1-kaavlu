package _04_popcorn;

import javax.swing.JOptionPane;

import _03_harry_potter.HarryPotter;

public class PopcornMaker {
	public static void main(String[] args) {
		Microwave microwave = new Microwave();
		String flavor = JOptionPane.showInputDialog("Input Flavor:");
		Popcorn popcorn = new Popcorn(flavor);
		int minutes = Integer.parseInt((JOptionPane.showInputDialog("Input Minutes to Cook:")));
		microwave.putInMicrowave(popcorn);
		microwave.setTime(minutes);
		microwave.startMicrowave();
	}
}
