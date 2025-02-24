package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class NavbarFragment extends Fragment {

    public NavbarFragment()
    {
        // required public component
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.navbar,container,false);

        Button homeBtn = view.findViewById(R.id.homeBtn);
        Button profileBtn = view.findViewById(R.id.profileBtn);
        Button settingBtn = view.findViewById(R.id.settingBtn);


        homeBtn.setOnClickListener(v->replaceFragment(new HomeFragment()));
        profileBtn.setOnClickListener(v->replaceFragment(new ProfileFragment()));
        settingBtn.setOnClickListener(v->replaceFragment(new SettingFragment()));

        return  view;
    }

    private  void replaceFragment(Fragment fragment)
    {
        FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container,fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
