package com.example.testrecycleview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordViewHolder>{
    private final LayoutInflater mInflater;
    private LinkedList<Paper> mWordList;

    public WordListAdapter(Context context, LinkedList<Paper> mWordList) {
        this.mInflater = LayoutInflater.from(context);
        this.mWordList = mWordList;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.item_layout,parent,false);
        return new WordViewHolder(mItemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        holder.wordItemText.setText(mWordList.get(position).getWord());
        holder.descriptItemText.setText(mWordList.get(position).getDes());
        holder.CoverImg.setImageResource(mWordList.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }
}
