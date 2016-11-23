package rmi.server;

import java.rmi.RemoteException;

import rmi.interfaces.CalculatorInterface;

public class Calculator extends java.rmi.server.UnicastRemoteObject implements CalculatorInterface {

	protected Calculator() throws RemoteException {
		super();
	}

	@Override
	public int add(int x, int y) throws RemoteException {
		return x + y;
	}

}
