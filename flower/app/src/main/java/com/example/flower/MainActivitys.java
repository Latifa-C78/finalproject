package com.example.flower;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivitys extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitys);
        ImageView m;
        m=findViewById(R.id.imageView6);
        ImageView p;
        p=findViewById(R.id.imageView61);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://instgram.com/plantnmore?igshid=n3k8l1u8vob1");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.instagram.android");
                try {
                    startActivity(intent);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://instgram.com/plantnmore?igshid=n3k8l1u8vob1")));
                }
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://instgram.com/almuwainea?igshid=aetu09g1xg6");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.instagram.android");
                try {
                    startActivity(intent);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://instgram.com/almuwainea?igshid=aetu09g1xg6")));
                }
            }
        });

    }
    }
