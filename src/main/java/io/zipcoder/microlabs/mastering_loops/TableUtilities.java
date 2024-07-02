package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return null;
    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
       StringBuilder tableString = new StringBuilder();
       int x = 0;
       int y = 1;
       int i = 1;
       while (y <=tableSize) {
           for (i = 1; i <= tableSize; i=x+1) {
               tableString.append(i + " | ");
                i++;
                x++;
           }
           x = x*y;
           y++;
       }
        return null;
    }
}
