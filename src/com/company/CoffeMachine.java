package com.company;

import java.util.Scanner;

public class CoffeMachine {
    int water = 10;
    int coffee = 10;
    public  void MakeCoffe(int iAmericano){
        if(iAmericano >0){
            for (int i = 0; i < iAmericano; i++){
                Americano americano = MakeAmericano();
                if( americano != null)
                    System.out.println(i + "cup, Here your americano");
                else
                    System.out.println("Sorry can't make this cup.");
            }
        }

        System.out.println("Select your Coffee");
        System.out.println("1. Americano");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        if (input == "1"){
            Americano americano = MakeAmericano();
            if (americano != null)
                System.out.println("Here your americano");
            else
                System.out.println("Sorry can't make it.");
        }
    }
    public  Amaricano MakeAmericano(){
        //check recipe = americano offee 1 , water 2\
        if (coffee > 1 && water > 2){
            coffee -= 1;
            water -= 2;
            //creat americano object
            Amaricano amaricano = new Amaricano();
            //return americano object
            return amaricano;
        }else
            return null;

    }
}
