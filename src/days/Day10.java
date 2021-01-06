package days;

import resources.AdventDataReader;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Day10 {

    public static void main(String[] args) throws IOException {
        String inputData = AdventDataReader.readFromInputStream("Day10_02.txt");

        List<Integer> jolts = formatInputData(inputData);

        // Treat the charging outlet near your seat as having an effective joltage rating of 0.
        jolts.add(0);
        // Your device has a built-in joltage adapter rated for 3 jolts higher than the highest-rated adapter in your bag.
        jolts.add(Collections.max(jolts) + 3);

        System.out.println(productOfJoltDiffernces(jolts));

        // Expected value > trillion
        Long sum = 0L;

        Set<List<Integer>> allVariants = new HashSet<>();
        allVariants.add(jolts);

        getSumOfAllCombinations(jolts, allVariants);
        System.out.println(allVariants.size());
    }

    private static Set<List<Integer>> getSumOfAllCombinations(List<Integer> jolts, Set<List<Integer>> allVariants) {

        for (int i = 1; i < jolts.size() - 1; i++) {
            if (jolts.get(i + 1) - jolts.get(i - 1) <= 3) {
                List<Integer> joltsCopy = new ArrayList<>(jolts);
                joltsCopy.remove(jolts.get(i));
                if (!allVariants.contains(joltsCopy)) {
                    allVariants.add(joltsCopy);
                    getSumOfAllCombinations(joltsCopy, allVariants);
                }
            }
        }
        return allVariants;
    }

    private static int productOfJoltDiffernces(List<Integer> jolts) {
        int sum1 = 0;
        int sum3 = 0;

        Collections.sort(jolts);

        int currentJolt = jolts.get(0);

        for (int i = 1; i < jolts.size(); i++) {
            int diff = jolts.get(i) - currentJolt;
            currentJolt = diff + currentJolt;
            if (diff == 3) sum3++;
            else sum1++;
        }

        return sum1 * sum3;
    }

    private static List<Integer> formatInputData(String inputData) {
        return Arrays.stream(inputData.split("\n")).map(Integer::valueOf).collect(Collectors.toList());
    }
}
