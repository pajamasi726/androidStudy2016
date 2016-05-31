package com.example.yeasangkug.notitlebar;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View v)
    {
        ActionBar actionBar = getSupportActionBar();
        switch(v.getId())
        {
            case R.id.show :
                actionBar.show();
                Toast.makeText(this,"Title show",Toast.LENGTH_SHORT).show();
            break;

            case R.id.hide :
                actionBar.hide();
                Toast.makeText(this,"Title Hide",Toast.LENGTH_SHORT).show();
            break;
        }


    }
}
