package com.quick

fun main(args: Array<String>) {     //main方法可以在最外層
    //val secretNumber = SecretNumber(10)

    val h = Human(weight = 66.5f, height = 1.7f)              //建構物件的方法，叫做建構子
    h.hello()
    print(h.bmi())
    /*val age = 19 //自動推斷資料型態為Int(val age : Int = 19), val為常數 不能再給別的值
    var age1 =20 //var為變數值，可以改變
    var name :String //用冒號來指定資料型態, 只定義不給值的話必須設定資料型態
    name = "Jack"
    var weight : Float = 66.5f*/
//    val p = Person()
//    p.hello()
//    println("Hello Kotlin")

}

class Human(var name: String = "", var weight: Float, var height: Float) {         //主要、次要建構子，只要在類別名後加括號就是, constructor可省略
    init {
        println("init $weight / $height")
    }
//    constructor(name:String, weight: Float, height: Float) :this(weight, height) //用這個來寫第二個建構子，次要建構子不能寫var val, 有用到主建構子的屬性就要用this
    fun bmi(): Float {
        val bmi = weight / (height * height)
        return bmi
    }

    fun hello() {
        println("Hello Kotlin")
    }
}