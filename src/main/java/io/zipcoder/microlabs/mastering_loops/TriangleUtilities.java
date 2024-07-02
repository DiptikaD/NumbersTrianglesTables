package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {


    public static String getTriangle(int numberOfRows) {
//        StringBuilder triangle = new StringBuilder();
//        for (int i = 1; i <= numberOfRows; i++){
//        triangle.append("*");
//        while (i > 0){
//            triangle.append("*");
//            i--;
//        }
//        }
//        return triangle.toString();
        StringBuilder triangle = new StringBuilder();
        int i = 1;
        while (i < numberOfRows){
            triangle.append(getRow(i));
            triangle.append("\n");
            i++;

        }
        return triangle.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder asterisk = new StringBuilder();
        for (int i = numberOfStars; i>0; i--){
            asterisk.append("*");
        }


        return asterisk.toString();
    }

    public static String getSmallTriangle() {

        return getTriangle(4);
    }

    public static String getLargeTriangle() {


        return getTriangle(10);
    }
}
