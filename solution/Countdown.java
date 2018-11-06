class Countdown {

	public static void countdown(int x) {
        System.out.println(x);
	    if (x > 0) {
	        countdown(x - 1);
	    }
	}
}

