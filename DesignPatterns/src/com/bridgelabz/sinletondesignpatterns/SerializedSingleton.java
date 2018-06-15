package com.bridgelabz.sinletondesignpatterns;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {
	private static final long serialVersionUID = -7604766932017737115L;

	private SerializedSingleton() {
	}

	private static class SingletonHelper {
		private static final SerializedSingleton instance = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SingletonHelper.instance;
	}

	public static void main(String[] args) {
		SerializedSingleton intance1 = new SerializedSingleton();
		SerializedSingleton instance2 = new SerializedSingleton();
		System.out.println(intance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}
