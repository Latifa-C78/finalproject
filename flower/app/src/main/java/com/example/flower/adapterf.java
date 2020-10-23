package com.example.flower;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class adapterf extends RecyclerView.Adapter {
         ArrayList<flower1class> parray;
        Context context;
        public adapterf(ArrayList<flower1class> parray, Context context) {
            this.parray = parray;
            this.context = context;

        }

    public adapterf(ArrayList<gardensc> gl, MainActivity3 context) {
    }

    @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.flower1t,parent,false);
            ViewHolder op =new ViewHolder(v);
            return op ;
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
            ((ViewHolder)holder).img.setImageResource(parray.get(position).getImage());
            ((ViewHolder)holder).name.setText(parray.get(position).getName());
            ((ViewHolder)holder).n1.setText(parray.get(position).getN1());
            ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent p = new Intent(context,FlowerActivity3.class);
                    p.putExtra("flower1c",parray.get(position));
                    context.startActivity(p);
                }
            });
                }


        @Override
        public int getItemCount() {
            return parray.size();
        }
        public static class ViewHolder extends RecyclerView.ViewHolder {
            public ImageView img;
            public TextView name;
            public TextView n1;
            public View view;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                view = itemView;
                img = itemView.findViewById(R.id.imageView2);
                name = itemView.findViewById(R.id.textView3);
                n1 = itemView.findViewById(R.id.textView4);

            }
        }

    }
