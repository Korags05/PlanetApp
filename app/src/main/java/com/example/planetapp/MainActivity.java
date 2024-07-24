package com.example.planetapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Planet> planetArrayList;
    private static MyCustomAdapter adapter;
    int resource = R.layout.list_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.Listview);
        planetArrayList = new ArrayList<>();

        Planet planet1 = new Planet("1 Moon", "Earth", R.drawable.earth, "Earth: Life exists, bulges at the middle due to spin.");
        planetArrayList.add(planet1);
        Planet planet2 = new Planet("0 Moons", "Mercury", R.drawable.mercury, "Mercury: Hottest despite being closest");
        planetArrayList.add(planet2);
        Planet planet3 = new Planet("0 Moons", "Venus", R.drawable.venus, "Venus: Rotates slower than it orbits");
        planetArrayList.add(planet3);
        Planet planet4 = new Planet("2 Moons", "Mars", R.drawable.mars, "Mars: Once had water, tallest mountain in the solar system");
        planetArrayList.add(planet4);
        Planet planet5 = new Planet("79 Moons", "Jupiter", R.drawable.jupiter, "Jupiter: Giant gas planet, fits 1,000 Earths, Great Red Spot rages for centuries");
        planetArrayList.add(planet5);
        Planet planet6 = new Planet("83 Moons", "Saturn", R.drawable.saturn, "Saturn: The ringed giant with icy wonders");
        planetArrayList.add(planet6);
        Planet planet7 = new Planet("27 Moons", "Uranus", R.drawable.uranus, "Uranus: Rolls on its side, coldest atmosphere.");
        planetArrayList.add(planet7);
        Planet planet8 = new Planet("14 Moons", "Neptune", R.drawable.neptune, "Neptune: Windiest planet, supersonic speeds!");
        planetArrayList.add(planet8);

        adapter = new MyCustomAdapter(getApplicationContext(), resource, planetArrayList, getApplicationContext());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, ""+adapter.getItem(position).getPlanetFact(), Toast.LENGTH_LONG).show();
            }
        });
    }
}