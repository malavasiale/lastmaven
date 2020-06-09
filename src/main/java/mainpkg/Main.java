package mainpkg;

public class Main {
	
	String s;
	
	public Main(String a) {
		this.s = a;
	}
	
	public Main() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
	}
	
	public boolean firstTest() {
		if(s.length() < 5)
			return true;
		return false;
	}

}
