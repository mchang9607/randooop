package edu.illinois.randooop;

import java.io.File;
import java.util.List;

public interface APIAnalyzer {
	public File getFile(String path);
	public List<String> getMethodSignatures();
	public List<List<String>> parseMethodSignatures();
}
