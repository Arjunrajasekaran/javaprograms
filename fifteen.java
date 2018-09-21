publicclass javalab15 {

		intid;  
		    String name;  
		    javalab15(inti,String n){  
		id = i;  
		name = n;  
		    }  
		
		    javalab15(javalab15 s){  
		id = s.id;  
		name =s.name;  
		    }  
		void display(){System.out.println(id+" "+name);}  
		
		publicstaticvoid main(String args[]){  
			javalab15 s1 = new javalab15(111,"Kailash");  
			javalab15 s2 = new javalab15(s1);  
		s1.display();  
		s2.display();  
	   }  

}

