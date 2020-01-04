package abhijeet;

import java.util.Scanner;

public class IOClass {

	private int arrays[];

	public int[] input() {
		System.out.println("Enter the size of array");
		Scanner sn = new Scanner(System.in);
		int size = sn.nextInt();
		arrays = new int[size];
		System.out.println("Enter the elements of array");
		for(int i = 0; i < size; i++) {
			arrays[i] = sn.nextInt();
		}
		sn.close();
		return arrays;
	}
	
	public void display(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println("");
	}
}
