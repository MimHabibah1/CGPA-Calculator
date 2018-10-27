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

import static java.lang.Double.valueOf;

public class thirdActivity extends AppCompatActivity {

    String[] points;
    private Button thirdSum;
    private TextView result3;
    private String temp5;
    double third1, third2, third3, third4, third5, third6, third7, temp4;
    private Spinner third1stS, third2ndS, third3rdS, third4thS, third5thS, third6thS, third7thS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        points = getResources().getStringArray(R.array.names);

        third1stS = findViewById(R.id.third1stS);
        third2ndS = findViewById(R.id.third2ndS);
        third3rdS = findViewById(R.id.third3rdS);
        third4thS = findViewById(R.id.third4thS);
        third5thS = findViewById(R.id.third5thS);
        third6thS = findViewById(R.id.third6thS);
        third7thS = findViewById(R.id.third7thS);

        thirdSum = findViewById(R.id.thirdSum);
        result3 = findViewById(R.id.tv3);

        ActionBar actionBar = getActionBar();
        //  actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
        //actionBar.show();


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        //getSupportActionBar().setLogo(R.drawable.splashi);
        //getSupportActionBar().setDisplayUseLogoEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.sample,points);
        third1stS.setAdapter(adapter);
        third2ndS.setAdapter(adapter);
        third3rdS.setAdapter(adapter);
        third4thS.setAdapter(adapter);
        third5thS.setAdapter(adapter);
        third6thS.setAdapter(adapter);
        third7thS.setAdapter(adapter);


        thirdSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String value = third1stS.getSelectedItem().toString();

                int pos = third1stS.getSelectedItemPosition();
                if(pos!=0)
                {
                    String value1 = third1stS.getSelectedItem
                            ().toString();
                    third1 = valueOf(value1) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value.equals("CGPA"))
                {
                    String value1 = third1stS.getSelectedItem
                            ().toString();
                    third1 = valueOf(value1) * 3.0;
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
                String value2 = third2ndS.getSelectedItem().toString();

                int pos2 = third2ndS.getSelectedItemPosition();
                if(pos2!=0)
                {
                    String value3 = third2ndS.getSelectedItem
                            ().toString();
                    third2 = valueOf(value3) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value2.equals("CGPA"))
                {
                    String value3 = third1stS.getSelectedItem
                            ().toString();
                    third2 = valueOf(value3) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                //3rd
                String value4 = third3rdS.getSelectedItem().toString();

                int pos3 = third3rdS.getSelectedItemPosition();
                if(pos3!=0)
                {
                    String value5 = third3rdS.getSelectedItem
                            ().toString();
                    third3 = valueOf(value5) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value4.equals("CGPA"))
                {
                    String value5 = third3rdS.getSelectedItem
                            ().toString();
                    third3 = valueOf(value5) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }



                //4th

                String value6 = third4thS.getSelectedItem().toString();

                int pos4 = third4thS.getSelectedItemPosition();
                if(pos4!=0)
                {
                    String value7 = third4thS.getSelectedItem
                            ().toString();
                    third4 = valueOf(value7) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value6.equals("CGPA"))
                {
                    String value7 = third4thS.getSelectedItem
                            ().toString();
                    third4 = valueOf(value7) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }


                //5th
                String value8 = third5thS.getSelectedItem().toString();

                int pos5 = third5thS.getSelectedItemPosition();
                if(pos5!=0)
                {
                    String value9 = third5thS.getSelectedItem
                            ().toString();
                    third5 = valueOf(value9) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value8.equals("CGPA"))
                {
                    String value9 = third5thS.getSelectedItem
                            ().toString();
                    third5 = valueOf(value9) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }


                //6th
                String value10 = third6thS.getSelectedItem().toString();

                int pos6 = third6thS.getSelectedItemPosition();
                if(pos6!=0)
                {
                    String value11 = third6thS.getSelectedItem
                            ().toString();
                    third6 = valueOf(value11) * 1.5;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value10.equals("CGPA"))
                {
                    String value11 = third6thS.getSelectedItem
                            ().toString();
                    third6 = valueOf(value11) * 1.5;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                //7th
                String value12 = third7thS.getSelectedItem().toString();

                int pos7 = third7thS.getSelectedItemPosition();
                if(pos7!=0)
                {
                    String value13 = third7thS.getSelectedItem
                            ().toString();
                    third7 = valueOf(value13) * 1.5;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value12.equals("CGPA"))
                {
                    String value13 = third7thS.getSelectedItem
                            ().toString();
                    third7 = valueOf(value13) * 1.5;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }





                temp4 = ( third1 + third2 + third3 + third4 + third5 + third6 + third7 ) / 18.0 ;
                temp5 = valueOf(temp4).toString();
                result3.setText(temp5);
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
