
//Condition Programs: 


//1. Write a program to check whether a number is divisible by 5 and 11 or not. 

class Divisible{
	public static void main(String[] args){
	
		int n = 55;
		
		if(n%5==0 && n%11==0){
			System.out.println("The number is Divisible by 5 and 11");
		}
		else{
			System.out.println("The number is not Divisible by 5 or 11");
		}	
	}
}


//2. Write a program to check whether a number is even or odd. 

class Prog2{
	public static void main(String[] args){
	
	    int n = 11;
	
	    if(n%2==0){
		    System.out.println("The number is even");
		
	    }else{
		    System.out.println("The number is odd");
	    }
	}
	
}


//3. Write a program to check whether a year is a leap year or not. 

import java.util.Scanner;

class Prog3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year : ");
		int year = sc.nextInt();
		
		if((year%4==0 && year%100!=0)||(year%400==0)){
			System.out.println("It is a leap year..!");
		}
		else{
			System.out.println("It is a not leap year..!");
		}
	}
}


//4. Write a program to input any alphabet and check whether it is vowel or consonant.

import java.util.Scanner;
class VC{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a single character : ");
		String in = sc.next();
		char ch = in.charAt(0);
		
		if(ch =='a' || ch == 'e'|| ch =='i'|| ch =='o'|| ch =='u'){
			System.out.println("it is vowel");
		}
		else if(ch =='A' || ch == 'E'|| ch =='I'|| ch =='O'|| ch =='U'){
			System.out.println("it is vowel");
		}
		else{
			System.out.println("it is a Consonant");
		}
	}
}


//5. Write a program to check whether a character is uppercase or lowercase alphabet.

import java.util.Scanner;
class UL{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a single character : ");
		String in = sc.next();
		char ch = in.charAt(0);
		if(ch >= 'a' && ch <='z'){
			System.out.println("it is a lower case character");
		}
		else if(ch >= 'A' && ch <='Z'){
			System.out.println("it is a upper case character");
		}
		else{
			System.out.println("invalid entry");
		}
	}
}




 //6. Write a program to input all sides of a triangle and check whether the triangle is valid or not. 

import java.util.Scanner;
class Tri{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value 1st side : ");
		int a = sc.nextInt();
		System.out.print("Enter the value 2nd side : ");
		int b = sc.nextInt();
		System.out.print("Enter the value 3rd side  : ");
		int c = sc.nextInt();
		
		if(a <=0 || b <=0 || c <= 0){
			System.out.println("Sides of triangle cannot be zero");
			System.out.println("It is not a triangle");
		}
		else if(a+b >c && a+c >b && b+c >a){
			System.out.println("It is a valid triangle");
		}else{
			System.out.println("It is not a triangle");
		}
	}
}









7. Write a program and declare Cost Price and Sale Price and check if you are getting profit or loss and print it. 

class Prog7{
	public static void main(String[] args){
		
		double cp = 249.99;
		double sp = 299.99;
		
		double profit = sp-cp;
		double loss = cp-sp;
		
		if(sp>cp){
			System.out.println("They are at profit : " + profit);
		}
		else{
			System.out.println("They are at loss : " + loss);
			
		}
	}
}

