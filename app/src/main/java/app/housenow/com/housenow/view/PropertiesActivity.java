package app.housenow.com.housenow.view;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import app.housenow.com.housenow.R;
import app.housenow.com.housenow.adapter.SectionsStateAdapterViewPager;
import app.housenow.com.housenow.view.fragment.PropertiesDetailFragment;
import app.housenow.com.housenow.view.fragment.PropertiesListFragment;

public class PropertiesActivity extends AppCompatActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_properties);

        this.viewPager = (ViewPager) findViewById(R.id.vwpConteiner);
        this.setupViewPager(this.viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsStateAdapterViewPager adapter = new SectionsStateAdapterViewPager(getSupportFragmentManager());
        adapter.addFragment(new PropertiesListFragment(), getResources().getString(R.string.toolbar_tittle_properties_list));
        adapter.addFragment(new PropertiesDetailFragment(), getResources().getString(R.string.toolbar_tittle_properties_detail));
        viewPager.setAdapter(adapter);
    }

    public void setViewPager(int fragmentNumber) {
        this.viewPager.setCurrentItem(fragmentNumber);
    }
}
