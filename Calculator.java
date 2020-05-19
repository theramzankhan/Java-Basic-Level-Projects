//CALCULATOR PROJECT

import java.util.*;
													
class Calculator
{
	public static void main(String args[])
	{
		int n1,n2,choice,add,sub,mul,div,mod;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers : ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("\n**********************CALACULATOR*********************************");
		do
			{
				System.out.println("\n1.ADD\n2.SUB\n3.MUL\n4.DIV\n5.MOD\n6.EXIT\n\n");
				System.out.print("Enter Your Choice : ");
				choice=sc.nextInt();
				System.out.println("\nYou have selected option no : " + choice);

				switch(choice)
				{
					case 1:
					add=n1+n2;
					System.out.println("\nResult is :"  + add);
					break;

					case 2:
					sub=n1-n2;
					System.out.println("\nResult is :"  + sub);
					break;

					case 3:
					mul=n1*n2;
					System.out.println("\nResult is :"  + mul);
					break;

					case 4:
					div=n1/n2;
					System.out.println("\nResult is :"  + div);
					break;

					case 5:
					mod=n1%n2;
					System.out.println("\nResult is :"  + mod);
					break;

					case 6:
					System.out.println("Thank You !!!");
					System.out.println("BYE...");
					return;


					default:
					int chocie;
					System.out.println("\nYou Have Entered Invalid Option!!!");
					System.out.println("Try Again!!!");
					System.out.println("\nSelect Number from 1 - 5 : ");
					break;
				}
	 	 	} while(choice != 0);
	}
}

// Output
D:\Java Projects (Basic Level)>javac Calculator.java

D:\Java Projects (Basic Level)>java Calculator
Enter 2 Numbers :
432
432

**********************CALACULATOR*********************************

1.ADD
2.SUB
3.MUL
4.DIV
5.MOD
6.EXIT


Enter Your Choice : 1

You have selected option no : 1

Result is :864

1.ADD
2.SUB
3.MUL
4.DIV
5.MOD
6.EXIT


Enter Your Choice : 2

You have selected option no : 2

Result is :0

1.ADD
2.SUB
3.MUL
4.DIV
5.MOD
6.EXIT


Enter Your Choice : 3

You have selected option no : 3

Result is :186624

1.ADD
2.SUB
3.MUL
4.DIV
5.MOD
6.EXIT


Enter Your Choice : 6

You have selected option no : 6
Thank You !!!
BYE...

D:\Java Projects (Basic Level)>javac Calculator.java

D:\Java Projects (Basic Level)>java Calculator
Enter 2 Numbers :
100
50

**********************CALACULATOR*********************************

1.ADD
2.SUB
3.MUL
4.DIV
5.MOD
6.EXIT


Enter Your Choice : 1

You have selected option no : 1

Result is :150

1.ADD
2.SUB
3.MUL
4.DIV
5.MOD
6.EXIT


Enter Your Choice : 2

You have selected option no : 2

Result is :50

1.ADD
2.SUB
3.MUL
4.DIV
5.MOD
6.EXIT


Enter Your Choice : 3

You have selected option no : 3

Result is :5000

1.ADD
2.SUB
3.MUL
4.DIV
5.MOD
6.EXIT


Enter Your Choice : 4

You have selected option no : 4

Result is :2

1.ADD
2.SUB
3.MUL
4.DIV
5.MOD
6.EXIT


Enter Your Choice : 5

You have selected option no : 5

Result is :0

1.ADD
2.SUB
3.MUL
4.DIV
5.MOD
6.EXIT


Enter Your Choice : 6

You have selected option no : 6
Thank You !!!
BYE...

D:\Java Projects (Basic Level)>





