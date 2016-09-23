package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	MyInteger firstNum = new MyInteger(12);

	@Test
	public void test() {
		
		assertTrue(firstNum.isEven());

		assertFalse(firstNum.isOdd());

		assertFalse(firstNum.isPrime());
		}
	MyInteger secondNum = new MyInteger(11);
	@Test
	public void test2() {
		
		assertFalse(secondNum.isEven());

		assertTrue(secondNum.isOdd());

		assertTrue(secondNum.isPrime());
		}
	
	@Test
	public void test3(){
		assertTrue(MyInteger.isEven(100));
		assertTrue(MyInteger.isOdd(111));
		assertTrue(MyInteger.isPrime(11));
	}
	@Test
	public void test4(){
		assertTrue(MyInteger.isEven(12));
		assertTrue(MyInteger.isOdd(13));
		assertTrue(MyInteger.isPrime(11));		
	}

	
	@Test
	public void test5(){
		assertFalse(MyInteger.isEven(13));
		assertFalse(MyInteger.isOdd(12));
		assertFalse(MyInteger.isPrime(10));
	}
	@Test
	public void test6(){
		assertFalse(MyInteger.isEven(13));
		assertFalse(MyInteger.isOdd(12));
		assertFalse(MyInteger.isPrime(12));
		
	}
	@Test
	public void test7(){
		MyInteger thirdNum = new MyInteger(25);	
		assertTrue(thirdNum.equals(25));
		assertTrue(thirdNum.equals(25));
	}
}