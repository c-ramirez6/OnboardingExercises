package main;

import java.util.ArrayList;
import java.util.Collections;

public class CreditCardChecker {
	
	public boolean checkCard(String cardString)	{
		ArrayList<Integer> cardArray = populateList(cardString);
		int checkNum = cardArray.remove(cardArray.size()-1);
		Collections.reverse(cardArray);
		cardArray = doubleList(cardArray);
		int sum = sumList(cardArray);
		sum = sum % 10;
		if((10 - sum) == checkNum) {
			return true;
		}
		return false;
		
	}
	
	public ArrayList<Integer> populateList(String string)	{
		ArrayList<Integer> numbers = new ArrayList<>();
		for(int i = 0; i < string.length(); i++)	{
			numbers.add(Character.getNumericValue(string.charAt(i)));
		}
		return numbers;
	}
	
	public ArrayList<Integer> doubleList(ArrayList<Integer> cardArray)	{
		ArrayList<Integer> doubled = new ArrayList<>();
		for(int i = 0; i < cardArray.size(); i ++) {
			if((i % 2) == 0) {
				int temp = cardArray.get(i);
				temp *= 2;
				if(temp >= 10) {
					temp +=1;
					temp = temp % 10;
				}
				doubled.add(temp);
			}
			else	{
				doubled.add(cardArray.get(i));
			}
		}
		return doubled;
	}
	
	public int sumList(ArrayList<Integer> numbers)	{
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		return sum;
	}
}
