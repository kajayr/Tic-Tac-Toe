package com.company;

import java.util.ArrayList;

public class Board {
    public void showBoard(ArrayList<String> b){
        System.out.println("" +
                "  "+b.get(0)+" |  "+b.get(1)+"  | "+b.get(2)+"\n" +
                "--------------\n" +
                "  "+b.get(3)+" |  "+b.get(4)+"  | "+b.get(5)+"\n" +
                "--------------\n" +
                "  "+b.get(6)+" |  "+b.get(7)+"  | "+b.get(8)+"");
    }
}
