package com.librari.librari;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class rvAdapter extends RecyclerView.Adapter<rvAdapter.viewHolder> {
    private Activity activity;
    private ArrayList<Data> arData;
    View view ;

    public rvAdapter(Activity activity, ArrayList<Data> arData) {
        this.activity = activity;
        this.arData = arData;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View v = inflater.inflate(R.layout.rv_cardview, parent, false);
        viewHolder holder = new viewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.bookName.setText(arData.get(position).getBookName());
        holder.bookAuthor.setText(arData.get(position).getBookAuthor());
        holder.bookImage.setImageResource(arData.get(position).getPicture());

    }

    @Override
    public int getItemCount() {
        return arData.size();
    }



    public class viewHolder extends RecyclerView.ViewHolder {
        TextView bookName , bookAuthor;
        ImageView bookImage;
        CardView cardView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            bookName=itemView.findViewById(R.id.bookName);
            bookAuthor=itemView.findViewById(R.id.bookAuthor);
            cardView = itemView.findViewById(R.id.card);
            bookImage = itemView.findViewById(R.id.imv);

        }
    }
}