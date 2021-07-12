package com.prabhakar.idenditycard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<PersonModel> personList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        buildList();
        setRecyclerView();
    }

    private void buildList() {
        personList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            personList.add(new PersonModel(R.drawable.bill, "Age : 64", "Microsoft", "Profession : Buisness"));
            personList.add(new PersonModel(R.drawable.jeff, "Age : 56", "Amazon", "Profession : Buisness"));
            personList.add(new PersonModel(R.drawable.prateek, "Age : 31", "Masai School", "Profession : Buisness"));
        }
    }

    private void setRecyclerView() {
        PersonAdapter personAdapter = new PersonAdapter(personList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(personAdapter);
    }

}