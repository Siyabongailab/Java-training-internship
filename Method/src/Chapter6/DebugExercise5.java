package Chapter6;

public class DebugExercise5 {
	public static void main(String[] args) {
		System.out.println("Average Calculator");
		double avg = calcAverage(1, 2, 3); // Pass the numbers to calculate the average
		System.out.println("The average is: " + avg); // Display the result
	}

	public static double calcAverage(double... numbers) {
		double results = 0;

		// Sum all the numbers
		for (double n : numbers) {
			results += n;
		}

		// Calculate the average by dividing the sum by the number of elements
		return numbers.length == 0 ? 0 : results / numbers.length;
	}
}
