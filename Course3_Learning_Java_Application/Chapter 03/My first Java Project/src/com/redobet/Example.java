package com.redobet;

public class Example {
	
	public static void main(String[] args) {
		
		StringE.printme("Hello this is from static method");
		
		StringE myname = new StringE();
		myname.printMeWiz("This is from non static methiod");
		
		Review inOut = new Review();
		inOut.printScan();
	}
	
	

}
