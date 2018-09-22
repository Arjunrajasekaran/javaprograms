
package javaset2;

publicclass javalab032 {
		intspeed=50;  
		}  
		
		class Bike4 extendsjavalab032{  
		intspeed=100;  
		
		void display(){  
		   System.out.println(super.speed);//will print speed of Vehicle now  
		  }  
		publicstaticvoid main(String args[]){  
		   Bike4 b=new Bike4();  
		b.display();  
		
	}  

}

