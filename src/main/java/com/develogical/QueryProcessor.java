package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.toLowerCase().contains("plus")) {
            String[] parts = query.split(" ");
            return String.valueOf((Integer.parseInt(parts[2]) + Integer.parseInt(parts[4])));
        }
        else if (query.toLowerCase().contains("multiplied by")) {
            String[] parts = query.split(" ");
            return String.valueOf((Integer.parseInt(parts[2]) * Integer.parseInt(parts[5])));
        }
        // else if (query.toLowerCase().contains("which of the following numbers is the largest")) {
        //     String[] parts = query.split("%20");
        //     String[] numbers = parts[7].split("%");

        //     int i;
                
        //     // Initialize maximum element
        //     int max = Integer.parseInt(numbers[1]);
                
        //     // Traverse array elements from second and
        //     // compare every element with current max
        //     for (i = 1; i < numbers.length; i++)
        //         if (Integer.parseInt(numbers[i]) > max)
        //             max = numbers[i];
                
        //     return max;
        // }
        return "Could not process query";
    }
}
