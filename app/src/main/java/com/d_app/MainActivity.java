package com.d_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private static EditText e1;
    private static EditText e2;
    protected static Button b1;
    protected static Button b2;
    private static TextView t1;
    private static int a=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        abc();
        abc2();
        b2.setEnabled(false);

    }
    public void abc(){
        e1=(EditText) findViewById(R.id.uid);
        e2=(EditText) findViewById(R.id.pwd);
        b1=(Button) findViewById(R.id.btn);
        b2=(Button) findViewById(R.id.btn1);
        t1=(TextView) findViewById(R.id.txt);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().equals("deepesh") && (e2.getText().toString().equals("12345"))) {
                    Toast.makeText(MainActivity.this, "wow!...\n Login Successfull...", Toast.LENGTH_SHORT).show();
                    b2.setEnabled(false);
                    Intent i1=new Intent("com.d_app.Welcom");
                    startActivity(i1);
                } else {
                    Toast.makeText(MainActivity.this, "Oh!...you have enterd \n incurrect username and password.\n try again.. ", Toast.LENGTH_SHORT).show();
                    a--;
                    t1.setText(Integer.toString(a));
                    if (a == 0) {
                        b1.setEnabled(false);
                        b2.setEnabled(true);
                    }
                }
            }
        });

    }

    public void abc2(){
        e1=(EditText) findViewById(R.id.uid);
        e2=(EditText) findViewById(R.id.pwd);
        b1=(Button) findViewById(R.id.btn);
        b2=(Button) findViewById(R.id.btn1);
        t1=(TextView) findViewById(R.id.txt);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setEnabled(true);
                Toast.makeText(MainActivity.this, "User_id=deepesh" , Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, "Password=12345", Toast.LENGTH_LONG).show();
                b2.setEnabled(false);
                t1.setText(Integer.toString(a = 2));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
