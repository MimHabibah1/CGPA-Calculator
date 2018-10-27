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

public class SemesterActivity extends AppCompatActivity implements View.OnClickListener {


    private Button first, second, third, fourth, fifth, sixth, seventh, eighth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);

        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        fourth = findViewById(R.id.fourth);
        fifth = findViewById(R.id.fifth);
        sixth = findViewById(R.id.sixth);
        seventh = findViewById(R.id.seventh);
        eighth = findViewById(R.id.eighth);

        ActionBar actionBar = getActionBar();
        //  actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
        //actionBar.show();


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        first.setOnClickListener(this);
        second.setOnClickListener(this);
        third.setOnClickListener(this);
        fourth.setOnClickListener(this);
        fifth.setOnClickListener(this);
        sixth.setOnClickListener(this);
        seventh.setOnClickListener(this);
        eighth.setOnClickListener(this);

        
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

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.first :
                Intent i1 = new Intent(getApplicationContext(), firstActivity.class);
                startActivity(i1);
                break;

            case R.id.second :
                Intent i2 = new Intent(getApplicationContext(), secondActivity.class);
                startActivity(i2);
                break;

            case R.id.third :
                Intent i3 = new Intent(getApplicationContext(), thirdActivity.class);
                startActivity(i3);
                break;

            case R.id.fourth :
                Intent i4 = new Intent(getApplicationContext(), fourthActivity.class);
                startActivity(i4);
                break;

            case R.id.fifth :
                Intent i5 = new Intent(getApplicationContext(), fifthActivity.class);
                startActivity(i5);
                break;

            case R.id.sixth :
                Intent i6 = new Intent(getApplicationContext(), sixthActivity.class);
                startActivity(i6);
                break;

            case R.id.seventh :
                Intent i7 = new Intent(getApplicationContext(), seventhActivity.class);
                startActivity(i7);
                break;

            case R.id.eighth :
                Intent i8 = new Intent(getApplicationContext(), eighthActivity.class);
                startActivity(i8);
                break;
        }
    }
}
