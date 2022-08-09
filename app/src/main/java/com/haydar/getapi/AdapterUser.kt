package com.haydar.getapi

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.haydar.getapi.data.User
import com.haydar.getapi.data.UserItem
import com.haydar.getapi.databinding.ItemUserBinding

class AdapterUser :RecyclerView.Adapter<AdapterUser.UserViewHolder>() {

    private val lisUser = ArrayList<UserItem>()

    class UserViewHolder(val itemUser: ItemUserBinding): RecyclerView.ViewHolder(itemUser.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = UserViewHolder(
        ItemUserBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    )

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.itemUser.apply {
            with(lisUser[position]){
                textView.text = login
                Glide.with(imageView.context).load(avatarUrl).into(imageView)
            }
        }
    }

    override fun getItemCount() = lisUser.size

    fun setUser(user: ArrayList<UserItem>){
        this.lisUser.clear()
        this.lisUser.addAll(user)
    }

}