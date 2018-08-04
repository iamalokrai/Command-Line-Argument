//Class to get the input in command line
public class CommandLineArg {
	public static void main(String[] args) {
		int i, total = 0;
		for (i = 0; i < args.length; i++) {
			// Converting the string array in int
			total = total + Integer.parseInt(args[i]);

		}
		System.out.println(total);
	}

}
