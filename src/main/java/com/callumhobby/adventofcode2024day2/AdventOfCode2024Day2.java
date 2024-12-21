/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.callumhobby.adventofcode2024day2;
/**
 *
 * @author CallumBinns
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdventOfCode2024Day2 {

    public static void main(String[] args) {
        InputReader in1 = new InputReader("src\\main\\java\\com\\callumhobby\\adventofcode2024day2\\Input.txt");
        List<Report> reports = new ArrayList<>();
        Integer safeCounter = 0;
        String testInput = """
        7 6 4 2 1
        1 2 7 8 9
        9 7 6 2 1
        1 3 2 4 5
        8 6 4 4 1
        1 3 6 7 9
        """;
        
        
        for (String ln : in1.getInput()) {
            Report newReport = new Report(ln);
            newReport.safetyChecks(newReport.values);
            if (newReport.isSafe) {
                safeCounter ++;
            }
            reports.add(newReport);
        }
        System.out.println("Pre-problem dampener safe report count:"+ safeCounter);
        

    }
}
