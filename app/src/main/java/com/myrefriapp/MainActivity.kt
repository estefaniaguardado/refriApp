package com.myrefriapp

import Adapter.ListRowAdapter
import Model.Product
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val listProducts: ArrayList<Product> = ArrayList()

        for (i in 1..10){
            val product: Product = Product("Product " + i, "Detail")
            listProducts.add(product)
        }

        val listRowAdapter: ListRowAdapter = ListRowAdapter(this, listProducts)

        recyclerView.adapter = listRowAdapter
    }
}
