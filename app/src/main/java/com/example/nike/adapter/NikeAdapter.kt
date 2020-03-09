package com.example.nike.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.nike.R
import com.example.nike.model.Nike
import kotlinx.android.synthetic.main.nike_item.view.*

class NikeAdapter(var nikeList:ArrayList<Nike>): RecyclerView.Adapter<NikeAdapter.NikeViewHolder>(){
    inner class NikeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindNike(nike:Nike){
            itemView.itemImage.setImageResource(nike.image)
            itemView.itemNo.text = nike.itemNo
            itemView.itemName.text = nike.itemName
            itemView.itemModel.text = nike.itemModel
            itemView.price.text = nike.price.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NikeViewHolder {
        return NikeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.nike_item,parent,false))
    }

    override fun getItemCount(): Int {
        return nikeList.size
    }

    override fun onBindViewHolder(holder: NikeViewHolder, position: Int) {
       holder.bindNike(nikeList[position] )
    }
}