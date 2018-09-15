package com.jasrin.healthyinfoofdiabetes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Details2Activity extends AppCompatActivity {

    TextView txtAdd,txtCon;
    Button btnLoc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2);

        txtAdd=findViewById(R.id.txt_add);
        txtCon=findViewById(R.id.txt_con);

        btnLoc =findViewById(R.id.btn_loc);

        String getName=getIntent().getExtras().getString("name");

        if(getName.equals("Chandgaon Diabatic Center")){
            txtAdd.setText(R.string.address);
            txtCon.setText(R.string.phone);


            btnLoc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(Details2Activity.this,MapsActivity.class);
                    startActivity(intent);
                }
            });

        }

        else if(getName.equals("Plasma Diagnostic & Diabetic Center")){
            txtAdd.setText(R.string.address1);
            txtCon.setText(R.string.phone1);


            btnLoc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(Details2Activity.this,Maps1Activity.class);
                    startActivity(intent);
                }
            });

        }

        else if(getName.equals("The Soul Hart And Diabetic Center")){
            txtAdd.setText(R.string.address2);
            txtCon.setText(R.string.phone2);


            btnLoc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(Details2Activity.this,Maps2Activity.class);
                    startActivity(intent);
                }
            });

        }

        else if(getName.equals("Dr. Mamun's Diabetes Specialities Center")){
            txtAdd.setText(R.string.address3);
            txtCon.setText(R.string.phone3);


            btnLoc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(Details2Activity.this,Maps3Activity.class);
                    startActivity(intent);
                }
            });

        }

        else if(getName.equals("Chittagong Diabetic General Hospital")){
            txtAdd.setText(R.string.address4);
            txtCon.setText(R.string.phone4);


            btnLoc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(Details2Activity.this,Maps4Activity.class);
                    startActivity(intent);
                }
            });

        }

        else if(getName.equals("Patiya Diabetes Hospital")){
            txtAdd.setText(R.string.address5);
            txtCon.setText(R.string.phone5);


            btnLoc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(Details2Activity.this,Maps5Activity.class);
                    startActivity(intent);
                }
            });

        }

        else if(getName.equals("Dr Mosih's Diabetes Care")){
            txtAdd.setText(R.string.address6);
            txtCon.setText(R.string.phone6);


            btnLoc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(Details2Activity.this,Maps6Activity.class);
                    startActivity(intent);
                }
            });

        }

        else if(getName.equals("Chittagong Diabetic Hospital")){
            txtAdd.setText(R.string.address7);
            txtCon.setText(R.string.phone7);


            btnLoc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(Details2Activity.this,Maps7Activity.class);
                    startActivity(intent);
                }
            });

        }

    }
}
