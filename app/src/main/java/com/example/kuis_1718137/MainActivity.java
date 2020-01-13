package com.example.kuis_1718137;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private FamilyAdapter adapter;
    private ArrayList<family>familyArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = findViewById(R.id.recycleview);
        adapter = new FamilyAdapter(familyArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        familyArrayList = new ArrayList<>();
        //mahasiswaArrayList.add(new Mahasiswa(getDrawable(R.drawable.ten),));
        familyArrayList.add(new family(getDrawable(R.drawable.ibu),"Rufi'ah", "Ibu"));
        familyArrayList.add(new family(getDrawable(R.drawable.anak1),"Aris Zainul Mutaqin", "Anak"));
        familyArrayList.add(new family(getDrawable(R.drawable.anak2),"Iqbal Adhim", "Anak"));
        familyArrayList.add(new family(getDrawable(R.drawable.aku),"Nasrul Afwa", "Anak"));
        familyArrayList.add(new family(getDrawable(R.drawable.adik),"Fahmi Mubarok", "Anak"));
    }
}


