package com.example.oso.agente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Nota> list_notes = new ArrayList<>();
        list_notes.add(new Nota(123,1,1,"12-12-12"));
        list_notes.add(new Nota(456,2,1,"12-12-12"));
        list_notes.add(new Nota(789,3,1,"12-12-12"));
        list_notes.add(new Nota(125,4,2,"12-12-12"));
        list_notes.add(new Nota(152,5,2,"12-12-12"));
        list_notes.add(new Nota(253,6,2,"12-12-12"));
        list_notes.add(new Nota(678,7,3,"12-12-12"));
        list_notes.add(new Nota(987,8,3,"12-12-12"));
        list_notes.add(new Nota(623,9,3,"12-12-12"));
        list_notes.add(new Nota(323,10,3,"12-12-12"));

        RecyclerView rv = findViewById(R.id.list_subjects);
        rv.setLayoutManager(new GridLayoutManager(this, 2));
        Adapter adapter = new Adapter(list_notes, this);
        rv.setAdapter(adapter);
    }
}
