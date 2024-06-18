package org.example;

import java.util.Random;

public class Game {
    Random random = new Random();

    public int gameStart(int quantity){
        int count = 0;
        for (int i = 0; i < quantity; i++) {
            int randomAnswer = random.nextInt(1, 4);

            int prize = 1;

            if(randomAnswer == prize){
                count++;
            }else {
                randomAnswer = random.nextInt(1, 3);
                if(randomAnswer == prize){
                    count++;
                }
            }
        }
        return count;
    }
}
