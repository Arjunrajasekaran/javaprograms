package javalab19;

publicclass javalab19 {
		intid;  
		    String name;  
		
		    javalab19(intid,String name){  
		this.id = id;  
		this.name = name;  
	    }  
		void display(){System.out.println(id+" "+name);}  
		
		publicstaticvoid main(String args[]){  
		    javalab19 s1 = new javalab19(011,"Kailash");  
	    javalab19 s2 = new javalab19(004,"deepikha");  
		s1.display();  
	s2.display();  
	   }  


}
