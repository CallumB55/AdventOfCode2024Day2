/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.callumhobby.adventofcode2024day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author CallumBinns
 */
public class Report {
    public List<Integer> values;
    public boolean isSafe;
    
    public Report(String values){
        this.values = makeIntList(values);
        this.isSafe = true;
    }
    
    
    private List<Integer> makeIntList(String values){
        List<String> stringValues = new ArrayList<>(Arrays.asList(values.split("\\s+")));
        List<Integer> formattedData = new ArrayList<>();
        
        for (String str : stringValues) {
            formattedData.add(Integer.valueOf(str));
        }

         return formattedData;
    }
    
    public void safetyChecks(List<Integer> in){
        Integer prev = in.get(0);
        boolean safe = true;
        boolean ascending = true;
        Integer current;
        for (int i = 1; i < in.size(); i++) {
            current = in.get(i);
            if (i==1 && current < prev) {
                ascending = false;
            }
            if (current == prev) {
                safe = false;
            }
            if (Math.abs(prev-current) > 3) {
                safe = false;
            }
            if ((current < prev) == ascending) {
                safe = false;
            }
            
            prev = current;
            
        }
                
        this.isSafe = safe;   
    }
    
}
