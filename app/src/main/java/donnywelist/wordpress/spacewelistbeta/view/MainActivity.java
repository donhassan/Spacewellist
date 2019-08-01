package donnywelist.wordpress.spacewelistbeta.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import donnywelist.wordpress.spacewelistbeta.R;
import donnywelist.wordpress.spacewelistbeta.Splashscreen2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen1);
    }

    public void onClick (View view) {
        Intent i = new Intent(MainActivity.this, Splashscreen2.class);
        startActivity(i);
    }
}
