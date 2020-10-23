package com.example.flower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FlowerActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower3);


        Bundle b =getIntent().getExtras();
       flower1class  a = (flower1class) b.getSerializable("flower1c");

        ImageView img = findViewById(R.id.imageView3);
        TextView name = findViewById(R.id.textView8);
        TextView n2 = findViewById(R.id.textView9);
        TextView n3 = findViewById(R.id.textView10);
        TextView n4 = findViewById(R.id.textView11);
        TextView n5 = findViewById(R.id.textView12);


       img.setImageResource(a.getImage());
        name.setText(a.getName());
        n2.setText(a.getN2());
        n3.setText(a.getN3());
        n4.setText(a.getN4());
        n5.setText(a.getN5());

    }
}
