package javaset2;

publicclass javalab027 {
		void msg(){System.out.println("Hello");}  
		} 
		class java{  
		void msg(){System.out.println("Welcome");}  
		}  
		class C extends javalab027,java{//suppose if it were  
		
		publicStaticvoid main(String args[]){  
	   C obj=new C();  
		obj.msg();//Now which msg() method would be invoked?  
		}  
}


