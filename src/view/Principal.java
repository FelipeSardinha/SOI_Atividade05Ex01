package view;
import controller.Threads;
public class Principal {
	public static void main(String[] args) {
		for (int i = 0; i<21; i++) {
			Thread thread = new Threads(i);
			thread.start();		
		}
	}
}