package com.ua.ChessTurn;

public class Knight extends Chess {
    String[] position;

    public Knight(String[] position) {
        this.position = position;
    }

    public Knight() {

    }

    public static boolean checkCondition(int[] firstPosition, int[] secondPosition){
        boolean condition = false;
        if (((firstPosition[0] == secondPosition[0] + 2 || firstPosition[0] == secondPosition[0] - 2) && (firstPosition[1] == secondPosition[1] + 1 || firstPosition[1] == secondPosition[1] - 1))) {
            condition = true;
        } else if ((firstPosition[0] == secondPosition[0] - 1 || firstPosition[0] == secondPosition[0] + 1) && (firstPosition[1] == secondPosition[1] + 2 || firstPosition[1] == secondPosition[1] - 2)) {

            condition = true;
        }

        return condition;
    }
}
