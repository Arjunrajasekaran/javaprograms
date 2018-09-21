package javalab14;

publicclass javalab14 {
	intid;  
	    String name;  
		intage;  
		    javalab14(inti,String n){  
		id = i;  
	name = n;  
		    }  
		    javalab14(inti,String n,inta){  
	id = i;  
		name = n;  
		age=a;  
		    }  
		void display(){System.out.println(id+" "+name+" "+age);}  
		
	publicstaticvoid main(String args[]){  
	    javalab14 s1 = new javalab14(111,"Kailash",19);  
		    javalab14 s2 = new javalab14(222,"vinoth",19);  
		s1.display();  
		s2.display();  
		   }  


}
