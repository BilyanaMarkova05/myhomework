package com.company;

import java.util.Scanner;

public class NumFrom0To1000 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int dijitA = n / 1000;
        int digitB = (n / 100) % 10;
        int digitC = (n / 10) % 10;
        int digitD = n % 10;

        if (dijitA == 1) {
            System.out.print("Хиляда");
        }
        switch (digitB) {
            case 1:
                System.out.print("сто");break;
            case 2:
                System.out.print("двеста");break;
            case 3:
                System.out.print("триста");break;
            case 4:
                System.out.print("четиристотин");break;
            case 5:
                System.out.print("петстотин");break;
            case 6:
                System.out.print("шестотин");break;
            case 7:
                System.out.print("седемстотин");break;
            case 8:
                System.out.print("осемстотин");break;
            case 9:
                System.out.print("деветстотин");break;
        }
        if (digitC == 1 && digitD == 0) {
            System.out.print(" и десет");
        } else if (digitC == 1 && digitD == 1) {
            System.out.print(" и единайсет");
        } else if (digitC == 1 && digitD == 2) {
            System.out.print(" и дванайсет");
        } else if (digitC == 1 && digitD == 3) {
            System.out.print(" и тринайсет");
        } else if (digitC == 1 && digitD == 4) {
            System.out.print(" и четиринайсет");
        } else if (digitC == 1 && digitD == 5) {
            System.out.print(" и петнайсет");
        } else if (digitC == 1 && digitD == 6) {
            System.out.print(" и шестнаисет");
        } else if (digitC == 1 && digitD == 7) {
            System.out.print(" и седемнайсет");
        } else if (digitC == 1 && digitD == 8) {
            System.out.print(" и осемнайсет");
        } else if (digitC == 1 && digitD == 9) {
            System.out.print(" и деветнайсет");
        } else if (digitC == 2 && digitD == 0) {
            System.out.print(" и двайсет");
        }
        if (digitC == 2){
            System.out.print(" двадесет");
        }else if (digitC == 3){
            System.out.print(" тридесет");
        }else if (digitC == 4){
            System.out.print(" четиресет");
        }else if (digitC == 5){
            System.out.print(" педесет");
        }else if (digitC == 6){
            System.out.print(" шейсет");
        }else if (digitC == 7){
            System.out.print(" седемдесет");
        }else if (digitC == 8){
            System.out.print(" осемдесет");
        }else if (digitC == 9){
            System.out.print(" деведесет");
        }
        if (digitD == 1){
            System.out.print(" и едно");
        }else if (digitD == 2){
            System.out.print(" и две");
        }else if (digitD == 3){
            System.out.print(" и три");
        }else if (digitD == 4){
            System.out.print(" и четири");
        }else if (digitD == 5){
            System.out.print(" и пет");
        }else if (digitD == 6){
            System.out.print(" и шест");
        }else if (digitD == 7){
            System.out.print(" и седем");
        }else if (digitD == 8){
            System.out.print(" и осем");
        }else if (digitD == 9){
            System.out.print(" и девет");
        }
    }
}