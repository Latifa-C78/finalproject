package com.example.flower;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        ArrayList<gardensc> gl = new ArrayList<>();

        gardensc g1 =new gardensc("هيتاتشي,إيباراكي في اليابان",R.drawable.hitachi,"googl maps");
        gardensc g2 =new gardensc("غابة هالي في بلجيكا",R.drawable.g2,"googl maps");
        gardensc g3 =new gardensc("حقول الورود في كارلسباد في كاليفورنيا",R.drawable.g3,"googl maps");


        gl.add(g1);
        gl.add(g2);
        gl.add(g3);
        RecyclerView ah = findViewById(R.id.RecyclerView4);
        ah.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        ah.setHasFixedSize(true);
        RecyclerView.LayoutManager y = new LinearLayoutManager(this);
        ah.setLayoutManager(y);
        adapterg o = new adapterg(gl, this);
        ah.setAdapter(o);


    }
}