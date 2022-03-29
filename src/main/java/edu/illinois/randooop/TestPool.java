package edu.illinois.randooop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class TestPool {
	private List<PoolElement> pool;
	private HashSet<String> listOfTypes;
	private Random rand;
	
	public TestPool(List<PoolElement> initPool) {
		pool = new ArrayList<PoolElement>();
		listOfTypes = new HashSet<String>();
		rand = new Random();
		
		//pool.addAll(initPool);
	}
	
	/**
	 * Helper function to help determine whether a randomly chosen PoolElement is valid,
	 *  that is, contains the specified type requested.
	 * 
	 * @param element randomly chosen PoolElement.
	 * @param returnType requested type.
	 * @return yes if sufficient.
	 */
	private boolean isValidPoolElement(PoolElement element, String returnType) {
		if (element.getReturnTypes().contains(returnType)) {
			return true;
		}
		return false;
		
		}
	
	public PoolElement getElement(String returnType) {
		if (!hasReturnType(returnType)) {
			return null;
		}
		PoolElement element;

		/* 
		 * Tries to randomly find an element that satisfies the request type.
		 * We set the total amount of tries to the size of the pool.
		 * This is due to performance consideration, and is O(n).
		 */
		int poolSize = pool.size();
		for (int i = 0; i < poolSize; i++) {
			element = pool.get(rand.nextInt(poolSize));
			if (isValidPoolElement(element, returnType)) {
				return element;
			}
		}

		/* 
		 * No luck by sampling with uniform randomness. 		
		 * With a random starting index, we perform a linear search that wraps around.
		 * We try to avoid favoring higher index values by randomizing the search direction.
		 * While this is less random, we consider it sufficient and also has performance of O(n). 
		 */
		int index = rand.nextInt(poolSize);
		int direction = index % 2 == 0 ? 1 : -1;
		for (int i = 0; i < poolSize; i++) {
			element = pool.get(index);
			if (isValidPoolElement(element, returnType)) {
				return element;
			}
			index = Math.floorMod((index + direction), poolSize);
		}
		// this should never happen...
		return null;
	}

	public void addElement(PoolElement testCase) {
		updateTypes(testCase);
		pool.add(testCase);
	}
	
	private void updateTypes(PoolElement testCase) {
		listOfTypes.addAll(testCase.getReturnTypes());
	}

	public boolean hasElement(PoolElement testCase) {
		if (pool.contains(testCase)) {
			return true;
		}
		return false;
	}
	
	public boolean hasReturnType(String returnType) {
		if (listOfTypes.contains(returnType)) {
			return true;
		}
		return false;
	}
	
	public boolean hasReturnTypes(List<String> parameters) {
		if (listOfTypes.containsAll(parameters)) {
			return true;
		}
		return false;
	}
	
	// TODO: generate primPool; basic pool with primitive types.
}
