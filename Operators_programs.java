
//Operator Example: 


//1. Length and breadth of a rectangle are 5 and 7 respectively. Write a program to calculate the area and perimeter of the rectangle.

class Prog1{
	public static void main(String[] args){
	
		int l = 5;
		int b = 7;
		
		double area = l*b;
		double pm = (2*(l+b));
		System.out.println("Area of the rectangle is : " +area);
		System.out.println("perimeter of the rectangle is : " +pm);
	}
}



//2. Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result. 

class Prog2{
	public static void main(String[] args){
	
		double n = 2345;
		
		n = (n+8);
		System.out.println("value : " + n);
		n = (n/3);
		System.out.println("value : " + n);
		n = (n%5);
		System.out.println("value : " + n);
		n = (n*5);
		System.out.println("final value : " + n);
	}
}


//3. Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if both the conditions 'a < 50' and 'a < b' are true.




class Prog3{
	public static void main(String[] args){
	
		int a = 55;
		int b =70;
		
		if(a<50 && a<b){
			System.out.println("both conditions are true");
		}else{
			System.out.println("false");
		}
		
	}
}

//4. If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ), write a program to calculate his total marks and percentage marks. 

class Prog4{
	public static void main(String[] args){
	
		int a = 78;
		int b = 45;
		int c = 62;
		double total = a+b+c;
		double percent = ((total/300)*100);
		System.out.println("Total Marks is : "+ total);
		System.out.println("Percentage : "+ percent +"%");
	}
}


//5. The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'. 

class Prog5{
	public static void main(String[] args){
		int total = 90;
		int b = 45;
		
		int g = total-b;
		System.out.println("Total no of girls are : "+ g);
		int ga = (total/2)-20;
		System.out.println("Total no of girls getting grade A : "+ ga);
	}
}

