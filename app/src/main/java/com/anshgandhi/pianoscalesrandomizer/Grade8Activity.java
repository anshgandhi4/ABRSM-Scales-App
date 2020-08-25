/*
 * Copyright © 2020 Ansh Gandhi
 *
 * This file is part of Piano Scales Randomizer.
 *
 * Piano Scales Randomizer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Piano Scales Randomizer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Piano Scales Randomizer.  If not, see <https://www.gnu.org/licenses/>.
 *
 * Original Author: Ansh Gandhi
 * Original Source Code: <https://github.com/anshgandhi4/ABRSM-Scales-App/>
 * Original App: <https://play.google.com/store/apps/details?id=com.anshgandhi.pianoscalesrandomizer>
 *
 * EVERYTHING ABOVE THIS LINE MUST BE KEPT AS IS UNDER GNU GPL LICENSE RULES.
 */

package com.anshgandhi.pianoscalesrandomizer;

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

    public void goHome(View view) {
        Intent homeIntent = new Intent(this, MainActivity.class);
        startActivity(homeIntent);
    }
}
