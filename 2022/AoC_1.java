import java.nio.file.*;
import java.io.*;
import java.util.*;

public class AoC_1 {

    public static void main(String[] args) {

        Path p = Paths.get("2022-12-01_input");
        try {
        List<String> lines = Files.readAllLines(p);

        List<Integer> totals = new ArrayList<Integer>();
        totals.add(0);

        for (String line : lines)
        {
            if (line.length() == 0) {
                totals.add(0);
           } else {
                int value = Integer.parseInt(line);
                value = value + totals.get(totals.size() - 1);
                totals.set(totals.size() - 1, value);
                }
        }
        Collections.sort(totals, Collections.reverseOrder());

        System.out.println("Part 1 " + totals.get(0).toString());
        int total = 0;
        for (int i = 0; i < 3; i++){
            total += totals.get(i);
        }
        System.out.println("Part 2 " + Integer.toString(total));

        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } 
    }
}
