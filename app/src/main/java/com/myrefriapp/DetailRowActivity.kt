package com.myrefriapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailRowActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_row)

        val extras: Bundle = intent.extras
        if (!extras.isEmpty){
            val productName: TextView = findViewById(R.id.productName)
            productName.setText(extras.getString("name"))
            val productDetail: TextView = findViewById(R.id.productDetail)
            productDetail.setText(extras.getString("detail"))
        }
    }
}
