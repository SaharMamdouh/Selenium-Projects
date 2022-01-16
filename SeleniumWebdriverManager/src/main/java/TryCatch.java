
public class TryCatch {

	public static void main(String[] args) {
		try {
			fn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void fn() throws Exception {
		
			System.out.println("Hello World....!");
			throw new ArithmeticException("not valid operation");
//			int i = 1/0;
//			System.out.println("completed");
	}
}
		
//		catch(Exception exp){
//			System.out.println("i'm in the catch block ");
//			System.out.println( "message is :" +exp.getMessage());
//			System.out.println("cause is :"+ exp.getCause());
//			exp.printStackTrace();
//			}
		


