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
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Grade4RegularScales extends AppCompatActivity {

    String minorType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade4_regular_scales);
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

        scaleText.setText(scaleType);

        if (SaveSettings.getG345() == SaveSettings.HARMONIC345) minorType = getResources().getString(R.string.harmonic);
        else minorType = getResources().getString(R.string.melodic);

        randomize();
    }

    public void goToGrade4(View view) {
        Intent grade4Intent = new Intent(this, Grade4Activity.class);
        startActivity(grade4Intent);
    }

    private void reset4() {
        TextView keyText = findViewById(R.id.keyText);
        TextView speedText = findViewById(R.id.speedText);
        TextView lengthText = findViewById(R.id.lengthText);

        TextView majorText = findViewById(R.id.majorText);
        TextView harmonicText = findViewById(R.id.minorText);
        TextView melodicText = findViewById(R.id.melodicText);

        TextView leftText = findViewById(R.id.leftText);
        TextView rightText = findViewById(R.id.rightText);
        TextView bothText = findViewById(R.id.bothText);

        keyText.setText(R.string.blank);
        speedText.setText(R.string._52);
        lengthText.setText(R.string._2_octaves);

        majorText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        harmonicText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        melodicText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        majorText.setTypeface(null, Typeface.BOLD);
        harmonicText.setTypeface(null,Typeface.BOLD);
        melodicText.setTypeface(null,Typeface.BOLD);

        leftText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        rightText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        bothText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        leftText.setTypeface(null,Typeface.BOLD);
        rightText.setTypeface(null,Typeface.BOLD);
        bothText.setTypeface(null,Typeface.BOLD);
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

        reset4();

        Random randint = new Random();
        int value;

        if (scaleType == R.string.regular_scales) {
            harmonicText.setText(minorType);
            melodicText.setTextColor(getResources().getColor(R.color.colorPrimary));

            value = randint.nextInt(4);
            leftText.setTypeface(null,Typeface.NORMAL);
            rightText.setTypeface(null,Typeface.NORMAL);
            bothText.setTypeface(null,Typeface.NORMAL);
            if (value == 0) leftText.setTypeface(null,Typeface.BOLD);
            else if (value == 1) rightText.setTypeface(null,Typeface.BOLD);
            else bothText.setTypeface(null,Typeface.BOLD);

            value = randint.nextInt(2);
            if (value == 0) majorText.setTypeface(null,Typeface.NORMAL);
            else harmonicText.setTypeface(null,Typeface.NORMAL);

            if (value == 0) {
                value = randint.nextInt(5);
                if (value == 0) keyText.setText(R.string.b);
                else if (value == 1) keyText.setText(R.string.b_flat);
                else if (value == 2) keyText.setText(R.string.e_flat);
                else if (value == 3) keyText.setText(R.string.a_flat);
                else keyText.setText(R.string.d_flat);
            } else {
                value = randint.nextInt(4);
                if (value == 0) keyText.setText(R.string.c_sharp);
                else if (value == 1) keyText.setText(R.string.g_sharp);
                else if (value == 2) keyText.setText(R.string.c);
                else keyText.setText(R.string.f);
            }
        } else if (scaleType == R.string.contrary_motion_scales) {
            lengthText.setText(R.string._2_octaves);
            melodicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            leftText.setTextColor(getResources().getColor(R.color.colorPrimary));
            rightText.setTextColor(getResources().getColor(R.color.colorPrimary));

            value = randint.nextInt(2);
            if (value == 0) majorText.setTypeface(null,Typeface.NORMAL);
            else harmonicText.setTypeface(null,Typeface.NORMAL);

            if (value == 0) {
                value = randint.nextInt(2);
                if (value == 0) keyText.setText(R.string.d);
                else keyText.setText(R.string.c);
            } else {
                value = randint.nextInt(2);
                if (value == 0) keyText.setText(R.string.f);
                else keyText.setText(R.string.e_flat);
            }
        } else if (scaleType == R.string.chromatic_scales) {
            majorText.setTextColor(getResources().getColor(R.color.colorPrimary));
            harmonicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            melodicText.setTextColor(getResources().getColor(R.color.colorPrimary));

            value = randint.nextInt(4);
            leftText.setTypeface(null,Typeface.NORMAL);
            rightText.setTypeface(null,Typeface.NORMAL);
            bothText.setTypeface(null,Typeface.NORMAL);
            if (value == 0) leftText.setTypeface(null,Typeface.BOLD);
            else if (value == 1) rightText.setTypeface(null,Typeface.BOLD);
            else bothText.setTypeface(null,Typeface.BOLD);

            value = randint.nextInt(5);
            if (value == 0) keyText.setText(R.string.d_flat_c_sharp);
            else if (value == 1) keyText.setText(R.string.e_flat_d_sharp);
            else if (value == 2) keyText.setText(R.string.g_flat_f_sharp);
            else if (value == 3) keyText.setText(R.string.a_flat_g_sharp);
            else keyText.setText(R.string.b_flat_a_sharp);
        } else if (scaleType == R.string.arpeggios) {
            speedText.setText(R.string._76_q);
            harmonicText.setText(getResources().getString(R.string.minor));
            melodicText.setTextColor(getResources().getColor(R.color.colorPrimary));

            value = randint.nextInt(4);
            leftText.setTypeface(null,Typeface.NORMAL);
            rightText.setTypeface(null,Typeface.NORMAL);
            bothText.setTypeface(null,Typeface.NORMAL);
            if (value == 0) leftText.setTypeface(null,Typeface.BOLD);
            else if (value == 1) rightText.setTypeface(null,Typeface.BOLD);
            else bothText.setTypeface(null,Typeface.BOLD);

            value = randint.nextInt(2);
            if (value == 0) majorText.setTypeface(null,Typeface.NORMAL);
            else harmonicText.setTypeface(null,Typeface.NORMAL);

            if (value == 1) {
                value = randint.nextInt(5);
                if (value == 0) keyText.setText(R.string.b);
                else if (value == 1) keyText.setText(R.string.b_flat);
                else if (value == 2) keyText.setText(R.string.e_flat);
                else if (value == 3) keyText.setText(R.string.a_flat);
                else keyText.setText(R.string.d_flat);
            } else {
                value = randint.nextInt(4);
                if (value == 0) keyText.setText(R.string.c_sharp);
                else if (value == 1) keyText.setText(R.string.g_sharp);
                else if (value == 2) keyText.setText(R.string.c);
                else keyText.setText(R.string.f);
            }
        }
    }
}