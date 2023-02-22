package week3.ass.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester"; 
		String[] s=test.split("");
		System.out.println("The given string is :"+test);
		System.out.println("Aftter Reverse of Even Words :");
		for(int i=0;i<s.length;i++) {
			if(i%2==0) {
				
				char[] c=s[i].toCharArray();
				
				for(int j=c.length-1;j>=0;j--) {
					
					System.out.print(c[j]);
					
				}
				
			}
			else {
				System.out.print(s[i]+" ");
			}
		
		}
		
	}

}
