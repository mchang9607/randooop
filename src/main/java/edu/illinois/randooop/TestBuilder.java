package edu.illinois.randooop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class TestBuilder {
	HashMap<String, APIElement> api;
	List<String> callableList;
	// TODO: Something to keep track of generated sequences.
	// information needed will contain:
	// 1. Sequence chose from pool for calling method
	// 2. Called Method
	// 3. chosen return type variable name
	// HashSet<HashSet<String>> generatedSequences;
	TestPool pool;
	
	private Random rand;
	private final char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	
	public TestBuilder(HashMap<String, APIElement> api, TestPool pool) {
		this.api = api;
		this.pool = pool;
		callableList = new ArrayList<String>(api.keySet());
		rand = new Random();
	}
	
	/**
	 * Randomly builds a test that may or may not be redundant.
	 *  
	 * @return
	 */
	public PoolElement buildTest() {
		APIElement toCat;
		while (true) {
			// randomly draw a callable method from the api
			toCat = api.get(callableList.get(rand.nextInt()));
			if (pool.hasReturnTypes(toCat.getParams())) {
				break;
			}
		}
		
		// get building blocks
		List<String> params = toCat.getParams();
		List<PoolElement> argData = new ArrayList<PoolElement>();
		List<String> argNames = new ArrayList<String>();
		for (String param : params) {
			argData.add(pool.getElement(param));
		}
		// get each argument's variable name
		int paramSize = params.size();
		List<String> varNamesOfType;
		for (int i = 0; i < paramSize; i++) {
			varNamesOfType = argData.get(i).getTypeToVarNameMap().get(argNames.get(i)); 
			argNames.add(varNamesOfType.get(rand.nextInt(varNamesOfType.size())));
		}
		
		// TODO: verify that sequence was not previously generated
		
		// build base sequence
		String testSequence = "";
		HashSet<String> definedVars = new HashSet<String>();
		List<String> redundant = new ArrayList<String>();
		String sequence;
		for (PoolElement base : argData) {
			redundant.clear();
			redundant.addAll(base.getVarNames());
			redundant.retainAll(definedVars);
			sequence = base.getSequence();
			if (!redundant.isEmpty()) {
				sequence = pruneSequence(sequence, redundant);
			}			
			testSequence += sequence;
		}
		return null;
	}
	
	private String pruneSequence(String sequence, List<String> redundant) {
		
		return null;
	}
	
	public String generateVarname() {
		return "" + alphabet[rand.nextInt(alphabet.length)] + rand.nextInt(100);
	}

}
