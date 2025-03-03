package com.example;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.fragments.Page1Fragment;
import com.example.fragments.Page2Fragment;

public class ViewPageAdapter extends FragmentStateAdapter {
    public ViewPageAdapter(@NonNull FragmentActivity fragmentActivity)
    {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position)
    {
        switch (position)
        {
            case 0 : return  new Page1Fragment();
            case 1 : return  new Page2Fragment();
            case 2 : return  new Page1Fragment();
            case 3 : return  new Page1Fragment();
            default: return  new Page1Fragment();
        }
    }
    @Override
    public int getItemCount(){
        return 4;
    }

}
