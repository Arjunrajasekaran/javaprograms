package javalab21;

publicclass javalab21 {
		intid;  
		    String name;  
		    String city;  
		
		    javalab21(intid,String name){  
		this.id = id;  
	this.name = name;  
	    }  
		    javalab21(intid,String name,String city){  
		this(id,name);//now no need to initialize id and name  
		this.city=city;  
		    }  
		void display(){System.out.println(id+" "+name+" "+city);}  
	
		publicstaticvoid main(String args[]){  
	    javalab21 e1 = new javalab21(111,"kailash","tambaram");  
		    javalab21 e2 = new javalab21(222,"deepikha","kk nagar");  
		e1.display();  
	e2.display();  


}
		    }

