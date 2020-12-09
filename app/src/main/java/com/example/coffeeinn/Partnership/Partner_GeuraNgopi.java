package com.example.coffeeinn.Partnership;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.coffeeinn.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Partner_GeuraNgopi#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Partner_GeuraNgopi extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Partner_GeuraNgopi() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_partner_geura_ngopi.
     */
    // TODO: Rename and change types and number of parameters
    public static Partner_GeuraNgopi newInstance(String param1, String param2) {
        Partner_GeuraNgopi fragment = new Partner_GeuraNgopi();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_partner_geura_ngopi, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {  // it should use OnViewCreated Method
        super.onViewCreated(view, savedInstanceState);

        super.onViewCreated(view, savedInstanceState);
        Uri uri = Uri.parse("http://instagram.com/geura.ngopi/");
        final Intent i= new Intent(Intent.ACTION_VIEW,uri);
        i.setPackage("com.instagram.android");
        
        view.findViewById(R.id.back_icon).setOnClickListener(new View.OnClickListener() { // In the R.id, use the id of your button
            @Override
            public void onClick(View view) { // Use the R.id. of your button/ImageView/ImageButton you want to press
                getFragmentManager().popBackStackImmediate();



            }
        });

        view.findViewById(R.id.image_insta).setOnClickListener(new View.OnClickListener() { // In the R.id, use the id of your button
            @Override
            public void onClick(View view) { // Use the R.id. of your button/ImageView/ImageButton you want to press
                try {
                    startActivity(i);
                } catch (ActivityNotFoundException e) {

                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://instagram.com/geura.ngopi/")));
                }
            }
        });
        view.findViewById(R.id.image_wa).setOnClickListener(new View.OnClickListener() { // In the R.id, use the id of your button
            @Override
            public void onClick(View view) { // Use the R.id. of your button/ImageView/ImageButton you want to press
                String url = "https://api.whatsapp.com/send?phone="+"+62 81910014697";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}