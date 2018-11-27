package com.quick;

public class Person {   //如果一個類別沒有繼承任何類別，都預設繼承object類別
    String name;
    float weight;
    float heihgt;
    public Person(float weight, float heihgt){    //如果都沒有寫任何建構子，java會送你一個空的(無參數)建構子
            this.weight = weight;
            this.heihgt = heihgt;
        //初始化的屬性寫在第一個建構子
    }
    public Person(String name, float weight, float heihgt) {
        this(weight, heihgt);
        this.name = name;
    }

    public float bmi() {
        float bmi =  weight / (heihgt * heihgt);    //變數用在方法內，它就不是屬性了
        return bmi;                                 //區域變數在用完之後就不用了
    }


    public void hello() {
        System.out.println("HELLO JAVA");
    }
}
