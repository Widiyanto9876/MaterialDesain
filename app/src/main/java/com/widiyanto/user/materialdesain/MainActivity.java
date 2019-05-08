package com.widiyanto.user.materialdesain;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.rv_data);

        adapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Dimas Maulana", "17.02.0001", "D3MI"));
        mahasiswaArrayList.add(new Mahasiswa("Fadly Yonk", "17.02.0002", "D3MI"));
        mahasiswaArrayList.add(new Mahasiswa("Ariyandi Nugraha", "17.02.0003", "D3MI"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "17.02.0003", "D3MI"));
    }

}
