package week3.ass.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test ="changename";
		char[] a= test.toCharArray();
	
			System.out.println("ChangeOddIndexToUpperCase");
		
		
		for(int i = 0;i<a.length;i++) {
			if(i%2!=0) {
				System.out.print(Character.toUpperCase(a[i]));
			}
			else {
				System.out.print(a[i]);
			}
		}

		}
		
		}


