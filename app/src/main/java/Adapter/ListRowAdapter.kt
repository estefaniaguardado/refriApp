package Adapter

import Model.Product
import android.R.attr.*
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.myrefriapp.R
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text


class ListRowAdapter (val context: Context, val listProducts: List<Product>) : RecyclerView.Adapter<ListRowAdapter.ViewHolder>() {

    class ViewHolder(view: View, ctx: Context, products: ArrayList<Product>): RecyclerView.ViewHolder(view){
        val name: TextView = view.findViewById<View>(R.id.name) as TextView
        val detail: TextView = view.findViewById<View>(R.id.detail) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_row, parent, false)
        return ViewHolder(view, context, listProducts as ArrayList<Product>)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var product: Product = listProducts.get(position)
        holder.name.setText(product.name)
        holder.detail.setText(product.detail)
    }

    override fun getItemCount(): Int {
        return listProducts.size
    }

}

