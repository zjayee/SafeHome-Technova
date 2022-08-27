package com.example.technova;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BottomMenu#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BottomMenu extends Fragment {

    View rootView;
    ImageButton profileImageButton;
    ImageButton homeImageButton;
    ImageButton chatImageButton;

    public BottomMenu() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.

     * @return A new instance of fragment BottomMenu.
     */

    public static BottomMenu newInstance() {
        BottomMenu fragment = new BottomMenu();
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
        rootView = inflater.inflate(R.layout.fragment_bottom_menu, container, false);
        setUpButtons();
        return rootView;
    }

    void setUpButtons(){
        profileImageButton = rootView.findViewById(R.id.profile_imagebutton);
        homeImageButton = rootView.findViewById(R.id.home_imagebutton);
        chatImageButton = rootView.findViewById(R.id.chat_imagebutton);

        profileImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ProfileActivity.class);
                startActivity(intent);
            }
        });

        homeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), HomeActivity.class);
                startActivity(intent);
            }
        });

        chatImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ChatActivity.class);
                startActivity(intent);
            }
        });
    }
}