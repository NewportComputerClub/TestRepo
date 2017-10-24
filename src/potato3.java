import java.util.Scanner;

public class potato3 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("How Many Potatoes do you want?");
		int input = console.nextInt();
		
		if (input <= 0) {
			System.out.println("NO POTATOES FOR YOU!!!");
			System.out.println("OFF TO HELL FOR YOU!!!");
			for (int i = 1; i <= Math.abs(input) + 1000;i++) {
				System.out.println("POTATO HELL!");
		}
	} else if (input > 0) {
		for (int i = 1; i <= input + 100;i++) {
			System.out.println(i + " Potatoes");
			}
		}
		
		console.close();
	}
}
