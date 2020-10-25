package com.example.flower;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityg2 extends AppCompatActivity {
EditText l;
EditText k ;
Button h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityg2);
     l=findViewById(R.id.editTextTextPersonName2);
        k=findViewById(R.id.editTextTextPersonName3);

        h=findViewById(R.id.button);
     h.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             String s= l.getText().toString().trim();
             String l = k.getText().toString().trim();
             if (s.equals("")&& l.equals("")){
                 Toast.makeText(getApplicationContext(),"Enter",Toast.LENGTH_SHORT).show();
             }else {
                 DisplayTrack(s,l);
             }
         }
     });
    }

    private void DisplayTrack(String s, String l) {
        try {
            Uri uri=Uri.parse("https://www.google.co.in/maps/dir/"+s+"/"+l);
            Intent intent=new Intent(Intent.ACTION_VIEW,uri);
            intent.setPackage("com.google.android.apps.maps");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

        }catch (ActivityNotFoundException e){
          Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps") ;
          Intent intent =new Intent(Intent.ACTION_VIEW,uri);
          startActivity(intent);


        }
    }

   
      }

