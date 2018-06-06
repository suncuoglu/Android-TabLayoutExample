package com.example.suncuoglu.tablayout;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.example.suncuoglu.tablayout.Adapter.PagerAdapter;
import com.example.suncuoglu.tablayout.Fragment.FruitsFragment;
import com.example.suncuoglu.tablayout.Fragment.VegetablesFragment;


public class MainActivity extends AppCompatActivity {
    private Toolbar myToolbar;
    private ViewPager mViewPager;
    private TabLayout mtabLayout;
    private PagerAdapter mpagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myToolbar =findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setElevation(0);

        mViewPager=findViewById(R.id.viewPager);
        mtabLayout=findViewById(R.id.tabLayout);

        mpagerAdapter=new PagerAdapter(getSupportFragmentManager());
        mpagerAdapter.AddFragment(new FruitsFragment(),"");
        mpagerAdapter.AddFragment(new VegetablesFragment(),"");
        mViewPager.setAdapter(mpagerAdapter);
        mtabLayout.setupWithViewPager(mViewPager);
        mtabLayout.getTabAt(0).setIcon(R.drawable.fruit);
        mtabLayout.getTabAt(1).setIcon(R.drawable.vegetables);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }
}
