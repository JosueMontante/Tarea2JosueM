package com.example.tarea2.beans;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tarea2.AdapterProduct;
import com.example.tarea2.R;

import java.util.ArrayList;

public class FragmentTechnology extends Fragment {


    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private  ArrayList<ItemProduct> myDataSet;


    public FragmentTechnology() {
        // Required empty public constructor
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
        View view = inflater.inflate(R.layout.fragment_technology, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.fragment_recycler_view);
        recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);

        myDataSet = new ArrayList<ItemProduct>();
        ItemProduct itemProduct = new ItemProduct ();
        itemProduct.setTitle ("MacBook Pro 17\"");
        itemProduct.setStore ("BestBuy");
        itemProduct.setLocalitation ("Zapopan, Jalisco");
        itemProduct.setPhone ("33 12345678");
        itemProduct.setImage (0);
        itemProduct.setDescription ( " Llevate esta Mac con un 30% de descuento para que puedas programar para XCode" );
        myDataSet.add ( itemProduct );

        ItemProduct itemProduct2 = new ItemProduct ();
        itemProduct2.setTitle ("Alienware  15\"");
        itemProduct2.setStore ("BestBuy"); itemProduct2.setLocalitation ("Zapopan, Jalisco");
        itemProduct2.setPhone ("33 12345678"); itemProduct2.setImage (1);
        itemProduct2.setDescription ( "Llevate esta Mac con un 30% de descuento para que puedas programar para XCode" );
        myDataSet.add ( itemProduct2 );

        mAdapter = new AdapterProduct( getActivity(), myDataSet );
        recyclerView.setAdapter ( mAdapter );

        return view;
    }
}
