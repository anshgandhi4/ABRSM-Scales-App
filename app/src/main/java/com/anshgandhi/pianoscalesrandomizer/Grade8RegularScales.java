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
 * Original Source Code: <https://github.com/anshipie/ABRSM-Scales-App/>
 * Original App: Waiting for Publish
 *
 * EVERYTHING ABOVE THIS LINE MUST BE KEPT AS IS UNDER GNU GPL LICENSE RULES.
 */

package com.anshgandhi.pianoscalesrandomizer;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class Grade8RegularScales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade8_regular_scales);
        int scaleType = ScaleType.getType();

        TextView scaleText = findViewById(R.id.scaleText);
        TextView keyText = findViewById(R.id.keyText);
        TextView speedText = findViewById(R.id.speedText);
        TextView lengthText = findViewById(R.id.lengthText);

        TextView majorText = findViewById(R.id.majorText);
        TextView harmonicText = findViewById(R.id.minorText);
        TextView melodicText = findViewById(R.id.melodicText);

        TextView leftText = findViewById(R.id.leftText);
        TextView rightText = findViewById(R.id.rightText);
        TextView bothText = findViewById(R.id.bothText);

        TextView legatoText = findViewById(R.id.legatoText);
        TextView staccatoText = findViewById(R.id.staccatoText);

        scaleText.setText(scaleType);

        randomize();
    }

    public void goToGrade8(View view) {
        Intent grade8Intent = new Intent(this, Grade8Activity.class);
        startActivity(grade8Intent);
    }

    private void reset8() {
        TextView keyText = findViewById(R.id.keyText);
        TextView speedText = findViewById(R.id.speedText);
        TextView lengthText = findViewById(R.id.lengthText);

        TextView majorText = findViewById(R.id.majorText);
        TextView harmonicText = findViewById(R.id.minorText);
        TextView melodicText = findViewById(R.id.melodicText);

        TextView leftText = findViewById(R.id.leftText);
        TextView rightText = findViewById(R.id.rightText);
        TextView bothText = findViewById(R.id.bothText);

        TextView legatoText = findViewById(R.id.legatoText);
        TextView staccatoText = findViewById(R.id.staccatoText);

        keyText.setText(R.string.blank);
        speedText.setText(R.string._88);
        lengthText.setText(R.string._4_octaves);

        majorText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        harmonicText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        melodicText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        majorText.setTypeface(null,Typeface.BOLD);
        harmonicText.setTypeface(null,Typeface.BOLD);
        melodicText.setTypeface(null,Typeface.BOLD);

        leftText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        rightText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        bothText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        leftText.setTypeface(null,Typeface.BOLD);
        rightText.setTypeface(null,Typeface.BOLD);
        bothText.setTypeface(null,Typeface.BOLD);

        legatoText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        staccatoText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        legatoText.setTypeface(null,Typeface.BOLD);
        staccatoText.setTypeface(null,Typeface.BOLD);
    }

    public void randomize(View view) {
        randomize();
    }

    public void randomize() {
        int scaleType = ScaleType.getType();
        TextView keyText = findViewById(R.id.keyText);
        TextView speedText = findViewById(R.id.speedText);
        TextView lengthText = findViewById(R.id.lengthText);
        TextView majorText = findViewById(R.id.majorText);
        TextView harmonicText = findViewById(R.id.minorText);
        TextView melodicText = findViewById(R.id.melodicText);
        TextView leftText = findViewById(R.id.leftText);
        TextView rightText = findViewById(R.id.rightText);
        TextView bothText = findViewById(R.id.bothText);
        TextView legatoText = findViewById(R.id.legatoText);
        TextView staccatoText = findViewById(R.id.staccatoText);

        reset8();

        Random randint = new Random();
        int value;

        if (scaleType == R.string.scales_a_third_apart || scaleType == R.string.scales_a_sixth_apart) {
            speedText.setText(R.string._63);
            melodicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            leftText.setTextColor(getResources().getColor(R.color.colorPrimary));
            rightText.setTextColor(getResources().getColor(R.color.colorPrimary));

            value = randint.nextInt(2);
            if (value == 0) majorText.setTypeface(null,Typeface.NORMAL);
            else harmonicText.setTypeface(null,Typeface.NORMAL);

            value = randint.nextInt(2);
            if (value == 0) legatoText.setTypeface(null,Typeface.NORMAL);
            else staccatoText.setTypeface(null,Typeface.NORMAL);

            value = randint.nextInt(8);
            if (value == 0) keyText.setText(R.string.c);
            else if (value == 1) keyText.setText(R.string.d);
            else if (value == 2) keyText.setText(R.string.b);
            else if (value == 3) keyText.setText(R.string.f_sharp);
            else if (value == 4) keyText.setText(R.string.f);
            else if (value == 5) keyText.setText(R.string.e_flat);
            else if (value == 6) keyText.setText(R.string.a_flat_g_sharp);
            else keyText.setText(R.string.d_flat_c_sharp);
        } else if (scaleType == R.string.whole_tone_scale) {
            lengthText.setText(R.string._2_octaves);
            majorText.setTextColor(getResources().getColor(R.color.colorPrimary));
            harmonicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            melodicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            staccatoText.setTextColor(getResources().getColor(R.color.colorPrimary));
            keyText.setText(R.string.e);

            value = randint.nextInt(4);
            leftText.setTypeface(null,Typeface.NORMAL);
            rightText.setTypeface(null,Typeface.NORMAL);
            bothText.setTypeface(null,Typeface.NORMAL);
            if (value == 0) leftText.setTypeface(null,Typeface.BOLD);
            else if (value == 1) rightText.setTypeface(null,Typeface.BOLD);
            else bothText.setTypeface(null,Typeface.BOLD);
        } else if (scaleType == R.string.regular_scales) {
            value = randint.nextInt(3);
            majorText.setTypeface(null,Typeface.NORMAL);
            harmonicText.setTypeface(null,Typeface.NORMAL);
            melodicText.setTypeface(null,Typeface.NORMAL);
            if (value == 0) majorText.setTypeface(null,Typeface.BOLD);
            else if (value == 1) harmonicText.setTypeface(null,Typeface.BOLD);
            else melodicText.setTypeface(null,Typeface.BOLD);

            value = randint.nextInt(2);
            if (value == 0) legatoText.setTypeface(null,Typeface.NORMAL);
            else staccatoText.setTypeface(null,Typeface.NORMAL);

            value = randint.nextInt(4);
            leftText.setTypeface(null,Typeface.NORMAL);
            rightText.setTypeface(null,Typeface.NORMAL);
            bothText.setTypeface(null,Typeface.NORMAL);
            if (value == 0) leftText.setTypeface(null,Typeface.BOLD);
            else if (value == 1) rightText.setTypeface(null,Typeface.BOLD);
            else bothText.setTypeface(null,Typeface.BOLD);

            value = randint.nextInt(8);
            if (value == 0) keyText.setText(R.string.c);
            else if (value == 1) keyText.setText(R.string.d);
            else if (value == 2) keyText.setText(R.string.b);
            else if (value == 3) keyText.setText(R.string.f_sharp);
            else if (value == 4) keyText.setText(R.string.f);
            else if (value == 5) keyText.setText(R.string.e_flat);
            else if (value == 6) keyText.setText(R.string.a_flat_g_sharp);
            else keyText.setText(R.string.d_flat_c_sharp);
        } else if (scaleType == R.string.dominant_sevenths) {
            speedText.setText(R.string._66);
            majorText.setTextColor(getResources().getColor(R.color.colorPrimary));
            harmonicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            melodicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            staccatoText.setTextColor(getResources().getColor(R.color.colorPrimary));

            value = randint.nextInt(4);
            leftText.setTypeface(null,Typeface.NORMAL);
            rightText.setTypeface(null,Typeface.NORMAL);
            bothText.setTypeface(null,Typeface.NORMAL);
            if (value == 0) leftText.setTypeface(null,Typeface.BOLD);
            else if (value == 1) rightText.setTypeface(null,Typeface.BOLD);
            else bothText.setTypeface(null,Typeface.BOLD);

            value = randint.nextInt(8);
            if (value == 0) keyText.setText(R.string.c);
            else if (value == 1) keyText.setText(R.string.d);
            else if (value == 2) keyText.setText(R.string.b);
            else if (value == 3) keyText.setText(R.string.f_sharp);
            else if (value == 4) keyText.setText(R.string.f);
            else if (value == 5) keyText.setText(R.string.e_flat);
            else if (value == 6) keyText.setText(R.string.a_flat);
            else keyText.setText(R.string.d_flat);
        } else if (scaleType == R.string.legato_scales_in_thirds) {
            lengthText.setText(R.string._2_octaves);
            speedText.setText(R.string._52);
            majorText.setTextColor(getResources().getColor(R.color.colorPrimary));
            harmonicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            melodicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            staccatoText.setTextColor(getResources().getColor(R.color.colorPrimary));
            bothText.setTextColor(getResources().getColor(R.color.colorPrimary));

            value = randint.nextInt(2);
            if (value == 0) leftText.setTypeface(null,Typeface.NORMAL);
            else rightText.setTypeface(null,Typeface.NORMAL);

            value = randint.nextInt(2);
            if (value == 0) keyText.setText(R.string.c);
            else keyText.setText(R.string.b_flat);
        } else if (scaleType == R.string.chromatic_scale_in_minor_thirds) {
            lengthText.setText(R.string._2_octaves);
            speedText.setText(R.string._52);
            majorText.setTextColor(getResources().getColor(R.color.colorPrimary));
            harmonicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            melodicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            staccatoText.setTextColor(getResources().getColor(R.color.colorPrimary));
            bothText.setTextColor(getResources().getColor(R.color.colorPrimary));
            keyText.setText(R.string.a_sharp_c_sharp);

            value = randint.nextInt(2);
            if (value == 0) leftText.setTypeface(null,Typeface.NORMAL);
            else rightText.setTypeface(null,Typeface.NORMAL);
        } else if (scaleType == R.string.chromatic_scales_a_minor_third_apart) {
            speedText.setText(R.string._76);
            majorText.setTextColor(getResources().getColor(R.color.colorPrimary));
            harmonicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            melodicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            leftText.setTextColor(getResources().getColor(R.color.colorPrimary));
            rightText.setTextColor(getResources().getColor(R.color.colorPrimary));

            value = randint.nextInt(2);
            if (value == 0) legatoText.setTypeface(null,Typeface.NORMAL);
            else staccatoText.setTypeface(null,Typeface.NORMAL);

            value = randint.nextInt(12);
            if (value == 0) keyText.setText(R.string.a);
            else if (value == 1) keyText.setText(R.string.b_flat_a_sharp);
            else if (value == 2) keyText.setText(R.string.b);
            else if (value == 3) keyText.setText(R.string.c);
            else if (value == 4) keyText.setText(R.string.d_flat_c_sharp);
            else if (value == 5) keyText.setText(R.string.d);
            else if (value == 6) keyText.setText(R.string.e_flat_d_sharp);
            else if (value == 7) keyText.setText(R.string.e);
            else if (value == 8) keyText.setText(R.string.f);
            else if (value == 9) keyText.setText(R.string.g_flat_f_sharp);
            else if (value == 10) keyText.setText(R.string.g);
            else keyText.setText(R.string.a_flat_g_sharp);
        } else if (scaleType == R.string.diminished_sevenths) {
            speedText.setText(R.string._66);
            majorText.setTextColor(getResources().getColor(R.color.colorPrimary));
            harmonicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            melodicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            staccatoText.setTextColor(getResources().getColor(R.color.colorPrimary));

            value = randint.nextInt(4);
            leftText.setTypeface(null,Typeface.NORMAL);
            rightText.setTypeface(null,Typeface.NORMAL);
            bothText.setTypeface(null,Typeface.NORMAL);
            if (value == 0) leftText.setTypeface(null,Typeface.BOLD);
            else if (value == 1) rightText.setTypeface(null,Typeface.BOLD);
            else bothText.setTypeface(null,Typeface.BOLD);

            value = randint.nextInt(12);
            if (value == 0) keyText.setText(R.string.a);
            else if (value == 1) keyText.setText(R.string.b_flat_a_sharp);
            else if (value == 2) keyText.setText(R.string.b);
            else if (value == 3) keyText.setText(R.string.c);
            else if (value == 4) keyText.setText(R.string.d_flat_c_sharp);
            else if (value == 5) keyText.setText(R.string.d);
            else if (value == 6) keyText.setText(R.string.e_flat_d_sharp);
            else if (value == 7) keyText.setText(R.string.e);
            else if (value == 8) keyText.setText(R.string.f);
            else if (value == 9) keyText.setText(R.string.g_flat_f_sharp);
            else if (value == 10) keyText.setText(R.string.g);
            else keyText.setText(R.string.a_flat_g_sharp);
        }
    }
}
