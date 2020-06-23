package exceptionfiles;

import java.util.Scanner;

public class payment_app {
static double  payment = 0;
static boolean positive_payment = true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// to get the info from the user
 // "in" is an object /  need to import scanner lib / and used to give info through console
 
  do {
	  System.out.println("enter the payment amount: ");
	  Scanner in = new Scanner(System.in);
  try {
	payment = in.nextDouble();
	if(payment < 0)
		{
		positive_payment = false;
		throw new negativepayment_exeption(); // creating  an object
		
		}
	else
	{
		positive_payment = true;
	}
}
catch(negativepayment_exeption e)

{
	System.out.println(e.toString());
}
  }
  
  while(!positive_payment);
  {
	  System.out.println("thank you for the payment" + payment);
  }
}
	

}
 