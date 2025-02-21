package com.example.fragments;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

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

        loadFragments(new FragmentsExample());
    }

    private void loadFragments(Fragment fragment)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction= fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.commit();
    }

}