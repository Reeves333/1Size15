package com.example.a1size;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.a1size.fragment.CreationFragment;
import com.example.a1size.fragment.PostsFragment;
import com.example.a1size.fragment.SettingsFragment;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";
    private BottomNavigationView Tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final FragmentManager fragmentManager = getSupportFragmentManager();

        Tabs = findViewById(R.id.Tabs);

        Tabs.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment;
                switch (item.getItemId()) {
                    case R.id.Home:
                        fragment = new PostsFragment();
                        Toast.makeText(MainActivity.this, "Home!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.Profile:
                        fragment = new CreationFragment();
                        Toast.makeText(MainActivity.this, "Profile!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.creation:
                        fragment = new CreationFragment();
                        Toast.makeText(MainActivity.this, "Creation!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.settings:
                    default:
                        fragment = new SettingsFragment();
                        Toast.makeText(MainActivity.this, "Settings!", Toast.LENGTH_SHORT).show();
                        break;
                }
                fragmentManager.beginTransaction().replace(R.id.flContainer, fragment).commit();
                return true;
            }

        });
        // Set default selection
        Tabs.setSelectedItemId(R.id.Home);
    }
}

