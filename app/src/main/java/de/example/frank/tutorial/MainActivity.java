package de.example.frank.tutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MenuFragment.OnFragmentInteractionListener,TextFragment.OnFragmentInteractionListener
{
    String name= "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onFragmentInteraction(String uri) {
        Toast.makeText(this,uri,Toast.LENGTH_LONG).show();
    }
}
