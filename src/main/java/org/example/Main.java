package org.example;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("Выиграно игр " + game.gameStart(1000));
    }
}