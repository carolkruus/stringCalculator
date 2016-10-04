package stringcalculator;

public class StringCalculator {

	public static void main(String[] args) {
		StringCalculator c = new StringCalculator();
		System.out.println(c.add("58,7"));

	}

	public int add(String str) {
		if (str.equals("")) {
			return 0;
		}
		/**
		 * String[] stringArray = str.split(","); int[] intArray =
		 * stringArrayToIntArray(stringArray); int arraySum =
		 * sumArray(intArray); return arraySum;
		 */

		return sumArray(stringArrayToIntArray(str.split(",")));
	}

	private int[] stringArrayToIntArray(String[] strings) {
		int[] result = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			int parsed = Integer.parseInt(strings[i]);
			result[i] = parsed;
		}
		return result;
	}

	private int sumArray(int[] array) {
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum;

	}
}
