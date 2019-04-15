package com.sushilbahuguna.www.sushilbahuguna;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class Devrloper extends Fragment {

    Button fb, insta, gmail;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.activity_devrloper, container, false);
        View view = inflater.inflate(R.layout.activity_devrloper, container, false);
        gmail= (Button)view.findViewById(R.id.gmailD);
        fb= (Button)view.findViewById(R.id.fbD);
        insta= (Button)view.findViewById(R.id.instaD);
        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    String[] recipent = {"er.avaneesh3009@gmail.com"};
                    intent.putExtra(Intent.EXTRA_EMAIL, recipent);
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
                    intent.setType("text.html");
                    intent.setPackage("com.google.android.gm");
                    startActivity(Intent.createChooser(intent,"Send Mail"));
                }catch (ActivityNotFoundException e){

                }
            }
        });
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/haq.se.single007"));
                    startActivity(intent);
                }catch (ActivityNotFoundException e){

                }
            }
        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/status_pending_"));
                    startActivity(intent);
                }catch (ActivityNotFoundException e){

                }
            }
        });
        return view;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
