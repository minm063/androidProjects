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

public class Fragment1 extends Fragment {

    private View view;
    private TextView tv_frag1;
    private Button btn_move;
    private String result;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_1, container, false);

        tv_frag1 = view.findViewById(R.id.tv_frag1);
        btn_move = view.findViewById(R.id.btn_move);

        if(getArguments() != null) { // 받아온 번들이 null이 아닐 때
            result = getArguments().getString("fromFrag2"); // 프래그먼트 2로부터 setArgument 된 데이터를 받아온다
            tv_frag1.setText(result);
        }

        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle(); // 무언가를 담을 준비를 할 수 있는 보따리
                bundle.putString("fromFrag1", "홍드로이드 프래그먼트 1"); // key 값, value 값
                // transaction ; 프래그먼트를 관리, 검사
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                Fragment2 fragment2 = new Fragment2();
                fragment2.setArguments(bundle); // 번들을 fragment2에 넣는다
                transaction.replace(R.id.frameLayout, fragment2); // 교체할 화면에 대한 영역, 교체할 화면에 넣을 것
                transaction.commit(); // 저장
            }
        });

        return view;
    }
}
