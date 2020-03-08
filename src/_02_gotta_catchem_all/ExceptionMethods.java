package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double a, double b){
		if(b==0)
			throw new IllegalArgumentException();
		else
			return a/b;
	}
	public String reverse(String s) {
		if(s.length()==0) throw new IllegalStateException();
		else {
			String n  = "";
			for(int i=s.length()-1;i>=0;i--) {
				n+=s.charAt(i);
			}
			return n;
		}
	}
}
