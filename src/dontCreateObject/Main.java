package dontCreateObject;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonOld pold = new PersonOld();
		
		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			pold.isBabyBoomer();
		}
		long end1 = System.currentTimeMillis();
		System.out.println("PersonOld = " + (end1 - start1));

		PersonNew pnew = new PersonNew();
		long start2 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			pold.isBabyBoomer();
		}
		long end2 = System.currentTimeMillis();
		System.out.println("PersonNew = " + (end2 - start2));

	}

}
