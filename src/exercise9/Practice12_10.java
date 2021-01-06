package exercise9;

public class Practice12_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			@SuppressWarnings("unused")
			int[] arr = new int[Integer.MAX_VALUE];
		} catch(OutOfMemoryError e) {
			System.out.println("OutOfMemoryError");
		}
	}

}
