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

public class fifthActivity extends AppCompatActivity {

    String[] points;
    private Button fifthSum;
    private TextView result5;
    private String temp9;
    double fifth1, fifth2, fifth3, fifth4, fifth5, fifth6, fifth7, temp8;
    private Spinner fifth1stS, fifth2ndS, fifth3rdS, fifth4thS, fifth5thS, fifth6thS, fifth7thS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        points = getResources().getStringArray(R.array.names);

        fifth1stS = findViewById(R.id.fifth1stS);
        fifth2ndS = findViewById(R.id.fifth2ndS);
        fifth3rdS = findViewById(R.id.fifth3rdS);
        fifth4thS = findViewById(R.id.fifth4thS);
        fifth5thS = findViewById(R.id.fifth5thS);
        fifth6thS = findViewById(R.id.fifth6thS);
        fifth7thS = findViewById(R.id.fifth7thS);

        fifthSum = findViewById(R.id.fifthSum);
        result5 = findViewById(R.id.tv5);

        ActionBar actionBar = getActionBar();
        //  actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
        //actionBar.show();


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        //getSupportActionBar().setLogo(R.drawable.splashi);
        //getSupportActionBar().setDisplayUseLogoEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.sample,points);
        fifth1stS.setAdapter(adapter);
        fifth2ndS.setAdapter(adapter);
        fifth3rdS.setAdapter(adapter);
        fifth4thS.setAdapter(adapter);
        fifth5thS.setAdapter(adapter);
        fifth6thS.setAdapter(adapter);
        fifth7thS.setAdapter(adapter);


        fifthSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String value = fifth1stS.getSelectedItem().toString();

                int pos = fifth1stS.getSelectedItemPosition();
                if(pos!=0)
                {
                    String value1 = fifth1stS.getSelectedItem
                            ().toString();
                    fifth1 = valueOf(value1) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value.equals("CGPA"))
                {
                    String value1 = fifth1stS.getSelectedItem
                            ().toString();
                    fifth1 = valueOf(value1) * 3.0;
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
                String value2 = fifth2ndS.getSelectedItem().toString();

                int pos2 = fifth2ndS.getSelectedItemPosition();
                if(pos2!=0)
                {
                    String value3 = fifth2ndS.getSelectedItem
                            ().toString();
                    fifth2 = valueOf(value3) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value2.equals("CGPA"))
                {
                    String value3 = fifth1stS.getSelectedItem
                            ().toString();
                    fifth2 = valueOf(value3) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                //3rd
                String value4 = fifth3rdS.getSelectedItem().toString();

                int pos3 = fifth3rdS.getSelectedItemPosition();
                if(pos3!=0)
                {
                    String value5 = fifth3rdS.getSelectedItem
                            ().toString();
                    fifth3 = valueOf(value5) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value4.equals("CGPA"))
                {
                    String value5 = fifth3rdS.getSelectedItem
                            ().toString();
                    fifth3 = valueOf(value5) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }



                //4th

                String value6 = fifth4thS.getSelectedItem().toString();

                int pos4 = fifth4thS.getSelectedItemPosition();
                if(pos4!=0)
                {
                    String value7 = fifth4thS.getSelectedItem
                            ().toString();
                    fifth4 = valueOf(value7) * 1.5;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value6.equals("CGPA"))
                {
                    String value7 = fifth4thS.getSelectedItem
                            ().toString();
                    fifth4 = valueOf(value7) * 1.5;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }


                //5th
                String value8 = fifth5thS.getSelectedItem().toString();

                int pos5 = fifth5thS.getSelectedItemPosition();
                if(pos5!=0)
                {
                    String value9 = fifth5thS.getSelectedItem
                            ().toString();
                    fifth5 = valueOf(value9) * 1.5;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value8.equals("CGPA"))
                {
                    String value9 = fifth5thS.getSelectedItem
                            ().toString();
                    fifth5 = valueOf(value9) * 1.5;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }


                //6th
                String value10 = fifth6thS.getSelectedItem().toString();

                int pos6 = fifth6thS.getSelectedItemPosition();
                if(pos6!=0)
                {
                    String value11 = fifth6thS.getSelectedItem
                            ().toString();
                    fifth6 = valueOf(value11) * 1.5;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value10.equals("CGPA"))
                {
                    String value11 = fifth6thS.getSelectedItem
                            ().toString();
                    fifth6 = valueOf(value11) * 1.5;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                //7th
                String value12 = fifth7thS.getSelectedItem().toString();

                int pos7 = fifth7thS.getSelectedItemPosition();
                if(pos7!=0)
                {
                    String value13 = fifth7thS.getSelectedItem
                            ().toString();
                    fifth7 = valueOf(value13) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value12.equals("CGPA"))
                {
                    String value13 = fifth7thS.getSelectedItem
                            ().toString();
                    fifth7 = valueOf(value13) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }





                temp8 = ( fifth1 + fifth2 + fifth3 + fifth4 + fifth5 + fifth6 + fifth7) / 16.5 ;
                temp9 = valueOf(temp8).toString();
                result5.setText(temp9);
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
