package edu.illinois.randooop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class TestBuilder {
	HashMap<String, ElementData> api;
	// TODO: Something to keep track of generated sequences.
	// information needed will contain:
	// 1. Called Method
	// 2. Sequence chose from pool for calling method
	// 3. chosen return type variable name
	HashSet<Object> generatedObjects;
	TestPool pool;
	
	private Random rand;
	private final char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	
	private void getCommunicationPool(TestPool pool) {
		this.pool = pool;
	}
	
	public TestBuilder(TestPool pool) {
		// TODO: what does a testbuilder need to start?
		rand = new Random();
		getCommunicationPool(pool);
	}
	
	public boolean generatedObject(Object obj) {
		if (generatedObjects.contains(obj)) {
			return true;
		}
		return false;
	}
	
	public String generateVarname() {
		return "" + alphabet[rand.nextInt(alphabet.length)] + rand.nextInt(100);
		
	}
	
	public String generateSequence() {
		// TODO: not auto-generated stub
		return null;
	}
	
	
	
}
