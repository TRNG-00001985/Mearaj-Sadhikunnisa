package exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a=9;
		int b=0;
		try {
			int c;
			c=a/b;
		}
		catch(ArithmeticException e) {
			
			Throwable t = new Throwable(e.getMessage());
			//t.initCause(t);
			//e.printStackTrace();
			//System.out.println(t.getCause());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
			
		}
		

	}

}