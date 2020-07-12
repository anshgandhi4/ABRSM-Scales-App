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

public class Grade7Arpeggios extends AppCompatActivity {

    String group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade7_arpeggios);

        if (SaveSettings.getG567() == SaveSettings.GROUP1) group = "group1";
        else group = "group2";

        randomize();
    }

    public void goToGrade7(View view) {
        Intent grade7Intent = new Intent(this, Grade7Activity.class);
        startActivity(grade7Intent);
    }

    private void reset7() {
        TextView keyText = findViewById(R.id.keyText);

        TextView majorText = findViewById(R.id.majorText);
        TextView minorText = findViewById(R.id.minorText);

        TextView leftText = findViewById(R.id.leftText);
        TextView rightText = findViewById(R.id.rightText);
        TextView bothText = findViewById(R.id.bothText);

        TextView rootText = findViewById(R.id.rootText);
        TextView firstText = findViewById(R.id.firstText);

        keyText.setText(R.string.blank);

        majorText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        minorText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        majorText.setTypeface(null, Typeface.BOLD);
        minorText.setTypeface(null, Typeface.BOLD);

        leftText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        rightText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        bothText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        leftText.setTypeface(null,Typeface.BOLD);
        rightText.setTypeface(null,Typeface.BOLD);
        bothText.setTypeface(null,Typeface.BOLD);

        rootText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        firstText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        rootText.setTypeface(null,Typeface.BOLD);
        firstText.setTypeface(null,Typeface.BOLD);
    }

    public void randomize(View view) {
        randomize();
    }

    public void randomize() {
        TextView keyText = findViewById(R.id.keyText);

        TextView majorText = findViewById(R.id.majorText);
        TextView minorText = findViewById(R.id.minorText);

        TextView leftText = findViewById(R.id.leftText);
        TextView rightText = findViewById(R.id.rightText);
        TextView bothText = findViewById(R.id.bothText);

        TextView rootText = findViewById(R.id.rootText);
        TextView firstText = findViewById(R.id.firstText);

        reset7();

        Random randint = new Random();
        int value;

        value = randint.nextInt(2);
        if (value == 0) majorText.setTypeface(null,Typeface.NORMAL);
        else minorText.setTypeface(null,Typeface.NORMAL);

        value = randint.nextInt(4);
        leftText.setTypeface(null,Typeface.NORMAL);
        rightText.setTypeface(null,Typeface.NORMAL);
        bothText.setTypeface(null,Typeface.NORMAL);
        if (value == 0) leftText.setTypeface(null,Typeface.BOLD);
        else if (value == 1) rightText.setTypeface(null,Typeface.BOLD);
        else bothText.setTypeface(null,Typeface.BOLD);

        value = randint.nextInt(2);
        if (value == 0) rootText.setTypeface(null,Typeface.NORMAL);
        else firstText.setTypeface(null,Typeface.NORMAL);

        value = randint.nextInt(6);
        if (group.equals("group1")) {
            if (value == 0) keyText.setText(R.string.c);
            else if (value == 1) keyText.setText(R.string.d);
            else if (value == 2) keyText.setText(R.string.e);
            else if (value == 3) keyText.setText(R.string.f_sharp);
            else if (value == 4) keyText.setText(R.string.b_flat);
            else keyText.setText(R.string.a_flat_g_sharp);
        } else {
            if (value == 0) keyText.setText(R.string.g);
            else if (value == 1) keyText.setText(R.string.a);
            else if (value == 2) keyText.setText(R.string.b);
            else if (value == 3) keyText.setText(R.string.f);
            else if (value == 4) keyText.setText(R.string.e_flat);
            else keyText.setText(R.string.d_flat_c_sharp);
        }
    }
}
