package com.myapptest.abrsmpianoscalesandsightreading;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.CompoundButton;
import android.widget.Switch;

public class SettingsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

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

        Switch groupSwitch = findViewById(R.id.groupSwitch);
        Switch ssSwitch = findViewById(R.id.ssSwitch);

        groupSwitch.setChecked(SaveSettings.getG12());
        ssSwitch.setChecked(SaveSettings.getSors());

        groupSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                SaveSettings.setG12(isChecked);
            }
        });
        ssSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                SaveSettings.setSors(isChecked);
            }
        });
    }

    public boolean getG12() {
        return SaveSettings.getG12();
    }

    public boolean getSors() {
        return SaveSettings.getSors();
    }

    public void setG12(Boolean message) {
        SaveSettings.setG12(message);
    }

    public void setSors(Boolean message) {
        SaveSettings.setSors(message);
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
            Intent g1Intent = new Intent(this, MainActivity.class);
            startActivity(g1Intent);
        } else if (id == R.id.nav_g2) {
            Intent g2Intent = new Intent(this, MainActivity.class);
            startActivity(g2Intent);
        } else if (id == R.id.nav_g3) {
            Intent g3Intent = new Intent(this, MainActivity.class);
            startActivity(g3Intent);
        } else if (id == R.id.nav_g4) {
            Intent g4Intent = new Intent(this, MainActivity.class);
            startActivity(g4Intent);
        } else if (id == R.id.nav_g5) {
            Intent g5Intent = new Intent(this, MainActivity.class);
            startActivity(g5Intent);
        } else if (id == R.id.nav_g6) {
            Intent g6Intent = new Intent(this, Grade6Activity.class);
            startActivity(g6Intent);
        } else if (id == R.id.nav_g7) {
            Intent g7Intent = new Intent(this, Grade7Activity.class);
            startActivity(g7Intent);
        } else if (id == R.id.nav_g8) {
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
