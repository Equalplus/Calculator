package com.example.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //入力画面でIntentに詰めた値を取り出す
        val price = intent.getIntExtra("price", 0)
        val discount = intent.getIntExtra("discount", 0)

        val expression = findViewById<TextView>(R.id.expression_label)
        expression.text = getString(R.string.expression, price, discount)

        //割引後の価格を計算
        val discountedPrice = price * (100 - discount) / 100

        val result = findViewById<TextView>(R.id.result_label)
        result.text = getString(R.string.result, discountedPrice)
    }
}
