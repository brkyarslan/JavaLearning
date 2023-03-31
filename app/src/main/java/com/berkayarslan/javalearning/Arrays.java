package com.berkayarslan.javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {

    public static void main(String[] args){

        //Arrays - Diziler
        String[] myStringArray = new String[4];

        myStringArray[0] = "Tobey";
        myStringArray[1] = "Andrew";
        myStringArray[2] = "Tom";
        myStringArray[3] = "Rob";

        System.out.println(myStringArray[1]);

        int[] myIntegerArray = new int[4]; //İşte burayı 4 yaptık... (Önce aşağıyı oku.)
        myIntegerArray[0] = 46;
        myIntegerArray[1] = 38;
        myIntegerArray[2] = 25;
        myIntegerArray[3] = 80; //Burası HATA verir çünkü diziyi 3 elemanlı tanımladık. 4 yapalım ki hata vermesin.

        System.out.println(myIntegerArray[1]);

        //Another way;

        int[] myNumberArray = {1,2,3,4,5,6,7,8};
        System.out.println(myNumberArray[2]);

        System.out.println("myNumberArray dizisinin eleman sayısı: " + myNumberArray.length);

        //Lists - Listeler

        ArrayList<String> myMusicians = new ArrayList<String>();

        myMusicians.add("James");
        myMusicians.add("Lars");
        myMusicians.add(1,"Kirk");  //Kirk'ü Lars'ın yerine attı, Lars'ı da bir sonraki indexe koydu.
        myMusicians.add("Rob");
        myMusicians.add(0,"Berkay");

        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(3));

        //HashSet - Aynı elemanı 1 kez kabul ediyor.

        HashSet<String> mySet = new HashSet<String>();

        mySet.add("Jamie");
        mySet.add("Jamie");

        System.out.println(mySet.size()); //Eleman sayısını 1 verdi.

        //HashMap - Anahtar kelime belirleyerek onun değerini alabiliyoruz...

        HashMap<String, String> myMap = new HashMap<String, String>();

        myMap.put("name","Lionel Messi");
        myMap.put("team","PSG");

        System.out.println(myMap);
        System.out.println(myMap.get("name"));
        System.out.println(myMap.get("team"));


        HashMap<String, Integer> mySecondMap = new HashMap<String, Integer>();

        mySecondMap.put("age", 34);
        mySecondMap.put("height",169);

        System.out.println(myMap.get("name")+" "+mySecondMap.get("age")+" "+mySecondMap.get("height"));


    }


}
