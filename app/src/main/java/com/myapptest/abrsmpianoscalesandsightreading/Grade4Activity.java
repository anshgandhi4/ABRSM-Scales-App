package com.myapptest.abrsmpianoscalesandsightreading;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Grade4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade4);
    }

    public void regularScales(View view) {
        Grade4Scales.setType(R.string.regular_scales);
        Intent regularScalesIntent = new Intent(this, Grade4RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void contraryMotionScales(View view) {
        Grade4Scales.setType(R.string.contrary_motion_scales);
        Intent regularScalesIntent = new Intent(this, Grade4RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void chromaticScales(View view) {
        Grade4Scales.setType(R.string.chromatic_scales);
        Intent regularScalesIntent = new Intent(this, Grade4RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void arpeggios(View view) {
        Grade4Scales.setType(R.string.arpeggios);
        Intent regularScalesIntent = new Intent(this, Grade4RegularScales.class);
        startActivity(regularScalesIntent);
    }
}