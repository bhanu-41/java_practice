//Patterns :

//7. Write a program to print following: 

1)

**********
**********
********** 
*******
*** 

class Patt{
	public static void main(String[] args){
		
		for(int i=0; i<3; i++){
			for(int j=0; j<10; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<1; i++){
			for(int j=0; j<7; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<1; i++){
			for(int j=0; j<3; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}






//2 & 3)

* 
** 
*** 
**** 
***** 
 * 
         ** 
        *** 
       **** 
      *****

class Pattern{
	public static void main(String[] args){
		
		for(int i=1; i<=5; i++){
			
			for(int j = 1; j <=i; j++){
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = 1; i<=5; i++){
			for(int j = 1; j<=5-i; j++ )
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}




//4)

	  * 
 *** 
        ***** 
       ******* 
      ********* 

class Pattern3{
	public static void main(String[] args){
		
		
		for(int i =1; i<=5; i++){
			for(int j =i; j<=5; j++){
				System.out.print(" ");
			}
			//System.out.println();
			
			for(int k =1; k<=i; k++){
				System.out.print("*");
			
			}
			for(int m = 1; m<=i-1; m++){
				if(i>=2){
					System.out.print("*");
				}
				
			}	
			System.out.println();
		}
	}
}

//5)
	 1 
        222 
      33333 
    4444444 
  555555555 

class Pattern4{
	public static void main(String[] args){
		
		for(int i =1; i<=5; i++){
			for(int j =i; j<=5; j++){
				System.out.print(" ");
			}
			//System.out.println();
			
			for(int k =1; k<=i; k++){
				System.out.print(i);
			
			}
			for(int m = 1; m<=i-1; m++){
				if(i>=2){
					System.out.print(i);
					
				}
			}	
			System.out.println();
		}
	}
}

//6)
  	  1 
212 
       32123 
     4321234 
   543212345 

class Pattern5{
	public static void main(String[] args){
		
		int m=0;
		int n=1;
		for(int i =1; i<=5; i++){
			m=i;n=2;
			for(int j =i; j<=5; j++){
				System.out.print(" ");
			}
			//System.out.println();
			
			for(int k =1; k<=i; k++){
				
				System.out.print(m);
				m--;
				
			}
			
			for(int l = 1; l<=i-1; l++){
				if(n>=2){
					System.out.print(n);
					
				}
				n++;
			}
			
			System.out.println();
		}
	}
}

