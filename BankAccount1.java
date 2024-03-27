package number_pattern_practice9jan;

import java.util.Scanner;

public class BankAccount1 
		{
			   static double current_balance=10000;
			   public static void main(String[] args)throws MinimunAccountBalance 
			   {
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter amount to withdraw:");
				int n=sc.nextInt();
				try {
					if(current_balance<n) 
					{
						throw new MinimunAccountBalance("Insufficient funds! Your current balance is :"+ current_balance);
					}
					else 
					{
						System.out.println("please take your money :"+ n);
						System.out.println("Current balance is:"+(current_balance- n));
					}
					}
				    catch(MinimunAccountBalance tv)
				    {
					tv.printStackTrace();
				    }
			   }
			}
class MinimunAccountBalance extends Exception{
	  String message;

	public MinimunAccountBalance(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MinimunAccountBalance [message=" + message + "]";
	}
}