import java.util.Scanner;
public class IncreasingNumber {
	
	static void checkNumber(int number)
	{ 	
		int r=0;
		int[] a=new int[10];
		int i=0;
		while(number!=0)
		{
			
			r=number%10;
			number=number/10;
			a[i]=r;
			i++;
			
		}
		int temp=0;
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j]<a[j+1])
			{
				 temp=1;
			}
		}	
			if(temp==0)
			{
				System.out.println("number is  increasing");
			}
			else
			{
				System.out.println("Number is not increasing");
			}
		
	}
	
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter any 5 digit number");
		checkNumber(s.nextInt());
		
	}

}
