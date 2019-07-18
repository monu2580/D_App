package com.d_app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class Calculator extends Activity {
    protected static EditText t4;
    protected static EditText t5;
    protected static TextView t6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }
    public void Add(View view) {
        t4 = (EditText) findViewById(R.id.n1);
        t5 = (EditText) findViewById(R.id.n2);
        t6 = (TextView) findViewById(R.id.result);


        Double num1, num2, sum = null;
        num1 = Double.parseDouble(t4.getText().toString());
        num2 = Double.parseDouble(t5.getText().toString());
        if (view.getId() == R.id.add1)
            sum = num1 + num2;
        if (view.getId() == R.id.sub1)
            sum = num1 - num2;
        if (view.getId() == R.id.mul1)
            sum = num1 * num2;
        if (view.getId() == R.id.div1)
            if (num2 == 0)
                sum = num2;
            else
                sum = num1 / num2;
        t6.setText(sum + " ");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculator, menu);
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
