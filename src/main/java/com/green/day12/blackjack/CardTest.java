package com.green.day12.blackjack;

import java.util.List;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        System.out.println("-----------------------");
        Card c = cd.draw();
        System.out.println(c);
        Card c2 = cd.draw();
        System.out.println(c2);
        System.out.println("-----------------------");
        cd.checkCard();
    }
}

class CardTest2{
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Card c1 = cd.draw();
        Gamer gamer = new Gamer();
        gamer.receiveCard(c1);// 카드를 저장한다.
        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());

        gamer.showYourCards();

        System.out.println(gamer.getPoint());

        List<Card> list = gamer.openCards();
        System.out.println(list);
    }
}

class cardsTest3{
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.showYourCards();
        System.out.println(dealer.getPoint());
        dealer.needMoreCard(cd);
        System.out.println(dealer.getPoint());
        dealer.showYourCards();



    }
}

class cardTest4{
    public static void main(String[] args) {
        CardDeck gcd = new CardDeck();
        CardDeck dcd = new CardDeck();

        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();

        gamer.receiveCard(gcd.draw());
        gamer.receiveCard(gcd.draw());

        dealer.receiveCard(dcd.draw());
        dealer.receiveCard(dcd.draw());

        gamer.showYourCards();
        System.out.println("gamer : " + gamer.getPoint());
        dealer.showYourCards();
        System.out.println("dealer : " + dealer.getPoint());
        dealer.needMoreCard(gcd);
        System.out.println("dealer : " + dealer.getPoint());
        Rule rule = new Rule();
        rule.getWinner(dealer, gamer);
    }
}