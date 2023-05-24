package string;

import java.util.ArrayList;

public class 연습문제2 {
	public static void main(String[] args) {
		
		String str = new String("Have a nice day Have a nice day Have a nice day");
		int i=0;
		ArrayList arr = new ArrayList();
		while(i < str.length()) {
			if(str.charAt(i) == 'a')
				arr.add(i);
			i++;
		}
		System.out.println(arr);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
