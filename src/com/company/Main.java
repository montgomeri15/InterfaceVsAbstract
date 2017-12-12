package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Computer[] computers = new Computer[]{
                new Computer("Lenovo"), new Computer("MacBook")
        };

        for (Computer computer : computers){
            computer.turnOn();
        }

        System.out.println("Выключить компьютеры? Y/N");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        if (s.equalsIgnoreCase("Y")){
            System.out.println("Выключаем компьютеры.");
            for (Computer computer : computers){
                computer.turnOff();
            }

        } else if (s.equalsIgnoreCase("N")){
            System.out.println("Компьютеры продолжают работать.");
        } else {
            System.out.println("Такой команды нет.");
        }
    }
}
