package com.myapptest.abrsmpianoscalesandsightreading;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Grade6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade6);
    }

    public void regularScales(View view) {
        Grade6Scales.setType(R.string.regular_scales);
        Intent regularScalesIntent = new Intent(this, Grade6RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void staccatoScales(View view) {
        Grade6Scales.setType(R.string.staccato_scales);
        Intent regularScalesIntent = new Intent(this, Grade6RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void contraryMotionScales(View view) {
        Grade6Scales.setType(R.string.contrary_motion_scales);
        Intent regularScalesIntent = new Intent(this, Grade6RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void staccatoScalesInThirds(View view) {
        Grade6Scales.setType(R.string.staccato_scales_in_thirds);
        Intent regularScalesIntent = new Intent(this, Grade6RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void chromaticScales(View view) {
        Grade6Scales.setType(R.string.chromatic_scales);
        Intent regularScalesIntent = new Intent(this, Grade6RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void chromaticContraryMotionScales(View view) {
        Grade6Scales.setType(R.string.chromatic_contrary_motion_scales);
        Intent regularScalesIntent = new Intent(this, Grade6RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void arpeggios(View view) {
        Grade6Scales.setType(R.string.arpeggios);
        Intent regularScalesIntent = new Intent(this, Grade6RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void diminishedSevenths(View view) {
        Grade6Scales.setType(R.string.diminished_sevenths);
        Intent regularScalesIntent = new Intent(this, Grade6RegularScales.class);
        startActivity(regularScalesIntent);
    }
}