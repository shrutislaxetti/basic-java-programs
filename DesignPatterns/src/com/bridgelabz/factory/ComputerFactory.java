package com.bridgelabz.factory;

import com.bridgelabz.factorydesignmodel.Computer;
import com.bridgelabz.factorydesignmodel.PC;
import com.bridgelabz.factorydesignmodel.Server;

public class ComputerFactory {
	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		if ("PC".equalsIgnoreCase(type))
			return new PC(ram, hdd, cpu);
		else if ("Server".equalsIgnoreCase(type))
			return new Server(ram, hdd, cpu);

		return null;
	}
}
