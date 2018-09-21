package javalab13;

publicclass javalab13 {
		intid;  
		    String name;  
		
		    javalab13(inti,String n){  
	id = i;  
		name = n;  
	    }  
	void display(){System.out.println(id+" "+name);}  
	
		publicstaticvoid main(String args[]){  
		    javalab13 s1 = new javalab13(111,"Kailash");  
		    javalab13 s2 = new javalab13(222,"eswaran");  
		s1.display();  
	s2.display();  
	  }  

}
