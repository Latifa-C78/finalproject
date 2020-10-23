package com.example.flower;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.ArrayList;


public class adapterp extends RecyclerView.Adapter {
    private ArrayList<Platingc> parray;
    ArrayList<Platingc> Au;
    Context context;
    public adapterp(ArrayList<Platingc> parray, Context context) {
        this.parray = parray;
        this.context = context;

    }

    public void adapterp() {
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.plantt,parent,false);
        ViewHolder vh=new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder)holder).img.setImageResource(parray.get(position).getImage());
        ((ViewHolder)holder).n1.setText(parray.get(position).getN1());
        ((ViewHolder)holder).i.setText(parray.get(position).getI()+"");

    }




    @Override
    public int getItemCount() {
        return parray.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView img;
        public TextView n1;
        public TextView i;
        public View view;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            img = itemView.findViewById(R.id.imageView4);
            n1 = itemView.findViewById(R.id.textView13);
            i = itemView.findViewById(R.id.textView14);

        }
    }
}

