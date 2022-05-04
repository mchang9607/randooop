package edu.illinois.randooop;

import java.util.ArrayList;
import java.util.List;

public class PoolInitializer {
	TestPool pool;
	List<PoolElement> primitives = new ArrayList<PoolElement>();
	
	private void byteElements() {
		PoolElement byteElement1 = new PoolElement("byte byte1;\nbyte1 = 0;\n", "byte1 = 0;\n", "byte", "byte1");
		PoolElement byteElement2 = new PoolElement("byte byte2;\nbyte2 = 1;\n", "byte2 = 1;\n", "byte", "byte2");
		primitives.add(byteElement1);
		primitives.add(byteElement2);
	}
	
	private void shortElements() {
		PoolElement shortElement1 = new PoolElement("short short1;\nshort1 = 1;\n", "short1 = 3;\n", "short", "short1");
		PoolElement shortElement2 = new PoolElement("short short2;\nshort2 = 1;\n", "short2 = 4;\n", "short", "short2");
		PoolElement shortElement3 = new PoolElement("short short3;\nshort3 = 2;\n", "short3 = 8;\n", "short", "short3");
		PoolElement shortElement4 = new PoolElement("short short4;\nshort4 = 9;\n", "short4 = 6;\n", "short", "short4");
		PoolElement shortElement5 = new PoolElement("short short5;\nshort5 = 11;\n", "short5 = 5;\n", "short", "short5");
		primitives.add(shortElement1);
		primitives.add(shortElement2);
		primitives.add(shortElement3);
		primitives.add(shortElement4);
		primitives.add(shortElement5);
	}
	
	private void intElements() {
		PoolElement intElement1 = new PoolElement("int integer1;\ninteger1 = 7;\n", "integer1 = 8;\n", "int", "integer1");
		PoolElement intElement2 = new PoolElement("int integer2;\ninteger2 = 9;\n", "integer2 = 10;\n", "int", "integer2");
		PoolElement intElement3 = new PoolElement("int integer3;\ninteger3 = 5;\n", "integer3 = 6;\n", "int", "integer3");
		PoolElement intElement4 = new PoolElement("int integer4;\ninteger4 = 3;\n", "integer4 = 4;\n", "int", "integer4");
		PoolElement intElement5 = new PoolElement("int integer5;\ninteger5 = 1;\n", "integer5 = 2;\n", "int", "integer5");
		primitives.add(intElement1);
		primitives.add(intElement2);
		primitives.add(intElement3);
		primitives.add(intElement4);
		primitives.add(intElement5);
	}
	private void longElements() {
		PoolElement longElement1 = new PoolElement("long long1;\nlong1 = 6;\n", "long1 = 7;\n", "long", "long1");
		PoolElement longElement2 = new PoolElement("long long2;\nlong2 = 2;\n", "long2 = 6;\n", "long", "long2");
		PoolElement longElement3 = new PoolElement("long long3;\nlong3 = 9;\n", "long3 = 10;\n", "long", "long3");
		primitives.add(longElement1);
		primitives.add(longElement2);
		primitives.add(longElement3);
	}
	private void charElements() {
		PoolElement charElement1 = new PoolElement("char char1;\nchar1 = 'a';\n", "char1 = 'a';\n", "char", "char1");
		PoolElement charElement2 = new PoolElement("char char2;\nchar2 = 'b';\n", "char2 = 'b';\n", "char", "char2");
		PoolElement charElement3 = new PoolElement("char char3;\nchar3 = 'c';\n", "char3 = 'b';\n", "char", "char3");
		PoolElement charElement4 = new PoolElement("char char4;\nchar4 = ' ';\n", "char4 = ' ';\n", "char", "char4");
		PoolElement charElement5 = new PoolElement("char char5;\nchar5 = '\0';\n", "char5 = '\0';\n", "char", "char5");
		primitives.add(charElement1);
		primitives.add(charElement2);
		primitives.add(charElement3);
		primitives.add(charElement4);
		primitives.add(charElement5);
	}
	private void floatElements() {
		PoolElement floatElement1 = new PoolElement("float float1;\nfloat1 = 1.0;\n", "float1 = 1.0;\n", "float", "float1");
		PoolElement floatElement2 = new PoolElement("float float2;\nfloat2 = 10.0;\n", "float2 = 10.0;\n", "float", "float2");
		PoolElement floatElement3 = new PoolElement("float float3;\nfloat3 = 10.0;\n", "float3 = 10.0;\n", "float", "float3");
		primitives.add(floatElement1);
		primitives.add(floatElement2);
		primitives.add(floatElement3);
	}
	private void doubleElements() {
		PoolElement doubleElement1 = new PoolElement("double double1;\ndouble1 = 4.0;\n", "double1 = 4.0;\n", "double", "double1");
		PoolElement doubleElement2 = new PoolElement("double double2;\ndouble2 = 1.0;\n", "double2 = 1.0;\n", "double", "double2");
		PoolElement doubleElement3 = new PoolElement("double double3;\ndouble3 = 1.0;\n", "double3 = 1.0;\n", "double", "double3");
		PoolElement doubleElement4 = new PoolElement("double double4;\ndouble4 = 9.9;\n", "double4 = 9.9;\n", "double", "double4");
		PoolElement doubleElement5 = new PoolElement("double double5;\ndouble5 = 9.9;\n", "double5 = 9.9;\n", "double", "double5");
		primitives.add(doubleElement1);
		primitives.add(doubleElement2);
		primitives.add(doubleElement3);
		primitives.add(doubleElement4);
		primitives.add(doubleElement5);
	}
	private void booleanElements() {
		PoolElement booleanElement1 = new PoolElement("boolean boolean1;\nboolean1 = true;\n", "boolean1 = true;\n", "boolean", "boolean1");
		PoolElement booleanElement2 = new PoolElement("boolean boolean2;\nboolean2 = false;\n", "boolean2 = false;\n", "boolean", "boolean2");
		primitives.add(booleanElement1);
		primitives.add(booleanElement2);
	}
	private void addPrimitiveElements() {
		byteElements();
		shortElements();
		intElements();
		longElements();
		floatElements();
		doubleElements();
		booleanElements();
		charElements();	
	}
	
	private void preparePool() {
		pool = new TestPool(primitives);
	}
	
	public PoolInitializer() {
		primitives  = new ArrayList<PoolElement>();
		addPrimitiveElements();
	}
	
	public TestPool makePool() {
		preparePool();
		return pool;
	}
}
