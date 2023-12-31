package com.hakanbaysal20.getirclone

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoryViewAdapter(private val mContext:Context,private val categoryList: List<Category>)
    :RecyclerView.Adapter<CategoryViewAdapter.CategoryViewBindingHolder>(){

    inner class CategoryViewBindingHolder(view:View):RecyclerView.ViewHolder(view){
        var categoryName: TextView
        var categoryImage : ImageView
        init {
            categoryName = view.findViewById(R.id.categoryName)
            categoryImage = view.findViewById(R.id.categoryImage)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewBindingHolder {
        val binding = LayoutInflater.from(mContext).inflate(R.layout.category_view,parent,false)
        return CategoryViewBindingHolder(binding)
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }

    override fun onBindViewHolder(holder: CategoryViewBindingHolder, position: Int) {
        val category = categoryList[position]
        holder.categoryName.text = category.categoryName
        holder.categoryImage.setImageResource(
            mContext.resources.getIdentifier(category.categoryImage,"drawable",mContext.packageName)
        )
    }
}