package days;

import resources.AdventDataReader;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day09 {

    public static void main(String[] args) throws IOException {
        String inputData = AdventDataReader.readFromInputStream("Day09_02.txt");
        List<Long> vals = formatInputData(inputData);

        System.out.println(getNonFittingValue(vals, 25));
    }

    private static long getNonFittingValue(List<Long> vals, int limit) {
        boolean match;

        for (int i = limit; i < vals.size(); i++) {
            match = false;
            for (int j = i - limit; j < i; j++) {
                for (int k = j + 1; k < i; k++) {
                    if (vals.get(j) + vals.get(k) == vals.get(i)) {
                        match = true;
                        break;
                    }
                }
                if (match) break;
            }
            if (!match) {
                return vals.get(i);
            }
        }

        return 0;
    }

    private static List<Long> formatInputData(String inputData) {
        return Arrays.stream(inputData.split("\n")).map(Long::valueOf).collect(Collectors.toList());
    }

}
