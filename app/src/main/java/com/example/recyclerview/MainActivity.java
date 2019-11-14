package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<Person> people = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        people.add(new Person("Kis", "Pista", "bus"));
        people.add(new Person("Kovacs", "Geza", "bus"));
        people.add(new Person("Olah", "Mark", "plane"));
        people.add(new Person("Revesz", "Laszlo", "bus"));
        people.add(new Person("Elek", "Ferenc", "plane"));
        people.add(new Person("Toth", "Kalman", "bus"));
        people.add(new Person("Nagy", "Emil", "plane"));
        people.add(new Person("Varga", "Aladar", "plane"));
        people.add(new Person("Varga", "Aladar", "lofasz"));
        myAdapter = new PersonAdapter(this, people);
        recyclerView.setAdapter(myAdapter);
    }
}
