package com.berkayarslan.javalearning;

public class Statements {

    public static void main(String[] args){
        //Statements - Operatörler
        int x, y;
        x = 5;
        System.out.println(x);
        x = x + 1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x = x * 5;
        System.out.println(x);

        y = 4;

        System.out.println(x>y); //Boolean verdi. Yani true/false'dan cevabı verdi.
        System.out.println(y>x);

        y = 30;

        System.out.println(x>y);

        System.out.println(x>=y);

        System.out.println(x==y);

        System.out.println(x!=y); //x eşit değil mi y'ye demek.

        // and && - ve
        // or || - veya

        x = 3;
        y = 4;
        int z = 5;

        System.out.println(x<y && y<z);

        // if statements - eğer

        if (x<y){
            System.out.println("X, Y'den küçüktür.");
        } else if (x==y){
            System.out.println("X ve Y eşittir.");
        } else {
            System.out.println("X, Y'den büyüktür.");
        }

        //Switch - Case

        int day = 1;
        String dayString;

        /*
        if (day == 1) {
            dayString = "Monday";
        }else if (day == 2) {
            dayString = "Tuesday";
        }else if (day == 3) {
            dayString = "Wednesday";
        }else {
            dayString = "Sunday";
        }
        */

        switch (day){

            case 1:dayString = "Monday";break;
            case 2:dayString = "Tuesday";break;
            case 3:dayString = "Wednesday";break;
            default:dayString = "Sunday";break;

        }

        System.out.println(dayString);





    }



}
