package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import main.CreditCardChecker;

public class TestCardChecker {
	
	@Test
	public void testPopList()	{
		CreditCardChecker check = new CreditCardChecker();
		String numbers = "1234567";
		ArrayList<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(7);
		
		ArrayList<Integer> given = check.populateList(numbers);
		assertEquals(expected, given);
	}
	
	@Test
	public void testDoubleList()	{
		CreditCardChecker check = new CreditCardChecker();
		String numbers = "1234567";
		ArrayList<Integer> value = check.populateList(numbers);
		ArrayList<Integer> expected = new ArrayList<>();
		expected.add(2);
		expected.add(2);
		expected.add(6);
		expected.add(4);
		expected.add(1);
		expected.add(6);
		expected.add(5);
		value = check.doubleList(value);
		assertEquals(expected, value);
	}
	
	@Test
	public void testSum()	{
		CreditCardChecker check = new CreditCardChecker();
		ArrayList<Integer> expected = new ArrayList<>();
		expected.add(2);
		expected.add(4);
		expected.add(6);
		expected.add(8);
		expected.add(1);
		expected.add(3);
		expected.add(5);
		int expectedSum = 29;
		assertEquals(expectedSum, check.sumList(expected));
	}

}
