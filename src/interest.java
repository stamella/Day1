import java.util.Scanner;
public class interest {
	public static void main(String args[])
	{
		double pr, rate, t, si, ci;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount: ");
		pr=sc.nextDouble();
		System.out.println("Enter no.of years: ");
		t=sc.nextDouble();
		System.out.println("Enter ROI: ");
		rate=sc.nextDouble();
		si = (pr * t * rate)/100;
		ci = pr * Math.pow(1.0+rate/100.0,t) - pr;
		System.out.println("Simple interest= " + si);
		System.out.println("Compound interest= " + ci);
		
 	}

}
