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
public class FragmentJob extends Fragment {
    private Bundle bundle;
    private Pegawai pegawainyaa;
    private TextView txtPekerjaan,txtLamaKerja,txtNama2;


    public FragmentJob() {
        // Required empty public constructor
    }

        @Override
        public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        bundle=getArguments();
        pegawainyaa=(Pegawai)bundle.getSerializable("bungkus2");
            }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view2 = inflater.inflate(R.layout.fragment_fragment_job, container, false);
        txtNama2 = (TextView)view2.findViewById(R.id.txt_nama2);
        txtPekerjaan = (TextView)view2.findViewById(R.id.txt_pekerjaan);
        txtLamaKerja = (TextView)view2.findViewById(R.id.txt_lamakerja);
        return view2;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState){
            super.onActivityCreated(savedInstanceState);
            txtNama2.setText(pegawainyaa.getNama());
            txtPekerjaan.setText(pegawainyaa.getPekerjaan());
            txtLamaKerja.setText(pegawainyaa.getLamaKerja());
    }
}