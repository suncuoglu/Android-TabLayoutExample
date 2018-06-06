package com.example.suncuoglu.tablayout.Adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> lstFragment = new ArrayList<>();
    private final List<String> lstTitles = new ArrayList<>();

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return lstFragment.get(position);
    }


    @Override
    public int getCount() {
        return lstTitles.size();
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return lstTitles.get(position);
    }
    public void AddFragment (Fragment fragment,String title){
        lstFragment.add(fragment);
        lstTitles.add(title);
    }
}
