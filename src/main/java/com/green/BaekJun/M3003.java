package com.green.BaekJun;
import java.util.Scanner;
public class M3003 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 4;
        int pawn = 8;
        king = king - s.nextInt();
        queen = queen - s.nextInt();
        rook = rook - s.nextInt();
        bishop = bishop - s.nextInt();
        knight = knight - s.nextInt();
        pawn = pawn - s.nextInt();
        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(rook + " ");
        System.out.print(bishop + " ");
        System.out.print(knight + " ");
        System.out.print(pawn);
    }
}
