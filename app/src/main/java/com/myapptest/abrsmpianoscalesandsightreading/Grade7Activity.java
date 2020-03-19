package com.myapptest.abrsmpianoscalesandsightreading;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Grade7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade7);
    }

    public void regularScales(View view) {
        Grade7Scales.setType(R.string.regular_scales);
        Intent regularScalesIntent = new Intent(this, Grade7RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void scalesAThirdApart(View view) {
        Grade7Scales.setType(R.string.scales_a_third_apart);
        Intent regularScalesIntent = new Intent(this, Grade7RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void contraryMotionScales(View view) {
        Grade7Scales.setType(R.string.contrary_motion_scales);
        Intent regularScalesIntent = new Intent(this, Grade7RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void legatoScalesInThirds(View view) {
        Grade7Scales.setType(R.string.legato_scales_in_thirds);
        Intent regularScalesIntent = new Intent(this, Grade7RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void staccatoScalesInSixths(View view) {
        Grade7Scales.setType(R.string.staccato_scales_in_sixths);
        Intent regularScalesIntent = new Intent(this, Grade7RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void chromaticScales(View view) {
        Grade7Scales.setType(R.string.chromatic_scales);
        Intent regularScalesIntent = new Intent(this, Grade7RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void chromaticContraryMotionScales(View view) {
        Grade7Scales.setType(R.string.chromatic_contrary_motion_scales);
        Intent regularScalesIntent = new Intent(this, Grade7RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void arpeggios(View view) {
        Grade7Scales.setType(R.string.arpeggios);
        Intent arpeggiosIntent = new Intent(this, Grade7Arpeggios.class);
        startActivity(arpeggiosIntent);
    }

    public void dominantSevenths(View view) {
        Grade7Scales.setType(R.string.dominant_sevenths);
        Intent regularScalesIntent = new Intent(this, Grade7RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void diminishedSevenths(View view) {
        Grade7Scales.setType(R.string.diminished_sevenths);
        Intent regularScalesIntent = new Intent(this, Grade7RegularScales.class);
        startActivity(regularScalesIntent);
    }
}
