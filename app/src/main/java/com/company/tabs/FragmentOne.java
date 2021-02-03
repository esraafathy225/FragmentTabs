package com.company.tabs;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;



public class FragmentOne extends Fragment {

    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        textView=getActivity().findViewById(R.id.txt);

        textView.setText("Fragment One");

        return inflater.inflate(R.layout.fragment_one,container,false);
    }
}
