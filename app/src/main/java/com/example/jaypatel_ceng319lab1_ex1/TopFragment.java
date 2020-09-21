package com.example.jaypatel_ceng319lab1_ex1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class TopFragment extends Fragment
{
    private static final String AI_ACTIVITY = "AIActivity";
    private static final String VR_ACTIVITY = "VRActivity";

    public TopFragment() {
        // Required empty public constructor
    }

    public static TopFragment newInstance() {
        TopFragment fragment = new TopFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_top, container, false);

        ListView listView = view.findViewById(R.id.list_view);

        final ArrayList<String> data = new ArrayList<>();
        data.add(AI_ACTIVITY);
        data.add(VR_ACTIVITY);

        ArrayAdapter adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_activated_1, data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String activity = data.get(position);
                if (activity.equals(AI_ACTIVITY)) {
                    launchAIActivity();
                } else if (activity.equals(VR_ACTIVITY)) {
                    launchVRActivity();
                }
            }
        });
        return view;
    }

    private void launchVRActivity() {
        if (getActivity() != null)
        {
            getActivity().startActivity(new Intent(getActivity(), VRActivity.class));
        }
    }

    private void launchAIActivity() {
        if (getActivity() != null) {
            getActivity().startActivity(new Intent(getActivity(), AIActivity.class));
        }
    }


    @Override
    public void onDetach() {
        super.onDetach();
    }
}