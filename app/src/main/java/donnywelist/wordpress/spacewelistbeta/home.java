package donnywelist.wordpress.spacewelistbeta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    Button encyclopedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
//        next2 = (Button) findViewById(R.id.btn_nextss2);
//        next2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(Splashscreen2.this, home.class);
//                startActivity(i);
//            }
//        });
    }

    public void onClickEnsi(View view) {
        Intent intent  = new Intent(home.this, ensiklopedia.class);
        startActivity(intent);
    }
}
