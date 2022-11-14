package com.emc.threadpool_example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Principal {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(10);
		executor.execute(() -> doLongWork("hi 1"));
		executor.execute(() -> doLongWork("hi 2"));
		executor.execute(() -> doLongWork("hi 3"));
	}

	private static void doLongWork(String hola) {
		try {
			Thread.sleep(10000);
			System.out.println("Running after " + hola);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}