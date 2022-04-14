package com.example.fragmenttofragmentcoommunication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MessageFragment.OnMessageKinzaListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if(findViewById(R.id.kinzaContainer) != null){

            if(savedInstanceState != null)
            {
                return;
            }


            MessageFragment messageFragment = new MessageFragment();

            getSupportFragmentManager().beginTransaction().add(R.id.kinzaContainer, messageFragment, null)
                    .commit();

        }



    }

    @Override
    public void onKinzaMessage(String message) {

        DisplayFragment displayFragment = new DisplayFragment();

        Bundle bundle = new Bundle();

        bundle.putString("💕💕kinza💕💕", message);

        displayFragment.setArguments(bundle);

        getSupportFragmentManager().beginTransaction().replace(R.id.kinzaContainer, displayFragment, null)
                .addToBackStack(null).commit();
    }
}