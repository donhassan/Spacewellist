package donnywelist.wordpress.spacewelistbeta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import donnywelist.wordpress.spacewelistbeta.view.Home;

public class Splashscreen2 extends AppCompatActivity {

    Button next2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen2);
//        next2 = (Button) findViewById(R.id.btn_nextss2);
//        next2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(Splashscreen2.this, Home.class);
//                startActivity(i);
//            }
//        });
    }

    public void onClickSS2(View view) {
        Intent intent  = new Intent(Splashscreen2.this, Home.class);
        startActivity(intent);
    }
}
