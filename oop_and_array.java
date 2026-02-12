//Interface program Example.


interface A{
	
	public abstract void greet1(String a);
}

interface B{
	
	public abstract void greet2(String b);
}
interface C{
	
	public abstract void greet3(String c);
}

class IntEx implements A, B, C{
	
	
	public void greet1(String a){
		System.out.println("Hello " + a);
	}
	public void greet2(String b){
		System.out.println("Hi " + b);
	}
	public void greet3(String c){
		System.out.println("Hola " + c);
	}
	public static void main(String[] args){
		IntEx obj = new IntEx();
		obj.greet1("Ram");
		obj.greet2("Sham");
		obj.greet3("Jack");
	}
}


//Abstract class and abstract method example program.

abstract class Super_abs{
	
	abstract void display();
	
	static int sum(int a, int b){
		return a+b;
	}

	void print(String a){
		System.out.println("Hello " + a);
	}
}

class Sub_abs extends Super_abs{
	
	void display(){
		System.out.println("Abstract method...!");
	}	
	
		
	
	public static void main(String[] args){
		
		Sub_abs obj = new Sub_abs();
		obj.display();
		obj.print("abcd");
		int x = Super_abs.sum(3,5);
		System.out.println("sum: " + x);
	}
}


//Encapsulation program example.

class EncapX{

	private int roll;
	private String name;

	public void setroll(int roll){
		
		this.roll = roll;
	}
	
	public int getroll(){
		
		return this.roll;
	}
	public void setroll(String name){
		
		this.name = name;
	}
	
}

class Encap{
	public static void main(String[] args){
		EncapX obj = new EncapX();
		obj.setroll(20);
		
		obj.setname("abc");
		
		System.out.println("Roll no : "+obj.getroll());
	}
	
	
	
}

//Inheritance program Example.

class Vehicle{
	int Wheels;
	int milage;
	
}
class Car extends Vehicle{
	
	String Model;
	
	public void acc(){
		System.out.println("Accelerating...");
	}
	public void brek(){
		System.out.println("breaking...");
	}

}
public class Main{
	public static void main(String[] args){
		Car obj = new Car();
		obj.milage = 20;
		obj.Wheels = 4;
		obj.Model = "SUV";
		obj.acc();
		obj.brek();
		
		System.out.println("Milage :" + obj.milage);
		System.out.println("Model :" + obj.Model);
		
	}
}


//Array example program in java.

class Arr{
	public static void main(String args[])
	{
		int a[] = new int[50];
		int sum = 0;

		for(int i = 0; i < 50; i++)
		{
			a[i] = i + 1;
		}
		for(int i = 0; i < 50; i++)
		{
			System.out.print(a[i] + ",");
			sum = sum + i;
		}
		System.out.println();
		System.out.println("sum : "+sum);
		
		System.out.println("even : ");
		for(int i = 0; i < 50; i++){
			if (a[i] % 2 == 0){
				System.out.print(a[i] + ", ");
			}
			
		}
		System.out.println();
		System.out.println("odd : ");
		for(int i = 0; i < 50; i++){
			if (a[i] % 2 != 0){
				System.out.print(a[i] + ",");
			}	
			
		}
		
		
	}
	
}



//2D Array example program.

class Array2d{
	
	public static void main(String args[])
	{
		
		int arr[][] = new int[5][5];
		
		for(int i =0; i< arr.length; i++){
			for(int j =0; j< arr[i].length; j++){
				arr[i][j] = (i+j)+i;
				System.out.print(" " + arr[i][j]);
				
			}
			System.out.println();
		}
		
	}
}


//Constructor program Example.

class Const{
	
	Const(){
		
		System.out.println("default constructor");
	}
	Const(int x, int y){
		int s = x + y;
		System.out.println("value of sum :"+ s);
		
	}
	Const(String a){
		System.out.println("hello "+ a +"!");
	}
	
	public static void main(String[] args){
		Const obj1 = new Const();
		Const obj2 = new Const(10, 20);
		Const obj3 = new Const("abc");
		
	}
}



//Jagged array example.

class JaggedArr{
	
	public static void main(String args[]){
		
		int arr[][] = new int[2][];
		arr[0] = new int[3];
		arr[1] = new int[4];
		
		for(int i =0; i< arr.length; i++){
			for(int j =0; j<arr[i].length; j++){
				
				arr[i][j] = ((i + j)/ 2) + 10;
				System.out.print(arr[i][j] +", ");
			}
			System.out.println();
		}
	}
}

//Overloading program example.

class Overloadingx{
	public void meth(){
		
		System.out.println("Method with no parameter");
	}
	
	public void meth(int a){
		
		System.out.println("Method with single parameter ->" + a);
	}
	public void meth(int a, int b){
		
		System.out.println("Method with multiple parameter ->" + (a+b));
	}
	public void meth(String a, String b){
		
		System.out.println("Method with multiple parameter strings ->" + (a + b));
	}
}
class Overloading{
	
	public static void main(String[] args){
		
		Overloadingx obj = new Overloadingx();
		obj.meth();
		obj.meth(10);
		obj.meth(1, 20);
		obj.meth("hi ", "abc");
	}
}


//Overriding program example.

class Super{
	 
	public void meth(){
		int a = 10;
		int b = 12;
		
		System.out.println("Addition : " + (a+b));
	}
}
class Sub extends Super{
	
	public void meth(){
		int a = 10;
		int b = 12;
		
		System.out.println("Multiplication : " + a*b);
	}
}

class Overriding{
	
	public static void main(String[] args){
		
		Sub obj = new Sub();
		obj.meth();
		
		Super obj1 = new Super();
		obj1.meth();
		
		
	}
}


//Swap 2 numbers without a variable.

class Prog{
	
	public static void main (String args[]){
		
		int a = 10;
		int b = 20;
			
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swap ");
		System.out.println("value of a : " + a);
		System.out.println("value of b : " + b);
		
		
	}
	
	
}

//Swap 2 numbers with a variable.

class Swap_two{
	public static void main(String args[])
	{
		
		int a = 10;
		int b = 20;
		int temp;
		
		System.out.println("before swap ");
		System.out.println("value of a : " + a);
		System.out.println("value of b : " + b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swap ");
		System.out.println("value of a : " + a);
		System.out.println("value of b : " + b);
		
		
	}
	
	
}

