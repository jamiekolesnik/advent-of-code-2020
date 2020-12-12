package days;

import java.util.*;
import java.util.function.Predicate;

// Problem Description: https://adventofcode.com/2020/day/4
public class Day04 {

    public static void main(String[] args) {
        String passportBatch = "ecl:gry pid:860033327 eyr:2020 hcl:#fffffd\n" +
                "byr:1937 iyr:2017 cid:147 hgt:183cm\n" +
                "\n" +
                "iyr:2013 ecl:amb cid:350 eyr:2023 pid:028048884\n" +
                "hcl:#cfa07d byr:1929\n" +
                "\n" +
                "hcl:#ae17e1 iyr:2013\n" +
                "eyr:2024\n" +
                "ecl:brn pid:760753108 byr:1931\n" +
                "hgt:179cm\n" +
                "\n" +
                "hcl:#cfa07d eyr:2025 pid:166559648\n" +
                "iyr:2011 ecl:brn hgt:59in";

        System.out.println(countValidPassports(passportBatch));
    }

    public static int countValidPassports(String passportBatch) {
        int passportCount = 0;
        List<Map<String, String>> formattedPassports = formatPassports(passportBatch);

        Map<String, Predicate<String>> conditions = createPassportValidityConditions();

        for (Map<String, String> passport : formattedPassports) {
            int conditionsCount = 0;

            for (Map.Entry<String, Predicate<String>> entry : conditions.entrySet()) {
                String passportField = entry.getKey();
                Predicate<String> condition = entry.getValue();

                if (passport.size() == 8) {
                    if (condition.test(passport.get(passportField))) {
                        conditionsCount++;
                    } else {
                        break;
                    }
                    if (conditionsCount == 8) {
                        passportCount++;
                    }
                } else if (!passport.containsKey("cid") && passport.size() == 7) {
                    if (passportField.equals("cid")) {
                        continue;
                    }
                    if (condition.test(passport.get(passportField))) {
                        conditionsCount++;
                    } else {
                        break;
                    }
                    if (conditionsCount == 7) {
                        passportCount++;
                    }
                }
            }
        }

        return passportCount;
    }

    private static Map<String, Predicate<String>> createPassportValidityConditions() {
        Map<String, Predicate<String>> conditions = new HashMap<>();

        conditions.put("byr", byr -> Integer.parseInt(byr) >= 1920 && Integer.parseInt(byr) <= 2002);
        conditions.put("iyr", iyr -> Integer.parseInt(iyr) >= 2010 && Integer.parseInt(iyr) <= 2020);
        conditions.put("eyr", eyr -> Integer.parseInt(eyr) >= 2020 && Integer.parseInt(eyr) <= 2030);
        // Height: If cm, the number must be at least 150 and at most 193. *OR* If in, the number must be at least 59 and at most 76.
        conditions.put("hgt", hgt -> hgt.matches("^1(([5][0-9])|([6-8][0-9])|([9][0-3]))cm$") || hgt.matches("^((59)|(6[0-9])|(7[0-6]))in$"));

        // Hair Color: a # followed by exactly six characters 0-9 or a-f
        conditions.put("hcl", hcl -> hcl.length() == 7 && hcl.matches("^#([a-f0-9]{6}|[a-f0-9]{3})$"));

        List<String> eyeColors = Arrays.asList("amb", "blu", "brn", "gry", "grn", "hzl", "oth");
        conditions.put("ecl", eyeColors::contains);

        // Passport id: between 0-9, with 9 digits
        conditions.put("pid", pid -> pid.matches("^[0-9]{9}$"));

        // true, because this criteria doesn't matter at all IF it exists
        conditions.put("cid", cid -> true);
        return conditions;
    }

    private static List<Map<String, String>> formatPassports(String passportBatch) {
        String[] splitPassports = passportBatch.split("\n\n");

        List<Map<String, String>> formattedPassports = new ArrayList<>();

        for (String unformattedPassport : splitPassports) {
            String[] passportParts = unformattedPassport.split("[: \\n]");
            Map<String, String> formattedPassport = new HashMap<>();
            for (int i = 0; i < passportParts.length; i = i + 2) {
                formattedPassport.put(passportParts[i], passportParts[i + 1]);
            }
            formattedPassports.add(formattedPassport);
        }

        return formattedPassports;
    }
}
