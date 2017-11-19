package app.housenow.com.housenow.adapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import app.housenow.com.housenow.R;
import app.housenow.com.housenow.model.House;
import app.housenow.com.housenow.view.PropertiesActivity;

/**
 * Created by Jorge on 12/11/2017.
 */

public class HouseAdapterRecyclerView extends RecyclerView.Adapter<HouseAdapterRecyclerView.HouseViewHolder> {

    private ArrayList<House> houseArrayList;
    private int resource;
    private Activity activity;

    public HouseAdapterRecyclerView(ArrayList<House> houseArrayList, int resource, Activity activity) {
        this.houseArrayList = houseArrayList;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public HouseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(this.resource, parent, false);
        return new HouseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HouseViewHolder holder, int position) {
        House house = this.houseArrayList.get(position);

        holder.txvCardHousePrice.setText(house.getPrice());
        holder.txvCardHouseBedrooms.setText(house.getBedrooms());
        holder.txvCardHouseBathrooms.setText(house.getBathrooms());
        holder.txvCardHouseZoneProvinceCity.setText(String.format("%s, %s, %s", house.getZone(), house.getProvince(), house.getCity()));
        holder.ckbCardHouseHeart.setChecked(house.isLike());

        holder.imvHouseImgCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(activity, )
                //activity.startActivity(intent);
                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

                }
                ((PropertiesActivity)activity).setViewPager(1);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.houseArrayList.size();
    }

    public class HouseViewHolder extends RecyclerView.ViewHolder {

        private ImageView imvHouseImgCard;
        private TextView txvCardHousePrice;
        private TextView txvCardHouseBedrooms;
        private TextView txvCardHouseBathrooms;
        private TextView txvCardHouseZoneProvinceCity;
        private CheckBox ckbCardHouseHeart;

        public HouseViewHolder(View itemView) {
            super(itemView);
            //this.imvHouseImgCard = new ImageView(this.activity.getCon);
            this.txvCardHousePrice = (TextView) itemView.findViewById(R.id.txvCardHousePrice);
            this.txvCardHouseBedrooms = (TextView) itemView.findViewById(R.id.txvCardHouseBedrooms);
            this.txvCardHouseBathrooms = (TextView) itemView.findViewById(R.id.txvCardHouseBathrooms);
            this.txvCardHouseZoneProvinceCity = (TextView) itemView.findViewById(R.id.txvCardHouseZoneProvinceCity);
            this.ckbCardHouseHeart = (CheckBox) itemView.findViewById(R.id.ckbCardHouseHeart);
        }
    }

}
