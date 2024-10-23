package com.green.day12.blackjack;


public class CardDeck {
    //Card 객체 주소값 52개를 저장할 수 있어햐 한다.
    private final Card[] cards;
    private final String[] patterns;
    private int selectedIdx = 0; // 외부에 줘야할 카드의 index값

    public CardDeck(){
        cards = new Card[52];
        patterns = new String[] {"Diamond", "Heart", "Clover", "Spade"};

        //미션1
        //"", "" 값을 가지고 있는 Card객체를 52개 만들어 주시고
        // cards배열에 하나씩 넣어주세요.

        //미션2
        //모두 다른값을 가지고 있는 Card객체 만들어서 cards에 순차적으로 넣어주세요.
        int idx = 0;
        for(int i=0; i< patterns.length; i++){
            for(int k=1; k<=13; k++){
                    cards[idx++] = new Card(patterns[i], getDenomination(k));

            }
        }

        //섞어주세요.

        for(int i=0; i<cards.length; i++){
            int rIdx = (int)(Math.random()* cards.length);
            Card temp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx] = temp;
        }

        //enhanced-for문으로 card 객체 주소값 출력
//        for(Card item : cards){
//            System.out.println(item);
//        }
    }

    public void checkCard(){
        for(Card item : cards){
            System.out.println(item);
        }
    }
    public String getDenomination(int n){
//        if(n>0 && n<14){
//            switch(n){
//                case 1: return "A";
//                case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
//                    return String.valueOf(n);
//                case 11: return "J";
//                case 12: return "Q";
//                case 13: return "K";
//            }
//        }
        if(n<1 || n>13){
            return "";
        }
        switch(n){
            case 1: return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            default: return String.valueOf(n);
        }
//        return "";
    }
    private void shuffle(){
        for(int i=0; i<cards.length; i++){
            int rIdx = (int)(Math.random()* cards.length);
            Card temp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx] = temp;
        }
    }
    public Card draw(){
        Card c = cards[selectedIdx];
        cards[selectedIdx] = null;
        selectedIdx++;
        return c;
    }
}
