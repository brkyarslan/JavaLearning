package com.berkayarslan.javalearning;

public class Variables {

    public static void main(String[] args){
        //Variables - Değişkenler
        //Integer(32bit) - Long(64bit) - Tamsayı
        //Float(32bit) - Double(64bit) - Kesirli sayı
        int age = 20;

        System.out.println(10*age);
        System.out.println(age/5);

        //float tanımlarken sondaki f'e dikkat et! Bu şekilde OLMALI!
        float x = 5.0f;
        int y = 11;

        System.out.println(y/x);

        //Dairenin çevresini hesaplama.
        double pi = 3.14;
        int r = 5;

        System.out.println("Dairenin çevresi = "+2*pi*r);

        //String - Metin
        String name = "Berkay";
        String surname = "ARSLAN.";

        System.out.println(name+" "+surname);

        //Boolean - Doğru ya da Yanlış işlemlerinde kullanıyoruz.
        boolean isAlive = true;
        isAlive = false;

        System.out.println(isAlive);

        //Final - Değişkenin önüne yazarsak içindeki veri sabitlenir...
        //final int myInteger = 5;  GÖRÜLDÜĞÜ GİBİ YAPILDIĞINDA AŞAĞIDA 2 DEĞERİ HATA VERİR!
        int myInteger = 5;
        System.out.println("myInteger="+myInteger);

        myInteger = 2;
        System.out.println("myInteger="+myInteger);


    }


}
