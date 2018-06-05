package com.example.irmin.userapp;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class LocalB extends Fragment {


    public LocalB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_local_b, container, false);

        String[] localB = getResources().getStringArray(R.array.제주시);

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_expandable_list_item_1, localB);

        ListView listView = (ListView) view.findViewById(R.id.list3);
        listView.setAdapter(adapter);

        return view;
    }

}
