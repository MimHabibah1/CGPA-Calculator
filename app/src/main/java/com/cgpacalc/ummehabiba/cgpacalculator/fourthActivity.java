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

public class fourthActivity extends AppCompatActivity {

    String[] points;
    private Button fourthSum;
    private TextView result4;
    private String temp7;
    double fourth1, fourth2, fourth3, fourth4, fourth5, fourth6, fourth7, temp6;
    private Spinner fourth1stS, fourth2ndS, fourth3rdS, fourth4thS, fourth5thS, fourth6thS, fourth7thS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        points = getResources().getStringArray(R.array.names);

        fourth1stS = findViewById(R.id.fourth1stS);
        fourth2ndS = findViewById(R.id.fourth2ndS);
        fourth3rdS = findViewById(R.id.fourth3rdS);
        fourth4thS = findViewById(R.id.fourth4thS);
        fourth5thS = findViewById(R.id.fourth5thS);
        fourth6thS = findViewById(R.id.fourth6thS);
        fourth7thS = findViewById(R.id.fourth7thS);

        fourthSum = findViewById(R.id.fourthSum);
        result4 = findViewById(R.id.tv4);

        ActionBar actionBar = getActionBar();
        //  actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
        //actionBar.show();


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        //getSupportActionBar().setLogo(R.drawable.splashi);
        //getSupportActionBar().setDisplayUseLogoEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.sample,points);
        fourth1stS.setAdapter(adapter);
        fourth2ndS.setAdapter(adapter);
        fourth3rdS.setAdapter(adapter);
        fourth4thS.setAdapter(adapter);
        fourth5thS.setAdapter(adapter);
        fourth6thS.setAdapter(adapter);
        fourth7thS.setAdapter(adapter);


        fourthSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String value = fourth1stS.getSelectedItem().toString();

                int pos = fourth1stS.getSelectedItemPosition();
                if(pos!=0)
                {
                    String value1 = fourth1stS.getSelectedItem
                            ().toString();
                    fourth1 = valueOf(value1) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value.equals("CGPA"))
                {
                    String value1 = fourth1stS.getSelectedItem
                            ().toString();
                    fourth1 = valueOf(value1) * 3.0;
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
                String value2 = fourth2ndS.getSelectedItem().toString();

                int pos2 = fourth2ndS.getSelectedItemPosition();
                if(pos2!=0)
                {
                    String value3 = fourth2ndS.getSelectedItem
                            ().toString();
                    fourth2 = valueOf(value3) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value2.equals("CGPA"))
                {
                    String value3 = fourth1stS.getSelectedItem
                            ().toString();
                    fourth2 = valueOf(value3) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                //3rd
                String value4 = fourth3rdS.getSelectedItem().toString();

                int pos3 = fourth3rdS.getSelectedItemPosition();
                if(pos3!=0)
                {
                    String value5 = fourth3rdS.getSelectedItem
                            ().toString();
                    fourth3 = valueOf(value5) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value4.equals("CGPA"))
                {
                    String value5 = fourth3rdS.getSelectedItem
                            ().toString();
                    fourth3 = valueOf(value5) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }



                //4th

                String value6 = fourth4thS.getSelectedItem().toString();

                int pos4 = fourth4thS.getSelectedItemPosition();
                if(pos4!=0)
                {
                    String value7 = fourth4thS.getSelectedItem
                            ().toString();
                    fourth4 = valueOf(value7) * 1.5;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value6.equals("CGPA"))
                {
                    String value7 = fourth4thS.getSelectedItem
                            ().toString();
                    fourth4 = valueOf(value7) * 1.5;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }


                //5th
                String value8 = fourth5thS.getSelectedItem().toString();

                int pos5 = fourth5thS.getSelectedItemPosition();
                if(pos5!=0)
                {
                    String value9 = fourth5thS.getSelectedItem
                            ().toString();
                    fourth5 = valueOf(value9) * 1.5;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value8.equals("CGPA"))
                {
                    String value9 = fourth5thS.getSelectedItem
                            ().toString();
                    fourth5 = valueOf(value9) * 1.5;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }


                //6th
                String value10 = fourth6thS.getSelectedItem().toString();

                int pos6 = fourth6thS.getSelectedItemPosition();
                if(pos6!=0)
                {
                    String value11 = fourth6thS.getSelectedItem
                            ().toString();
                    fourth6 = valueOf(value11) * 1.5;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value10.equals("CGPA"))
                {
                    String value11 = fourth6thS.getSelectedItem
                            ().toString();
                    fourth6 = valueOf(value11) * 1.5;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                //7th
                String value12 = fourth7thS.getSelectedItem().toString();

                int pos7 = fourth7thS.getSelectedItemPosition();
                if(pos7!=0)
                {
                    String value13 = fourth7thS.getSelectedItem
                            ().toString();
                    fourth7 = valueOf(value13) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value12.equals("CGPA"))
                {
                    String value13 = fourth7thS.getSelectedItem
                            ().toString();
                    fourth7 = valueOf(value13) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }





                temp6 = ( fourth1 + fourth2 + fourth3 + fourth4 + fourth5 + fourth6 + fourth7) / 16.5 ;
                temp7 = valueOf(temp6).toString();
                result4.setText(temp7);
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
