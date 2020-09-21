package com.example.jaypatel_ceng319lab1_ex1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BottomFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BottomFragment extends Fragment
{
    private TextView messageTextView;

    public BottomFragment() {
        // Required empty public constructor
    }

    public static BottomFragment newInstance(String param1, String param2) {
        BottomFragment fragment = new BottomFragment();
        return fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_bottom, container, false);

        messageTextView = view.findViewById(R.id.message_tv);

        showToast(R.string.on_create_view);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        showToast(R.string.on_start);
    }

    void setMessage(String message) {
        if (messageTextView != null) {
            messageTextView.setText(message);
        }
    }

    private void showToast(int messageId)
    {
        Toast.makeText(getContext(), messageId, Toast.LENGTH_SHORT).show();
    }

}