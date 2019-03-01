package com.example.tsekk.dailynutritionapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BlankFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {
    private static final String[] WORDS = {"CALORIES", "FAT", "CARBS", "PROTEINS", "VITAMINS", "CALCIUM", "IRON"};
    String word = "";


    public void MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        //final Intent myIntent = new Intent(this,ImgDisplay.class);

        //attach reference list to mylist
        ListView list = (ListView) view.findViewById(R.id.mylist);

        //Create adapter and attach to WORDS
        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, WORDS);

        //Use myadapter as input to list
        list.setAdapter(myadapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                word = parent.getItemAtPosition(position).toString();
                Toast.makeText(getContext(), word, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
