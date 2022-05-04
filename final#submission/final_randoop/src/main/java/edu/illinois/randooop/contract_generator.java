package edu.illinois.randooop;

import java.util.concurrent.ThreadLocalRandom;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.MethodInvocation;

public class contract_generator {

	MethodInvocation operationContract = null;	
	
	
	 public ExpressionStatement getcontract(AST ast, String varName) {
    	 int randomOC = ThreadLocalRandom.current().nextInt(0, 4);
 		
    		switch(randomOC) {
//    		• o.equals(o)==true / assertTrue(o.equals(o))
    			case 0: {
    				MethodInvocation equals = ast.newMethodInvocation();
    				equals.setExpression(ast.newSimpleName(varName));
    				equals.setName(ast.newSimpleName("equals"));
    				equals.arguments().add(ast.newSimpleName(varName));
    				
    				operationContract = ast.newMethodInvocation();
    				operationContract.setName(ast.newSimpleName("assertTrue"));
    				operationContract.arguments().add(equals);
    				
    				break;
    			}
//    		• o.equals(o) throws no exception
    			case 1: {
    				operationContract = ast.newMethodInvocation();
    				operationContract.setExpression(ast.newSimpleName(varName));
    				operationContract.setName(ast.newSimpleName("equals"));
    				operationContract.arguments().add(ast.newSimpleName(varName));
    				

    				
    				break;
    			}
//    		• o.hashCode() throws no exception
    			case 2: {
    				operationContract = ast.newMethodInvocation();
    				operationContract.setExpression(ast.newSimpleName(varName));
    				operationContract.setName(ast.newSimpleName("hashCode"));
    				
    				break;
    			}
//    		• o.toString() throw no exception
    			case 3: {
    				operationContract = ast.newMethodInvocation();
    				operationContract.setExpression(ast.newSimpleName(varName));
    				operationContract.setName(ast.newSimpleName("toString"));
    				
    				break;
    			}
    		}	
    		
    		Expression operationContract2=operationContract;
    		ExpressionStatement contractStmt = ast.newExpressionStatement(operationContract2);
    		
    		return contractStmt;
		 
		 
		 

		 
	 }
	
	
	
	
	
	
}
