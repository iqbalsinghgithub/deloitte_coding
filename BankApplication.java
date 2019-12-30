package taktaurus.exception;

public class BankApplication {
	private String name;
	private int age;
	
	public BankApplication(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void verifyApplication() throws BankAgeException
	{
		if (age<15)
			throw new BankAgeException("null");
		else 
			System.out.println("Application registerded successfully");
	}
	
	public static void main(String[] args) {
		BankApplication b1=new BankApplication("Uttam", 22);
		BankApplication b2=new BankApplication("yami", 12);
		
		try{
			b1.verifyApplication();
			b2.verifyApplication();
		} catch (BankAgeException e){
			System.out.println(e);
		}
	
	}

}
