/**
 * Description: This program shows the top and bottom 5 average incomes in the USA by state
 * from years 2014 to 2018
 *
 * Author: Jeff Ostler
 */


import java.util.HashMap;
import java.util.Map;

public class IncomeMain {

    private static Map<String, String> lowAve = new HashMap<>();
    private static Map<String, String> highAve = new HashMap<>();

    public static void main(String[] args) {
        String[][] top5 = {{"Washington, DC", "71648", "75628", "75506", "82372", "85203"},
                {"Maryland", "73971", "83242", "75847", "78945", "80776"},
                {"Hawaii", "71919", "72222", "76126", "80088", "81740"},
                {"New Jersey", "69592", "73486", "74511", "77765", "80212"},
                {"Massachusetts", "69160", "70628", "75297", "77385", "79835"}};

        String[][] bottom5 = {{"Louisiana", "44555", "45727", "45146", "46145", "47905"},
                {"New Mexico", "44803", "45382", "46748", "46744", "47169"},
                {"Kansas", "41262", "41995", "44334", "45869", "47062"},
                {"Mississippi", "39680", "40593", "41754", "43529", "44717"},
                {"West Virginia", "41059", "42019", "43385", "43469", "44097"}};


        printLines(60, '-');
        System.out.println("Top 5 Median Income by State (Years 2014-2018)");
        printLines(60, '-');
        printArray(top5);

        printLines(60, '-');
        System.out.println("Bottom 5 Median Income by State (Years 2014-2018)");
        printLines(60, '-');
        printArray(bottom5);

        printLines(60, '-');
        System.out.println("Highest and Lowest Average Incomes");
        printLines(60, '-');

        highest(top5);
        lowest(bottom5);
        System.out.printf("Lowest Average: %s State: %s Year: %s%n", lowAve.get("Lowest Average"), lowAve.get("State"), lowAve.get("Year"));
        System.out.printf("Highest Average: %s State: %s Year: %s", highAve.get("Highest Average"), highAve.get("State"), highAve.get("Year"));
    }

    private static void highest(String[][] arr) {
        // initialize everything before the loop starts
        String hi = arr[0][1];
        String state = arr[0][0];
        int year = 2014;

        for (int i = 0; i <= arr.length - 1; i++) {
            int incr = 0;
            for (int j = 1; j <= arr.length - 1; j++) {
                // Check if income is lower than current assigned value
                if (Integer.parseInt(arr[i][j]) > Integer.parseInt(hi)) {
                    hi = arr[i][j];
                    state = arr[i][0];

                    // increment the year
                    if (i > 1) {
                        incr += 1;
                        year += incr;
                    }
                    lowAve.put("Highest Average", hi);
                    lowAve.put("State", state);
                    lowAve.put("Year", String.valueOf(year));
                }
            }
        }
    }

    private static void lowest(String[][] arr) {
        // initialize everything before the loop starts
        String lo = arr[0][1];
        String state = arr[0][0];
        int year = 2014;

        for (int i = 0; i <= arr.length - 1; i++) {
            int incr = 0;
            for (int j = 1; j <= arr.length - 1; j++) {
                // Check if income is lower than current assigned value
                if (Integer.parseInt(arr[i][j]) < Integer.parseInt(lo)) {
                    lo = arr[i][j];
                    state = arr[i][0];

                    // increment the year
                    if (i > 1) {
                        incr += 1;
                        year += incr;
                    }
                    lowAve.put("Lowest Average", lo);
                    lowAve.put("State", state);
                    lowAve.put("Year", String.valueOf(year));
                }
            }
        }
    }

    private static void printLines(int n, char c) {
        for (int i = 0; i <= n; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    private static void printArray(String[][] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i][0] + ": ");
            for (int j = 1; j <= arr[i].length - 1; j++){
                System.out.printf("%5s ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
