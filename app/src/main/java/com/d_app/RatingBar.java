package com.d_app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RatingBar extends Activity {
    private static android.widget.RatingBar r1;
    private static TextView t1;
    protected static Button b10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar1);
        Abc1();
        Abc2();

    }
    public void Abc1(){
        r1=(android.widget.RatingBar) findViewById(R.id.rbar);
        t1=(TextView) findViewById(R.id.txt);
        r1.setOnRatingBarChangeListener(new android.widget.RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(android.widget.RatingBar ratingBar, float rating, boolean fromUser) {
                t1.setText(String.valueOf(rating));
            }
        });
    }
    public void Abc2(){
        r1=(android.widget.RatingBar) findViewById(R.id.rbar);
        b10=(Button)findViewById(R.id.btn10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RatingBar.this, "Thanku...for rate me. \n You have rated:" + String.valueOf(r1.getRating()), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rating_bar1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
