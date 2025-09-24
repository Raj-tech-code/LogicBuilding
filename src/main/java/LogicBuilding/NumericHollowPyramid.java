package main.java.LogicBuilding;

public class NumericHollowPyramid {
    public static void main(String[] args) {
        int totalNumberOfRows = 5;

        for (int row = 1; row <= totalNumberOfRows; row++) {
            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row || row == totalNumberOfRows) {
                    System.out.print(col);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

