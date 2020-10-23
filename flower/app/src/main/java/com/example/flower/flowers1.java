package com.example.flower;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class flowers1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flowers1);


        ArrayList<flower1class> fl = new ArrayList<>();
        flower1class f1 = new flower1class("زهرة الزنبق", "زهرة الزنبق من النباتات المزهرة والمعمرة", "هناك مئات الأصناف من زهرة الزنبق حيث انه يمكن العثور عليه في الغالب في (أوروبا وآسيا وأمريكا الشمالية).", "ينمو معظم أنواعه في المناطق المعتدلة والاستوائية ، وعادة ما يسكن الغابات والمراعي والمستنقعات والجبال .", "وقت زراعتها في نهاية فصل الشتاء و بداية فصل الربيع .", "تزرع على عمق 15 سم و أكثر من سطح التربة.", R.drawable.f11);
        flower1class f2 = new flower1class("زهرة اللوتس", "زهرة اللوتس من النباتات المائية المعمرة", "تنمو في المياه الضحلة والموحلةوموطنها في جنوب آسيا وأستراليا وأكثرها شيوعا المزروعة في الحدائق المائية.", " تتمتع بأشعة الشمس الدافئة ولا تتحمل الطقس البارد.", "تزرع جذور زهرة اللوتس في تربة البركة أو أسفل النهر، بينما تطفو الأوراق فوق سطح الماء.", "ستخدم زهرة اللوتس أيضا في الطب التقليدي العشبي الآسيوي.", R.drawable.f23);
        flower1class f3 = new flower1class("زهرة النرجس", "تُعد زهرة النرجس من النباتات المُعمّرة", "يفضل النرجس التربة الجافة والبيئة ذات الشمس الخفيفة والظل و تفتّح زهورها في فصل الربيع، حيث إنها تتكون من الأوراق المُفلطحة التي تبدأ من قاعدة النَبتة.", "يجب أن يزرع النرجس في الخريف، وعلى عمق 15 سم في التربة,وعندما تزهر النبتة يفضل إبعادها عن الشمس وتهيئة الجو البارد لها.", "عند موت الزهره لا يتم إزالة أوراقها الميتة، وذلك لإنها تُساعد في إمداد البُصيلات بالطاقة للموسم القادم لازدهارها.", " يقتل أي نبات ينمو بجواره والنرجس نبات له أنواع كثيرة.", R.drawable.f4);
        fl.add(f1);
        fl.add(f2);
        fl.add(f3);
        RecyclerView ah = findViewById(R.id.RecyclerView);
        ah.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        ah.setHasFixedSize(true);
        RecyclerView.LayoutManager y = new LinearLayoutManager(this);
        ah.setLayoutManager(y);
        adapterf o = new adapterf(fl, this);
        ah.setAdapter(o);

    }

}