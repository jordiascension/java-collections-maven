package com.emc.multithreading;

public class Principal {

	public static void main(String[] args) {

		RunnableDemo runnableDemo1 = new RunnableDemo("guru1");
		runnableDemo1.start();
		RunnableDemo runnableDemo2 = new RunnableDemo("guru2");
		runnableDemo2.start();

	}

}
