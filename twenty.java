Ex:20
package javalab20;

publicclass javalab20 {
		intid;  
	String name;  
		    javalab20(){System.out.println("default constructor is invoked");}  
		
		    javalab20(intid,String name){  
		this ();//it is used to invoked current class constructor.  
		this.id = id;  
		this.name = name;  
	    }  
		void display(){System.out.println(id+" "+name);}  
		
		publicstaticvoid main(String args[]){  
		    javalab20 e1 = new javalab20(111,"shiva");  
		    javalab20 e2 = new javalab20(222,"kailash");  
		e1.display();  
		e2.display();  
	  }  


}

