import java.util.*;
public class StringSearch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		String s[] = {"Dave","Ann","George","Sam","Ted","Gag","Saj","Gag","Agati","Mary","Sam","Ayan","Kity"};
		int count = 0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].compareTo(str)==0)
				count++;
		}
		System.out.println(count);
	
	}

}
