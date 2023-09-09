package hackerrank;
import java.util.Scanner;

public class CheckAnagrams {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter First String : ");
		String s1 = scan.nextLine();
		
		System.out.println("Enter Second String : ");
		String s2 = scan.nextLine();
		
		
		boolean isAnagram = checkAnagrams(s1, s2);
		
		
		
	}
	
	static boolean checkAnagrams(String str1, String str2) {
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
		
		if (str1.length() != str2.length()) {
			return false;
		}
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		bubbleSort(arr1);
		bubbleSort(arr2);
		
			
		
		
		return true;
	}
	
	static void bubbleSort(char[] array) {
		
	}
	
	static void areEqual(char[] array1, char[] array2) {
		
	}
}
