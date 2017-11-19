package app.housenow.com.housenow.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jorge on 12/11/2017.
 */

public class SectionsStateAdapterViewPager extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentList;
    private List<String> fragmentListTittle;

    public SectionsStateAdapterViewPager(FragmentManager fragmentManager){
        super(fragmentManager);
        this.fragmentList = new ArrayList<Fragment>();
        this.fragmentListTittle = new ArrayList<String>();
    }

    public void addFragment(Fragment fragment, String fragmentTittle) {
        this.fragmentList.add(fragment);
        this.fragmentListTittle.add(fragmentTittle);
    }

    public String getItemTittle(int position) {
        return this.fragmentListTittle.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return this.fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return this.fragmentList.size();
    }
}
