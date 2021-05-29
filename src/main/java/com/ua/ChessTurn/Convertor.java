package com.ua.ChessTurn;

public class Convertor extends Chess {
    public static int[] getIndex(String[] array){
        int[] index = new int[2];
        for (int i = 0; i < chessBoardLet.length; i++) {
            if (chessBoardLet[i].equals(array[0])){
                index[0] = i;
            }
        }
        index[1] = Integer.parseInt(array[1]) - 1;
        return index;
    }
}
