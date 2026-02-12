
// Array Example: 


//1. Write a Java program to calculate the average value of array elements. 

class Prog1{
	public static void main(String[] args){
		
		int a[] = {1,3, 2, 4, 5};
		int total =0;
		int len = a.length;
		for(int i=0; i<a.length; i++){
			total = total +a[i];
			
		}
		int avg = total/len;
		System.out.println("Average value of array elements is : "+ avg);
	}
	
}

//2. Write a program to print sum values of an array. 

class Prog2{
	public static void main(String[] args){
		
		int a[] = {1,3, 2, 4, 5};
		int sum =0;
		for(int i=0; i<a.length; i++){
			sum = sum +a[i];
		}
		System.out.println("Sum of array is : "+ sum);
	}
}

//3. Write a program to print all odd numbers in an array. 

class Prog3{
	public static void main(String[] args){
		
		int a[] = {1,3, 2, 4, 5};
		int temp =0;
System.out.println("Odd numbers in an Array are  : “);
		for(int i=0; i<a.length; i++){
			if(a[i]%2 != 0){
				System.out.print(a[i] + “ ”);			
}
		}
		
	}
}


//4. Write a program to print all Even numbers in an array. 

class Prog5{
	public static void main(String[] args){
		
		int a[] = {1,3, 2, 4, 5,-7};
		int temp =0;
System.out.println("Even numbers in an Array are  : “);
		for(int i=0; i<a.length; i++){
			if(a[i]%2== 0){
				System.out.print(a[i] + “ ”);
			}
		}
		System.out.println("Sum of even numbers in array is : "+ temp);
	}
}



//5. Write a program to print the sum of Even Numbers in an array. 

class Prog5{
	public static void main(String[] args){
		
		int a[] = {1,3, 2, 4, 5,-7};
		int temp =0;
		for(int i=0; i<a.length; i++){
			if(a[i]%2== 0){
			temp=temp+a[i];
			}
		}
		System.out.println("Sum of even numbers in array is : "+ temp);
	}
}






//6. Write a program to print the sum of Negative Numbers in an array. 


class Neg_num{
	public static void main(String[] args){
		
		int a[] = {1,-3, -2, 4, 5,-7,6,-2};
		int temp =0;
		for(int i=0; i<a.length; i++){
			if(a[i] < 0){
			temp=temp+a[i];
			}
		}
		
		System.out.println("Sum of negative numbers in array is : "+ temp);
	}
	
}


//7. Input 3x3 matrix and find sum of all Rows, Columns and Diagonals. 

import java.util.Scanner;
class Mat{
	public static void main(String args[]){
		int mat[][] = new int[3][3];
		int rs =0;
		int cs=0;
		
		int md =0;
		int ad = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elements of 3*3 matrix : ");
		for(int i=0; i<mat.length;i++){
			for(int j=0; j<mat[i].length; j++){
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("----------######---------");
		System.out.println("elements of 3*3 matrix are : ");
		for(int i=0; i<mat.length;i++){
			
			for(int j=0; j<mat[i].length; j++){
				System.out.print(mat[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("----------##########---------");
		
		for(int i=0; i<mat.length;i++){
			for(int j= 0; j<mat.length; j++){
				rs = rs+mat[i][j];
			}
		}
		System.out.println("row sum : " + rs);
		
		for(int j=0; j<mat.length;j++){
			for(int i=0; i<mat.length; i++){
				cs = cs+mat[i][j];
			}
		}
		System.out.println("column sum : " + cs);
		System.out.println("----------######---------");
		
		for(int i=0; i<mat.length; i++){
			
			md = md + mat[i][i];
			ad = ad + mat[i][2-i];
			
		}
		System.out.println("Main diagonal sum : " + md);
		System.out.println("anti-diagonal sum : " + ad);
	}
}

