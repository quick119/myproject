package com.quick;

import java.util.Random;

public class Deck {
    char[] types = {'\u2663', '\u2666', '\u2665', '\u2660'};
    String[] points = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    int[] cards = new int[52];

    public Deck() {
        init();
//        print();
    }

    public void shuffle() {
        //洗牌：1 2 3…每次和任一亂數交換
        for (int i = 0; i < 52; i++) {
            int r = new Random().nextInt(52);
            int tmp = cards[i];
            cards[i] = cards[r];
            cards[r] = tmp;

        }
    }

    public void print() {
        for (int i=0; i<52; i++) {
            int card = cards[i];
            int p = card%13;
            System.out.print(points[p]);
            System.out.print(types[card/13] + " ");
            if (card%13 == 12)
                System.out.println();
        }
    }

    void init() {
        for (int i = 0; i < 52; i++) {
            cards[i] = i;
        }
    }
}
