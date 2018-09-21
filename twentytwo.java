package javalab22;

publicclass javalab22 {
		void m(){  
			  System.out.println("method is invoked");  
		  }  
			void n(){  
			this.m(); 
			  }  
		void p(){  
			  n(); 
			  }  
			publicstaticvoid main(String args[]){  
			  javalab22 s1 = new javalab22();  
			s1.p();  
			  }  


}
