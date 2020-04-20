package apr17assessment;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
	/*
	 * Complete the 'devTeam' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. 2D_INTEGER_ARRAY teams 2. INTEGER r
	 */
	public static int devTeam(List<List<Integer>> teams, int r) {
		int thresholdCount = 0;
		for (List<Integer> listOfIntegers : teams) {
			double firstNumber = listOfIntegers.get(0);
			double secondNumber = listOfIntegers.get(1);
			double percentage = (firstNumber / secondNumber) * 100;
			// System.out.println(firstNumber+"\t"+secondNumber+"\t"+percentage);
			while (percentage < r) {
				firstNumber += 1;
				secondNumber += 1;
				percentage = (firstNumber / secondNumber) * 100;
				thresholdCount++;
				// System.out.println("Percentage from wile loop..: "+percentage);
			}
		}
		return thresholdCount;
	}
}

public class DevTeamThreashold {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));
		int teamsRows = Integer.parseInt(bufferedReader.readLine().trim());
		int teamsColumns = Integer.parseInt(bufferedReader.readLine().trim());
		List<List<Integer>> teams = new ArrayList<>();
		IntStream.range(0, teamsRows).forEach(i -> {
			try {
				teams.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
						.collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});
		int r = Integer.parseInt(bufferedReader.readLine().trim());
		int result = Result.devTeam(teams, r);
		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();
		bufferedReader.close();
		// bufferedWriter.close();

		System.out.println(String.valueOf(result));
	}
}
