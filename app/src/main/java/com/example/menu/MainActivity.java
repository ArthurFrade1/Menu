package com.example.menu;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.example.menu.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
       // NavigationUI.setupWithNavController(binding.navView, navController);

        ImageView imageView = findViewById(R.id.imageView);
        AnimationDrawable animation = (AnimationDrawable) imageView.getDrawable();

        ConstraintLayout container = findViewById(R.id.container);
        ScrollView scrollView = findViewById(R.id.scrollview);

        container.setBackgroundResource(R.color.white);
        scrollView.setBackgroundResource(R.color.white);


        animation.start();
    }
    public void Tal(View V){}


}