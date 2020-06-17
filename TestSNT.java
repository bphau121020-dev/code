package BUI_PHUC_HAU;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSNT {
	Kiem_Tra_Snt k=new Kiem_Tra_Snt();
	@Test
	void test1() {
		assertEquals(k.isPrime(5),true);
	}
	@Test
	void test2() {
		assertEquals(k.isPrime(-1),true);
	}
	@Test
	void test3() {
		assertEquals(k.isPrime((1.25),true);
	}
	@Test
	void test4() {
		assertEquals(k.isPrime(10000),false);
	}
	

}
