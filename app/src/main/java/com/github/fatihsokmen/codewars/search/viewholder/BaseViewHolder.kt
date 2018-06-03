package com.github.fatihsokmen.codewars.search.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View

import com.github.fatihsokmen.codewars.data.UserDomain

abstract class BaseViewHolder constructor(itemView: View)
    : RecyclerView.ViewHolder(itemView) {

    abstract fun bind(user: UserDomain)
}