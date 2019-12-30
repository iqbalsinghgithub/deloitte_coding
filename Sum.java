package sum;
import java.util.Scanner;

public class Sum {
	static void calculateSum(int n)
	{
		int sum=0;
		for(int j=1;j<=n;j++)
		{
			if(j%3==0 || j%5==0)
			sum=sum+j;
		}
		System.out.println("sum is "+sum);
		
	
	}
	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		
		calculateSum(s.nextInt());
	}

}
