package com.myapptest.abrsmpianoscalesandsightreading;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Grade5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade5);
    }

    public void regularScales(View view) {
        ScaleType.setType(R.string.regular_scales);
        Intent regularScalesIntent = new Intent(this, Grade5RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void contraryMotionScales(View view) {
        ScaleType.setType(R.string.contrary_motion_scales);
        Intent regularScalesIntent = new Intent(this, Grade5RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void chromaticScales(View view) {
        ScaleType.setType(R.string.chromatic_scales);
        Intent regularScalesIntent = new Intent(this, Grade5RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void chromaticContraryMotionScales(View view) {
        ScaleType.setType(R.string.chromatic_contrary_motion_scales);
        Intent regularScalesIntent = new Intent(this, Grade5RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void arpeggios(View view) {
        ScaleType.setType(R.string.arpeggios);
        Intent regularScalesIntent = new Intent(this, Grade5RegularScales.class);
        startActivity(regularScalesIntent);
    }
}