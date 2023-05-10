package com.example.imdbtop100.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.imdbtop100.R
import com.example.imdbtop100.model.MoviesResponseEntity

 class Adapter ( private val responseList :ArrayList<MoviesResponseEntity>) : RecyclerView.Adapter<Adapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Inflate the layout for each item and return a new ViewHolder object
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_items, parent, false)
        return MyViewHolder(itemView)
    }

    fun update(list: ArrayList<MoviesResponseEntity>) {
        responseList.clear()
        responseList.addAll(list)
        this.notifyDataSetChanged()
    }

    // This method returns the total
    // number of items in the data set
    override fun getItemCount(): Int {
        return responseList.size
    }

    // This method binds the data to the ViewHolder object
    // for each item in the RecyclerView
    override fun onBindViewHolder(holder: MyViewHolder, position : Int) {
        val movieList = responseList[position]
        holder.movieName.text = movieList.title
        holder.movieRating.text = movieList.rating

    }

    // This class defines the ViewHolder object for each item in the RecyclerView
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val movieName: TextView = itemView.findViewById(R.id.movie_name)
        val movieRating: TextView = itemView.findViewById(R.id.movie_rating)
    }
}