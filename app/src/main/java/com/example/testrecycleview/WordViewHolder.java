package com.example.testrecycleview;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private final WordListAdapter wordAdapter;
    TextView wordItemText;
    TextView descriptItemText;
    ImageView CoverImg;
    public WordViewHolder(@NonNull View itemView, WordListAdapter wordAdapter) {
        super(itemView);
        wordItemText = itemView.findViewById(R.id.word);
        descriptItemText = itemView.findViewById(R.id.description);
        CoverImg = itemView.findViewById(R.id.imgView);
        this.wordAdapter = wordAdapter;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
    }
}
