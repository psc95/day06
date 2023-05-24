package array_;

import java.util.Scanner;

public class TestClass07 {

	public static void main(String[] args) {
		
		for(int i=0; i < 5; i++) {
			System.out.println( i );
		}
		System.out.println("=======================");
		Scanner input = new Scanner(System.in);
		int arr[] = new int[] {10,54,13,17,25,30};
		String odd_even = null;
		System.out.println("짝수, 홀수 입력 : ");
		odd_even = input.next();
		/*
		 짝수 입력시 : index가 짝수번째인값 출력(0,2,4)10,13,25
		 홀수 입력시 : index가 홀수번째인값 출력(1,3,5)54,17,30
		 */
		
		for( int i=0; i<arr.length; i++) {
			if(odd_even.equals("짝수")) {
				if(i%2 == 0)
				System.out.println(i+"."+arr[i]);
			}else {
				if(i%2 !=0)
					System.out.println(i+"."+arr[i]);
			}
		}
		System.out.println("========================");
		
		String s = odd_even.equals("짝수")? "1111":"2222";
		System.out.println(s);
		System.out.println("=============================");
		
		int i =odd_even.equals("짝수") ? 0 : 1;
		for( ; i<arr.length; i+=2) {
			System.out.println(i+"."+arr[i]);
		}
		
		
		
		
		/*
		 * for(int i=0; i <= arr.length; i++) { if(odd_even.equals("짝수")) { if(i % 2 ==
		 * 0) { System.out.println("짝수 : "+arr[i]); } }else { if(i % 2 != 0) {
		 * System.out.println("홀수 : "+arr[i]); } }
		 * 
		 * }
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
