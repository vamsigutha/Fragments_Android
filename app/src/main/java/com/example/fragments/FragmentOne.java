package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentOne extends Fragment {

    ListView listView;
    ArrayAdapter<String> adapter;
    String[] versions;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragement_one_layout,container,false);
        listView = view.findViewById(R.id.list_view);
        versions = getResources().getStringArray(R.array.android_versions);
        adapter = new ArrayAdapter<String>(getActivity(),R.layout.list_view_layout,R.id.row_item,versions);
        listView.setAdapter(adapter);

        return view;
    }
}
