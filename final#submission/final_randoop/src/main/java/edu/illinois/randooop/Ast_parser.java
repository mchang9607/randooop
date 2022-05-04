package edu.illinois.randooop;

import java.util.ArrayList;
import java.util.HashSet;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

public class Ast_parser {
	
	ASTParser parser = ASTParser.newParser(AST.JLS8);
	
	public ArrayList<String> getVarNames(String fileContent) {
		
		parser.setSource(fileContent.toCharArray());
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		final CompilationUnit cu = (CompilationUnit) parser.createAST(null);
		final ArrayList<String> variables = new ArrayList<String>();
		cu.accept(new ASTVisitor() {

		    public boolean visit(VariableDeclarationFragment var) {

		    	variables.add(var.getName().toString());

		        return false;
		    }

		});
	
		//System.out.println(newVarName);
		return variables;
	}
	
	public CompilationUnit getAST(String fileContent) {
		
		parser.setSource(fileContent.toCharArray());
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		final CompilationUnit cu = (CompilationUnit) parser.createAST(null);
		final ArrayList<String> variables = new ArrayList<String>();
		cu.accept(new ASTVisitor() {

		    public boolean visit(VariableDeclarationFragment var) {

		    	variables.add(var.getName().toString());

		        return false;
		    }

		});
	
		//System.out.println(newVarName);
		return cu;
	}
	
	
	
	

}
