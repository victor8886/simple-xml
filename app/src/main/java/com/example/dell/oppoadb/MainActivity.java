package com.example.dell.oppoadb;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ComponentName componentName = new ComponentName("com.android.settings", "com.android.settings.OppoAdbSettingsActivity");
        Intent intent = new Intent();
        intent.setComponent(componentName);
        startActivity(intent);
        finish();
        

    }
}
