package javalab23;

publicclass javalab23 {
	void m(javalab23 obj){  
			  System.out.println("method is invoked");  
			  }  
			void p(){  
			  m(this);  
			  }  
		
			publicstaticvoid main(String args[]){  
			  javalab23 s1 = new javalab23();  
		s1.p();  
			  }  

}


