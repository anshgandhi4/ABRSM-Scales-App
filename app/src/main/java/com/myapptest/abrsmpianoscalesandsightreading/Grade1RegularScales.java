package com.myapptest.abrsmpianoscalesandsightreading;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Grade1RegularScales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade1_regular_scales);
        int scaleType = Grade1Scales.getType();

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

        if (scaleType == R.string.contrary_motion_scales) {
            bothText.setTextColor(getResources().getColor(R.color.colorPrimary));
        }

        if (scaleType == R.string.contrary_motion_scales) {
            lengthText.setText(R.string._1_octave);
            harmonicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            melodicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            leftText.setTextColor(getResources().getColor(R.color.colorPrimary));
            rightText.setTextColor(getResources().getColor(R.color.colorPrimary));
        }

        if (scaleType == R.string.broken_chords) {
            lengthText.setText(R.string._1_octave);
            speedText.setText(R.string._46_dq);
            melodicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            bothText.setTextColor(getResources().getColor(R.color.colorPrimary));
        }
    }

    public void goToGrade1(View view) {
        Intent grade1Intent = new Intent(this, Grade1Activity.class);
        startActivity(grade1Intent);
    }

    public void reset1() {
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
        speedText.setText(R.string._60_q);
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
        int scaleType = Grade1Scales.getType();
        TextView keyText = findViewById(R.id.keyText);
        TextView speedText = findViewById(R.id.speedText);
        TextView lengthText = findViewById(R.id.lengthText);
        TextView majorText = findViewById(R.id.majorText);
        TextView harmonicText = findViewById(R.id.minorText);
        TextView melodicText = findViewById(R.id.melodicText);
        TextView leftText = findViewById(R.id.leftText);
        TextView rightText = findViewById(R.id.rightText);
        TextView bothText = findViewById(R.id.bothText);

        reset1();

        Random randint = new Random();
        int value;

        if (scaleType == R.string.regular_scales) {
            bothText.setTextColor(getResources().getColor(R.color.colorPrimary));

            value = randint.nextInt(2);
            if (value == 0) {leftText.setTypeface(null,Typeface.NORMAL);}
            else {rightText.setTypeface(null,Typeface.NORMAL);}

            value = randint.nextInt(3);
            majorText.setTypeface(null,Typeface.NORMAL);
            harmonicText.setTypeface(null,Typeface.NORMAL);
            melodicText.setTypeface(null,Typeface.NORMAL);
            if (value == 0) {majorText.setTypeface(null,Typeface.BOLD);}
            else if (value == 1) {harmonicText.setTypeface(null,Typeface.BOLD);}
            else {melodicText.setTypeface(null,Typeface.BOLD);}
            //TODO: ADD NATURAL/HARMONIC/MELODIC TO SETTINGS

            if (value == 0) {
                value = randint.nextInt(4);
                if (value == 0) {keyText.setText(R.string.c);}
                else if (value == 1) {keyText.setText(R.string.g);}
                else if (value == 2) {keyText.setText(R.string.d);}
                else {keyText.setText(R.string.f);}
            } else {
                value = randint.nextInt(2);
                if (value == 0) {keyText.setText(R.string.a);}
                else {keyText.setText(R.string.d);}
            }
        }

        if (scaleType == R.string.contrary_motion_scales) {
            lengthText.setText(R.string._1_octave);
            harmonicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            melodicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            leftText.setTextColor(getResources().getColor(R.color.colorPrimary));
            rightText.setTextColor(getResources().getColor(R.color.colorPrimary));

            keyText.setText(R.string.c);
        }

        if (scaleType == R.string.broken_chords) {
            lengthText.setText(R.string._1_octave);
            speedText.setText(R.string._46_dq);
            melodicText.setTextColor(getResources().getColor(R.color.colorPrimary));
            bothText.setTextColor(getResources().getColor(R.color.colorPrimary));

            value = randint.nextInt(2);
            if (value == 0) {leftText.setTypeface(null,Typeface.NORMAL);}
            else {rightText.setTypeface(null,Typeface.NORMAL);}

            value = randint.nextInt(2);
            if (value == 0) {majorText.setTypeface(null,Typeface.NORMAL);}
            else {harmonicText.setTypeface(null,Typeface.NORMAL);}

            if (value == 1) {
                value = randint.nextInt(3);
                if (value == 0) {keyText.setText(R.string.c);}
                else if (value == 1) {keyText.setText(R.string.g);}
                else {keyText.setText(R.string.f);}
            } else {
                value = randint.nextInt(2);
                if (value == 0) {keyText.setText(R.string.a);}
                else {keyText.setText(R.string.d);}
            }
        }
    }
}