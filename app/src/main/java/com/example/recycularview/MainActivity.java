package com.example.recycularview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

        data.add(new AppItem(1, "Subway Surfers", "SYBO Games", "4.4", "187 MB", R.drawable.app1));
        data.add(new AppItem(2, "Roblox", "Roblox Corporation", "4.4", "126 MB", R.drawable.app2));
        data.add(new AppItem(3, "Candy Crush Saga", "King", "4.6", "95 MB", R.drawable.app3));
        data.add(new AppItem(4, "8 Ball Pool", "Miniclip.com", "4.5", "115 MB", R.drawable.app4));
        data.add(new AppItem(5, "Temple Run 2", "Imangi Studios", "4.3", "132 MB", R.drawable.app1));
        data.add(new AppItem(6, "Clash Royale", "Supercell", "4.2", "158 MB", R.drawable.app2));
        data.add(new AppItem(7, "Hill Climb Racing", "Fingersoft", "4.4", "89 MB", R.drawable.app3));
        data.add(new AppItem(8, "Angry Birds 2", "Rovio Entertainment", "4.3", "121 MB", R.drawable.app4));

        adapter = new AppAdapter(this, data);
        rv.setAdapter(adapter);
    }
}