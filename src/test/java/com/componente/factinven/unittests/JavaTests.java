package com.componente.factinven.unittests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JavaTests {

	@Test //Prueba Strings Inmutables
	void test() {
		String name="andres";
		String newName= name.replace("s", "a");
		assertEquals("andres", name);
		assertEquals("andrea", newName);
	}

	@Test //Redeclaracion de String
	void test2() {
		String name="andres";
		name="Alejandro";
		assertEquals("andres", name);
	}

	
}
