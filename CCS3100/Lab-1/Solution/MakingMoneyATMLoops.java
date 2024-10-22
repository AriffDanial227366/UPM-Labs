public class MakingMoneyATMLoops {
	public static void main(String[] args) {
		String name = "Danial";
		printMultipleTimes("*", 68);
		System.out.print("\n");
		System.out.print("*");
		printMultipleTimes(" ", 66);
		System.out.print("*\n");
		System.out.print("*");
		printMultipleTimes(" ", 20);
		System.out.print("Making Money Bank ATM Service");
		printMultipleTimes(" ", 17);
		System.out.print("*\n");
		System.out.print("*");
		printMultipleTimes(" ", 66);
		System.out.print("*\n");
		printMultipleTimes("*", 68);
		System.out.println("\n\nWelcome, " + name + "!");
	}

	public static void printMultipleTimes(String character, int times) {
		for (int i = 0; i < times; i++) {
			System.out.print(character);
		}
	}
}