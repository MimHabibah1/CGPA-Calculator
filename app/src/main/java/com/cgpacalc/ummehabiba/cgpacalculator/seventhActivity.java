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

public class seventhActivity extends AppCompatActivity {

    String[] points;
    private Button seventhSum;
    private TextView result7;
    private String temp13;
    double seventh1, seventh2, seventh3, seventh4, seventh5, seventh6, seventh7, seventh8, temp12;
    private Spinner seventh1stS, seventh2ndS, seventh3rdS, seventh4thS, seventh5thS, seventh6thS, seventh7thS, seventh8thS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        points = getResources().getStringArray(R.array.names);

        seventh1stS = findViewById(R.id.seventh1stS);
        seventh2ndS = findViewById(R.id.seventh2ndS);
        seventh3rdS = findViewById(R.id.seventh3rdS);
        seventh4thS = findViewById(R.id.seventh4thS);
        seventh5thS = findViewById(R.id.seventh5thS);
        seventh6thS = findViewById(R.id.seventh6thS);
        seventh7thS = findViewById(R.id.seventh7thS);
        seventh8thS = findViewById(R.id.seventh8thS);

        seventhSum = findViewById(R.id.seventhSum);
        result7 = findViewById(R.id.tv7);

        ActionBar actionBar = getActionBar();
        //  actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
        //actionBar.show();


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        //getSupportActionBar().setLogo(R.drawable.splashi);
        //getSupportActionBar().setDisplayUseLogoEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.sample,points);
        seventh1stS.setAdapter(adapter);
        seventh2ndS.setAdapter(adapter);
        seventh3rdS.setAdapter(adapter);
        seventh4thS.setAdapter(adapter);
        seventh5thS.setAdapter(adapter);
        seventh6thS.setAdapter(adapter);
        seventh7thS.setAdapter(adapter);
        seventh8thS.setAdapter(adapter);


        seventhSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String value = seventh1stS.getSelectedItem().toString();

                int pos = seventh1stS.getSelectedItemPosition();
                if(pos!=0)
                {
                    String value1 = seventh1stS.getSelectedItem
                            ().toString();
                    seventh1 = valueOf(value1) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value.equals("CGPA"))
                {
                    String value1 = seventh1stS.getSelectedItem
                            ().toString();
                    seventh1 = valueOf(value1) * 3.0;
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
                String value2 = seventh2ndS.getSelectedItem().toString();

                int pos2 = seventh2ndS.getSelectedItemPosition();
                if(pos2!=0)
                {
                    String value3 = seventh2ndS.getSelectedItem
                            ().toString();
                    seventh2 = valueOf(value3) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value2.equals("CGPA"))
                {
                    String value3 = seventh1stS.getSelectedItem
                            ().toString();
                    seventh2 = valueOf(value3) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                //3rd
                String value4 = seventh3rdS.getSelectedItem().toString();

                int pos3 = seventh3rdS.getSelectedItemPosition();
                if(pos3!=0)
                {
                    String value5 = seventh3rdS.getSelectedItem
                            ().toString();
                    seventh3 = valueOf(value5) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value4.equals("CGPA"))
                {
                    String value5 = seventh3rdS.getSelectedItem
                            ().toString();
                    seventh3 = valueOf(value5) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }



                //4th

                String value6 = seventh4thS.getSelectedItem().toString();

                int pos4 = seventh4thS.getSelectedItemPosition();
                if(pos4!=0)
                {
                    String value7 = seventh4thS.getSelectedItem
                            ().toString();
                    seventh4 = valueOf(value7) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value6.equals("CGPA"))
                {
                    String value7 = seventh4thS.getSelectedItem
                            ().toString();
                    seventh4 = valueOf(value7) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }


                //5th
                String value8 = seventh5thS.getSelectedItem().toString();

                int pos5 = seventh5thS.getSelectedItemPosition();
                if(pos5!=0)
                {
                    String value9 = seventh5thS.getSelectedItem
                            ().toString();
                    seventh5 = valueOf(value9) * 1.5;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value8.equals("CGPA"))
                {
                    String value9 = seventh5thS.getSelectedItem
                            ().toString();
                    seventh5 = valueOf(value9) * 1.5;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }


                //6th
                String value10 = seventh6thS.getSelectedItem().toString();

                int pos6 = seventh6thS.getSelectedItemPosition();
                if(pos6!=0)
                {
                    String value11 = seventh6thS.getSelectedItem
                            ().toString();
                    seventh6 = valueOf(value11) * 1.5;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value10.equals("CGPA"))
                {
                    String value11 = seventh6thS.getSelectedItem
                            ().toString();
                    seventh6 = valueOf(value11) * 1.5;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                //7th
                String value12 = seventh7thS.getSelectedItem().toString();

                int pos7 = seventh7thS.getSelectedItemPosition();
                if(pos7!=0)
                {
                    String value13 = seventh7thS.getSelectedItem
                            ().toString();
                    seventh7 = valueOf(value13) * 1.5;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value12.equals("CGPA"))
                {
                    String value13 = seventh7thS.getSelectedItem
                            ().toString();
                    seventh7 = valueOf(value13) * 1.5;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }


                //8th
                String value14 = seventh8thS.getSelectedItem().toString();

                int pos8 = seventh8thS.getSelectedItemPosition();
                if(pos8!=0)
                {
                    String value15 = seventh8thS.getSelectedItem
                            ().toString();
                    seventh8 = valueOf(value15) * 1.5;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value14.equals("CGPA"))
                {
                    String value13 = seventh8thS.getSelectedItem
                            ().toString();
                    seventh8 = valueOf(value13) * 1.5;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }




                temp12 = ( seventh1 + seventh2 + seventh3 + seventh4 + seventh5 + seventh6 + seventh7 + seventh8 ) / 18.0 ;
                temp13 = valueOf(temp12).toString();
                result7.setText(temp13);
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
