package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Computer[] computers = new Computer[]{  //массив экземпляров класса, но можно использовать и 1
                new Computer("Lenovo"), new Computer("MacBook")
        };

        //Выведем параметры монитора (абстрактный класс):
        Monitor monitor = new Monitor(13, 25);
        monitor.getParameters();
        System.out.println("Диагональ монитора = " + monitor.result() + "\n");


        for (Computer computer : computers){  //перебираем, и по умолчанию компы включены
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
