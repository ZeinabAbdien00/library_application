package com.librari.librari;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.librari.librari.databinding.ActivityAdminFragmentBinding;

import java.util.ArrayList;

public class AdminFragment extends AppCompatActivity {

    private ActivityAdminFragmentBinding binding;

    RecyclerView rv;
    ArrayList<Data> arrayData;
    rvAdapter object;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAdminFragmentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard/*, R.id.navigation_notifications*/)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_admin_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        //Intent intent2 = getIntent();

        arrayData = new ArrayList<>();

        arrayData.add(new Data("Book" , "suzan" , R.drawable.ic_launcher_background , "URL"));
        arrayData.add(new Data("Book" , "suzan" , R.drawable.ic_launcher_background , "URL"));
        arrayData.add(new Data("Book" , "suzan" , R.drawable.ic_launcher_background , "URL"));
        arrayData.add(new Data("Book" , "suzan" , R.drawable.ic_launcher_background , "URL"));
        arrayData.add(new Data("Book" , "suzan" , R.drawable.ic_launcher_background , "URL"));
        arrayData.add(new Data("Book" , "suzan" , R.drawable.ic_launcher_background , "URL"));
        arrayData.add(new Data("Book" , "suzan" , R.drawable.ic_launcher_background , "URL"));
        arrayData.add(new Data("Book" , "suzan" , R.drawable.ic_launcher_background , "URL"));



        // pdf

        object = new rvAdapter(this,arrayData);
        rv =findViewById(R.id.recyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rv.setLayoutManager(manager);
        rv.setAdapter(object);


    }

}