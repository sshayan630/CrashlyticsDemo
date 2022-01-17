package com.example.crashlytics;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.crashlytics.FirebaseCrashlytics;

public class MainActivity extends AppCompatActivity {

    Button btn_crash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true);
        btn_crash = (Button) findViewById(R.id.btn_crash);

        btn_crash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "test", Toast.LENGTH_SHORT).show();
                throw new RuntimeException("Test Crash"); // Force a crash
            }
        });
    }
}