package com.myapptest.abrsmpianoscalesandsightreading;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Grade8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_8);
    }

    public void regularScales(View view) {
        ScaleType.setType(R.string.regular_scales);
        Intent regularScalesIntent = new Intent(this, Grade8RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void scalesAThirdApart(View view) {
        ScaleType.setType(R.string.scales_a_third_apart);
        Intent regularScalesIntent = new Intent(this, Grade8RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void scalesASixthApart(View view) {
        ScaleType.setType(R.string.scales_a_sixth_apart);
        Intent regularScalesIntent = new Intent(this, Grade8RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void wholeToneScale(View view) {
        ScaleType.setType(R.string.whole_tone_scale);
        Intent regularScalesIntent = new Intent(this, Grade8RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void dominantSevenths(View view) {
        ScaleType.setType(R.string.dominant_sevenths);
        Intent regularScalesIntent = new Intent(this, Grade8RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void legatoScalesInThirds(View view) {
        ScaleType.setType(R.string.legato_scales_in_thirds);
        Intent regularScalesIntent = new Intent(this, Grade8RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void chromaticScaleInMinorThirds(View view) {
        ScaleType.setType(R.string.chromatic_scale_in_minor_thirds);
        Intent regularScalesIntent = new Intent(this, Grade8RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void chromaticScalesAMinorThirdApart(View view) {
        ScaleType.setType(R.string.chromatic_scales_a_minor_third_apart);
        Intent regularScalesIntent = new Intent(this, Grade8RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void diminishedSevenths(View view) {
        ScaleType.setType(R.string.diminished_sevenths);
        Intent regularScalesIntent = new Intent(this, Grade8RegularScales.class);
        startActivity(regularScalesIntent);
    }

    public void arpeggios(View view) {
        ScaleType.setType(R.string.arpeggios);
        Intent arpeggiosIntent = new Intent(this, Grade8Arpeggios.class);
        startActivity(arpeggiosIntent);
    }
}
