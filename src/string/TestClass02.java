package string;

public class TestClass02 {

	public static void main(String[] args) {
		String str = new String("test");
		String str2 = "test";
		System.out.println( str );
		System.out.println( str2 );
		
		String id = "aaa	";
		String inputId = "aaa";
		System.out.println( id.equals( inputId ) );
		System.out.println( id+"." );
		System.out.println( inputId+"." );
		System.out.println( id.trim()+"."); // trim() 양쪽에 공백을 없애주는 명령어
		
		String addr = "051421/서울특별시 종로구/101-914"; // /나 :으로 구분해준다
		String[] addrs = addr.split("/");
		for(String s : addrs) {
			System.out.println( s );
		}
		
		
		String repl = addr.replace("/", "==>");
		System.out.println( repl );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
