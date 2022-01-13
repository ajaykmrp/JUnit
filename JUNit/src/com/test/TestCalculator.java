package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class TestCalculator {
	Calculator obj;
	
	@BeforeAll
	public static void BeforeClass() {
		System.out.println("Before Class");
	}
	@AfterAll
	public static void AfterClass() {
		System.out.println("After Class");
	}
	@BeforeEach
	public void setUp() {
		System.out.println("Before test method.");
	}
	@AfterEach
	public void setDown() {
		System.out.println("after test method.");
	}
	@Test
	public void testAdd() {
		System.out.println("test add method.");
		assertEquals(obj.add(10,90),100);
	}
	@Test
	public void testSub() {
		System.out.println("test sub method.");
		assertEquals(200, obj.add(300,100));
	}
	@Test
	public void testTestMsg() {
		System.out.println("test string method.");
	}
}
