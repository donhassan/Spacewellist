package donnywelist.wordpress.spacewelistbeta.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import butterknife.ButterKnife;
import donnywelist.wordpress.spacewelistbeta.R;

public class TampilData2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_tampil_data2);

        ButterKnife.bind(this);

        String id = getIntent().getExtras().getString("id");
        String nama = getIntent().getExtras().getString("name");
        String kategori = getIntent().getExtras().getString("kategori");
        String deskripsi = getIntent().getExtras().getString("deskripsi");


        TextView namax = (TextView)findViewById(R.id.tampilnama);
        TextView kategorix = (TextView)findViewById(R.id.tampilkategori);
        TextView deskripsix= (TextView)findViewById(R.id.tampildeskripsi);

   }


}
