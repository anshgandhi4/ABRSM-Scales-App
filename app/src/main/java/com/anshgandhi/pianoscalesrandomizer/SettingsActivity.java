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
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioGroup;

public class SettingsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private RadioGroup g12;
    private RadioGroup g345;
    private RadioGroup g567;

    public static final String SHARED_PREFS = "settings";
    public static final String G12 = "G12";
    public static final String G345 = "G345";
    public static final String G567 = "G567";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        g12 = findViewById(R.id.g12);
        g345 = findViewById(R.id.g345);
        g567 = findViewById(R.id.g567);

        loadData();
    }

    public void saveData(View v) {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        int g12Checked = g12.getCheckedRadioButtonId();
        int g345Checked = g345.getCheckedRadioButtonId();
        int g567Checked = g567.getCheckedRadioButtonId();

        editor.putInt(G12, g12Checked);
        editor.putInt(G345, g345Checked);
        editor.putInt(G567, g567Checked);
        editor.apply();

        SaveSettings.setG12(g12Checked);
        SaveSettings.setG345(g345Checked);
        SaveSettings.setG567(g567Checked);
    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        int g12Checked = sharedPreferences.getInt(G12, SaveSettings.NATURAL12);
        int g345Checked = sharedPreferences.getInt(G345, SaveSettings.HARMONIC345);
        int g567Checked = sharedPreferences.getInt(G567, SaveSettings.GROUP1);

        SaveSettings.setG12(g12Checked);
        SaveSettings.setG345(g345Checked);
        SaveSettings.setG567(g567Checked);

        g12.check(g12Checked);
        g345.check(g345Checked);
        g567.check(g567Checked);
    }

    // Close Menu When Back Button is Pressed
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    // Handle Menu Click, Close Menu
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent homeIntent = new Intent(this, MainActivity.class);
            startActivity(homeIntent);
        } else if (id == R.id.nav_g1) {
            ScaleType.setGrade(1);
            Intent g1Intent = new Intent(this, Grade1Activity.class);
            startActivity(g1Intent);
        } else if (id == R.id.nav_g2) {
            ScaleType.setGrade(2);
            Intent g2Intent = new Intent(this, Grade2Activity.class);
            startActivity(g2Intent);
        } else if (id == R.id.nav_g3) {
            ScaleType.setGrade(3);
            Intent g3Intent = new Intent(this, Grade3Activity.class);
            startActivity(g3Intent);
        } else if (id == R.id.nav_g4) {
            ScaleType.setGrade(4);
            Intent g4Intent = new Intent(this, Grade4Activity.class);
            startActivity(g4Intent);
        } else if (id == R.id.nav_g5) {
            ScaleType.setGrade(5);
            Intent g5Intent = new Intent(this, Grade5Activity.class);
            startActivity(g5Intent);
        } else if (id == R.id.nav_g6) {
            ScaleType.setGrade(6);
            Intent g6Intent = new Intent(this, Grade6Activity.class);
            startActivity(g6Intent);
        } else if (id == R.id.nav_g7) {
            ScaleType.setGrade(7);
            Intent g7Intent = new Intent(this, Grade7Activity.class);
            startActivity(g7Intent);
        } else if (id == R.id.nav_g8) {
            ScaleType.setGrade(8);
            Intent g8Intent = new Intent(this, Grade8Activity.class);
            startActivity(g8Intent);
        } else if (id == R.id.nav_settings) {
            Intent settingsIntent = new Intent(this, SettingsActivity.class);
            startActivity(settingsIntent);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
