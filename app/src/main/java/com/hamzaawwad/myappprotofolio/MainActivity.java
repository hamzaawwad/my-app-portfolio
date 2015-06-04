package com.hamzaawwad.myappprotofolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button spotifyBtn, scoresBtn, libraryBtn, buildItBtn, xyzBtn, capstoneBtn;
    private Context ctx = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotifyBtn = (Button) findViewById(R.id.SpotifyStreamerBtn);
        scoresBtn = (Button) findViewById(R.id.ScoresAppBtn);
        libraryBtn = (Button) findViewById(R.id.LibraryAppBtn);
        buildItBtn = (Button) findViewById(R.id.buildItBtn);
        xyzBtn = (Button) findViewById(R.id.xyzBtn);
        capstoneBtn = (Button) findViewById(R.id.capstonBtn);


        spotifyBtn.setOnClickListener(this);
        scoresBtn.setOnClickListener(this);
        libraryBtn.setOnClickListener(this);
        buildItBtn.setOnClickListener(this);
        xyzBtn.setOnClickListener(this);
        capstoneBtn.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.SpotifyStreamerBtn:

                showToast(getString(R.string.toast_spotify));
                break;

            case R.id.ScoresAppBtn:
                showToast(getString(R.string.toast_scores));
                break;
            case R.id.LibraryAppBtn:
                showToast(getString(R.string.toast_library));
                break;
            case R.id.buildItBtn:
                showToast(getString(R.string.toast_build));
                break;
            case R.id.xyzBtn:
                showToast(getString(R.string.toast_xyz));
                break;
            case R.id.capstonBtn:
                showToast(getString(R.string.toast_capstone));
                break;
        }
    }

    private void showToast(String text) {
        Toast.makeText(ctx, text, Toast.LENGTH_LONG).show();
    }
}
