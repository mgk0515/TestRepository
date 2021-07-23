package kr.or.myapplication0723;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class Fragment2 extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_2,container,false);


        TextView tv_fg_data2 = view.findViewById(R.id.tv_fg_data2);

        tv_fg_data2.setText("두 번째 프래그먼트 화면");


        return view;

    }
}