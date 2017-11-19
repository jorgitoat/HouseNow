package app.housenow.com.housenow.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

import app.housenow.com.housenow.R;
import app.housenow.com.housenow.adapter.HouseAdapterRecyclerView;
import app.housenow.com.housenow.model.House;
import app.housenow.com.housenow.view.PropertiesActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class PropertiesListFragment extends Fragment {


    public PropertiesListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_properties_list, container, false);
        this.showToolBar(view.getResources().getString(R.string.toolbar_tittle_properties_list), false, view);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rlvHousesList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        HouseAdapterRecyclerView houseAdapterRecyclerView = new HouseAdapterRecyclerView(buildHouses(), R.layout.cardview_house, getActivity());

        recyclerView.setAdapter(houseAdapterRecyclerView);

        return view;
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

    public void showToolBar(String tittle, boolean upButton, View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }


    //private void EJEMPLO_DE_IR_A_OTRO_FRACMENT() {
    //    ((PropertiesActivity)getActivity()).setViewPager(1);
    //}
}
