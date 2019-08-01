package donnywelist.wordpress.spacewelistbeta.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import donnywelist.wordpress.spacewelistbeta.R;

public class Home extends AppCompatActivity {
    FragmentManager fragmentManager;
    Fragment fragment = null;
    Button encyclopedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Button btn_encyclopedia = findViewById(R.id.btn_encyclopedia);
        btn_encyclopedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Home.this, Ensiklopedia2.class);
                startActivity(in);
            }
        });
    }


}
