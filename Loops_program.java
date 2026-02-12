//Loop Programs 


//1. Write a program to find a factorial value of 20. 

class Factorial{
	public static void main(String[] args){
		
		int fact = 1;
		int n = 20;
		
		for(int i =1; i<=n; i++){
			
			fact = (n*fact);
			n = n-1;
		}
		System.out.println("Factorial is : "+ fact);
	}
}




//2. Write a program to print 1 to 50 numbers and make a sum of all even numbers and odd numbers from 1 to 50. 

class Even_Odd{
	public static void main(String[] args){
		
		int n = 50;
		System.out.println("numbers 1 to 50 :");
		for(int i =1; i<=n; i++){
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		int x = 0;
		for(int i =1; i<=n; i++){
			
			if(i%2==0){
				x = x + i;
				
			}
		}
		System.out.println("Sum Even numbers 1 to 50 :" + x);
		
		int y =0;
		for(int i =1; i<=n; i++){
			
			if(i%2!=0){
				y = y + i;
			}
		}
		System.out.println("Sum Odd numbers 1 to 50 : " + y);
	}
}



//3. Write a program to print if a given number is prime or not. 

import java.util.Scanner;

class Prime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n = sc.nextInt();
		boolean flag = true;
		if(n<=1){
			flag = false;
		}else{
			for(int i=2; i<=n/2; i++){
				if(n%i==0){
					flag = false;
					break;
				}
			}
			
		}
		if(flag == true){
				System.out.println(" a Prime number");
		}else{
				System.out.println(" not a Prime number");
		}
	}
}






//4. Write a program to find HCF of two given numbers. 

class HCF{
	public static void main(String[] args){
	
		int a = 10;
		int b = 12;
		int rem, hcf = 0;
		
		do{
			rem = a%b;
			if(rem==0){
				hcf = b;
			}
			else{
				a=b;
				b=rem;
			}
			
			
			
		}while(rem!=0);
		System.out.println("HCF is : " + hcf);
	}
}


//5. Write a program to print Fibonacci series of n numbers. 

class Fibonacci{
	public static void main(String[] args){
		int n=10;
		
		int x =0;
		int y=1;
		int temp=0;
		System.out.print(x + " " + y);
		
		for(int i =1; i<=n; i++){
			temp = x + y;
			System.out.print(temp + " ");
			x=y;
			y=temp;
		}
	}
}








//6. Write a program to calculate the sum of the following series. 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/50. 

class Series{
	public static void main(String[] args){
		
		double sum =0;
		int n = 50;
		double x = 1;
		for(int i=1; i<=49; i++){
			sum = sum + 1/x;
			x = x + 1;
		}
		System.out.println("sum of the Series is : " + sum);
	}
}








