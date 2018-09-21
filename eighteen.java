package javalab18;

publicclass javalab18 {
	introllno;  
		     String name;  
		static String college = "ITS";  
		
		staticvoid change(){  
		college = "RIT"; 	     }  
	
	     javalab18(intr, String n){  
		rollno = r;  
		name = n;  
		     }  
		
		void display (){System.out.println(rollno+" "+name+" "+college);}  
		
		publicstaticvoid main(String args[]){  
			javalab18.change();  	
			javalab18 s1 = new javalab18 (111,"kailash");  
			javalab18 s2 = new javalab18 (222,"vinoth");  
			javalab18 s3 = new javalab18 (333,"deepikha");  
		
	s1.display();  
		s2.display();  
	s3.display();  
	    }  


}
