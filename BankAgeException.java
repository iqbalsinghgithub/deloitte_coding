package taktaurus.exception;

public class BankAgeException extends Exception
{
	private String msg;
	public  BankAgeException()
	{
		
	}
	public  BankAgeException(String msg)
	{
		this.msg=msg;
	}
	public String toString()
	{
		if(msg==null)
			return "Age Must be above 18 to accept any individual Account request";
		else 
			return msg;
	}
}
