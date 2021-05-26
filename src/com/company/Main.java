package com.company;

import java.util.*;

public class Main {
public static ArrayList<String> getData(ArrayList<String> b){
    return b;
}
    public static void main(String[] args) {
        Win win = new Win();
        Board board = new Board();
	Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println("Do you want to be X or O?");
        String c = "O";
        int count = 1;
        String p = "";
        try{
            p = scanner.next();
            if(p.length() > 1){
                throw new Exception();
            }
            if(p.equals("O")){
                c = "X";
            }
            System.out.println("You have chose " + p + " let's start the game. Computer starts first");
        }catch (Exception e){
            System.out.println("Warning: You should only choose a single character");
        }
        ArrayList<String> b = new ArrayList<>(9);
        for(int i = 0; i < 10; i++){
            b.add("");
        }
        b.remove(0);
        b.add(0, c);
        board.showBoard(b);
        Main.getData(b);
while(count < 10){
    int num = 0;
    if(count % 2 != 0){
        System.out.println("choose a number between 1 - 9");
        try{
            num = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Warning: The input should be a number");
        }

        b.set(num, p);
    }
    if(count % 2 == 0){
        int randomNum = (int) Math.round(Math.random() * 8 + 1);
        for(int i = 1; i < b.size(); i++){
            if(b.get(randomNum).equals("") && randomNum != num){
                b.set(randomNum, c);
                break;
            }else{
                randomNum = (int) Math.round(Math.random() * 8 + 1);
            }
        }
    }
    board.showBoard(b);
    count++;
win.result(b, c, p);
if(count == 9){
    System.out.println("The game is tie!");
}
if(win.isOver){
    System.out.println("Game is over!");
    break;
}}}}
