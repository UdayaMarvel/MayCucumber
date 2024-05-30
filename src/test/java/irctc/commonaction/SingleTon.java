package irctc.commonaction;

public class SingleTon {
	public static SingleTon s1 = null;

	private SingleTon() {
		
	}
	
	public static SingleTon getInstance() {
		if(s1==null) {
			s1 = new SingleTon(); 
			return s1;
		}
		return s1;
	}
	
	public void method() {
		System.out.println("singleTon");
	}
	
	
	public static void main(String[] args) {
		
	}
}
