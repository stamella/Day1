import java.io.*;
import java.util.Scanner;
import java.text.DateFormatSymbols;
public class date {
	private static int a;
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String abc=br.readLine();
		String[] date=abc.split(",");
		System.out.println(date);
		int x=Integer.parseInt(date[1]);
		String monthString;
		monthString = new DateFormatSymbols().getMonths()[x-1];
		System.out.println(date[0] + "/" + monthString + "/"+date[2]);
	    a=date.length;
	}

}
