package com.d_app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Web_Browser extends Activity {
    protected static ImageButton b11;
    private static EditText edit1;
    private static WebView img1;
    protected static ImageView img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web__browser);
        WebMethod();
    }
    public void WebMethod(){
        img2=(ImageView)findViewById(R.id.imageView1);
        b11=(ImageButton) findViewById(R.id.btn11);
        edit1=(EditText)findViewById(R.id.url);
        img1=(WebView)findViewById(R.id.web);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url1=edit1.getText().toString();
                img1.getSettings().setLoadsImagesAutomatically(true);
                img1.getSettings().setJavaScriptEnabled(true);
                img1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                img1.loadUrl(url1);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_web__browser, menu);
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
