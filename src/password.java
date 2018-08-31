import java.util.Scanner;
public class password {
	public static void main(String args[]) 
	{
		Scanner sc =new Scanner(System.in);
        String u="stamella";
        String p="swathi555";
        int count=0;
        while(count<3)
        {
        	System.out.println("Enter username");
        	String username=sc.nextLine();
        	System.out.println("Enter password");
        	String pw=sc.nextLine();
        	if(u.equals(username)&&p.equals(pw)) {
        		System.out.println("Welcome");
        		return;
        	}
        	else {
        		count++;
        		if(count!=3)
        			System.out.println("wrong username or password");
        	}
  
        }
        if(count==3)
        	System.out.println("Contack admin");
	}

}
