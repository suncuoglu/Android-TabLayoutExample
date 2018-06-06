package com.example.suncuoglu.tablayout.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.suncuoglu.tablayout.Adapter.RecyclerViewAdapter;
import com.example.suncuoglu.tablayout.Contact;
import com.example.suncuoglu.tablayout.R;

import java.util.ArrayList;
import java.util.List;


public class FruitsFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private List<Contact> lstContact;

    public FruitsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fruits_fragment, container, false);
        mRecyclerView=view.findViewById(R.id.recyclerview);
        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(getContext(),lstContact);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(recyclerViewAdapter);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact=new ArrayList<>();
        lstContact.add(new Contact("Elma","Elma Türkiyenin Ege Bölgesinde Yetişir...",R.drawable.apple));
        lstContact.add(new Contact("Avocado","Avocado Türkiyenin Ege Bölgesinde Yetişir...",R.drawable.avocado));
        lstContact.add(new Contact("Cherries","Cherries Türkiyenin Ege Bölgesinde Yetişir...",R.drawable.cherries));
        lstContact.add(new Contact("Strawberry","Strawberry Türkiyenin Ege Bölgesinde Yetişir...",R.drawable.strawberry));
        lstContact.add(new Contact("Watermelon","Watermelon Türkiyenin Ege Bölgesinde Yetişir...",R.drawable.watermelon));
        lstContact.add(new Contact("Watermelon","Watermelon Türkiyenin Ege Bölgesinde Yetişir...",R.drawable.watermelon));
        lstContact.add(new Contact("Watermelon","Watermelon Türkiyenin Ege Bölgesinde Yetişir...",R.drawable.watermelon));
        lstContact.add(new Contact("Watermelon","Watermelon Türkiyenin Ege Bölgesinde Yetişir...",R.drawable.watermelon));
        lstContact.add(new Contact("Watermelon","Watermelon Türkiyenin Ege Bölgesinde Yetişir...",R.drawable.watermelon));
        lstContact.add(new Contact("Watermelon","Watermelon Türkiyenin Ege Bölgesinde Yetişir...",R.drawable.watermelon));
        lstContact.add(new Contact("Avocado","Avocado Türkiyenin Ege Bölgesinde Yetişir...",R.drawable.avocado));
        lstContact.add(new Contact("Avocado","Avocado Türkiyenin Ege Bölgesinde Yetişir...",R.drawable.avocado));
        lstContact.add(new Contact("Avocado","Avocado Türkiyenin Ege Bölgesinde Yetişir...",R.drawable.avocado));
        lstContact.add(new Contact("Avocado","Avocado Türkiyenin Ege Bölgesinde Yetişir...",R.drawable.avocado));
    }
}
