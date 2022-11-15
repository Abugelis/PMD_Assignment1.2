package com.example.pmd_assignment12;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyRvAdapter extends RecyclerView.Adapter<MyRvAdapter.ViewHolder> {

    private List<String> myText;
    private List<Integer> myImages;
    private LayoutInflater myInflater;

    public MyRvAdapter(Menu_screen context, List<String> myText, List<Integer> myImages){
        this.myText = myText;
        this.myImages = myImages;
        this.myInflater =LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public MyRvAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = myInflater.inflate(R.layout.rv_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRvAdapter.ViewHolder holder, int position) {
        holder.myTextView.setText(myText.get(position));
        holder.myImageView.setImageResource(myImages.get(position));

    }

    @Override
    public int getItemCount() {
        return myText.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView myTextView;
        ImageView myImageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            myTextView = itemView.findViewById(R.id.rv_text_view);
            myImageView = itemView.findViewById(R.id.rv_image_view);
        }
    }
}
