package com.mapPrograms;

public class Temp {
	public String toString() {
		return "temp";

	}

	public void finalize() {
		System.out.println("finalize method called");
	}
}
