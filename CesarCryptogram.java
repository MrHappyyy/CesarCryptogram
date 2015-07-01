package lesson8;

import java.util.Scanner;

public class CesarCryptogram {
	
	int key;
	
	
	public CesarCryptogram(int key) {
		this.key = key;
	}
	
	/*
	 * Do encryption	
	 */
	
	
	public String encrypt (int n, String str) {
		return doEncryption(n, str);
	}
	
	public String encrypt (String str) {
		return doEncryption(key, str);
	}
	
	private String doEncryption(int n, String str) {
		String res = "";
		char[] inputString = str.toCharArray();
		
		for (int i = 0; i < inputString.length; i++) {
			res += moveChar(inputString[i], n);
		}
		
		return res; 
		
	}
	
	private char moveChar(char letter, int n) {
		if (letter>='а' && letter <= 'я') {
			return (char) ('а' + ((letter - 'а' + n)) % 32);
		} else if (letter>='a' && letter <= 'z') {
			return (char) ('a' + ((letter - 'a' + n)) % 26);
		} 
		
		if (letter>='А' && letter <= 'Я') {
			return (char) ('А' + ((letter - 'А' + n)) % 32);
		} else if (letter>='A' && letter <= 'Z') {
			return (char) ('A' + ((letter - 'A' + n)) % 26);
		}
		
		//if (letter >= '!' && letter <=)
		
		return letter;
				
	}
	
/////////////////////////////////////////////////////////////	
	
	
	/*
	 * Do decryption	
	 */
	
	public String decrypt (int n, String str) {
		return doDencryption(n, str);
		
	}
	
	public String decrypt (String str) {
		return doDencryption(key, str);
		
	}
	
	private String doDencryption(int n, String str) {
		String res = "";
		char[] inputString = str.toCharArray();
		
		for (int i = 0; i < inputString.length; i++) {
			res += moveCharDecription(inputString[i], n);
		}
		
		return res; 
	}
	
	private char moveCharDecription(char letter, int n) {
		if ((letter>='а') && (letter <= 'я')) {
			letter = (char) (letter - n);
			if (letter < 'а') {
				return (char) ('я' - ('а' - letter) + 1);						
			} else {
				return letter;
			}
			
		} else if ((letter>='a') && (letter <= 'z')) {
			letter = (char) (letter - n);
			if (letter < 'a') {
				return (char) ('z' - ('a' - letter) + 1);						
			} else {
				return letter;
			}
			
		}
		
		if ((letter>='А') && (letter <= 'Я')) {
			letter = (char) (letter - n);
			if (letter < 'А') {
				return (char) ('Я' - ('А' - letter) + 1);						
			} else {
				return letter;
			}
			
		} else if ((letter>='A') && (letter <= 'Z')) {
			letter = (char) (letter - n);
			if (letter < 'A') {
				return (char) ('Z' - ('A' - letter) + 1);						
			} else {
				return letter;
			}
			
		}
		
		return letter;
		
	}
	
	
	

}
