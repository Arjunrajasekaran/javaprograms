package javaset2;

publicclass javalab028 {
		int square(intn){  
			returnn*n;  
			 }  
			}  
			
			class Circle{  
			 javalab028 op;//aggregation  
			doublepi=3.14;  
			
			double area(intradius){  
			op=new javalab028();  
			intrsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
		returnpi*rsquare;  
			 }  
			
			
			
			publicstaticvoid main(String args[]){  
			   Circle c=new Circle();  
			doubleresult=c.area(5);  
		   System.out.println(result);  
			 }  


}

