package com.example.ilmhonapizza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     ArrayList<Integer> pImages = new ArrayList<>();
     ArrayList<String> pNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getImagesToView();
    }

    private void getImagesToView() {
        pImages.add(R.drawable.image);
        pNames.add("Paperoni");

        pImages.add(R.drawable.margherita);
        pNames.add("Margherita");

        pImages.add(R.drawable.marinara);
        pNames.add("Marinara");

        pImages.add(R.drawable.prosciutto_e_funghi);
        pNames.add("Prosciutto e funghi");

        pImages.add(R.drawable.quattro_stagioni);
        pNames.add("Quattro Stagioni");

        pImages.add(R.drawable.capricciosa);
        pNames.add("Capricciosa");

        pImages.add(R.drawable.quattro_formaggi);
        pNames.add("Quattro Formaggi");

        pImages.add(R.drawable.ortolana_vegetariana);
        pNames.add("Ortolana Vegetariana");

        pImages.add(R.drawable.diavola);
        pNames.add("Diavola");

        pImages.add(R.drawable.boscaiola);
        pNames.add("Boscaiola");

        pImages.add(R.drawable.frutti_di_mare);
        pNames.add("Frutti di Mare");

        pImages.add(R.drawable.garlic_fingers);
        pNames.add("Garlic Fingers");

        pImages.add(R.drawable.detroit_style_pizza);
        pNames.add("Detroit style pizza");

        pImages.add(R.drawable.pizza_e_fichi);
        pNames.add("Pizza e fichi");

        pImages.add(R.drawable.apizza);
        pNames.add("Apizza");

        pImages.add(R.drawable.pizza_rustica);
        pNames.add("Pizza rustica");

        pImages.add(R.drawable.stuffed_pizza);
        pNames.add("Stuffed pizza");

        pImages.add(R.drawable.pesto_genovese);
        pNames.add("Pizza pesto Genovese");

        pImages.add(R.drawable.grandmapie);
        pNames.add("Grandma pie");

        pImages.add(R.drawable.ricecrustpizza);
        pNames.add("Rice Crust Pizza");

        RecyclerView();
    }

    private void RecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recycle_view);
        recyclerView.setHasFixedSize(true);
        PizzaAdapter adapter = new PizzaAdapter(this, pImages, pNames);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}