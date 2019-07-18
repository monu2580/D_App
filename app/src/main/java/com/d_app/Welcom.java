package com.d_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Welcom extends Activity {
    protected   static Button b3;
    protected   static Button b4;
    protected   static Button b5;
    protected   static Button b6;
    protected   static Button b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);
        Abc3();
        Abc4();
        Abc5();
        Abc6();
        Abc7();
    }
    public void Abc3(){
        b3=(Button) findViewById(R.id.btn2);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mi2 = new Intent("com.d_app.Current_time");
                startActivity(mi2);
            }
        });
    }

    public void Abc4() {
        b4 = (Button) findViewById(R.id.btn3);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mi3=new Intent("com.d_app.Web_Browser");
                startActivity(mi3);
            }
        });
    }
    public void Abc5(){
        b5=(Button) findViewById(R.id.btn4);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mi4=new Intent("com.d_app.Calculator");
                startActivity(mi4);
            }
        });

    }
    public void Abc6(){
        b6=(Button) findViewById(R.id.btn5);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mi11=new Intent("com.d_app.Thanku");
                startActivity(mi11);
            }
        });

    }
    public void Abc7(){
        b7=(Button) findViewById(R.id.btn6);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent("com.d_app.RatingBar");
                startActivity(i4);
            }
        });

    }


        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_welcom, menu);
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
