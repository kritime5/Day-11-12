package com.bridge.deck;

import java.util.Random;

public class DeckOfCards {
    private Card[] deck;
    private static int currentCard;
    private static final int NUMBER_OF_CARDS=52;
    private static final Random randomNumbers=new Random();

    public DeckOfCards(){
        String faces[]={"ace","Duece","3","4","5","6","7","8","9","10","jack","queen","king"};
        String suits[]={"Hearts","diamonds","clubs","spades"};
        deck=new Card[NUMBER_OF_CARDS];

        for(int count=0;count<deck.length;count++){
            deck[count]=new Card(faces[count%13],suits[count/13]);

        }
    }
    public void shuffle(){
        currentCard=0;
        for(int first=0;first<deck.length;first++){
            int second= randomNumbers.nextInt(NUMBER_OF_CARDS);

            Card temp=deck[first];
            deck[first]=deck[second];
            deck[second]=temp;
        }
    }
    public Card dealCard(){
        if(currentCard<deck.length){
            return deck[currentCard++];
        }
        else{
            return null;
        }
    }

}
