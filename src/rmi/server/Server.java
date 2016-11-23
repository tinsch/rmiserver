package rmi.server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
	public Server() {
		try {
			Calculator c = new Calculator();
			Registry registry = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
			registry.bind("calculate", c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Server();
	}
}
