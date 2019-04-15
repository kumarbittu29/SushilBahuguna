package com.sushilbahuguna.www.sushilbahuguna;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Home extends Fragment {

    LinearLayout desg,email,nation;
    ImageView send;
    EditText text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.activity_home1, container, false);
     /*   desg = (LinearLayout) view. findViewById(R.id.desg);
        desg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Team Leader", Toast.LENGTH_SHORT).show();
            }
        });
        email = (LinearLayout) view. findViewById(R.id.email);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "sushilbahuguna@gmail.com", Toast.LENGTH_SHORT).show();
            }
        });
        nation = (LinearLayout) view. findViewById(R.id.nationality);
        nation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Indian", Toast.LENGTH_SHORT).show();
            }
        });*/
        // Inflate the layout for this fragment
        send = (ImageView)view.findViewById(R.id.mess);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager =getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fragment_container, new Message()).commit();
            }
        });

        return view;
    }



    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
