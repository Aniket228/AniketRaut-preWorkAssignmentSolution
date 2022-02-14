import java.util.Scanner;

public class Main {
	
Scanner sc = new Scanner(System.in);

           //function to checkPalindrome

       public void checkPalindrome()  {

      }

            //function to printPattern

       public void printPattern() {

      }

          //function to check no is prime or not

        public void checkPrimeNumber() {

        }  

          // function to print Fibonacci Series

          public void printFibonacciSeries() {

                //initialize the first and second value as 0,1 respectively.

           int first = 0, second = 1;

          }

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

choice = sc.nextInt();

switch (choice) {

case 0:

choice = 0;

break;

{
		    int num = 3553, reversedNum = 0, remainder;
		    
		    // store the number to originalNum
		    int originalNum = num;
		    
		    // get the reverse of originalNum
		    // store it in variable
		    while (num != 0) {
		      remainder = num % 10;
		      reversedNum = reversedNum * 10 + remainder;
		      num /= 10;
		    }
		    
		    // check if reversedNum and originalNum are equal
		    if (originalNum == reversedNum) {
		      System.out.println(originalNum + " is Palindrome.");
		    }
		    else {
		      System.out.println(originalNum + " is not Palindrome.");
		    }
		  }
	
obj.checkPalindrome();

}

break;

 {
	      int n = 5;
	      //Outer Loop for number of Rows
	      for(int i=0;i<n;i++)
	      {
	          // Inner loop for printing '*' in each column.
	          for(int j=0;j<n;j++)
	          {
	              // We add two spaces to match shape of a square.
	              System.out.print("*  ");
	          }
	          System.out.println();
	      }
obj.printPattern();

}

break;

 {
	{

		    int num = 33, i = 2;
		    boolean flag = false;
		    while (i <= num / 2) {
		      // condition for nonprime number
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }

		      ++i;
		    }

		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
obj.checkPrimeNumber();

}

break;

 {
	 {
	     
         int n, first = 0,next = 1;
          
            System.out.println("Enter how may fibonnaci numbers to print");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            System.out.print("The first " + n + " Fibonacci numbers are: ");
            System.out.print(first + " " + next);
            for (int i = 1; i<=n-2; ++i)
            {
                int sum = first + next;
                first = next;
                next = sum;
                System.out.print(" " + sum);
            }
  
    }
obj.printFibonacciSeries();

}

break;

System.out.println("Invalid choice. Enter a valid no.\n");

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();
}
}