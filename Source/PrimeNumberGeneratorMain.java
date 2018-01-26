package Source;
import java.util.Scanner;

public class PrimeNumberGeneratorMain {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter first range value");
        int firstNumber = keyboard.nextInt();
        System.out.println("Enter second range value");
        int secondNumber = keyboard.nextInt();
        PrimeChecker pc = new PrimeChecker();
        pc.generate(firstNumber, secondNumber);
        keyboard.close();
	}
}