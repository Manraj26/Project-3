package lab3;

public class Calculator {

	    public static float add(double d, double e) {
	        return (float) (d + e);
	    }

	    public static float subtract(double d, double e) {
	        return (float) (d - e);
	    }

	    public static float multiply(double d, double e) {
	        return (float) (d * e);
	    }

	    public static float divide(double d, double e) {
	        if (e == 0) {
	            throw new IllegalArgumentException("Division by zero is not allowed.");
	        }
	        return (float) (d / e);
	    }
	


}
