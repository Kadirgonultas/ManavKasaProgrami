package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double  armut;
        double elma;
        double domates;
        double muz;
        double patlican;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ? ; ");
        armut = input.nextDouble();

        System.out.println("Elma Kaç Kilo ? : ");
        elma = input.nextDouble();

        System.out.println("Domates Kaç Kilo ? : ");
        domates = input.nextDouble();

        System.out.println("Muz Kaç Kilo ? : ");
        muz = input.nextDouble();

        System.out.println("Patlıcan Kaç Kilo ? : ");
        patlican = input.nextDouble();

        double armutKgFiyati = 2.14;
        double elmaKgFiyati = 3.67;
        double domatesKgFiyati = 1.11;
        double muzKgFiyati =  0.95;
        double patlicanKgFiyati = 5.00;

        double armutToplam = armut * armutKgFiyati;
        double elmaToplam = elma * elmaKgFiyati;
        double domatesToplam = domates * domatesKgFiyati;
        double muzToplam = muz * muzKgFiyati;
        double patlicanToplam = patlican * patlicanKgFiyati;

        double toplamTutar = armutToplam + elmaToplam + domatesToplam + muzToplam + patlicanToplam;

        System.out.println("Toplam Tutar : ");

        System.out.println(toplamTutar);








    }
}
