//BANK MANAGEMENT SYSTEM
import java.util.*;
class BankSystem
{
	public static void main(String args[])
	{
		int choice,deposit,withdraw,amount,balance=1000;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n***************** WELCOME TO SBI BANK ATM *******************");
		do
		{
			System.out.println("\nENTER YOUR CHOICE : ");
			System.out.println("\n1.WITHDAW\n2.DEPOSIT\n3.BALANCE\n4.EXIT\n");
			choice = sc.nextInt();

			switch(choice)
			{
				case 0:
				System.out.println("THANK YOU !!!");
				System.out.println("HAVE A NICE DAY...");	
					return;
				case 1:
					System.out.println("ENTER THE AMOUNT : ");
					amount = sc.nextInt();
					withdraw = balance - amount;
					System.out.println("\nYOUR UPDATED BALANCE IS : " + withdraw);
					return;
				case 2:
					System.out.println("ENTER THE AMOUNT : \n");
					amount = sc.nextInt();
					deposit = amount + balance;
					System.out.println("\nYOUR UPDATED BALANCE IS : " + deposit);
					return;
				case 3:
					System.out.println("\nBALANCE : \n" + balance);
					return;
				case 4:
					System.out.println("THANK YOU !!!");
					System.out.println("HAVE A NICE DAY...");
					return;
				default:
					System.out.println("\nYou Have Entered Invalid Option!!!");
					System.out.println("Try Again!!!");
					System.out.println("\nSelect Number from 1 - 4 : ");
					break;
			}

		}while(choice != 0);
	}
}

//Output

D:\Java Projects (Basic Level)>javac BankSystem.java

D:\Java Projects (Basic Level)>java BankSystem

***************** WELCOME TO SBI BANK ATM *******************

ENTER YOUR CHOICE :

1.WITHDAW
2.DEPOSIT
3.BALANCE
4.EXIT

1
ENTER THE AMOUNT :
100

YOUR UPDATED BALANCE IS : 900

D:\Java Projects (Basic Level)>java BankSystem

***************** WELCOME TO SBI BANK ATM *******************

ENTER YOUR CHOICE :

1.WITHDAW
2.DEPOSIT
3.BALANCE
4.EXIT

2
ENTER THE AMOUNT :

100

YOUR UPDATED BALANCE IS : 1100

D:\Java Projects (Basic Level)>java BankSystem

***************** WELCOME TO SBI BANK ATM *******************

ENTER YOUR CHOICE :

1.WITHDAW
2.DEPOSIT
3.BALANCE
4.EXIT

3

BALANCE :
1000

D:\Java Projects (Basic Level)>java BankSystem

***************** WELCOME TO SBI BANK ATM *******************

ENTER YOUR CHOICE :

1.WITHDAW
2.DEPOSIT
3.BALANCE
4.EXIT

0
THANK YOU !!!
HAVE A NICE DAY...

D:\Java Projects (Basic Level)>java BankSystem

***************** WELCOME TO SBI BANK ATM *******************

ENTER YOUR CHOICE :

1.WITHDAW
2.DEPOSIT
3.BALANCE
4.EXIT

35

You Have Entered Invalid Option!!!
Try Again!!!

Select Number from 1 - 4 :

ENTER YOUR CHOICE :

1.WITHDAW
2.DEPOSIT
3.BALANCE
4.EXIT