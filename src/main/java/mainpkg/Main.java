package mainpkg;

public class Main {
	
	String s;
	NotImplemented notYet;
	
	public Main(String a,NotImplemented notYet) {
		this.s = a;
		this.notYet = notYet;
	}
	
	public Main(NotImplemented notYet) {
		this.notYet = notYet;
	}
	
	public boolean firstTest() {
		if(s.length() < 5)
			return true;
		return false;
	}
	
	public int toMock(String s) {
		return notYet.notImplementedMethod(s);
	}

}
