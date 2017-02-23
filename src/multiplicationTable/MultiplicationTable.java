package multiplicationTable;

public class MultiplicationTable {

	private static final int LIMIT = 12;

	public static void main(String[] args) {
		
		for (int i = 1; i <= LIMIT; i++) {
			for (int m = 1; m <= LIMIT; m++) {
				System.out.format("%4d", i*m);
			}
			System.out.println("");
		}

	}

}
