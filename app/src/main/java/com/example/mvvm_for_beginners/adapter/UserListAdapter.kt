package com.example.mvvm_for_beginners.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvm_for_beginners.R
import com.example.mvvm_for_beginners.data.User
import kotlinx.android.synthetic.main.user_list_layout.view.*

class UserListAdapter(private val userList: List<User>) : RecyclerView.Adapter<UserListAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.user_list_layout,parent,false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.tv_name.text = userList[position].name
        holder.itemView.tv_email.text = userList[position].email
    }

    override fun getItemCount() = userList.size
}