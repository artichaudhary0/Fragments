package com.example;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.fragments.DashboardFragment;
import com.example.fragments.HomeFragment;
import com.example.fragments.ProfileFragment;
import com.example.fragments.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {


    /*
        - What is Fragment : Reusable block or portion of user interface that can be
            embedded into an activity. ui manage different section of an app .

            Key Feature of Fragment :
                   - Fragments have their own lifecycle closely related to hosing activity.
                   - can be added , replace or removed dynamically at runtime.
                   - useful for responsive ui, such as adapting layouts for tablets and phone.

        - Lifecycle of a fragment :
            1 ) onAttach()
            2 ) onCreate()
            3 ) onCreateView()
            4 ) onViewCreate()
            5 ) onStart()
            6 ) onResume()
            7 ) onPause()
            8 ) onStop()
            9 ) onDestroyView()
            10 ) onDestroy()
            11 ) onDetach()

        Types of Fragments :
            - Static fragment : Defined in XML.
            - Dynamic fragment : Added programmatically using FragmentManager
    * */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new HomeFragment()).commit();

        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@Nullable MenuItem item){
                Fragment selectedFragments = null;
                switch (item.getItemId())
                {
                    case R.id.nav_home:
                        selectedFragments = new HomeFragment();
                        break;
                    case R.id.nav_dashboard:
                        selectedFragments = new DashboardFragment();
                        break;
                    case R.id.nav_profile :
                        selectedFragments = new ProfileFragment();
                        break;
                    default:
                        break;
                }

                if(selectedFragments != null)
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,selectedFragments).commit();

                }
                return  true;
            }
        });
    }


}