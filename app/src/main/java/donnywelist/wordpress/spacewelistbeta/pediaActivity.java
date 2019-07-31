package donnywelist.wordpress.spacewelistbeta;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class pediaActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    EncyclopediaFragment encyclopediaFragment = new EncyclopediaFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.content, encyclopediaFragment);
                    fragmentTransaction.commit();

                    return true;
                case R.id.navigation_dashboard:
                    NewsFragment newsFragment = new NewsFragment();
                    FragmentTransaction fragmentNewsTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentNewsTransaction.replace(R.id.content, newsFragment);
                    fragmentNewsTransaction.commit();

                    return true;
                case R.id.navigation_notifications:
                    ExitFragment exitFragment = new ExitFragment();
                    FragmentTransaction fragmentExitTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentExitTransaction.replace(R.id.content, exitFragment);
                    fragmentExitTransaction.commit();

                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedia);

        EncyclopediaFragment encyclopediaFragment = new EncyclopediaFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content, encyclopediaFragment);
        fragmentTransaction.commit();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
