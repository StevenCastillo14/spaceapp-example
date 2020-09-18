package com.steven.spaapp.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.steven.spaapp.Planetas;
import com.steven.spaapp.R;



public class HomeFragment extends Fragment implements View.OnClickListener {

    private HomeViewModel homeViewModel;

    ImageView Mercury, Venus, Tierra, Mars, Jupiter, Saturn, Uranus, Neptuno;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_planetas, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        Mercury = (ImageView) root.findViewById(R.id.Mercury);
        Venus = (ImageView) root.findViewById(R.id.Venus);
        Tierra = (ImageView) root.findViewById(R.id.Tierra);
        Mars = (ImageView) root.findViewById(R.id.Mars);
        Jupiter = (ImageView) root.findViewById(R.id.Jupiter);
        Saturn = (ImageView) root.findViewById(R.id.Saturno);
        Uranus = (ImageView) root.findViewById(R.id.Urano);
        Neptuno = (ImageView) root.findViewById(R.id.Neptune);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        Mercury.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Planetas.class);
                intent.putExtra("planeta", "Mercurio");
                startActivity(intent);
            }
        });

        Venus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Planetas.class);
                intent.putExtra("planeta", "Venus");
                startActivity(intent);
            }
        });

        Tierra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Planetas.class);
                intent.putExtra("planeta", "Tierra");
                startActivity(intent);
            }
        });

        Mars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Planetas.class);
                intent.putExtra("planeta", "Marte");
                startActivity(intent);
            }
        });

        Jupiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Planetas.class);
                intent.putExtra("planeta", "Jupiter");
                startActivity(intent);
            }
        });

        Saturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Planetas.class);
                intent.putExtra("planeta", "Saturno");
                startActivity(intent);
            }
        });

        Uranus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Planetas.class);
                intent.putExtra("planeta", "Urano");
                startActivity(intent);
            }
        });

        Neptuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Planetas.class);
                intent.putExtra("planeta", "Neptuno");
                startActivity(intent);
            }
        });
        return root;
    }

    @Override
    public void onClick(View view) {

    }
}