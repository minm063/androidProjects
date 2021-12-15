package com.example.fragmentbundleexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Fragment2 extends Fragment {

    private View view;
    private TextView tv_frag2;
    private Button btn_move;
    private String result;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_2, container, false);

        tv_frag2 = view.findViewById(R.id.tv_frag2);
        btn_move = view.findViewById(R.id.btn_move);

        if(getArguments() != null) { // 받아온 번들이 null이 아닐 때
            result = getArguments().getString("fromFrag1"); // 프래그먼트 1로부터 setArgument 된 데이터를 받아온다
            tv_frag2.setText(result);
        }

        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle(); // 무언가를 담을 준비를 할 수 있는 보따리
                bundle.putString("fromFrag2", "홍드로이드 프래그먼트 2"); // key 값, value 값
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                Fragment1 fragment1 = new Fragment1();
                fragment1.setArguments(bundle); // 번들을 fragment2에 넣는다
                transaction.replace(R.id.frameLayout, fragment1); // 교체할 화면에 대한 영역, 교체할 화면에 넣을 것
                transaction.commit(); // 저장

            }
        });

        return view;
    }
}
