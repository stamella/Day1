public class armstrong_range {
    public static void main(String args[])
    {
    	int a=100,b=999,n,i,rem,temp,count=0;
    	for(i=a+1; i<b; i++)
    	{
    		temp = i;
    		n = 0;
    		while(temp != 0)
    		{
    			rem = temp % 10;
    			n = n + rem*rem*rem;
    			temp = temp/10;
    		}
    		if(i == n)
    		{
    			if(count == 0)
    			{
    			  System.out.print("Armstrong numbers within given range: ");
    			}
    		    System.out.print(i + " ");
    			 count++;
    		}
    	}
    }
}
