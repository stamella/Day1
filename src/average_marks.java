import java.util.Scanner;
public class average_marks {
	public static void main(String args[])
	{
		
		        int stu1[] = new int[3];
		        int stu2[] = new int[3];
		        int stu3[] = new int[3];
		        int i;
		        float sum1=0,sum2=0,sum3=0;
		        float avg1=0,avg2=0,avg3=0;
		        float sub1_sum=0,sub2_sum=0,sub3_sum=0;
		        float sub1_avg=0,sub2_avg=0,sub3_avg=0;
		        Scanner sc = new Scanner(System.in);
				
		        System.out.print("Enter marks Obtained in 3 Subjects of student1 : ");
		        for(i=0; i<3; i++)
		        {
		            stu1[i] = sc.nextInt();
		            sum1 = sum1 + stu1[i];
		        }
		        avg1 = sum1/3;
		        System.out.print("\nsum = " +sum1);
		        System.out.print("\nAverage Marks = " +avg1);
		        System.out.print("Enter marks Obtained in 3 Subjects of student2 : ");
		        for(i=0; i<3; i++)
		        {
		            stu2[i] = sc.nextInt();
		            sum2 = sum2 + stu2[i];
		        }
		        avg2 = sum2/3;
		        System.out.print("\nsum = " +sum2);
		        System.out.print("\nAverage Marks = " +avg2);
		        System.out.print("Enter marks Obtained in 3 Subjects of student3 : ");
		        for(i=0; i<3; i++)
		        {
		            stu3[i] = sc.nextInt();
		            sum3 = sum3 + stu3[i];
		        }
		        avg3 = sum3/3;
		        System.out.print("\nsum = " +sum3);
		        System.out.print("\nAverage Marks = " +avg3);
		        sub1_sum = stu1[0]+stu2[0]+stu3[0];
		        sub1_avg = sub1_sum/3;
		        System.out.println("\ntotal marks obtained in sub1 : " + sub1_sum);
		        System.out.println("Average obtained in sub1 : " + sub1_avg);
		        sub2_sum = stu1[1]+stu2[1]+stu3[1];
		        sub2_avg = sub2_sum/3;
		        System.out.println("\ntotal marks obtained in sub2 : " + sub2_sum);
		        System.out.println("Average obtained in sub2 : " + sub2_avg);
		        sub3_sum = stu1[2]+stu2[2]+stu3[2]; sub3_avg = sub3_sum/3;
		        System.out.println("total marks obtained in sub3 : " + sub3_sum);
		        System.out.println("Average obtained in sub3 : " + sub3_avg);
    }
}

