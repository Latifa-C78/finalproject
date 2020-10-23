package com.example.flower;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Planting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planting);


        ArrayList<Platingc> p= new ArrayList<>();
        Platingc p1 = new Platingc("يجب اختيار الزهور التي تناسب نوعية التربة المتوفرة كما يجب تقليب التربة وتنظيفها من الأعشاب الزائدة وتركها تتعرض للشمس لبضعة أيام، ثم يتم نثر البذور و غمرها بطبقة من التراب.",R.drawable.planting,1);
        Platingc p2 = new Platingc(" يتم ريّها بشكل خفيف والمحافظة على رطوبة التربة باستمرار.",R.drawable.watering,2);
        Platingc p3 = new Platingc(" يتم زراعة الزهور بحيث يتم ترك مسافة بين كل زهرة وأخرى.",R.drawable.growing,3);
        Platingc p4 = new Platingc(" من الأفضل زراعة الزهور في مكان مشمس فهو المكان الأفضل لنموها و يجب أن تُروى في الصباح الباكر أو في المساء بعد غروب الشمس وعدم الري خلال ساعات النهار عندما تكون الشمس ساطعة لأنها ستُسبب تبخر المياه.",R.drawable.sunny,4);
        Platingc p5 = new Platingc("عندما تتكوّن الجذور يُمكن أن اقتلاع الزهرة ونقلها إلى الأصيص الخاص بالزراعة في حال الرغبة في توزيعها على عدة أماكن في المنزل.",R.drawable.flowerp,5);
        Platingc p6 = new Platingc("بعد ظهور الأزهار والأجزاء الخضراء في الزهرة يجب تقليم النبتة بين فترة وأخرى.",R.drawable.secateurs,6);
        Platingc p7 = new Platingc("لزهور أكثر من عشرة آلاف نوع مختلف ولكل نوع تربة معينة تنمو فيه لذا يُفضل معرفة نوع الزهرة الملائم للتربة الموجودة في المكان المنوي زراعة الزهور فيه حتى لا يقوم الشخص بزراعة نوع ومن ثم يفشل في النمو.",R.drawable.flowers,7);
      p.add(p1);
      p.add(p2);
      p.add(p3);
      p.add(p4);
      p.add(p5);
      p.add(p6);
      p.add(p7);
        RecyclerView ah = findViewById(R.id.RecyclerView2);
        RecyclerView.LayoutManager y = new LinearLayoutManager(this);
        ah.setLayoutManager(y);
        adapterp o = new adapterp(p,this);
        ah.setAdapter(o);


    }

}