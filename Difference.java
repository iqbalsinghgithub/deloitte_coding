import java.util.Scanner;
public class Difference {
	static void calculateDifference(int n)
	{
		int sum=0,total=0,diff;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(i*i);
			total=total+i;
		}
		total=total*total;
		diff=total-sum;
		System.out.println("Differene is"+diff);
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter n");
		calculateDifference(s.nextInt());
	}

}
