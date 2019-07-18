package com.d_app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DigitalClock;

public class Current_time extends Activity {
    private static AnalogClock a1;
    private static DigitalClock d1;
    protected static Button b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_time);
        Abc();
    }
    public void Abc(){
        a1=(AnalogClock) findViewById(R.id.aclk);
        d1=(DigitalClock) findViewById(R.id.dclk);
        b9=(Button) findViewById(R.id.btn8);
        d1.setVisibility(DigitalClock.GONE);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a1.getVisibility() == AnalogClock.GONE) {
                    a1.setVisibility(AnalogClock.VISIBLE);
                    d1.setVisibility(DigitalClock.GONE);
                } else {
                    d1.setVisibility(DigitalClock.VISIBLE);
                    a1.setVisibility(AnalogClock.GONE);
                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_current_time, menu);
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
