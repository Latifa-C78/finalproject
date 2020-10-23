package com.example.flower;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final ImageView o = findViewById(R.id.imageView5);
        final ImageView r = findViewById(R.id.imageView8);
        final ImageView p = findViewById(R.id.imageView7);
        final ImageView j = findViewById(R.id.imageView9);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(MainActivity2.this,flowers1.class);
                startActivity(r);

            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(MainActivity2.this,Planting.class);
                startActivity(p);
            }
        });
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(j);

            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(MainActivity2.this,MainActivitys.class);
                startActivity(r);

            }
        });


    }
}