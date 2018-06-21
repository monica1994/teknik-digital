package com.example.monicaputri.skripsiandry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView Instruction;
    ImageView Objective;
    ImageView Material;
    ImageView Simulation;
    ImageView Evaluation;
    ImageView Credit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Instruction = (ImageView)findViewById(R.id.petunjuk);
        Objective = (ImageView)findViewById(R.id.tujuan);
        Material = (ImageView)findViewById(R.id.materi);
        Simulation = (ImageView)findViewById(R.id.simulasi);
        Evaluation = (ImageView)findViewById(R.id.evaluasi);
        Credit1 = (ImageView)findViewById(R.id.credit);

        Instruction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),PetunjukActivity.class);

                startActivity(i);
            }
        });

        Objective.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(getApplicationContext(),TujuanActivity.class);

                startActivity(j);
            }
        });

        Material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(),MateriActivity.class);

                startActivity(k);
            }
        });

        Simulation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(getApplicationContext(),SimulasiActivity.class);

                startActivity(l);
            }
        });

        Evaluation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(getApplicationContext(),EvaluasiActivity.class);

                startActivity(m);
            }
        });

        Credit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(getApplicationContext(),CreditActivity.class);

                startActivity(n);
            }
        });

    }
}
