package com.katerina.myapplication.Stores;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.katerina.myapplication.R;

import java.util.ArrayList;

/*** Created by cathr on 26/6/2017. ***/

public class StoresFragment extends Fragment {

    StoresAdapter storesAdapter;


    public StoresFragment() {   }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //display stores on start of the activity:
    @Override
    public void onStart() {
        super.onStart();
        fetchStores();
    }

    private void fetchStores(){
        FetchStoresTask fetchMerchantsTask = new FetchStoresTask(storesAdapter);
        fetchMerchantsTask.execute();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_stores, container, false);
        storesAdapter = new StoresAdapter(getActivity(),new ArrayList<Store>());
        ListView merchantListView = (ListView)rootView.findViewById(R.id.stores_list);
        merchantListView.setAdapter(storesAdapter);

        return rootView;
    }



}