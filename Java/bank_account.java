import java.util.Scanner;
import java.io.Console;


class bank_account
{

 	int balance;
 	String name,address,acc;
 	void open_account(Scanner sc)
 	{
 		System.out.println("Enter the name");
 		sc.nextLine();
 		 name=sc.nextLine();
 		System.out.println("Enter address ");
 		 address=sc.nextLine();
 		System.out.println("Account type ");
 		 acc=sc.nextLine();
 		System.out.println("Enter account balance ");
 		balance=sc.nextInt();

 	}

 	void deposit_money(int dep_money)
 	{
 		balance=balance+dep_money;
 		System.out.println("Total balance is"+balance);
 	}
 	void withdraw_money(int w_money)
 	{
 		balance=balance-w_money;
 		System.out.println("Total balance is"+balance);
 	}

 	void display()
 	{
 		System.out.println("Name is"+name);
 		System.out.println("Address is"+address);
 		System.out.println("Account type is"+acc);
 		System.out.println("Available Balance is is"+balance);
 	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		bank_account c=new bank_account();
		int choice;
		do
		{
			System.out.println("1.Open acoount");
			System.out.println("2.Deposit Amount");
			System.out.println("3.Withdraw Amount");
			System.out.println("4 Display account");
			System.out.println("0.Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				c.open_account(sc);
				break;
				case 2:
				System.out.println("Enter amount you want to deposite");
				Console co=System.console();
				char cr[]=co.readPassword();
				int dep=Integer.parseInt(new String(cr));
				c.deposit_money(dep);
				break;
				case 3:
				System.out.println("Enter amount you want to withdraw");
				Console co1=System.console();
				char cr1[]=co1.readPassword();
				int w=Integer.parseInt(new String(cr1));
				c.withdraw_money(w);
				break;
				case 4:
				c.display();
				break;
				
			}


		}while(choice!=0); 
	}
}
