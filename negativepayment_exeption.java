package exceptionfiles ;
// constructor which takes the value and throws the exception
public class negativepayment_exeption extends Exception { // making an user defined exception using Exception class

	public negativepayment_exeption()
	{
		System.out.println("ERROR : negative payment ");
	}
	@Override
	public String toString()
	{
		return "ERROR : negative payment cannot happen";
	}
}
