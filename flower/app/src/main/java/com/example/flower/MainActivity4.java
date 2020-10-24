package com.example.flower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower3);
        ImageView imageView = findViewById(R.id.imageView3);
        TextView name = findViewById(R.id.textView8);
        TextView info1 = findViewById(R.id.textView9);
        TextView info2 = findViewById(R.id.textView12);
        TextView info3 = findViewById(R.id.textView10);
        TextView info4 = findViewById(R.id.textView11);
        Bundle bundle =getIntent().getExtras();
        flower1class f = (flower1class) bundle.getSerializable("flower1c");
        imageView.setImageResource(f.getImage());
        name.setText(f.getName());
        info1.setText(f.getN2());
        info2.setText(f.getN3());
        info3.setText(f.getN4());
        info4.setText(f.getN5());

    }
}