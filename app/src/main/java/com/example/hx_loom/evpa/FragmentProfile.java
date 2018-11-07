package com.example.hx_loom.evpa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.LinearLayout;

public class FragmentProfile extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View profileF = inflater.inflate(R.layout.activity_profile_fragment, container, false);

        final LinearLayout v_goBack = (LinearLayout) profileF.findViewById(R.id.backfromAbout);
        v_goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gg = new Intent(v_goBack.getContext(), AboutActivity.class);
                startActivity(gg);

            }
        });

        return  profileF;
    }


}
