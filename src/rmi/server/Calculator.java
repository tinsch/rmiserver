package rmi.server;

import java.rmi.RemoteException;

import rmi.interfaces.CalculatorInterface;

public class Calculator extends java.rmi.server.UnicastRemoteObject implements CalculatorInterface {

	protected Calculator() throws RemoteException {
		super();
	}

	@Override
	public Double add(Double x, Double y) throws RemoteException {
		return x + y;
	}

	@Override
	public Double subtract(Double x, Double y) throws RemoteException {
		return x -y;
	}

	@Override
	public Double multiply(Double x, Double y) throws RemoteException {
		return x * y;
	}

	@Override
	public Double divide(Double x, Double y) throws RemoteException {
		return x / y;
	}
}
