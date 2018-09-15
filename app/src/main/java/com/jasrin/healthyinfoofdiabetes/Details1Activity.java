package com.jasrin.healthyinfoofdiabetes;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Details1Activity extends AppCompatActivity {

    ListView listView;
    String nameList[]={"Chandgaon Diabatic Center","Plasma Diagnostic & Diabetic Center","The Soul Hart And Diabetic Center","Dr. Mamun's Diabetes Specialities Center","Chittagong Diabetic General Hospital","Patiya Diabetes Hospital","Dr Mosih's Diabetes Care","Chittagong Diabetic Hospital",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details1);

        listView=findViewById(R.id.listview);

        ArrayAdapter adapter=new ArrayAdapter(Details1Activity.this,R.layout.support_simple_spinner_dropdown_item,nameList);//adapter initialize

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(Details1Activity.this,Details2Activity.class);
                intent.putExtra("name",nameList[position]);
                startActivity(intent);
                Toast.makeText(Details1Activity.this, nameList[position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}
