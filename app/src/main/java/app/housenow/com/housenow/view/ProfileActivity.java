package app.housenow.com.housenow.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

import app.housenow.com.housenow.R;
import app.housenow.com.housenow.adapter.HouseAdapterRecyclerView;
import app.housenow.com.housenow.model.House;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        this.showToolBar("", false);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rlvProfile);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        HouseAdapterRecyclerView houseAdapterRecyclerView = new HouseAdapterRecyclerView(buildHouses(), R.layout.cardview_house, this);

        recyclerView.setAdapter(houseAdapterRecyclerView);

    }

    private ArrayList<House> buildHouses() {
        ArrayList<House> houses = new ArrayList<>();
        //LLENAR TOOOOOODOOO CON LAS CASAS

        houses.add(new House("stringPicture", "10.000 $", "2 dormitorios", "1 baño", "Condebamba", "Cercado", "Cochabamba", true));
        houses.add(new House("stringPicture", "25.000 $", "3 dormitorios", "2 baños", "Temporal", "Cercado", "Cochabamba", true));
        houses.add(new House("stringPicture", "30.000 $", "4 dormitorios", "2 baños", "Cala cala", "Cercado", "Cochabamba", true));
        houses.add(new House("stringPicture", "100.000 $", "5 dormitorios", "4 baños", "Temporal", "Cercado", "Cochabamba", true));

        return houses;
    }

    public void showToolBar(String tittle, boolean upButton) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(tittle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}
