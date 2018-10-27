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

public class firstActivity extends AppCompatActivity {

    String[] points;
    private Button firstSum;
    private TextView result1;
    private String temp1;
    double first1, first2, first3, first4, first5, first6, first7, temp;
    private Spinner first1stS, first2ndS, first3rdS, first4thS, first5thS, first6thS, first7thS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        points = getResources().getStringArray(R.array.names);

        first1stS = findViewById(R.id.first1stS);
        first2ndS = findViewById(R.id.first2ndS);
        first3rdS = findViewById(R.id.first3rdS);
        first4thS = findViewById(R.id.first4thS);
        first5thS = findViewById(R.id.first5thS);
        first6thS = findViewById(R.id.first6thS);
        first7thS = findViewById(R.id.first7thS);

        firstSum = findViewById(R.id.firstSum);
        result1 = findViewById(R.id.tv1);

        ActionBar actionBar = getActionBar();
        //  actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
        //actionBar.show();


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        //getSupportActionBar().setLogo(R.drawable.splashi);
        //getSupportActionBar().setDisplayUseLogoEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.sample,points);
        first1stS.setAdapter(adapter);
        first2ndS.setAdapter(adapter);
        first3rdS.setAdapter(adapter);
        first4thS.setAdapter(adapter);
        first5thS.setAdapter(adapter);
        first6thS.setAdapter(adapter);
        first7thS.setAdapter(adapter);


        firstSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String value = first1stS.getSelectedItem().toString();

                int pos = first1stS.getSelectedItemPosition();
                if(pos!=0)
                {
                    String value1 = first1stS.getSelectedItem
                            ().toString();
                    first1 = valueOf(value1) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value.equals("CGPA"))
                {
                    String value1 = first1stS.getSelectedItem
                            ().toString();
                    first1 = valueOf(value1) * 3.0;
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
                String value2 = first2ndS.getSelectedItem().toString();

                int pos2 = first2ndS.getSelectedItemPosition();
                if(pos2!=0)
                {
                    String value3 = first2ndS.getSelectedItem
                            ().toString();
                    first2 = valueOf(value3) * 1.5;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value2.equals("CGPA"))
                {
                    String value3 = first1stS.getSelectedItem
                            ().toString();
                    first2 = valueOf(value3) * 1.5;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                //3rd
                String value4 = first3rdS.getSelectedItem().toString();

                int pos3 = first3rdS.getSelectedItemPosition();
                if(pos3!=0)
                {
                    String value5 = first3rdS.getSelectedItem
                            ().toString();
                    first3 = valueOf(value5) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value4.equals("CGPA"))
                {
                    String value5 = first3rdS.getSelectedItem
                            ().toString();
                    first3 = valueOf(value5) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }



                //4th

                String value6 = first4thS.getSelectedItem().toString();

                int pos4 = first4thS.getSelectedItemPosition();
                if(pos4!=0)
                {
                    String value7 = first4thS.getSelectedItem
                            ().toString();
                    first4 = valueOf(value7) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value6.equals("CGPA"))
                {
                    String value7 = first4thS.getSelectedItem
                            ().toString();
                    first4 = valueOf(value7) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }


                //5th
                String value8 = first5thS.getSelectedItem().toString();

                int pos5 = first5thS.getSelectedItemPosition();
                if(pos5!=0)
                {
                    String value9 = first5thS.getSelectedItem
                            ().toString();
                    first5 = valueOf(value9) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value8.equals("CGPA"))
                {
                    String value9 = first5thS.getSelectedItem
                            ().toString();
                    first5 = valueOf(value9) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }


                //6th
                String value10 = first6thS.getSelectedItem().toString();

                int pos6 = first1stS.getSelectedItemPosition();
                if(pos6!=0)
                {
                    String value11 = first6thS.getSelectedItem
                            ().toString();
                    first6 = valueOf(value11) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value10.equals("CGPA"))
                {
                    String value11 = first6thS.getSelectedItem
                            ().toString();
                    first6 = valueOf(value11) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }


                //7th
                String value12 = first7thS.getSelectedItem().toString();

                int pos7 = first7thS.getSelectedItemPosition();
                if(pos7!=0)
                {
                    String value13 = first7thS.getSelectedItem
                            ().toString();
                    first7 = valueOf(value13) * 1.5;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value12.equals("CGPA"))
                {
                    String value13 = first7thS.getSelectedItem
                            ().toString();
                    first7 = valueOf(value13) * 1.5;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }





                temp = ( first1 + first2 + first3 + first4 + first5 + first6 + first7 ) / 18.0;
                temp1 = valueOf(temp).toString();
                result1.setText(temp1);
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
