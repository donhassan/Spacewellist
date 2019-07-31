package donnywelist.wordpress.spacewelistbeta;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ensiklopedia extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"Merkurius", "Venus", "Bumi", "Mars", "Jupiter", "Saturnus", "Uranus", "Neptunus"};
    String mDescription[] = {"Merkurius Description", "Venus Description", "Bumi Description", "Mars Description", "Jupiter Description", "Saturnus Description", "Uranus Description", "Neptunus Description",};
    int images[] = {R.drawable.merkurius, R.drawable.venus, R.drawable.bumi, R.drawable.mars, R.drawable.jupiter, R.drawable.saturnus, R.drawable.uranus, R.drawable.neptunus};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ensiklopedia);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)  {
                    Toast.makeText(ensiklopedia.this, "Merkurius Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0)  {
                    Toast.makeText(ensiklopedia.this, "Venus Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0)  {
                    Toast.makeText(ensiklopedia.this, "Bumi Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0)  {
                    Toast.makeText(ensiklopedia.this, "Mars Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0)  {
                    Toast.makeText(ensiklopedia.this, "Jupiter Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0)  {
                    Toast.makeText(ensiklopedia.this, "Saturnus Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0)  {
                    Toast.makeText(ensiklopedia.this, "Uranus Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0)  {
                    Toast.makeText(ensiklopedia.this, "Neptunus Description", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    class MyAdapter extends ArrayAdapter<String>{

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @Nullable
        @NonNull
        @Override
        public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);



            return row;
        }
    }
}
