class MathWork {
	
	public static void main (String [] args) {
		divisible(5);

}

		public static void divisible (int x) {

			for (int i = 0; i < 100; i = i+x)
				if (i%x == 0) {
					System.out.print(i +", ");
				}

		}
	}