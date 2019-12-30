import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		checkNumber(s.nextInt());
	}
	static void checkNumber(int n)
	{
		 int t=0;
		for(int i=1;i<=n;i++)
		{
			if(n%(2*i)==0)
			{
				t=1;
				if(n==(2*i))
				break;
			}
		}
		if(t==1)
		{
			System.out.println("Numer is power of 2");	
		}
		else
			System.out.println("Numer is not power of 2");
	}

}
