package com.cgpacalc.ummehabiba.cgpacalculator;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Double.valueOf;

public class TotalCActivity extends AppCompatActivity {

    private Button btnSum;
    private TextView tv;
    private String temp99;
    double sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8, temp98;
    private EditText my1, my2, my3, my4, my5, my6, my7, my8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_c);

        my1 = findViewById(R.id.myE1);
        my2 = findViewById(R.id.myE2);
        my3 = findViewById(R.id.myE3);
        my4 = findViewById(R.id.myE4);
        my5 = findViewById(R.id.myE5);
        my6 = findViewById(R.id.myE6);
        my7 = findViewById(R.id.myE7);
        my8 = findViewById(R.id.myE8);

        btnSum = findViewById(R.id.btnSum);
        tv = findViewById(R.id.tvt);

        ActionBar actionBar = getActionBar();
        //  actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
        //actionBar.show();


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        //getSupportActionBar().setLogo(R.drawable.splashi);
        //getSupportActionBar().setDisplayUseLogoEnabled(true);


        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String value51 = my1.getText().toString();

                if (value51.matches("")) {
                    Toast.makeText(getApplicationContext(),
                            "Please Enter your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                else{
                    String value61 = my1.getText().toString();
                    sem1 = valueOf(value61) * 18.0;
                }



                // eighth1 = valueOf(value1) * 16.5;

                //Please Select your acquired CGPA !!"
                String value52 = my2.getText().toString();

                if (value52.matches("")) {
                    Toast.makeText(getApplicationContext(),
                            "Please Enter your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                else{
                    String value62 = my2.getText().toString();
                    sem2 = valueOf(value62) * 16.5;
                }




                //3rd

                String value53 = my3.getText().toString();

                if (value53.matches("")) {
                    Toast.makeText(getApplicationContext(),
                            "Please Enter your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                else{
                    String value63 = my3.getText().toString();
                    sem3 = valueOf(value63) * 18.0;
                }



                //4th
                String value54 = my4.getText().toString();

                if (value54.matches("")) {
                    Toast.makeText(getApplicationContext(),
                            "Please Enter your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                else{
                    String value64 = my4.getText().toString();
                    sem4 = valueOf(value64) * 16.5;
                }



                //5th
                String value55 = my5.getText().toString();

                if (value55.matches("")) {
                    Toast.makeText(getApplicationContext(),
                            "Please Enter your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                else{
                    String value65 = my5.getText().toString();
                    sem5 = valueOf(value65) * 16.5;
                }



                //6th
                String value56 = my6.getText().toString();

                if (value56.matches("")) {
                    Toast.makeText(getApplicationContext(),
                            "Please Enter your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                else{
                    String value66 = my6.getText().toString();
                    sem6 = valueOf(value66) * 16.5;
                }


                //7th
                String value57 = my7.getText().toString();

                if (value57.matches("")) {
                    Toast.makeText(getApplicationContext(),
                            "Please Enter your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                else{
                    String value67 = my7.getText().toString();
                    sem7 = valueOf(value67) * 18.0;
                }


                //8th
                String value58 = my8.getText().toString();

                if (value58.matches("")) {
                    Toast.makeText(getApplicationContext(),
                            "Please Enter your acquired CGPA !!", Toast.LENGTH_LONG)
                            .show();
                    return;
                }

                else{
                    String value68 = my8.getText().toString();
                    sem8 = valueOf(value68) * 18.0;
                }



                temp98 = ( sem1 + sem2 + sem3 + sem4 + sem5 + sem6 + sem7 + sem8 ) / 138.0;
                temp99 = valueOf(temp98).toString();
                tv.setText(temp99);
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
