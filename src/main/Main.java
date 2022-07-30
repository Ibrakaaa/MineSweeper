package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Oyun alaninin uzunlugunu giriniz: ");
        int rowCount=input.nextInt();
        System.out.print("Oyun alaninin genisligini giriniz: ");
        int colCount=input.nextInt();
        System.out.println("=====================================");

        MineSweeper mineSweeper=new MineSweeper(rowCount,colCount);
        mineSweeper.run();
    }
}