package com.jasrin.healthyinfoofdiabetes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView txtDis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        txtDis=findViewById(R.id.txt_dis);

        String getName=getIntent().getExtras().getString("name");

        if(getName.equals("Diabetes")) {
            txtDis.setText(R.string.diabetes);
        }

        else if(getName.equals("Types Of Diabetes")) {
            txtDis.setText(R.string.types_of_diabetes);
        }

        else if(getName.equals("Symptoms Of Diabetes")) {
            txtDis.setText(R.string.symptoms_of_diabetes);
        }

        else if(getName.equals("Conciousness Of Diabetes")) {
            txtDis.setText(R.string.conciousness_of_diabetes);
        }

        else if(getName.equals("Exercise And Diet Plan")) {
            txtDis.setText(R.string.exercise_and_dietplan);
        }

    }
}
