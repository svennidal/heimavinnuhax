public class Sortari {
	public static void main(String[] args) {
		java.util.Arrays.sort(args);
		for( int i = 0; i < args.length; i++) { System.out.print(args[i] + " "); }
		System.out.println();
	}
}
