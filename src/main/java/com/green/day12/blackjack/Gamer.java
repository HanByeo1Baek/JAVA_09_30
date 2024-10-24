package com.green.day12.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    //Card객체 주소값 여러개 저장할 수 있어야 합니다.
    //ArrayList 사용할거임
    //멤버필드 선언, 변수명은 cards
    private final List<Card> cards;
    private int point;

    public Gamer(){
        cards = new ArrayList();
    }

    public void receiveCard(Card c){
        //switch expression
        int point = switch(c.getDenomination()){
            case "A" -> 1;
            case "J", "Q", "K" -> 10;
            default -> Integer.parseInt(c.getDenomination());
        };

        this.point += point;

        String str = "10";
        int val = Integer.parseInt(str); // val 변수에 10 정수값이 주입된다.
        cards.add(c);
    }

    public void showYourCards(){
        for(Card item : cards){
            System.out.println(item);
        }
    }

    public List<Card> openCards() {
        return cards;
    }


}
