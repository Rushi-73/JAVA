import  java.util.Scanner;                                                        
class bank
{
	int Deposit(int balance,int depo)
	{
		
		return balance;
	}
     public static void main(String args[])
     {
     	int balance,choice;
     	Scanner sc=new Scanner(System.in);
     	do
     	{
     		System.out.println("1.check balance");
     		System.out.println("2.Deposit");
     		System.out.println("3.withdraw");
     		System.out.println("0.exit")
            choice=sc.nextInt();

            switch(choice)
            {
            	case 1:
            	  System.out.println("Your current balance is"+balance);
            	  break;
            	case 2:
            	 int depo;
            	 System.out.println("Enter number of amount you want to deposit");
            	  depo=sc.nextInt();
            	  balance=Deposit(balance,depo);
            	  break;
            	case 3:
            	 



            	    
            }

     	}while(choice!=0);

     }
}