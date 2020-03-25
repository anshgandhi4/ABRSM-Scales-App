package com.myapptest.abrsmpianoscalesandsightreading;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Grade1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade1);
    }

    public void regularScales(View view) {
        Grade1Scales.setType(R.string.regular_scales);
        Intent regularScalesIntent = new Intent(this, Grade1RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void contraryMotionScales(View view) {
        Grade1Scales.setType(R.string.contrary_motion_scales);
        Intent regularScalesIntent = new Intent(this, Grade1RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void brokenChords(View view) {
        Grade1Scales.setType(R.string.broken_chords);
        Intent regularScalesIntent = new Intent(this, Grade1RegularScales.class);
        startActivity(regularScalesIntent);
    }
}