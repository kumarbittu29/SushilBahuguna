package com.sushilbahuguna.www.sushilbahuguna;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

public class Message extends Fragment {

    ImageView sendd;
    EditText text,t2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.message, container, false);
        sendd = (ImageView)view.findViewById(R.id.send);
        t2 = (EditText)view.findViewById(R.id.topic);
        text = (EditText)view.findViewById(R.id.text);
        sendd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    String[] recipent = {"sushilbahuguna@gmail.com"};
                    intent.putExtra(Intent.EXTRA_EMAIL, recipent);
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Message reguarding " + t2.getText());
                    intent.putExtra(Intent.EXTRA_TEXT, text.getText());
                    intent.setType("text.html");
                    intent.setPackage("com.google.android.gm");
                    startActivity(Intent.createChooser(intent,"Send Mail"));
                }catch (ActivityNotFoundException e){

                }
            }
        });
        return  view;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
