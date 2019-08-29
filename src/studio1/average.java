package studio1;

import support.cse131.ArgsProcessor;

public class average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int x = ap.nextInt("Value for x?");
        int y = ap.nextInt("Value for y?");
        double average = (x+y)/2.0;
        System.out.println("The average of " + x + " and " + y + " is " + average);
    }
}
