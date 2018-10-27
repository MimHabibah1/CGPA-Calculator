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

public class eighthActivity extends AppCompatActivity {

    String[] points;
    private Button eigthSum;
    private TextView result8;
    private String temp15;
    double eighth1, eighth2, eighth3, eighth4, eighth5, eighth6, temp14;
    private Spinner eigth1stS, eigth2ndS, eigth3rdS, eigth4thS, eigth5thS, eigth6thS ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);

        points = getResources().getStringArray(R.array.names);

        eigth1stS = findViewById(R.id.eigth1stS);
        eigth2ndS = findViewById(R.id.eigth2ndS);
        eigth3rdS = findViewById(R.id.eigth3rdS);
        eigth4thS = findViewById(R.id.eigth4thS);
        eigth5thS = findViewById(R.id.eigth5thS);
        eigth6thS = findViewById(R.id.eigth6thS);


        eigthSum = findViewById(R.id.eigthSum);
        result8 = findViewById(R.id.tv8);

        ActionBar actionBar = getActionBar();
        //  actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
        //actionBar.show();


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        //getSupportActionBar().setLogo(R.drawable.splashi);
        //getSupportActionBar().setDisplayUseLogoEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.sample,points);
        eigth1stS.setAdapter(adapter);
        eigth2ndS.setAdapter(adapter);
        eigth3rdS.setAdapter(adapter);
        eigth4thS.setAdapter(adapter);
        eigth5thS.setAdapter(adapter);
        eigth6thS.setAdapter(adapter);



        eigthSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String value = eigth1stS.getSelectedItem().toString();

                int pos = eigth1stS.getSelectedItemPosition();
                if(pos!=0)
                {
                    String value1 = eigth1stS.getSelectedItem
                            ().toString();
                    eighth1 = valueOf(value1) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value.equals("CGPA"))
                {
                    String value1 = eigth1stS.getSelectedItem
                            ().toString();
                    eighth1 = valueOf(value1) * 3.0;
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
                String value2 = eigth2ndS.getSelectedItem().toString();

                int pos2 = eigth2ndS.getSelectedItemPosition();
                if(pos2!=0)
                {
                    String value3 = eigth2ndS.getSelectedItem
                            ().toString();
                    eighth2 = valueOf(value3) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value2.equals("CGPA"))
                {
                    String value3 = eigth1stS.getSelectedItem
                            ().toString();
                    eighth2 = valueOf(value3) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                //3rd
                String value4 = eigth3rdS.getSelectedItem().toString();

                int pos3 = eigth3rdS.getSelectedItemPosition();
                if(pos3!=0)
                {
                    String value5 = eigth3rdS.getSelectedItem
                            ().toString();
                    eighth3 = valueOf(value5) * 3.0;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value4.equals("CGPA"))
                {
                    String value5 = eigth3rdS.getSelectedItem
                            ().toString();
                    eighth3 = valueOf(value5) * 3.0;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }



                //4th

                String value6 = eigth4thS.getSelectedItem().toString();

                int pos4 = eigth4thS.getSelectedItemPosition();
                if(pos4!=0)
                {
                    String value7 = eigth4thS.getSelectedItem
                            ().toString();
                    eighth4 = valueOf(value7) * 1.5;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value6.equals("CGPA"))
                {
                    String value7 = eigth4thS.getSelectedItem
                            ().toString();
                    eighth4 = valueOf(value7) * 1.5 ;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }


                //5th
                String value8 = eigth5thS.getSelectedItem().toString();

                int pos5 = eigth5thS.getSelectedItemPosition();
                if(pos5!=0)
                {
                    String value9 = eigth5thS.getSelectedItem
                            ().toString();
                    eighth5 = valueOf(value9) * 1.5;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value8.equals("CGPA"))
                {
                    String value9 = eigth5thS.getSelectedItem
                            ().toString();
                    eighth5 = valueOf(value9) * 1.5;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }


                //6th
                String value10 = eigth6thS.getSelectedItem().toString();

                int pos6 = eigth6thS.getSelectedItemPosition();
                if(pos6!=0)
                {
                    String value11 = eigth6thS.getSelectedItem
                            ().toString();
                    eighth6 = valueOf(value11) * 6.0 ;
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if(!value10.equals("CGPA"))
                {
                    String value11 = eigth6thS.getSelectedItem
                            ().toString();
                    eighth6 = valueOf(value11) * 6.0 ;
                }
                else{
                    Toast.makeText
                            (getApplicationContext(),
                                    "Please Select your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }




                temp14 = ( eighth1 + eighth2 + eighth3 + eighth4 + eighth5 + eighth6 ) / 18.0 ;
                temp15 = valueOf(temp14).toString();
                result8.setText(temp15);
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
