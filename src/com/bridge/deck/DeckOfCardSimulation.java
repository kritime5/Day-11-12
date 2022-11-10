package com.bridge.deck;

public class DeckOfCardSimulation {
    public static void main(String[] args) {
        DeckOfCards deckOfCards=new DeckOfCards();
        for(int i=0;i<52;i++){
            System.out.println(deckOfCards.dealCard());
        }

    }
}
