package com.berkayarslan.javalearning;

public class Loops {

    public static void main(String[] args){
        //Loops - Döngüler
        //for loop
        /*
        int i,k;
        k = 5;

        for(i=1;i<=k;i++){
            System.out.println(i);
        }
        */

        int[] myNumbers = {12,15,18,21,24};

        for (int i=0; i < myNumbers.length; i++){

            int x = myNumbers[i] / 3 * 5;
            System.out.println(x);

        }

        for (int number : myNumbers){ //myNumbers dizisindeki elemanları sıra sıra number değişkenine at.

            System.out.println(number / 3 * 5);

        }

        //While Loop

        int j = 0;

        while (j<10){

            System.out.println(j);
            j++;

        }




    }



}
