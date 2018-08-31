import java.util.*;
public class Discount {
	public static void main(String args[]) {
		float newItem,discount,newItemPrice;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the new item price: ");
		newItem=in.nextFloat();
		discount=(newItem*35)/100;
		System.out.println("the discount amount is"+discount);
		newItemPrice=newItem-discount;
		System.out.println("the new amount is"+newItemPrice);
		
	}

}
