package days;

import resources.AdventDataReader;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Day10 {

    public static void main(String[] args) throws IOException {
        String inputData = AdventDataReader.readFromInputStream("Day10_03.txt");

        List<Integer> jolts = formatInputData(inputData);
        int highestJolt = Collections.max(jolts) + 3;
        System.out.println(productOfJoltDiffernces(jolts, highestJolt));
    }

    private static int productOfJoltDiffernces(List<Integer> jolts, int highestJolt) {
        int sum1 = 0;
        int sum3 = 0;

        // Treat the charging outlet near your seat as having an effective joltage rating of 0.
        int currentJolt = 0;

        Collections.sort(jolts);

        for (Integer jolt : jolts) {
            int diff = jolt - currentJolt;
            currentJolt = diff + currentJolt;
            if (diff == 3) sum3++;
            else sum1++;
        }

        if (highestJolt - currentJolt == 3) sum3++;
        else sum1++;

        return sum1 * sum3;
    }

    private static List<Integer> formatInputData(String inputData) {
        return Arrays.stream(inputData.split("\n")).map(Integer::valueOf).collect(Collectors.toList());
    }
}
