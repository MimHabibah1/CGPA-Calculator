package com.cgpacalc.ummehabiba.cgpacalculator;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

import static java.lang.Double.valueOf;

public class secondActivity extends AppCompatActivity {

    String[] points;
    private Button secondSum;
    private TextView result2;
    private String temp3;
    double second1, second2, second3, second4, second5, second6, temp2;
    private Spinner second1stS, second2ndS, second3rdS, second4thS, second5thS, second6thS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        points = getResources().getStringArray(R.array.names);

        second1stS = findViewById(R.id.second1stS);
        second2ndS = findViewById(R.id.second2ndS);
        second3rdS = findViewById(R.id.second3rdS);
        second4thS = findViewById(R.id.second4thS);
        second5thS = findViewById(R.id.second5thS);
        second6thS = findViewById(R.id.second6thS);

        secondSum = findViewById(R.id.secondSum);
        result2 = findViewById(R.id.tv2);

        ActionBar actionBar = getActionBar();
        //  actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
        //actionBar.show();


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        //getSupportActionBar().setLogo(R.drawable.splashi);
        //getSupportActionBar().setDisplayUseLogoEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.sample,points);
        second1stS.setAdapter(adapter);
        second2ndS.setAdapter(adapter);
        second3rdS.setAdapter(adapter);
        second4thS.setAdapter(adapter);
        second5thS.setAdapter(adapter);
        second6thS.setAdapter(adapter);


        secondSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String value = second1stS.getSelectedItem().toString();

                int pos = second1stS.getSelectedItemPosition();
                if(pos!=0)
                {
                    String value1 = second1stS.getSelectedItem
                            ().toString();
                    second1 = valueOf(value1) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value.equals("CGPA"))
                {
                    String value1 = second1stS.getSelectedItem
                            ().toString();
                    second1 = valueOf(value1) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }


                // eighth1 = valueOf(value1) * 16.5;

                //Please Select your acquired CGPA !!"
                String value2 = second2ndS.getSelectedItem().toString();

                int pos2 = second2ndS.getSelectedItemPosition();
                if(pos2!=0)
                {
                    String value3 = second2ndS.getSelectedItem
                            ().toString();
                    second2 = valueOf(value3) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value2.equals("CGPA"))
                {
                    String value3 = second1stS.getSelectedItem
                            ().toString();
                    second2 = valueOf(value3) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                //3rd
                String value4 = second3rdS.getSelectedItem().toString();

                int pos3 = second3rdS.getSelectedItemPosition();
                if(pos3!=0)
                {
                    String value5 = second3rdS.getSelectedItem
                            ().toString();
                    second3 = valueOf(value5) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value4.equals("CGPA"))
                {
                    String value5 = second3rdS.getSelectedItem
                            ().toString();
                    second3 = valueOf(value5) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }



                //4th

                String value6 = second4thS.getSelectedItem().toString();

                int pos4 = second4thS.getSelectedItemPosition();
                if(pos4!=0)
                {
                    String value7 = second4thS.getSelectedItem
                            ().toString();
                    second4 = valueOf(value7) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value6.equals("CGPA"))
                {
                    String value7 = second4thS.getSelectedItem
                            ().toString();
                    second4 = valueOf(value7) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }


                //5th
                String value8 = second5thS.getSelectedItem().toString();

                int pos5 = second5thS.getSelectedItemPosition();
                if(pos5!=0)
                {
                    String value9 = second5thS.getSelectedItem
                            ().toString();
                    second5 = valueOf(value9) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value8.equals("CGPA"))
                {
                    String value9 = second5thS.getSelectedItem
                            ().toString();
                    second5 = valueOf(value9) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }


                //6th
                String value10 = second6thS.getSelectedItem().toString();

                int pos6 = second1stS.getSelectedItemPosition();
                if(pos6!=0)
                {
                    String value11 = second6thS.getSelectedItem
                            ().toString();
                    second6 = valueOf(value11) * 1.5;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value10.equals("CGPA"))
                {
                    String value11 = second6thS.getSelectedItem
                            ().toString();
                    second6 = valueOf(value11) * 1.5;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }



                temp2 = ( second1 + second2 + second3 + second4 + second5 + second6 ) / 16.5 ;
                temp3 = valueOf(temp2).toString();
                result2.setText(temp3);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);


        return super.onCreateOptionsMenu(menu);
    }

    //back
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == android.R.id.home){
            this.finish();
        }

        if (id == R.id.aboutId) {
            Intent myIntent = new Intent(getApplicationContext(), AboutActivity.class);
            startActivity(myIntent);

        }

        return super.onOptionsItemSelected(item);


    }




}
