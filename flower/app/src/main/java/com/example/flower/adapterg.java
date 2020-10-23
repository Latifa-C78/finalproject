package com.example.flower;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.maps.MapView;

import java.util.ArrayList;
public class adapterg extends RecyclerView.Adapter {
    ArrayList<gardensc> parray;
    Context context;
    private View n1;

    public adapterg (ArrayList<gardensc> parray, Context context) {
        this.parray = parray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.gardens ,parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder) holder).img.setImageResource(parray.get(position).getImage());
        ((ViewHolder) holder).name.setText(parray.get(position).getName());
        ((ViewHolder) holder).n1.setText(parray.get(position).getN1());
        ((ViewHolder) holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,MainActivityg2.class);
                i.putExtra("g", parray.get(position));
                context.startActivity(i);



            }
        });
        ((ViewHolder) holder).n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,MainActivityg2.class);
                i.putExtra("g", parray.get(position));
                context.startActivity(i);

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
        public Uri uri;
        public TextView n1;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            img = itemView.findViewById(R.id.imageView10);
            name = itemView.findViewById(R.id.textView17);
            n1 = itemView.findViewById(R.id.textView199);



        }

    }
}


