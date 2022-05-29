package com.example.arbuz.activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.arbuz.R;

public class OrderFragment extends Fragment {
    private GridViewAdapters adapter;
    GridView gridView;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_order, container, false);

//        GridView gridView = inflater.inflate (R.id.gridPlaces);
//        adapter = new GridViewAdapters(this);
//        gridView.setAdapter(adapter);
    }
}