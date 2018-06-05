package com.example.irmin.userapp;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
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
public class LocalA extends Fragment {


    public LocalA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_local, container, false);

        String[] localA = getResources().getStringArray(R.array.제주);

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_expandable_list_item_1, localA);

        ListView listView = (ListView) view.findViewById(R.id.list2);
        listView.setAdapter(adapter);

        Fragment frg3 = null;

        frg3 = new LocalB();
        FragmentManager fm =getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.localB, frg3);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();


        return view;
    }

}
