package com.bridgelanz.designpatterns;

public enum EnumSingleton {
  INSTANCE;
    
    public static void doSomething(){
       System.out.println("instance is created");
    }
    public static void main(String[] args) {
		
    	System.out.println(EnumSingleton.INSTANCE.hashCode());
		System.out.println(EnumSingleton.INSTANCE.hashCode());
	}
}
