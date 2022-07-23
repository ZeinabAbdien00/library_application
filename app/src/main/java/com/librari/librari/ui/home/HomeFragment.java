package com.librari.librari.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.librari.librari.Data;
import com.librari.librari.R;
import com.librari.librari.databinding.FragmentHomeBinding;
import com.librari.librari.rvAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    RecyclerView rv;
    ArrayList<Data> arrayData;
    rvAdapter object;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        arrayData = new ArrayList<>();

        arrayData.add(new Data("Book" , "suzan" , R.drawable.ic_launcher_background , "https://www.orimi.com/pdf-test.pdf"));
        arrayData.add(new Data("Book" , "suzan" , R.drawable.ic_launcher_background , "https://www.orimi.com/pdf-test.pdf"));
        arrayData.add(new Data("Book" , "suzan" , R.drawable.ic_launcher_background , "https://www.orimi.com/pdf-test.pdf"));
        arrayData.add(new Data("Book" , "suzan" , R.drawable.ic_launcher_background , "https://www.orimi.com/pdf-test.pdf"));
        arrayData.add(new Data("Book" , "suzan" , R.drawable.ic_launcher_background , "https://www.orimi.com/pdf-test.pdf"));
        arrayData.add(new Data("Book" , "suzan" , R.drawable.ic_launcher_background , "https://www.orimi.com/pdf-test.pdf"));
        arrayData.add(new Data("Book" , "suzan" , R.drawable.ic_launcher_background , "https://www.orimi.com/pdf-test.pdf"));
        arrayData.add(new Data("Book" , "suzan" , R.drawable.ic_launcher_background , "https://www.orimi.com/pdf-test.pdf"));


        object = new rvAdapter(getActivity(),arrayData);
        binding.recyclerView.setAdapter(object);
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}