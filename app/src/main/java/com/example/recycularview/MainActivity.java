package com.example.recycularview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.DividerItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private AppAdapter adapter;
    private final List<AppItem> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv_topcharts);


        LinearLayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);


        rv.addItemDecoration(new DividerItemDecoration(this, lm.getOrientation()));


        data.add(new AppItem(1, "Windows 11 pro", "Puzzle • Offline", "4.5", "161 MB", R.drawable.app1));
        data.add(new AppItem(2, "Windows 10 pro", "Board • Mahjong", "4.6", "142 MB", R.drawable.app2));
        data.add(new AppItem(3, "Office 2024 Pro Plus", "Puzzle • Casual", "4.3", "71 MB", R.drawable.app3));
        data.add(new AppItem(4, "AVG Ultimate", "Puzzle • Match 3", "4.5", "Event", R.drawable.app4));

        adapter = new AppAdapter(this, data);
        rv.setAdapter(adapter);
    }
}