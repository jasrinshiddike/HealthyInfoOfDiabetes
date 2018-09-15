package com.jasrin.healthyinfoofdiabetes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button btnDia,btnTyp,btnSmp,btnCns,btnDiet,btnDoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnDia=findViewById(R.id.btn_dia);
        btnTyp=findViewById(R.id.btn_typ);
        btnSmp=findViewById(R.id.btn_smp);
        btnCns=findViewById(R.id.btn_cns);
        btnDiet=findViewById(R.id.btn_diet);
        btnDoc=findViewById(R.id.btn_doc);

        btnDia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name","Diabetes");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Diabetes", Toast.LENGTH_SHORT).show();
            }
        });

        btnTyp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name","Types Of Diabetes");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Types Of Diabetes", Toast.LENGTH_SHORT).show();
            }
        });

        btnSmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name","Symptoms Of Diabetes");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Symptoms Of Diabetes", Toast.LENGTH_SHORT).show();
            }
        });

        btnCns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name","Conciousness Of Diabetes");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Conciousness Of Diabetes", Toast.LENGTH_SHORT).show();
            }
        });

        btnDiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name","Exercise And Diet Plan");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Exercise And Diet Plan", Toast.LENGTH_SHORT).show();
            }
        });

        btnDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,Details1Activity.class);
                intent.putExtra("name","Doctors Info");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Doctors Info", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
