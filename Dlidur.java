// Svenni Dal -- svennidal.com -- 10/07/2014
// Newtons method -- X_(n+1) = X_n - (f(X) / f'(x))   n = 0,1,2,...
// Takes in one argument from the command line and outputs 
// the value of X when f(x) = 0 to the accuracy of 5 decimal places.

public class Dlidur {
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);

		System.out.println("Given X0 = " + x);
		System.out.println(newton(x));
	}

	public static double newton(double x) {
		double oldX = x;
		return newtonRecursive(x, oldX);
	}

	private static double newtonRecursive(double x, double oldX) {
		oldX = x;
		x -= (( Math.pow(x, 3) - (3 * Math.pow(x, 2)) - (9 * x) - 7) / ((3 * Math.pow(x, 2)) - (6 * x)  - 9));
		if(oldX - x > 0.00001) { return newtonRecursive(x, oldX); }
		else { return x; }
	}
}
