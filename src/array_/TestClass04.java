package array_;

public class TestClass04 {

	public static void main(String[] args) {
		int num = 0;		//자료형이 소문자로 시작하면 0으로초기화
		String name = null; //자료형이  대문자로 시작하면 null로 초기화 해야함
		
		String[] s = new String[3];
		double[] d = new double[3];
		System.out.println( s[0] );
		System.out.println( d[0] );
		
		String[] s1 = new String[]{"안녕","그래","반갑다"};	// 둘다 초기화하는 방식 똑같아서 편할걸로 쓰자
		double[] d1 = {1.1, 2.2, 3.3};
		System.out.println("================================");
		for(int i=0; i<s1.length; i++) {
			System.out.println( s1[i] );
		}
		System.out.println("----------------------------------------");
						//{"안녕","그래","반갑다"}
		int k=0;
		for( String ss : s1 ) {
			System.out.println(k+"."+ss);
			k++;
		}
		System.out.println("------------------------------------------");
		for(double dd : d1) {
			System.out.println( dd );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
