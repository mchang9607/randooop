package edu.illinois.randooop;

import java.util.HashSet;
import java.util.stream.Stream;

public class TestCaseRecorder {
	
	HashSet<String> generated;
	HashSet<String> error;
	
	public TestCaseRecorder() {
		this.generated = new HashSet<String>();
		this.error = new HashSet<String>();
	}
	
	public String pruneCode(String unprunedCode) {
		Stream<String> lines = unprunedCode.lines();
		Object[] pruned = lines.distinct().toArray();
		String prunedCode = "";
		for (Object obj : pruned) {
			prunedCode += (String) obj;
		}
		return prunedCode;
	}
	public String formatCode(String code, HashSet<String> varNames) {		
		int counter = 0;
		for (String varName : varNames) {
			code = code.replaceAll(varName, "var" + counter);
			counter++;
		}
		return code;
	}
	
	public String processTestSequence(PoolElement testCase, String contract) {
		String code = pruneCode(testCase.getCode()) + contract;
		code = formatCode(code, testCase.getVarNames());
		return code;
	}
	
	public void recordSequence(PoolElement testCase, String contract, boolean success) {
		String code = processTestSequence(testCase, contract);
		if (!success) {
			error.add(code);
		}
		generated.add(code);
	}
	
	public boolean isValidNewSequence(PoolElement testCase, String contract) {
		String code = processTestSequence(testCase, contract);		
		if (generated.contains(code)) {
			return false;
		}
		for (String errorSequence : error) {
			if (errorSequence.contains(code)) {
				return false;
			}
		}
		return true;
	}
	
}
