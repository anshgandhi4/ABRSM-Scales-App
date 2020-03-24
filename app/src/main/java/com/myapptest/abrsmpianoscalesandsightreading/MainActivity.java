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
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //Button button = findViewById(R.id.button);

    //TODO: DARK MODE, SETTING SAVING, CODE OPTIMIZATION (.equals for strings), BUILTIN METRONOME
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
        //SettingsActivity settingsData = new SettingsActivity();
        Intent grade8Intent = new Intent(this, Grade8Activity.class);
        startActivity(grade8Intent);

        /*String buttonDestination = settingsData.getGrade();

        if (buttonDestination.equals("SettingsActivity")) {
            button.setText(R.string.settings);
            Intent settingsIntent = new Intent(this, SettingsActivity.class);
            startActivity(settingsIntent);
        } else if (buttonDestination.equals("Grade1Activity")) {
            button.setText(R.string.menu_g1);
            Intent grade1Intent = new Intent(this, MainActivity.class);
            startActivity(grade1Intent);
        } else if (buttonDestination.equals("Grade2Activity")) {
            button.setText(R.string.menu_g2);
            Intent grade2Intent = new Intent(this, MainActivity.class);
            startActivity(grade2Intent);
        } else if (buttonDestination.equals("Grade3Activity")) {
            button.setText(R.string.menu_g3);
            Intent grade3Intent = new Intent(this, MainActivity.class);
            startActivity(grade3Intent);
        } else if (buttonDestination.equals("Grade4Activity")) {
            button.setText(R.string.menu_g4);
            Intent grade4Intent = new Intent(this, MainActivity.class);
            startActivity(grade4Intent);
        } else if (buttonDestination.equals("Grade5Activity")) {
            button.setText(R.string.menu_g5);
            Intent grade5Intent = new Intent(this, MainActivity.class);
            startActivity(grade5Intent);
        } else if (buttonDestination.equals("Grade6Activity")) {
            button.setText(R.string.menu_g6);
            Intent grade6Intent = new Intent(this, MainActivity.class);
            startActivity(grade6Intent);
        } else if (buttonDestination.equals("Grade7Activity")) {
            button.setText(R.string.menu_g7);
            Intent grade7Intent = new Intent(this, MainActivity.class);
            startActivity(grade7Intent);
        } else if (buttonDestination.equals("Grade8Activity")) {
            button.setText(R.string.menu_g8);
            Intent grade8Intent = new Intent(this, Grade8Activity.class);
            startActivity(grade8Intent);
        }*/
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
            Intent g1Intent = new Intent(this, Grade1Activity.class);
            startActivity(g1Intent);
        } else if (id == R.id.nav_g2) {
            Intent g2Intent = new Intent(this, Grade2Activity.class);
            startActivity(g2Intent);
        } else if (id == R.id.nav_g3) {
            Intent g3Intent = new Intent(this, Grade3Activity.class);
            startActivity(g3Intent);
        } else if (id == R.id.nav_g4) {
            Intent g4Intent = new Intent(this, Grade4Activity.class);
            startActivity(g4Intent);
        } else if (id == R.id.nav_g5) {
            Intent g5Intent = new Intent(this, Grade5Activity.class);
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
