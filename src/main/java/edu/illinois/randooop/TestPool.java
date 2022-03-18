package edu.illinois.randooop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class TestPool implements Pool {
	private List<PoolElement> pool;
	private HashSet<String> listOfTypes;
	private Random rand;
	
	public TestPool(int seedQuantity) {
		pool = new ArrayList<PoolElement>();
		listOfTypes = new HashSet<String>();
		rand = new Random();
		initPool(seedQuantity);
	}
	
	private void initPool(int seedQuantity) {
		
	}
	
	private void generateSeedElement(int quantity, String type) {
		
	}
	
	private boolean validPoolElement(PoolElement element, String returnType) {
		if (element.getReturnTypes().contains(returnType)) {
			return true;
		}
		return false;
	}
	
	@Override
	public PoolElement getElement(String returnType) {
		if (!hasReturnType(returnType)) {
			return null;
		}
		PoolElement element;
		// O(n) lmao
		int poolSize = pool.size();
		for (int i = 0; i < poolSize; i++) {
			element = pool.get(rand.nextInt(poolSize));
			if (validPoolElement(element, returnType)) {
				return element;
			}
		}

		// No luck. Start at random index and randomly (index %2) go left or right
		int index = rand.nextInt(poolSize);
		int direction = index % 2 == 0 ? 1 : -1;
		for (int i = 0; i < poolSize; i++) {
			element = pool.get(index);
			if (validPoolElement(element, returnType)) {
				return element;
			}
			index = Math.floorMod((index + direction), poolSize);
		}
		// this should not be happening...
		return null;
	}

	@Override
	public void addElement(PoolElement testCase) {
		updateTypes(testCase);
		pool.add(testCase);
	}
	
	private void updateTypes(PoolElement testCase) {
		listOfTypes.addAll(testCase.getReturnTypes());
	}

	@Override
	public boolean hasElement(PoolElement testCase) {
		if (pool.contains(testCase)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean hasReturnType(String returnType) {
		if (listOfTypes.contains(returnType)) {
			return true;
		}
		return false;
	}
}
