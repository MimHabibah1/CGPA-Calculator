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

public class sixthActivity extends AppCompatActivity {

    String[] points;
    private Button sixthSum;
    private TextView result6;
    private String temp11;
    double sixth1, sixth2, sixth3, sixth4, sixth5, sixth6, sixth7, temp10;
    private Spinner sixth1stS, sixth2ndS, sixth3rdS, sixth4thS, sixth5thS, sixth6thS, sixth7thS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        points = getResources().getStringArray(R.array.names);

        sixth1stS = findViewById(R.id.sixth1stS);
        sixth2ndS = findViewById(R.id.sixth2ndS);
        sixth3rdS = findViewById(R.id.sixth3rdS);
        sixth4thS = findViewById(R.id.sixth4thS);
        sixth5thS = findViewById(R.id.sixth5thS);
        sixth6thS = findViewById(R.id.sixth6thS);
        sixth7thS = findViewById(R.id.sixth7thS);

        sixthSum = findViewById(R.id.sixthSum);
        result6 = findViewById(R.id.tv6);

        ActionBar actionBar = getActionBar();
        //  actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
        //actionBar.show();


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        //getSupportActionBar().setLogo(R.drawable.splashi);
        //getSupportActionBar().setDisplayUseLogoEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.sample,points);
        sixth1stS.setAdapter(adapter);
        sixth2ndS.setAdapter(adapter);
        sixth3rdS.setAdapter(adapter);
        sixth4thS.setAdapter(adapter);
        sixth5thS.setAdapter(adapter);
        sixth6thS.setAdapter(adapter);
        sixth7thS.setAdapter(adapter);


        sixthSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String value = sixth1stS.getSelectedItem().toString();

                int pos = sixth1stS.getSelectedItemPosition();
                if(pos!=0)
                {
                    String value1 = sixth1stS.getSelectedItem
                            ().toString();
                    sixth1 = valueOf(value1) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value.equals("CGPA"))
                {
                    String value1 = sixth1stS.getSelectedItem
                            ().toString();
                    sixth1 = valueOf(value1) * 3.0;
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
                String value2 = sixth2ndS.getSelectedItem().toString();

                int pos2 = sixth2ndS.getSelectedItemPosition();
                if(pos2!=0)
                {
                    String value3 = sixth2ndS.getSelectedItem
                            ().toString();
                    sixth2 = valueOf(value3) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value2.equals("CGPA"))
                {
                    String value3 = sixth1stS.getSelectedItem
                            ().toString();
                    sixth2 = valueOf(value3) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                //3rd
                String value4 = sixth3rdS.getSelectedItem().toString();

                int pos3 = sixth3rdS.getSelectedItemPosition();
                if(pos3!=0)
                {
                    String value5 = sixth3rdS.getSelectedItem
                            ().toString();
                    sixth3 = valueOf(value5) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value4.equals("CGPA"))
                {
                    String value5 = sixth3rdS.getSelectedItem
                            ().toString();
                    sixth3 = valueOf(value5) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }



                //4th

                String value6 = sixth4thS.getSelectedItem().toString();

                int pos4 = sixth4thS.getSelectedItemPosition();
                if(pos4!=0)
                {
                    String value7 = sixth4thS.getSelectedItem
                            ().toString();
                    sixth4 = valueOf(value7) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value6.equals("CGPA"))
                {
                    String value7 = sixth4thS.getSelectedItem
                            ().toString();
                    sixth4 = valueOf(value7) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }


                //5th
                String value8 = sixth5thS.getSelectedItem().toString();

                int pos5 = sixth5thS.getSelectedItemPosition();
                if(pos5!=0)
                {
                    String value9 = sixth5thS.getSelectedItem
                            ().toString();
                    sixth5 = valueOf(value9) * 1.5;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value8.equals("CGPA"))
                {
                    String value9 = sixth5thS.getSelectedItem
                            ().toString();
                    sixth5 = valueOf(value9) * 1.5;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }


                //6th
                String value10 = sixth6thS.getSelectedItem().toString();

                int pos6 = sixth6thS.getSelectedItemPosition();
                if(pos6!=0)
                {
                    String value11 = sixth6thS.getSelectedItem
                            ().toString();
                    sixth6 = valueOf(value11) * 1.5;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value10.equals("CGPA"))
                {
                    String value11 = sixth6thS.getSelectedItem
                            ().toString();
                    sixth6 = valueOf(value11) * 1.5;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                //7th
                String value12 = sixth7thS.getSelectedItem().toString();

                int pos7 = sixth7thS.getSelectedItemPosition();
                if(pos7!=0)
                {
                    String value13 = sixth7thS.getSelectedItem
                            ().toString();
                    sixth7 = valueOf(value13) * 1.5;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value12.equals("CGPA"))
                {
                    String value13 = sixth7thS.getSelectedItem
                            ().toString();
                    sixth7 = valueOf(value13) * 1.5;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }





                temp10 = ( sixth1 + sixth2 + sixth3 + sixth4 + sixth5 + sixth6 + sixth7) / 16.5 ;
                temp11 = valueOf(temp10).toString();
                result6.setText(temp11);
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
