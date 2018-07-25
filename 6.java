import java.util.Scanner;  
class ScannerTest{  
 public static void main(String args[]){ 
 
   Scanner sc=new Scanner(System.in);  
     
   System.out.println("Enter the first number");  
   int num1=sc.nextInt();  
   System.out.println("Enter the second number");  
   int num2=sc.nextInt();  
   int product = num1*num2;
   int add= num1+num2;
   int sub=num1-num2;
   int div =num1/num2;
    System.out.println("the product is" : +product);
	 System.out.println("the sum is" : +add);
	  System.out.println("the difference is" : +sub);
	   System.out.println("the quotient  is" : +div);
	sc.close(); 
 }  
} 