package com.hakanbaysal20.getirclone

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class PageViewAdapter(private val mContext:Context,private val pageViewList:List<PageViewModel>)
    :RecyclerView.Adapter<PageViewAdapter.PageViewBindingHolder>(){


    inner class PageViewBindingHolder(view:View):RecyclerView.ViewHolder(view){
        var imageview: ImageView
        init {
            imageview = view.findViewById(R.id.pageViewImage)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PageViewBindingHolder {
        val binding = LayoutInflater.from(mContext).inflate(R.layout.page_view,parent,false)
        return PageViewBindingHolder(binding)
    }

    override fun getItemCount(): Int {
       return pageViewList.size
    }

    override fun onBindViewHolder(holder: PageViewBindingHolder, position: Int) {
        val model = pageViewList[position]
        holder.imageview.setImageResource(
            mContext.resources.getIdentifier(model.imagePath,"drawable",mContext.packageName)
        )
    }

}