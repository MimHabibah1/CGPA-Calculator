package com.cgpacalc.ummehabiba.cgpacalculator;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private Button semesterwise, totalcg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getActionBar();
        //  actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
        //actionBar.show();


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);



        semesterwise = findViewById(R.id.semesterwise);
        totalcg = findViewById(R.id.totalcg);

        semesterwise.setOnClickListener(this);
        totalcg.setOnClickListener(this);



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
            Intent iab = new Intent(getApplicationContext(), AboutActivity.class);
            startActivity(iab);

        }

        return super.onOptionsItemSelected(item);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.semesterwise :
                Intent myIntent = new Intent(getApplicationContext(), SemesterActivity.class);

                startActivity(myIntent);
                break;

            case R.id.totalcg :
                Intent i = new Intent(getApplicationContext(), TotalCActivity.class);

                startActivity(i);
                break;
        }
    }
}
