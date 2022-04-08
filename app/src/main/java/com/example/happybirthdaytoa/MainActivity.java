package com.example.happybirthdaytoa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            String s = "";
            int a = Integer.parseInt(s);
            System.out.println(a);
        } catch (Exception ex) {
            Log.e(LOG_TAG, "Exception line 19");
        }
    }
}