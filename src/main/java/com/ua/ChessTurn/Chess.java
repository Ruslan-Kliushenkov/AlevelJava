package com.ua.ChessTurn;


import java.util.Scanner;

import static com.ua.ChessTurn.Convertor.getIndex;
import static com.ua.ChessTurn.Knight.checkCondition;

public class Chess {
    static final String[] chessBoardNum = {"1", "2", "3", "4", "5", "6", "7", "8"};
    static final String[] chessBoardLet = {"a", "b", "c", "d", "e", "f", "g", "h"};


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Позиция 1, формата А 1");
        String[] firstPosition = scan.nextLine().toLowerCase().split(" ");
        if(!checkForCorrect(firstPosition)){
            out();
        }
        int[] indexOfFirst = getIndex(firstPosition);
        System.out.println("Позиция 2, формата А 1");
        String[] secondPosition = scan.nextLine().toLowerCase().split(" ");
        if(!checkForCorrect(secondPosition)){
            out();
        }
        int[] indexOfSecond = getIndex(secondPosition);
        System.out.println(checkCondition(indexOfFirst,indexOfSecond));
    }

    public static boolean checkForCorrect(String[] position) {
        boolean matchLet = false;
        boolean matchNum = false;
        for (String s : chessBoardLet) {
            if (position[0].equals(s)) {
                matchLet = true;
                break;
            }
        }
        for (String s : chessBoardNum) {
            if (position[1].equals(s)) {
                matchNum = true;
                break;
            }
        }
        return matchLet && matchNum;
    }

    public Chess() {
    }

    public Chess(Convertor convertor){
    }

    private static void out(){
        System.out.println("Некоректный ввод");
        System.exit(-1);
    }
}
