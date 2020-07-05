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

public class Grade3RegularScales extends AppCompatActivity {

    String minorType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade3_regular_scales);
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

    public void goToGrade3(View view) {
        Intent grade3Intent = new Intent(this, Grade3Activity.class);
        startActivity(grade3Intent);
    }

    private void reset3() {
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
        speedText.setText(R.string._80_q);
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

        reset3();

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
                if (value == 0) keyText.setText(R.string.a);
                else if (value == 1) keyText.setText(R.string.e);
                else if (value == 2) keyText.setText(R.string.b);
                else if (value == 3) keyText.setText(R.string.b_flat);
                else keyText.setText(R.string.e_flat);
            } else {
                value = randint.nextInt(3);
                if (value == 0) keyText.setText(R.string.b);
                else if (value == 1) keyText.setText(R.string.g);
                else keyText.setText(R.string.c);
            }
        } else if (scaleType == R.string.contrary_motion_scales) {
            melodicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            leftText.setTextColor(getResources().getColor(R.color.colorPrimary));
            rightText.setTextColor(getResources().getColor(R.color.colorPrimary));

            value = randint.nextInt(2);
            if (value == 0) majorText.setTypeface(null,Typeface.NORMAL);
            else harmonicText.setTypeface(null,Typeface.NORMAL);

            keyText.setText(R.string.a);
        } else if (scaleType == R.string.chromatic_scales) {
            majorText.setTextColor(getResources().getColor(R.color.colorPrimary));
            harmonicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            melodicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            bothText.setTextColor(getResources().getColor(R.color.colorPrimary));

            value = randint.nextInt(2);
            if (value == 0) leftText.setTypeface(null,Typeface.NORMAL);
            else rightText.setTypeface(null,Typeface.NORMAL);

            value = randint.nextInt(2);
            if (value == 0) keyText.setText(R.string.a_flat);
            else keyText.setText(R.string.c);
        } else if (scaleType == R.string.arpeggios) {
            speedText.setText(R.string._69_q);
            harmonicText.setText(getResources().getString(R.string.minor));
            melodicText.setTextColor(getResources().getColor(R.color.colorPrimary));

            value = randint.nextInt(4);
            leftText.setTypeface(null,Typeface.NORMAL);
            rightText.setTypeface(null,Typeface.NORMAL);
            bothText.setTypeface(null,Typeface.NORMAL);
            if (value == 0) leftText.setTypeface(null,Typeface.BOLD);
            else if (value == 1) rightText.setTypeface(null,Typeface.BOLD);
            else bothText.setTypeface(null,Typeface.BOLD);

            if (value == 2) {
                value = randint.nextInt(2);
                if (value == 0) majorText.setTypeface(null,Typeface.NORMAL);
                else harmonicText.setTypeface(null,Typeface.NORMAL);

                if (value == 1) keyText.setText(R.string.a);
                else keyText.setText(R.string.g);
            } else {
                value = randint.nextInt(2);
                if (value == 0) majorText.setTypeface(null,Typeface.NORMAL);
                else harmonicText.setTypeface(null,Typeface.NORMAL);

                if (value == 1) {
                    value = randint.nextInt(4);
                    if (value == 0) keyText.setText(R.string.e);
                    else if (value == 1) keyText.setText(R.string.b);
                    else if (value == 2) keyText.setText(R.string.b_flat);
                    else keyText.setText(R.string.e_flat);
                } else {
                    value = randint.nextInt(2);
                    if (value == 0) keyText.setText(R.string.b);
                    else keyText.setText(R.string.c);
                }
            }
        }
    }
}