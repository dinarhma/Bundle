package com.example.bundle;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSkill extends Fragment {
    private Bundle bundle;
    private Pegawai pegawaiNyaa;
    private TextView txtNama3,txtAsalSekolah,txtKompetensi;


    public FragmentSkill() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        bundle=getArguments();
        pegawaiNyaa=(Pegawai)bundle.getSerializable("bungkus3");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view2=inflater.inflate(R.layout.fragment_fragment_skill, container, false);
        txtNama3 = (TextView)view2.findViewById(R.id.txt_nama3);
        txtAsalSekolah = (TextView)view2.findViewById(R.id.txt_AsalSekolah);
        txtKompetensi  = (TextView)view2.findViewById(R.id.txt_kompetensi);
        return view2;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle saveInstanceState){
        super.onActivityCreated(saveInstanceState);
        txtNama3.setText(pegawaiNyaa.getNama());
        txtKompetensi.setText(pegawaiNyaa.getKompetensi());
        txtAsalSekolah.setText(pegawaiNyaa.getAsalSekolah());
    }

}
