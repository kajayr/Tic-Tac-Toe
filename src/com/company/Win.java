package com.company;

import java.util.ArrayList;

public class Win {
    boolean isOver = false;
    public Win(){

    }
    public void result(ArrayList<String> b, String c, String p){
        // X
        if(b.get(3).equals(p) && b.get(4).equals(p) && b.get(5).equals(p)){
            System.out.println("Human Won the game!");
            isOver = true;
        }else if(b.get(1).equals(p) && b.get(4).equals(p) && b.get(7).equals(p)){
            System.out.println("Human Won the game!");
            isOver = true;
        }else if(b.get(2).equals(p) && b.get(4).equals(p) && b.get(6).equals(p)){
            System.out.println("Human Won the game!");
            isOver = true;
        }else if(b.get(2).equals(p) && b.get(5).equals(p) && b.get(8).equals(p)){
            System.out.println("Human Won the game!");
            isOver = true;
            // O
        }else if(b.get(0).equals(c) && b.get(1).equals(c) && b.get(2).equals(c)){
            System.out.println("Computer Won the game!");
            isOver = true;
        }else if(b.get(3).equals(c) && b.get(4).equals(c) && b.get(5).equals(c)){
            System.out.println("Computer Won the game!");
            isOver = true;
        }else if(b.get(6).equals(c) && b.get(7).equals(c) && b.get(8).equals(c)){
            System.out.println("Computer Won the game!");
            isOver = true;
        }else if(b.get(0).equals(c) && b.get(3).equals(c) && b.get(6).equals(c)){
            System.out.println("Computer Won the game!");
            isOver = true;
        }else if(b.get(1).equals(c) && b.get(4).equals(c) && b.get(7).equals(c)){
            System.out.println("Computer Won the game!");
            isOver = true;
        }else if(b.get(2).equals(c) && b.get(5).equals(c) && b.get(8).equals(c)){
            System.out.println("Computer Won the game!");
            isOver = true;
        }else if(b.get(0).equals(c) && b.get(4).equals(c) && b.get(8).equals(c)){
            System.out.println("Computer Won the game!");
            isOver = true;
        }else if(b.get(2).equals(c) && b.get(4).equals(c) && b.get(6).equals(c)){
            System.out.println("Computer Won the game!");
            isOver = true;
        }
    }
}
