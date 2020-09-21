package com.example.mycalc

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun OneFun(view: View) {
        val countString = textResult.text.toString()
        var countString2: String = countString
        countString2 = countString2.first().toString()
        var number: Int = countString2.toInt()
        var count: String
        if (number == 0) {
            count = "1"
        } else {
        count =  countString + "1" }
        textResult.text = count
    }

    fun TwoFun(view: View) {
        val countString = textResult.text.toString()
        var count: String
        var countString2: String = countString
        countString2 = countString2.first().toString()
        var number: Int = countString2.toInt()
        if (number == 0) {
            count = "2"
        } else {
            count =  countString + "2" }
        textResult.text = count
    }

    fun ThreeFun(view: View) {
        val countString = textResult.text.toString()
        var countString2: String = countString
        countString2 = countString2.first().toString()
        var number: Int = countString2.toInt()
        var count: String
        if (number == 0) {
            count = "3"
        } else {
            count =  countString + "3" }
        textResult.text = count
    }

    fun FourFun(view: View) {
        val countString = textResult.text.toString()
        var countString2: String = countString
        countString2 = countString2.first().toString()
        var number: Int = countString2.toInt()
        var count: String
        if (number == 0) {
            count = "4"
        } else {
            count =  countString + "4" }
        textResult.text = count
    }

    fun FiveFun(view: View) {
        val countString = textResult.text.toString()
        var countString2: String = countString
        countString2 = countString2.first().toString()
        var number: Int = countString2.toInt()
        var count: String
        if (number == 0) {
            count = "5"
        } else {
            count =  countString + "5" }
        textResult.text = count
    }

    fun SixFun(view: View) {
        val countString = textResult.text.toString()
        var countString2: String = countString
        countString2 = countString2.first().toString()
        var number: Int = countString2.toInt()
        var count: String
        if (number == 0) {
            count = "6"
        } else {
            count =  countString + "6" }
        textResult.text = count
    }

    fun SevenFun(view: View) {
        val countString = textResult.text.toString()
        var countString2: String = countString
        countString2 = countString2.first().toString()
        var number: Int = countString2.toInt()
        var count: String
        if (number == 0) {
            count = "7"
        } else {
            count =  countString + "7" }
        textResult.text = count
    }

    fun EightFun(view: View) {
        val countString = textResult.text.toString()
        var countString2: String = countString
        countString2 = countString2.first().toString()
        var number: Int = countString2.toInt()
        var count: String
        if (number == 0) {
            count = "8"
        } else {
            count =  countString + "8" }
        textResult.text = count
    }

    fun NineFun(view: View) {
        val countString = textResult.text.toString()
        var countString2: String = countString
        countString2 = countString2.first().toString()
        var number: Int = countString2.toInt()
        var count: String
        if (number == 0) {
            count = "9"
        } else {
            count =  countString + "9" }
        textResult.text = count
    }

    fun ZeroFun(view: View) {
        val countString = textResult.text.toString()
        var countString2: String = countString
        countString2 = countString2.first().toString()
        var number: Int = countString2.toInt()
        var count: String
        if (number == 0) {
            count = "0"
        } else {
            count =  countString + "0" }
        textResult.text = count
    }

    fun ClearFun(view: View) {
        val countString = textResult.text.toString()
        textResult.text = "0"
    }

    fun PlusFun(view: View) {
        val countString = textResult.text.toString()
        var count: String = countString + "+"
        textResult.text = count
    }

    fun MinusFun(view: View) {
        val countString = textResult.text.toString()
        var count: String = countString + "-"
        textResult.text = count
    }

    fun DivideFun(view: View) {
        val countString = textResult.text.toString()
        var count: String = countString + "/"
        textResult.text = count
    }

    fun MultiplyFun(view: View) {
        val countString = textResult.text.toString()
        var count: String = countString + "*"
        textResult.text = count
    }

    fun EqualFun(view: View) {
        val countString = textResult.text.toString()
        val s: List<String>
        val result: Int
        if (countString.toString().contains("+")) {
            s = countString.split("+")
            result = s[0].toInt() + s[1].toInt()
        } else if (countString.toString().contains("-")) {
            s = countString.split("-")
            result = s[0].toInt() - s[1].toInt()
        } else if (countString.toString().contains("*")) {
            s = countString.split("*")
            result = s[0].toInt() * s[1].toInt()
        } else {
            s = countString.split("/")
            result = s[0].toInt() / s[1].toInt()
        }

        textResult.text = result.toString()
    }
}