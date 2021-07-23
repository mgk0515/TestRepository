package kr.or.myapplication0723;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment1 extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_1,container,false);


        TextView tv_fg_data = view.findViewById(R.id.tv_fg_data);

        tv_fg_data.setText("첫 번째 프래그먼트 화면");


        return view;

    }
}