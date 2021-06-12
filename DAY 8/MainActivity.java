package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lvName;
    int[] image={R.drawable.flower1,R.drawable.flower2,R.drawable.flower3,R.drawable.flower4,R.drawable.flower5,R.drawable.flower6};
    String[] name = {"This is Flower1","This is Flower2","This is Flower3","This is Flower4","This is Flower5","This is Flower6"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvName = findViewById(R.id.lvName);

        MyAdapter myAdapter = new MyAdapter(image,name,MainActivity.this);
        lvName.setAdapter(myAdapter);

        lvName.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,ListDataActivity.class);
                intent.putExtra("I1",image[position]);
                intent.putExtra("T1",name[position]);
                startActivity(intent);

            }
        });

    }
}