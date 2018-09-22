
package javaset2;

publicclass javalab033 {
		  javalab033(){System.out.println("Vehicle is created");}  
		}  
		
		class Bike5 extends javalab033{  
		  Bike5(){  
		super();//will invoke parent class constructor  
		   System.out.println("Bike is created");  
		  }  
		publicstaticvoid main(String args[]){  
		   Bike5 b=new Bike5();  
		
		}  


}

