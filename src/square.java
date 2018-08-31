import java.util.Scanner;

public class square {
	private static Scanner sc;
	public static void main(String[] args)
	{
		int number, squaree;
		sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		number = sc.nextInt();
		squaree = calsquare(number);
		System.out.println("\nSquare: " + squaree);
	}
public static int calsquare(int num) {
	return num * num;
}
}
