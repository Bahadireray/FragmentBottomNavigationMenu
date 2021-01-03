package com.bahadireray.gezgin.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.bahadireray.gezgin.Fragment.HomeFragment;
import com.bahadireray.gezgin.Fragment.ProfileFragment;
import com.bahadireray.gezgin.Fragment.SettingsFragment;
import com.bahadireray.gezgin.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;

    public void nextFragment(int frameLayoutId, Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(frameLayoutId, fragment).commit();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextFragment(R.id.frameLayout, new HomeFragment());
        bottomNavigationView = findViewById(R.id.bottomNavigation);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.menu_home:
                        nextFragment(R.id.frameLayout, new HomeFragment());
                        break;
                    case R.id.menu_profil:
                        nextFragment(R.id.frameLayout, new ProfileFragment());
                        break;
                    case R.id.menu_setting:
                        nextFragment(R.id.frameLayout, new SettingsFragment());
                        break;
                    default:
                        return false;
                }
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bottom, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
