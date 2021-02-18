package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = findViewById(R.id.linearLayout);

        final SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> ls = sensorManager.getSensorList(Sensor.TYPE_ALL);
        List<TextView> ltv = new ArrayList<TextView>();

        for (int i = 0; i < ls.size(); i++) {
            TextView tv = new TextView(this);
            tv.setText(ls.get(i).getName());

            ltv.add(tv);
            linearLayout.addView(ltv.get(i));
        }

    }
}