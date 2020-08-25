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
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //TODO: DARK MODE, CODE OPTIMIZATION (.equals for strings), BUILTIN METRONOME, TABLET SUPPORT
    //TODO: ADD RANDOMIZING FOR EACH GRADE
    //TODO: FIX QUARTER NOTE

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void shortcut(View view) {
        Intent settingsIntent = new Intent(this, SettingsActivity.class);
        startActivity(settingsIntent);
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
