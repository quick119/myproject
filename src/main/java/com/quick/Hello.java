package com.quick;

public class Hello {
    public static void main(String[] args) {
        Person p = new Person(66.5f, 1.7f);//new出物件後，在記憶體中用 p 把物件存起來
        p.hello();              //之後就可以利用該物件去執行各項功能
        p.weight = 66.5f;       //呼叫這個類別身上的什麼方法或資料
        p.heihgt = 1.7f;
        System.out.println(p.bmi());
        /*int age = 19;
        Integer age2 = 33;  //包裝類別 Wrapper class
        char c = 'A';
        Character c2 = 'a';
        byte b = 120;
        float weight = 66.5f;   //Float
        double height = 1.7;    //Double
        boolean adult = false;  //Boolean
        boolean enroll = true;
        String name = "Hank";*/
    }
}
